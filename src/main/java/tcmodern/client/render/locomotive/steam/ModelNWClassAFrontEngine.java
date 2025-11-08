//FMT-Marker FVTM-1.5
//Using PER-GROUP-INIT mode with limit '500'!
package tcmodern.client.render.locomotive.steam;


import net.minecraft.entity.Entity;
import tcmodern.client.render.locomotive.bogies.ModelNWClassAFrontBogie;
import tmt.FVTMFormatBase;
import tmt.ModelRendererTurbo;

/** This file was exported via the FVTM Exporter v1.5 of<br>
 *  FMT (Fex's Modelling Toolbox) v.2.7.5 &copy; 2025 - Fexcraft.net<br>
 *  All rights reserved. For this Model's License contact the Author/Creator.
 */
public class ModelNWClassAFrontEngine extends FVTMFormatBase {

	public ModelNWClassAFrontEngine(){
		super();
		textureX = 512;
		textureY = 1024;
		addToCreators("Riggs64");
		//
		initGroup_FrontEngine0();
		initGroup_FrontEngine1();
		for (FVTMFormatBase.TurboList l : groups) {
			tmt.ModelRendererTurbo[] arr = new tmt.ModelRendererTurbo[l.size()];
			l.toArray(arr);
			fixRotation(arr, false, true, true);
		}
	}

	private final void initGroup_FrontEngine0(){
		TurboList FrontEngine = new TurboList("FrontEngine");
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 321, 17, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 3, 1, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-3.6f, 3.5f, -2.5f).setRotationAngle(0, 0, 0).setName("Box 257")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 337, 17, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 3, 1, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0)
			.setRotationPoint(-3.6f, 3.5f, 1.5f).setRotationAngle(0, 0, 0).setName("Box 258")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 257, 9, textureX, textureY).addBox(0, 0, 0, 1, 3, 3)
			.setRotationPoint(-1.6f, 3.5f, -1.5f).setRotationAngle(0, 0, 0).setName("Box 259")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 473, 329, textureX, textureY).addBox(0, 0, 0, 1, 3, 5)
			.setRotationPoint(-4.6f, 3.5f, -2.5f).setRotationAngle(0, 0, 0).setName("Box 2014")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 185, 201, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0.25f, -0.25f, -0.65f, -0.5f, -0.25f, -0.65f, -0.5f, -0.15f, 0, 0.25f, -0.15f, 0, 0.25f, -0.25f, -0.65f, -0.5f, -0.25f, -0.65f, -0.5f, -0.15f, 0, 0.25f, -0.15f)
			.setRotationPoint(-12.85f, 6, -6.9f).setRotationAngle(0, 0, 0).setName("Box 1714")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 505, 201, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.65f, -0.5f, -0.25f, 0, 0.25f, -0.25f, 0, 0.25f, -0.15f, -0.65f, -0.5f, -0.15f, -0.65f, -0.5f, -0.25f, 0, 0.25f, -0.25f, 0, 0.25f, -0.15f, -0.65f, -0.5f, -0.15f)
			.setRotationPoint(-14.1f, 8.25f, -6.9f).setRotationAngle(0, 0, -90).setName("Box 1715")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 457, 209, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0.75f, -0.25f, -0.5f, 0.75f, -0.25f, -0.5f, 0.75f, -0.15f, 0, 0.75f, -0.15f, 0, 0.25f, -0.25f, -0.5f, 0.25f, -0.25f, -0.5f, 0.25f, -0.15f, 0, 0.25f, -0.15f)
			.setRotationPoint(-14.35f, 6, -6.9f).setRotationAngle(0, 0, 0).setName("Box 1716")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 441, 209, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.65f, -0.5f, -0.25f, 0, 0.25f, -0.25f, 0, 0.25f, -0.15f, -0.65f, -0.5f, -0.15f, -0.65f, -0.5f, -0.25f, 0, 0.25f, -0.25f, 0, 0.25f, -0.15f, -0.65f, -0.5f, -0.15f)
			.setRotationPoint(-15.35f, 6, -6.9f).setRotationAngle(0, 0, 0).setName("Box 1717")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 33, 225, textureX, textureY)
			.addShapeBox(0, 0, 0, 27, 1, 1, 0, -0.25f, 0.25f, -0.25f, -0.25f, 0.25f, -0.25f, -0.25f, 0.25f, -0.25f, -0.25f, 0.25f, -0.25f, -0.25f, 0.25f, -0.25f, -0.25f, 0.25f, -0.25f, -0.25f, 0.25f, -0.25f, -0.25f, 0.25f, -0.25f)
			.setRotationPoint(-41.1f, 6, -6.8f).setRotationAngle(0, 0, 0).setName("Box 1718")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 465, 209, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0.25f, -0.25f, -0.65f, -0.5f, -0.25f, -0.65f, -0.5f, -0.15f, 0, 0.25f, -0.15f, 0, 0.25f, -0.25f, -0.65f, -0.5f, -0.25f, -0.65f, -0.5f, -0.15f, 0, 0.25f, -0.15f)
			.setRotationPoint(-40.85f, 6, -6.9f).setRotationAngle(0, 0, 0).setName("Box 1719")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 473, 209, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0.75f, -0.25f, -0.5f, 0.75f, -0.25f, -0.5f, 0.75f, -0.15f, 0, 0.75f, -0.15f, 0, 0.25f, -0.25f, -0.5f, 0.25f, -0.25f, -0.5f, 0.25f, -0.15f, 0, 0.25f, -0.15f)
			.setRotationPoint(-42.35f, 6, -6.9f).setRotationAngle(0, 0, 0).setName("Box 1720")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 481, 209, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.65f, -0.5f, -0.25f, 0, 0.25f, -0.25f, 0, 0.25f, -0.15f, -0.65f, -0.5f, -0.15f, -0.65f, -0.5f, -0.25f, 0, 0.25f, -0.25f, 0, 0.25f, -0.15f, -0.65f, -0.5f, -0.15f)
			.setRotationPoint(-43.35f, 6, -6.9f).setRotationAngle(0, 0, 0).setName("Box 1721")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 489, 209, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.65f, -0.5f, -0.25f, 0, 0.25f, -0.25f, 0, 0.25f, -0.15f, -0.65f, -0.5f, -0.15f, -0.65f, -0.5f, -0.25f, 0, 0.25f, -0.25f, 0, 0.25f, -0.15f, -0.65f, -0.5f, -0.15f)
			.setRotationPoint(-42.1f, 8.25f, -6.9f).setRotationAngle(0, 0, -90).setName("Box 1722")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 497, 209, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0.75f, -0.25f, -0.5f, 0.75f, -0.25f, -0.5f, 0.75f, -0.15f, 0, 0.75f, -0.15f, 0, 0.25f, -0.25f, -0.5f, 0.25f, -0.25f, -0.5f, 0.25f, -0.15f, 0, 0.25f, -0.15f)
			.setRotationPoint(-28.35f, 6, -6.9f).setRotationAngle(0, 0, 0).setName("Box 1723")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 505, 209, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0.25f, -0.25f, -0.65f, -0.5f, -0.25f, -0.65f, -0.5f, -0.15f, 0, 0.25f, -0.15f, 0, 0.25f, -0.25f, -0.65f, -0.5f, -0.25f, -0.65f, -0.5f, -0.15f, 0, 0.25f, -0.15f)
			.setRotationPoint(-26.85f, 6, -6.9f).setRotationAngle(0, 0, 0).setName("Box 1724")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 289, 217, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.65f, -0.5f, -0.25f, 0, 0.25f, -0.25f, 0, 0.25f, -0.15f, -0.65f, -0.5f, -0.15f, -0.65f, -0.5f, -0.25f, 0, 0.25f, -0.25f, 0, 0.25f, -0.15f, -0.65f, -0.5f, -0.15f)
			.setRotationPoint(-29.35f, 6, -6.9f).setRotationAngle(0, 0, 0).setName("Box 1725")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 297, 217, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.65f, -0.5f, -0.25f, 0, 0.25f, -0.25f, 0, 0.25f, -0.15f, -0.65f, -0.5f, -0.15f, -0.65f, -0.5f, -0.25f, 0, 0.25f, -0.25f, 0, 0.25f, -0.15f, -0.65f, -0.5f, -0.15f)
			.setRotationPoint(-28.1f, 8.25f, -6.9f).setRotationAngle(0, 0, -90).setName("Box 1726")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 393, 217, textureX, textureY)
			.addShapeBox(0, 0, 0, 24, 1, 1, 0, -0.25f, 0.25f, -0.25f, -0.25f, 0.25f, -0.25f, -0.25f, 0.25f, -0.25f, -0.25f, 0.25f, -0.25f, -0.25f, 0.25f, -0.25f, -0.25f, 0.25f, -0.25f, -0.25f, 0.25f, -0.25f, -0.25f, 0.25f, -0.25f)
			.setRotationPoint(-37.1f, 2.5f, -9).setRotationAngle(0, 0, 8.4f).setName("Box 1734")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 105, 49, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 3, 0, -0.25f, 0.25f, 0, -0.25f, 0.25f, 0, -0.25f, 0.25f, 0, -0.25f, 0.25f, 0, -0.25f, 0.25f, 0, -0.25f, 0.25f, 0, -0.25f, 0.25f, 0, -0.25f, 0.25f, 0)
			.setRotationPoint(-14.6f, 6, -9.5f).setRotationAngle(0, 0, 0).setName("Box 1735")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 505, 217, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 2, 1, 0, 0, 0.75f, -0.25f, -0.5f, 0.75f, -0.25f, -0.5f, 0.75f, -0.15f, 0, 0.75f, -0.15f, 0, 0.25f, -0.25f, -0.5f, 0.25f, -0.25f, -0.5f, 0.25f, -0.15f, 0, 0.25f, -0.15f)
			.setRotationPoint(-14.35f, 5, -10.1f).setRotationAngle(0, 0, 0).setName("Box 1763")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 473, 217, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.65f, -0.5f, -0.25f, 0, 0.25f, -0.25f, 0, 0.25f, -0.15f, -0.65f, -0.5f, -0.15f, -0.65f, -0.5f, -0.25f, 0, 0.25f, -0.25f, 0, 0.25f, -0.15f, -0.65f, -0.5f, -0.15f)
			.setRotationPoint(-15.35f, 6, -10.1f).setRotationAngle(0, 0, 0).setName("Box 1764")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 17, 225, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.65f, -0.5f, -0.25f, 0, 0.25f, -0.25f, 0, 0.25f, -0.15f, -0.65f, -0.5f, -0.15f, -0.65f, -0.5f, -0.25f, 0, 0.25f, -0.25f, 0, 0.25f, -0.15f, -0.65f, -0.5f, -0.15f)
			.setRotationPoint(-14.1f, 8.25f, -10.1f).setRotationAngle(0, 0, -90).setName("Box 1765")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 153, 225, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0.25f, -0.25f, -0.65f, -0.5f, -0.25f, -0.65f, -0.5f, -0.15f, 0, 0.25f, -0.15f, 0, 0.25f, -0.25f, -0.65f, -0.5f, -0.25f, -0.65f, -0.5f, -0.15f, 0, 0.25f, -0.15f)
			.setRotationPoint(-12.85f, 6, -10.1f).setRotationAngle(0, 0, 0).setName("Box 1766")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 33, 361, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 1, 11, 0, 0, 4, -10, 0, 0, -7, 0, 0, -3, 0, 4, 0, 0, 1, -10, 0, 2, -7, 0, 2, -3, 0, 1, 0)
			.setRotationPoint(-9.6f, 3.5f, -5.5f).setRotationAngle(0, 0, 0).setName("Box 253")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 65, 441, textureX, textureY).addBox(0, 0, 0, 14, 14, 0)
			.setRotationPoint(-48.75f, -4, -6.01f).setRotationAngle(0, 0, 0).setName("Box 1870")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 97, 441, textureX, textureY).addBox(0, 0, 0, 14, 14, 0)
			.setRotationPoint(-34.75f, -4, -6.01f).setRotationAngle(0, 0, 0).setName("Box 1872")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 129, 441, textureX, textureY).addBox(0, 0, 0, 14, 14, 0)
			.setRotationPoint(-20.75f, -4, -6.01f).setRotationAngle(0, 0, 0).setName("Box 1873")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 401, 449, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 1, 11, 0, 0, 4, 0, 0, 0, -3, 0, 0, -7, 0, 4, -10, 0, 1, 0, 0, 2, -3, 0, 2, -7, 0, 1, -10)
			.setRotationPoint(-9.6f, 3.5f, -5.5f).setRotationAngle(0, 0, 0).setName("Box 1944")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 481, 489, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.65f, -0.5f, -0.25f, 0, 0.25f, -0.25f, 0, 0.25f, -0.15f, -0.65f, -0.5f, -0.15f, -0.65f, -0.5f, -0.25f, 0, 0.25f, -0.25f, 0, 0.25f, -0.15f, -0.65f, -0.5f, -0.15f)
			.setRotationPoint(-30.35f, 8.25f, -6.9f).setRotationAngle(0, 0, -90).setName("Box 2084")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 449, 497, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.65f, -0.5f, -0.25f, 0, 0.25f, -0.25f, 0, 0.25f, -0.15f, -0.65f, -0.5f, -0.15f, -0.65f, -0.5f, -0.25f, 0, 0.25f, -0.25f, 0, 0.25f, -0.15f, -0.65f, -0.5f, -0.15f)
			.setRotationPoint(-31.6f, 6, -6.9f).setRotationAngle(0, 0, 0).setName("Box 2085")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 481, 497, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0.75f, -0.25f, -0.5f, 0.75f, -0.25f, -0.5f, 0.75f, -0.15f, 0, 0.75f, -0.15f, 0, 0.25f, -0.25f, -0.5f, 0.25f, -0.25f, -0.5f, 0.25f, -0.15f, 0, 0.25f, -0.15f)
			.setRotationPoint(-30.6f, 6, -6.9f).setRotationAngle(0, 0, 0).setName("Box 2086")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 193, 505, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0.25f, -0.25f, -0.65f, -0.5f, -0.25f, -0.65f, -0.5f, -0.15f, 0, 0.25f, -0.15f, 0, 0.25f, -0.25f, -0.65f, -0.5f, -0.25f, -0.65f, -0.5f, -0.15f, 0, 0.25f, -0.15f)
			.setRotationPoint(-29.1f, 6, -6.9f).setRotationAngle(0, 0, 0).setName("Box 2087")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 305, 217, textureX, textureY)
			.addShapeBox(0, 0, 0, 8, 1, 2, 0, -0.25f, -0.75f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.75f, -0.25f, -0.25f, 0.25f, -0.25f, -0.25f, 0.25f, -0.25f, -0.25f, 0.25f, -0.25f, -0.25f, 0.25f, -0.25f)
			.setRotationPoint(-48.85f, 0.5f, -9.5f).setRotationAngle(0, 0, 0).setName("Box 1727")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 345, 217, textureX, textureY)
			.addShapeBox(0, 0, 0, 8, 1, 2, 0, -0.25f, 0.25f, -0.25f, -0.25f, 0.25f, -0.25f, -0.25f, 0.25f, -0.25f, -0.25f, 0.25f, -0.25f, -0.25f, -0.75f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.75f, -0.25f)
			.setRotationPoint(-48.85f, 4.5f, -9.5f).setRotationAngle(0, 0, 0).setName("Box 1728")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 97, 225, textureX, textureY).addBox(0, 0, 0, 12, 1, 1)
			.setRotationPoint(-50.1f, 2.5f, -9).setRotationAngle(0, 0, 0).setName("Box 1742")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 1, 225, textureX, textureY)
			.addShapeBox(0, -1, 0, 6, 1, 1, 0, -0.25f, -0.75f, -0.25f, -0.25f, -0.75f, -0.25f, -0.25f, -0.75f, -0.25f, -0.25f, -0.75f, -0.25f, -0.25f, 0.25f, -0.25f, -0.25f, 0.25f, -0.25f, -0.25f, 0.25f, -0.25f, -0.25f, 0.25f, -0.25f)
			.setRotationPoint(-37.6f, 3, -8.9f).setRotationAngle(0, -180, 0).setName("Box 1754")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 329, 217, textureX, textureY)
			.addShapeBox(0, 0.5f, -1, 1, 6, 1, 0, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f)
			.setRotationPoint(-41.7f, -3.4f, -10.3f).setRotationAngle(0, -180, -8).setName("Box 1755")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 129, 225, textureX, textureY)
			.addShapeBox(0, 0, 0, 9, 1, 1, 0, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, 0.25f, -0.25f, -0.25f, 0.25f, -0.25f, -0.25f, 0.25f, -0.25f, -0.25f, 0.25f, -0.25f)
			.setRotationPoint(-49.1f, -4, -10.55f).setRotationAngle(0, 0, 0).setName("Box 1756")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 97, 233, textureX, textureY)
			.addShapeBox(0, 0, 0, 10, 1, 2, 0, -0.25f, 0.25f, -0.25f, -0.25f, 0.25f, -0.25f, -0.25f, 0.25f, -0.25f, -0.25f, 0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f)
			.setRotationPoint(-41.35f, 4.5f, -9.5f).setRotationAngle(0, 0, 0).setName("Box 1828")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 129, 233, textureX, textureY)
			.addShapeBox(0, 0, 0, 10, 1, 2, 0, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, 0.25f, -0.25f, -0.25f, 0.25f, -0.25f, -0.25f, 0.25f, -0.25f, -0.25f, 0.25f, -0.25f)
			.setRotationPoint(-41.35f, 0.5f, -9.5f).setRotationAngle(0, 0, 0).setName("Box 1829")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 465, 225, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0.75f, -0.25f, -0.5f, 0.75f, -0.25f, -0.5f, 0.75f, -0.15f, 0, 0.75f, -0.15f, 0, -1, -0.25f, -0.5f, -1, -0.25f, -0.5f, -1, -0.15f, 0, -1, -0.15f)
			.setRotationPoint(-13.85f, 5, -10.7f).setRotationAngle(0, 0, 0).setName("Box 1842")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 449, 305, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0.25f, -0.25f, -0.65f, -0.5f, -0.25f, -0.65f, -0.5f, -0.15f, 0, 0.25f, -0.15f, 0, 0.25f, -0.25f, -0.65f, -0.5f, -0.25f, -0.65f, -0.5f, -0.15f, 0, 0.25f, -0.15f)
			.setRotationPoint(-14.1f, 4.25f, -10.1f).setRotationAngle(0, 0, -90).setName("Box 2136")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 201, 329, textureX, textureY).addBox(0, 0, 0, 5, 1, 1)
			.setRotationPoint(-27.2f, -5, -10.3f).setRotationAngle(0, 0, 90).setName("Box 1610")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 449, 353, textureX, textureY)
			.addShapeBox(-3, -1, 0, 16, 1, 1, 0, -0.25f, -0.75f, -0.25f, -0.25f, -0.75f, -0.25f, -0.25f, -0.75f, -0.25f, -0.25f, -0.75f, -0.25f, -0.25f, 0.25f, -0.25f, -0.25f, 0.25f, -0.25f, -0.25f, 0.25f, -0.25f, -0.25f, 0.25f, -0.25f)
			.setRotationPoint(-29.7f, -1.5f, -9).setRotationAngle(0, -180, -9).setName("Box 1612")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 105, 329, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 3, 1, 0, 0, 2, 0, 0, 0, 0, 0, 0, 0, 0, 2, 0, 0, 0, 0, 0, -2, 0, 0, -2, 0, 0, 0, 0)
			.setRotationPoint(-27.2f, -3, -10.3f).setRotationAngle(0, 0, 0).setName("Box 1613")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 345, 329, textureX, textureY)
			.addShapeBox(-1, 1.5f, -1, 1, 2, 1, 0, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f)
			.setRotationPoint(-27.2f, -2.4f, -10.1f).setRotationAngle(0, -180, -10).setName("Box 1614")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 225, 337, textureX, textureY)
			.addShapeBox(-1.3f, -1, 0, 8, 1, 1, 0, -0.25f, -0.75f, -0.25f, 0.05f, -0.75f, -0.25f, 0.05f, -0.75f, -0.25f, -0.25f, -0.75f, -0.25f, -0.25f, 0.25f, -0.25f, 0.05f, 0.25f, -0.25f, 0.05f, 0.25f, -0.25f, -0.25f, 0.25f, -0.25f)
			.setRotationPoint(-24.2f, -6.2f, -10.6f).setRotationAngle(0, 0, 0).setName("Box 1616")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 353, 329, textureX, textureY)
			.addShapeBox(-1, 1.5f, -1, 1, 5, 1, 0, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f)
			.setRotationPoint(-25.2f, -8, -10.1f).setRotationAngle(0, -180, -9).setName("Box 1617")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 409, 329, textureX, textureY)
			.addShapeBox(-1, 1.5f, -1, 1, 4, 1, 0, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f)
			.setRotationPoint(-17.95f, -8, -10.1f).setRotationAngle(0, -180, -9).setName("Box 1618")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 433, 337, textureX, textureY)
			.addShapeBox(-1.3f, -1, 0, 15, 1, 1, 0, -0.25f, -0.75f, -0.25f, -0.5f, -0.75f, -0.25f, -0.5f, -0.75f, -0.25f, -0.25f, -0.75f, -0.25f, -0.25f, 0.25f, -0.25f, -0.5f, 0.25f, -0.25f, -0.5f, 0.25f, -0.25f, -0.25f, 0.25f, -0.25f)
			.setRotationPoint(-26.45f, 1, -10.6f).setRotationAngle(0, 0, 15.4f).setName("Box 1620")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 321, 401, textureX, textureY).addBox(0, 0, 0, 11, 2, 1)
			.setRotationPoint(-33.1f, -3.5f, -10.4f).setRotationAngle(0, 0, 0).setName("Box 1807")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 425, 401, textureX, textureY).addBox(0, 0, 0, 4, 1, 1)
			.setRotationPoint(-35.1f, 1, -11.4f).setRotationAngle(0, 0, 90).setName("Box 1823")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 369, 401, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 1)
			.setRotationPoint(-35.1f, 5, -11.4f).setRotationAngle(0, 0, 90).setName("Box 1825")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 441, 401, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, 0, 0, -1, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 1, 0, 0, 0)
			.setRotationPoint(-35.1f, 0, -11.4f).setRotationAngle(0, 0, 90).setName("Box 1826")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 449, 401, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0.5f, 0)
			.setRotationPoint(-36.1f, -3.5f, -10.4f).setRotationAngle(0, 0, 0).setName("Box 1827")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 489, 425, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0)
			.setRotationPoint(-22.1f, -3.5f, -10.4f).setRotationAngle(0, 0, 0).setName("Box 1862")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 481, 433, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0)
			.setRotationPoint(-35.1f, -2.25f, -10.4f).setRotationAngle(0, 0, 0).setName("Box 1869")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 489, 433, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0)
			.setRotationPoint(-35.1f, -3.5f, -10.4f).setRotationAngle(0, 0, 0).setName("Box 1870")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 369, 217, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 2, 0, 0.75f, 0, -0.35f, 0.25f, 0, -0.35f, 0.25f, 0, -0.35f, 0.75f, 0, -0.35f, -0.25f, 0, -0.35f, -0.5f, 0, -0.35f, -0.5f, 0, -0.35f, -0.25f, 0, -0.35f)
			.setRotationPoint(-39.1f, 1.75f, -9.5f).setRotationAngle(0, 0, 0).setName("Box 1730")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 457, 217, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 2, 0, -0.25f, 0, -0.35f, -0.5f, 0, -0.35f, -0.5f, 0, -0.35f, -0.25f, 0, -0.35f, 0.75f, 0, -0.35f, 0.25f, 0, -0.35f, 0.25f, 0, -0.35f, 0.75f, 0, -0.35f)
			.setRotationPoint(-39.1f, 3.25f, -9.5f).setRotationAngle(0, 0, 0).setName("Box 1736")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 489, 217, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 2, 0, -0.25f, 0, -0.35f, -0.5f, 0, -0.35f, -0.5f, 0, -0.35f, -0.25f, 0, -0.35f, -0.25f, -0.5f, -0.35f, -0.5f, -0.5f, -0.35f, -0.5f, -0.5f, -0.35f, -0.25f, -0.5f, -0.35f)
			.setRotationPoint(-39.1f, 2.75f, -9.5f).setRotationAngle(0, 0, 0).setName("Box 1737")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 1, 361, textureX, textureY)
			.addShapeBox(-1.3f, -1, 0, 20, 1, 1, 0, -0.25f, -0.75f, -0.25f, -1.05f, -0.75f, -0.25f, -1.05f, -0.75f, -0.25f, -0.25f, -0.75f, -0.25f, -0.25f, 0.25f, -0.25f, -1.05f, 0.25f, -0.25f, -1.05f, 0.25f, -0.25f, -0.25f, 0.25f, -0.25f)
			.setRotationPoint(-18.95f, -2.8f, 8.3f).setRotationAngle(0, 90, 0).setName("Box 1619")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 273, 377, textureX, textureY).addBox(0, 0, 0, 3, 3, 0)
			.setRotationPoint(-54.6f, -2.25f, -12.02f).setRotationAngle(0, 0, 0).setName("Box 1786")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 1, 497, textureX, textureY)
			.addShapeBox(0, 0, 0, 9, 5, 24, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(-57.35f, -2.5f, -12).setRotationAngle(0, 0, 0).setName("Box 1960")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 73, 497, textureX, textureY).addBox(0, 0, 0, 9, 4, 4)
			.setRotationPoint(-57.6f, 1, -11.25f).setRotationAngle(0, 0, 0).setName("Box 1965")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 1, 497, textureX, textureY)
			.addShapeBox(0, 0, 0, 9, 4, 1, 0, 0, 0, 0, 0, 0, 0, 0, -1.5f, -0.25f, 0, -1.5f, -0.25f, 0, 0, 0, 0, 0, 0, 0, -1.5f, -0.25f, 0, -1.5f, -0.25f)
			.setRotationPoint(-57.6f, 1, -7.25f).setRotationAngle(0, 0, 0).setName("Box 1966")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 105, 497, textureX, textureY)
			.addShapeBox(0, 0, 0, 9, 4, 1, 0, 0, -1.5f, -0.25f, 0, -1.5f, -0.25f, 0, 0, 0, 0, 0, 0, 0, -1.5f, -0.25f, 0, -1.5f, -0.25f, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-57.6f, 0, -7.25f).setRotationAngle(-90, 0, 0).setName("Box 1967")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 129, 497, textureX, textureY)
			.addShapeBox(0, 0, 0, 9, 4, 1, 0, 0, -1.5f, -0.25f, 0, -1.5f, -0.25f, 0, 0, 0, 0, 0, 0, 0, -1.5f, -0.25f, 0, -1.5f, -0.25f, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-57.6f, 1, -12.25f).setRotationAngle(0, 0, 0).setName("Box 1968")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 153, 497, textureX, textureY)
			.addShapeBox(0, 0, 0, 9, 4, 1, 0, 0, 0, 0, 0, 0, 0, 0, -1.5f, -0.25f, 0, -1.5f, -0.25f, 0, 0, 0, 0, 0, 0, 0, -1.5f, -0.25f, 0, -1.5f, -0.25f)
			.setRotationPoint(-57.6f, 5, -7.25f).setRotationAngle(-90, 0, 0).setName("Box 1969")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 177, 497, textureX, textureY)
			.addShapeBox(0, 0, 0, 9, 1, 3, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -1.5f, 0, -0.5f, -1.5f, 0, -0.5f, -1, 0, -0.5f, -1)
			.setRotationPoint(-57.6f, -1.5f, -11.95f).setRotationAngle(0, 0, 0).setName("Box 1970")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 209, 497, textureX, textureY)
			.addShapeBox(0, 0, 0, 9, 1, 3, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -1.5f, 0, -0.5f, -1.5f, 0, -0.5f, -1, 0, -0.5f, -1)
			.setRotationPoint(-57.6f, -1, -8.95f).setRotationAngle(90, 0, 0).setName("Box 1971")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 241, 497, textureX, textureY)
			.addShapeBox(0, 0, 0, 9, 1, 3, 0, 0, -0.5f, -1.5f, 0, -0.5f, -1.5f, 0, -0.5f, -1, 0, -0.5f, -1, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-57.6f, -5, -11.95f).setRotationAngle(0, 0, 0).setName("Box 1972")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 273, 497, textureX, textureY)
			.addShapeBox(0, 0, 0, 9, 3, 3, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(-57.6f, -4, -11.95f).setRotationAngle(0, 0, 0).setName("Box 1973")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 305, 497, textureX, textureY)
			.addShapeBox(0, 0, 0, 9, 1, 3, 0, 0, -0.5f, -1.5f, 0, -0.5f, -1.5f, 0, -0.5f, -1, 0, -0.5f, -1, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-57.6f, -1, -12.45f).setRotationAngle(90, 0, 0).setName("Box 1974")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 305, 497, textureX, textureY)
			.addShapeBox(0, 0, 0, 9, 1, 25, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(-57.35f, -3.5f, -12.5f).setRotationAngle(0, 0, 0).setName("Box 1975")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 353, 497, textureX, textureY)
			.addShapeBox(0, 0, 0, 9, 1, 5, 0, 0, 0.1f, -1.5f, -0.5f, 0.1f, -1.5f, -0.5f, 0.1f, -1, 0, 0.1f, -1, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(-57.35f, -4.5f, -12.5f).setRotationAngle(0, 0, 0).setName("Box 1976")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 1, 1, textureX, textureY).addBox(0, 0, 0, 1, 6, 1)
			.setRotationPoint(-31.1f, 0.5f, -5.5f).setRotationAngle(0, 0, 0).setName("Box 19")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 9, 1, textureX, textureY).addBox(0, 0, 0, 1, 6, 1)
			.setRotationPoint(-25.1f, 0.5f, -5.5f).setRotationAngle(0, 0, 0).setName("Box 20")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 33, 1, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0)
			.setRotationPoint(-30.1f, 1, -5.5f).setRotationAngle(0, 0, 0).setName("Box 25")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 41, 1, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0)
			.setRotationPoint(-26.1f, 1, -5.5f).setRotationAngle(0, 0, 0).setName("Box 27")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 49, 1, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-26.1f, 4, -5.5f).setRotationAngle(0, 0, 0).setName("Box 28")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 57, 1, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-30.1f, 4, -5.5f).setRotationAngle(0, 0, 0).setName("Box 29")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 97, 1, textureX, textureY).addBox(0, 0, 0, 1, 6, 1)
			.setRotationPoint(-45.1f, 0.5f, -5.5f).setRotationAngle(0, 0, 0).setName("Box 38")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 105, 1, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-40.1f, 4, -5.5f).setRotationAngle(0, 0, 0).setName("Box 40")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 113, 1, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0)
			.setRotationPoint(-40.1f, 1, -5.5f).setRotationAngle(0, 0, 0).setName("Box 41")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 121, 1, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0)
			.setRotationPoint(-44.1f, 1, -5.5f).setRotationAngle(0, 0, 0).setName("Box 42")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 129, 1, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-44.1f, 4, -5.5f).setRotationAngle(0, 0, 0).setName("Box 43")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 137, 1, textureX, textureY).addBox(0, 0, 0, 5, 1, 1)
			.setRotationPoint(-44.1f, 5, -5.5f).setRotationAngle(0, 0, 0).setName("Box 44")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 153, 1, textureX, textureY).addBox(0, 0, 0, 5, 1, 1)
			.setRotationPoint(-30.1f, 5, -5.5f).setRotationAngle(0, 0, 0).setName("Box 54")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 241, 1, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-24.1f, 5.5f, -5.5f).setRotationAngle(0, 0, 0).setName("Box 110")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 249, 1, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, -0.5f, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(-33.1f, 5.5f, -5.5f).setRotationAngle(0, 0, 0).setName("Box 111")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 257, 1, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-32.1f, 5.5f, -5.5f).setRotationAngle(0, 0, 0).setName("Box 112")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 265, 1, textureX, textureY)
			.addShapeBox(0, 0, 0, 9, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0)
			.setRotationPoint(-32.1f, 6.5f, -5.5f).setRotationAngle(0, 0, 0).setName("Box 113")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 289, 1, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.25f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.25f, -0.5f, 0)
			.setRotationPoint(-23.1f, 5.5f, -5.5f).setRotationAngle(0, 0, 0).setName("Box 114")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 297, 1, textureX, textureY)
			.addShapeBox(0, 0, 0, 9, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0)
			.setRotationPoint(-46.1f, 6.5f, -5.5f).setRotationAngle(0, 0, 0).setName("Box 115")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 321, 1, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.25f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.25f, -0.5f, 0)
			.setRotationPoint(-37.1f, 5.5f, -5.5f).setRotationAngle(0, 0, 0).setName("Box 116")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 329, 1, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-38.1f, 5.5f, -5.5f).setRotationAngle(0, 0, 0).setName("Box 117")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 337, 1, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-46.1f, 5.5f, -5.5f).setRotationAngle(0, 0, 0).setName("Box 118")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 345, 1, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, -0.5f, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(-47.1f, 5.5f, -5.5f).setRotationAngle(0, 0, 0).setName("Box 119")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 57, 17, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-46.1f, 5.5f, 4.5f).setRotationAngle(0, 0, 0).setName("Box 205")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 65, 17, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, -0.5f, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(-47.1f, 5.5f, 4.5f).setRotationAngle(0, 0, 0).setName("Box 206")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 257, 25, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 3, 1, 0, 0, 0, -0.4f, 0, 0, -0.4f, 0, 0, -0.4f, 0, 0, -0.4f, 0, 0, -0.4f, 0, 0, -0.4f, 0, 0, -0.4f, 0, 0, -0.4f)
			.setRotationPoint(-44.1f, 1.5f, -5.5f).setRotationAngle(0, 0, 0).setName("Box 469")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 273, 25, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 3, 1, 0, 0, 0, -0.4f, 0, 0, -0.4f, 0, 0, -0.4f, 0, 0, -0.4f, 0, 0, -0.4f, 0, 0, -0.4f, 0, 0, -0.4f, 0, 0, -0.4f)
			.setRotationPoint(-30.1f, 1.5f, -5.5f).setRotationAngle(0, 0, 0).setName("Box 478")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 313, 25, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 6, 1, 0, -0.2f, 0, 0, -0.3f, 0, 0, -0.3f, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0, -0.3f, 0, 0, -0.3f, 0, 0, -0.2f, 0, 0)
			.setRotationPoint(-45.8f, -0.5f, -5.5f).setRotationAngle(0, 0, 0).setName("Box 505")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 497, 289, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(-44.1f, 0.5f, -5.5f).setRotationAngle(0, 0, 0).setName("Box 2070")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 17, 297, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(-30.1f, 0.5f, -5.5f).setRotationAngle(0, 0, 0).setName("Box 2071")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 49, 377, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 4, 11, 0, -0.5f, 2.5f, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, -0.5f, 2.5f, 0, -0.5f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.5f, 0, 0)
			.setRotationPoint(-49.35f, -1, -5.5f).setRotationAngle(0, 0, 0).setName("Box 1758")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 81, 225, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 12, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.3f, -0.3f, 0, -0.3f, -0.3f, 0, 0, 0, 0)
			.setRotationPoint(-41.6f, 3, -6).setRotationAngle(0, 0, 0).setName("Box 1874")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 113, 225, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 12, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.3f, -0.3f, 0, 0, 0, 0, 0, 0, 0, -0.3f, -0.3f, 0)
			.setRotationPoint(-42.6f, 3, -6).setRotationAngle(0, 0, 0).setName("Box 1875")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 145, 241, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 12, 0, -0.3f, -0.3f, 0, 0, 0, 0, 0, 0, 0, -0.3f, -0.3f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-42.6f, 2, -6).setRotationAngle(0, 0, 0).setName("Box 1876")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 473, 257, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 12, 0, 0, 0, 0, -0.3f, -0.3f, 0, -0.3f, -0.3f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-41.6f, 2, -6).setRotationAngle(0, 0, 0).setName("Box 1877")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 289, 337, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 12, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.3f, -0.3f, 0, -0.3f, -0.3f, 0, 0, 0, 0)
			.setRotationPoint(-27.6f, 3, -6).setRotationAngle(0, 0, 0).setName("Box 1889")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 329, 345, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 12, 0, 0, 0, 0, -0.3f, -0.3f, 0, -0.3f, -0.3f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-27.6f, 2, -6).setRotationAngle(0, 0, 0).setName("Box 1890")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 369, 345, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 12, 0, -0.3f, -0.3f, 0, 0, 0, 0, 0, 0, 0, -0.3f, -0.3f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-28.6f, 2, -6).setRotationAngle(0, 0, 0).setName("Box 1891")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 433, 345, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 12, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.3f, -0.3f, 0, 0, 0, 0, 0, 0, 0, -0.3f, -0.3f, 0)
			.setRotationPoint(-28.6f, 3, -6).setRotationAngle(0, 0, 0).setName("Box 1892")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 401, 441, textureX, textureY).addBox(0, 0, 0, 7, 1, 1)
			.setRotationPoint(-38.1f, 3.75f, -5.5f).setRotationAngle(0, 0, 0).setName("Box 1921")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 425, 441, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-38.1f, 2.75f, -5.5f).setRotationAngle(0, 0, 0).setName("Box 1922")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 433, 441, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0)
			.setRotationPoint(-38.1f, 0.5f, -5.5f).setRotationAngle(0, 0, 0).setName("Box 1923")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 465, 441, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0)
			.setRotationPoint(-36.35f, 0.5f, -5.5f).setRotationAngle(0, 0, 0).setName("Box 1924")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 473, 441, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0.25f, 0, 0, 0, 0, 0, 0, 0, 0, 0.25f, 0, 0, 0.25f, 0.25f, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0.25f, 0.25f, 0)
			.setRotationPoint(-35.1f, 0.5f, -5.5f).setRotationAngle(0, 0, 0).setName("Box 1925")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 481, 441, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0)
			.setRotationPoint(-34.1f, 0.5f, -5.5f).setRotationAngle(0, 0, 0).setName("Box 1926")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 489, 441, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-34.1f, 2.75f, -5.5f).setRotationAngle(0, 0, 0).setName("Box 1927")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 497, 441, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-36.35f, 2.75f, -5.5f).setRotationAngle(0, 0, 0).setName("Box 1928")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 505, 441, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-32.1f, 2.75f, -5.5f).setRotationAngle(0, 0, 0).setName("Box 1929")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 1, 449, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0)
			.setRotationPoint(-32.1f, 0.5f, -5.5f).setRotationAngle(0, 0, 0).setName("Box 1930")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 329, 449, textureX, textureY).addBox(0, 0, 0, 1, 6, 1)
			.setRotationPoint(-39.1f, 0.5f, -5.5f).setRotationAngle(0, 0, 0).setName("Box 1942")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 337, 449, textureX, textureY)
			.addShapeBox(0, 0, 0, 35, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-45.1f, -0.5f, -5.5f).setRotationAngle(0, 0, 0).setName("Box 1943")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 17, 1, textureX, textureY).addBox(0, 0, 0, 1, 6, 1)
			.setRotationPoint(-11.1f, 0.5f, -5.5f).setRotationAngle(0, 0, 0).setName("Box 21")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 25, 1, textureX, textureY).addBox(0, 0, 0, 1, 6, 1)
			.setRotationPoint(-17.1f, 0.5f, -5.5f).setRotationAngle(0, 0, 0).setName("Box 22")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 65, 1, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-12.1f, 4, -5.5f).setRotationAngle(0, 0, 0).setName("Box 34")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 73, 1, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0)
			.setRotationPoint(-12.1f, 1, -5.5f).setRotationAngle(0, 0, 0).setName("Box 35")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 81, 1, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0)
			.setRotationPoint(-16.1f, 1, -5.5f).setRotationAngle(0, 0, 0).setName("Box 36")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 89, 1, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-16.1f, 4, -5.5f).setRotationAngle(0, 0, 0).setName("Box 37")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 169, 1, textureX, textureY).addBox(0, 0, 0, 5, 1, 1)
			.setRotationPoint(-16.1f, 5, -5.5f).setRotationAngle(0, 0, 0).setName("Box 55")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 185, 1, textureX, textureY)
			.addShapeBox(0, 0, 0, 9, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0)
			.setRotationPoint(-18.1f, 6.5f, -5.5f).setRotationAngle(0, 0, 0).setName("Box 105")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 209, 1, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.25f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.25f, -0.5f, 0)
			.setRotationPoint(-9.1f, 5.5f, -5.5f).setRotationAngle(0, 0, 0).setName("Box 106")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 217, 1, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-10.1f, 5.5f, -5.5f).setRotationAngle(0, 0, 0).setName("Box 107")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 225, 1, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-18.1f, 5.5f, -5.5f).setRotationAngle(0, 0, 0).setName("Box 108")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 233, 1, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, -0.5f, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(-19.1f, 5.5f, -5.5f).setRotationAngle(0, 0, 0).setName("Box 109")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 497, 1, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 6, 1, 0, -0.2f, 0, 0, -0.3f, 0, 0, -0.3f, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0, -0.3f, 0, 0, -0.3f, 0, 0, -0.2f, 0, 0)
			.setRotationPoint(-10.3f, -0.5f, -5.5f).setRotationAngle(0, 0, 0).setName("Box 158")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 289, 25, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 3, 1, 0, 0, 0, -0.4f, 0, 0, -0.4f, 0, 0, -0.4f, 0, 0, -0.4f, 0, 0, -0.4f, 0, 0, -0.4f, 0, 0, -0.4f, 0, 0, -0.4f)
			.setRotationPoint(-16.1f, 1.5f, -5.5f).setRotationAngle(0, 0, 0).setName("Box 479")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 33, 297, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(-16.1f, 0.5f, -5.5f).setRotationAngle(0, 0, 0).setName("Box 2072")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 337, 417, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 12, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.3f, -0.3f, 0, -0.3f, -0.3f, 0, 0, 0, 0)
			.setRotationPoint(-13.6f, 3, -6).setRotationAngle(0, 0, 0).setName("Box 1893")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 297, 433, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 12, 0, 0, 0, 0, -0.3f, -0.3f, 0, -0.3f, -0.3f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-13.6f, 2, -6).setRotationAngle(0, 0, 0).setName("Box 1894")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 33, 441, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 12, 0, -0.3f, -0.3f, 0, 0, 0, 0, 0, 0, 0, -0.3f, -0.3f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-14.6f, 2, -6).setRotationAngle(0, 0, 0).setName("Box 1895")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 257, 441, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 12, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.3f, -0.3f, 0, 0, 0, 0, 0, 0, 0, -0.3f, -0.3f, 0)
			.setRotationPoint(-14.6f, 3, -6).setRotationAngle(0, 0, 0).setName("Box 1896")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 9, 449, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0)
			.setRotationPoint(-24.1f, 0.5f, -5.5f).setRotationAngle(0, 0, 0).setName("Box 1931")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 17, 449, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0)
			.setRotationPoint(-22.35f, 0.5f, -5.5f).setRotationAngle(0, 0, 0).setName("Box 1932")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 25, 449, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-22.35f, 2.75f, -5.5f).setRotationAngle(0, 0, 0).setName("Box 1933")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 33, 449, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-24.1f, 2.75f, -5.5f).setRotationAngle(0, 0, 0).setName("Box 1934")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 273, 449, textureX, textureY).addBox(0, 0, 0, 7, 1, 1)
			.setRotationPoint(-24.1f, 3.75f, -5.5f).setRotationAngle(0, 0, 0).setName("Box 1935")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 297, 449, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0.25f, 0, 0, 0, 0, 0, 0, 0, 0, 0.25f, 0, 0, 0.25f, 0.25f, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0.25f, 0.25f, 0)
			.setRotationPoint(-21.1f, 0.5f, -5.5f).setRotationAngle(0, 0, 0).setName("Box 1936")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 257, 449, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0)
			.setRotationPoint(-18.1f, 0.5f, -5.5f).setRotationAngle(0, 0, 0).setName("Box 1937")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 305, 449, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0)
			.setRotationPoint(-20.1f, 0.5f, -5.5f).setRotationAngle(0, 0, 0).setName("Box 1938")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 313, 449, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-20.1f, 2.75f, -5.5f).setRotationAngle(0, 0, 0).setName("Box 1939")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 321, 449, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-18.1f, 2.75f, -5.5f).setRotationAngle(0, 0, 0).setName("Box 1940")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 1, 9, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 3, 11, 0, 0, -1, 0, 0, 2.5f, 0, 0, 2.5f, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-63.35f, -1, -5.5f).setRotationAngle(0, 0, 0).setName("Box 126")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 41, 9, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 11, 0, 0, 0, 0, 0.2f, 0, 0, 0.2f, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0)
			.setRotationPoint(-67.1f, 2, -5.5f).setRotationAngle(0, 0, 0).setName("Box 127")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 105, 9, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 11, 0, 0.25f, 0, 0, 0, 0, 0, 0, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, -0.4f, 0, 0, -0.4f, 0, 0, 0.25f, 0, 0)
			.setRotationPoint(-69.1f, 3, -5.5f).setRotationAngle(0, 0, 0).setName("Box 129")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 137, 9, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 11, 0, 0, 0, 0, 0.4f, 0, 0, 0.4f, 0, 0, 0, 0, 0, -0.4f, 0, 0, 0, 0, 0, 0, 0, 0, -0.4f, 0, 0)
			.setRotationPoint(-60.6f, 3, -5.5f).setRotationAngle(0, 0, 0).setName("Box 130")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 169, 9, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 11, 0, 0.2f, 0, 0, 0, 0, 0, 0, 0, 0, 0.2f, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0)
			.setRotationPoint(-61.6f, 2, -5.5f).setRotationAngle(0, 0, 0).setName("Box 132")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 185, 17, textureX, textureY).addBox(0, 0, 0, 1, 1, 9)
			.setRotationPoint(-10.6f, -0.5f, -4.5f).setRotationAngle(0, 0, 0).setName("Box 463")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 321, 17, textureX, textureY).addBox(0, 0, 0, 1, 1, 9)
			.setRotationPoint(-10.6f, 5.5f, -4.5f).setRotationAngle(0, 0, 0).setName("Box 464")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 345, 25, textureX, textureY).addBox(0, 0, 0, 1, 1, 9)
			.setRotationPoint(-45.6f, -0.5f, -4.5f).setRotationAngle(0, 0, 0).setName("Box 509")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 369, 25, textureX, textureY).addBox(0, 0, 0, 1, 1, 9)
			.setRotationPoint(-45.6f, 4.5f, -4.5f).setRotationAngle(0, 0, 0).setName("Box 510")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 321, 369, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 8, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.75f, 0, 0, -0.75f, -2, 0, 0, 1.5f, 0, 0, 1.5f, 0, -0.75f, -2, 0, -0.75f)
			.setRotationPoint(-64.6f, -7.75f, -2.13f).setRotationAngle(0, 0, 0).setName("Box 1727")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 329, 369, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 8, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.75f, 0, 0, -0.75f, -2, 0, 0, 1.5f, 0, 0, 1.5f, 0, -0.75f, -2, 0, -0.75f)
			.setRotationPoint(-64.6f, -7.75f, 1.92f).setRotationAngle(0, 0, 0).setName("Box 1728")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 17, 377, textureX, textureY).addBox(0, 0, 0, 4, 2, 11)
			.setRotationPoint(-67.35f, 0, -5.5f).setRotationAngle(0, 0, 0).setName("Box 1756")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 129, 545, textureX, textureY)
			.addShapeBox(0, 0, 0, 12, 1, 11, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0, 0)
			.setRotationPoint(-60.6f, 2, -5.5f).setRotationAngle(0, 0, 0).setName("Box 1900")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 489, 537, textureX, textureY)
			.addShapeBox(0, 0, 0, 9, 1, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(-57.35f, 2.5f, -6.5f).setRotationAngle(0, 0, 0).setName("Box 1902")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 433, 481, textureX, textureY).addBox(0, 0, 0, 9, 4, 4)
			.setRotationPoint(-57.6f, 1, 7.25f).setRotationAngle(0, 0, 0).setName("Box 1939")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 465, 481, textureX, textureY)
			.addShapeBox(0, 0, 0, 9, 4, 1, 0, 0, -1.5f, -0.25f, 0, -1.5f, -0.25f, 0, 0, 0, 0, 0, 0, 0, -1.5f, -0.25f, 0, -1.5f, -0.25f, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-57.6f, 1, 6.25f).setRotationAngle(0, 0, 0).setName("Box 1940")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 489, 481, textureX, textureY)
			.addShapeBox(0, 0, 0, 9, 4, 1, 0, 0, -1.5f, -0.25f, 0, -1.5f, -0.25f, 0, 0, 0, 0, 0, 0, 0, -1.5f, -0.25f, 0, -1.5f, -0.25f, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-57.6f, 0, 11.25f).setRotationAngle(-90, 0, 0).setName("Box 1941")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 1, 489, textureX, textureY)
			.addShapeBox(0, 0, 0, 9, 4, 1, 0, 0, 0, 0, 0, 0, 0, 0, -1.5f, -0.25f, 0, -1.5f, -0.25f, 0, 0, 0, 0, 0, 0, 0, -1.5f, -0.25f, 0, -1.5f, -0.25f)
			.setRotationPoint(-57.6f, 1, 11.25f).setRotationAngle(0, 0, 0).setName("Box 1942")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 25, 489, textureX, textureY)
			.addShapeBox(0, 0, 0, 9, 4, 1, 0, 0, 0, 0, 0, 0, 0, 0, -1.5f, -0.25f, 0, -1.5f, -0.25f, 0, 0, 0, 0, 0, 0, 0, -1.5f, -0.25f, 0, -1.5f, -0.25f)
			.setRotationPoint(-57.6f, 5, 11.25f).setRotationAngle(-90, 0, 0).setName("Box 1943")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 49, 489, textureX, textureY)
			.addShapeBox(0, 0, 0, 9, 3, 3, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(-57.6f, -4, 8.45f).setRotationAngle(0, 0, 0).setName("Box 1950")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 81, 489, textureX, textureY)
			.addShapeBox(0, 0, 0, 9, 1, 3, 0, 0, -0.5f, -1.5f, 0, -0.5f, -1.5f, 0, -0.5f, -1, 0, -0.5f, -1, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-57.6f, -5, 8.45f).setRotationAngle(0, 0, 0).setName("Box 1952")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 113, 489, textureX, textureY)
			.addShapeBox(0, 0, 0, 9, 1, 3, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -1.5f, 0, -0.5f, -1.5f, 0, -0.5f, -1, 0, -0.5f, -1)
			.setRotationPoint(-57.6f, -1, 11.45f).setRotationAngle(90, 0, 0).setName("Box 1953")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 145, 489, textureX, textureY)
			.addShapeBox(0, 0, 0, 9, 1, 3, 0, 0, -0.5f, -1.5f, 0, -0.5f, -1.5f, 0, -0.5f, -1, 0, -0.5f, -1, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-57.6f, -1, 7.95f).setRotationAngle(90, 0, 0).setName("Box 1955")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 457, 489, textureX, textureY)
			.addShapeBox(0, 0, 0, 9, 1, 3, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -1.5f, 0, -0.5f, -1.5f, 0, -0.5f, -1, 0, -0.5f, -1)
			.setRotationPoint(-57.6f, -1.5f, 8.45f).setRotationAngle(0, 0, 0).setName("Box 1956")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 169, 545, textureX, textureY)
			.addShapeBox(0, 0, 0, 9, 1, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(-57.35f, 2.5f, 5.5f).setRotationAngle(0, 0, 0).setName("Box 1904")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 353, 1, textureX, textureY).addBox(0, 0, 0, 1, 1, 1)
			.setRotationPoint(-14.1f, -1.5f, -5.5f).setRotationAngle(0, 0, 0).setName("Box 129")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 361, 1, textureX, textureY).addBox(0, 0, 0, 1, 2, 1)
			.setRotationPoint(-17.61f, -4.5f, -5.5f).setRotationAngle(0, 0, 0).setName("Box 130")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 369, 1, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.2f, 0.2f, 0, -0.2f, 0.2f, 0, -0.2f, 0.2f, 0, -0.2f, 0.2f, 0, -0.2f, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0)
			.setRotationPoint(-14.1f, -3.5f, -5.5f).setRotationAngle(0, 0, 0).setName("Box 132")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 377, 1, textureX, textureY).addBox(0, 0, 0, 1, 2, 1)
			.setRotationPoint(-10.59f, -4.5f, -5.5f).setRotationAngle(0, 0, 0).setName("Box 133")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 385, 1, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.2f, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0)
			.setRotationPoint(-10.6f, -2.5f, -5.5f).setRotationAngle(0, 0, 0).setName("Box 134")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 393, 1, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.2f, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0)
			.setRotationPoint(-17.6f, -2.5f, -5.5f).setRotationAngle(0, 0, 0).setName("Box 135")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 401, 1, textureX, textureY).addBox(0, 0, 0, 1, 1, 1)
			.setRotationPoint(-28.1f, -1.5f, -5.5f).setRotationAngle(0, 0, 0).setName("Box 137")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 409, 1, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.2f, 0.2f, 0, -0.2f, 0.2f, 0, -0.2f, 0.2f, 0, -0.2f, 0.2f, 0, -0.2f, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0)
			.setRotationPoint(-28.1f, -3.5f, -5.5f).setRotationAngle(0, 0, 0).setName("Box 138")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 417, 1, textureX, textureY).addBox(0, 0, 0, 1, 2, 1)
			.setRotationPoint(-24.59f, -4.5f, -5.5f).setRotationAngle(0, 0, 0).setName("Box 140")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 425, 1, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.2f, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0)
			.setRotationPoint(-24.6f, -2.5f, -5.5f).setRotationAngle(0, 0, 0).setName("Box 141")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 433, 1, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.2f, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0)
			.setRotationPoint(-31.6f, -2.5f, -5.5f).setRotationAngle(0, 0, 0).setName("Box 142")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 441, 1, textureX, textureY).addBox(0, 0, 0, 1, 2, 1)
			.setRotationPoint(-31.61f, -4.5f, -5.5f).setRotationAngle(0, 0, 0).setName("Box 143")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 1, 49, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-28.1f, -3, -5.45f).setRotationAngle(0, 0, 0).setName("Box 667")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 9, 49, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.5f, -0.8f, 0, -0.5f, -0.6f, 0, -0.5f, -0.6f, 0, 0.5f, -0.8f, 0, 0.5f, 0, 0, -0.5f, -0.2f, 0, -0.5f, -0.2f, 0, 0.5f, 0, 0)
			.setRotationPoint(-26.6f, -3, -5.45f).setRotationAngle(0, 0, 0).setName("Box 668")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 17, 49, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, -0.6f, 0, 0.5f, -0.8f, 0, 0.5f, -0.8f, 0, -0.5f, -0.6f, 0, -0.5f, -0.2f, 0, 0.5f, 0, 0, 0.5f, 0, 0, -0.5f, -0.2f, 0)
			.setRotationPoint(-29.6f, -3, -5.45f).setRotationAngle(0, 0, 0).setName("Box 669")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 25, 49, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.6f, 0, 0.5f, -0.8f, 0, 0.5f, -0.8f, 0, 0, -0.6f, 0, 0, -0.2f, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, -0.2f, 0)
			.setRotationPoint(-29.6f, -3.25f, -5.45f).setRotationAngle(0, 0, 0).setName("Box 670")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 33, 49, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-28.1f, -3.25f, -5.45f).setRotationAngle(0, 0, 0).setName("Box 671")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 41, 49, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0.5f, -0.8f, 0, -0.5f, -0.6f, 0, -0.5f, -0.6f, 0, 0.5f, -0.8f, 0, 0.5f, 0, 0, -0.5f, -0.2f, 0, -0.5f, -0.2f, 0, 0.5f, 0, 0)
			.setRotationPoint(-26.6f, -3.5f, -5.45f).setRotationAngle(0, 0, 0).setName("Box 672")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 49, 49, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.5f, -0.8f, 0, 0, -0.6f, 0, 0, -0.6f, 0, 0.5f, -0.8f, 0, 0.5f, 0, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0.5f, 0, 0)
			.setRotationPoint(-26.6f, -3.25f, -5.45f).setRotationAngle(0, 0, 0).setName("Box 673")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 57, 49, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-28.1f, -3.5f, -5.45f).setRotationAngle(0, 0, 0).setName("Box 674")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 65, 49, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, -0.5f, -0.6f, 0, 0.5f, -0.8f, 0, 0.5f, -0.8f, 0, -0.5f, -0.6f, 0, -0.5f, -0.2f, 0, 0.5f, 0, 0, 0.5f, 0, 0, -0.5f, -0.2f, 0)
			.setRotationPoint(-30.6f, -3.5f, -5.45f).setRotationAngle(0, 0, 0).setName("Box 675")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 73, 49, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, -0.6f, 0, 0.5f, -0.8f, 0, 0.5f, -0.8f, 0, 0, -0.6f, 0, 0, -0.2f, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, -0.2f, 0)
			.setRotationPoint(-30.6f, -3.75f, -5.45f).setRotationAngle(0, 0, 0).setName("Box 676")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 81, 49, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-28.1f, -3.75f, -5.45f).setRotationAngle(0, 0, 0).setName("Box 677")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 89, 49, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0.5f, -0.8f, 0, 0, -0.6f, 0, 0, -0.6f, 0, 0.5f, -0.8f, 0, 0.5f, 0, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0.5f, 0, 0)
			.setRotationPoint(-26.6f, -3.75f, -5.45f).setRotationAngle(0, 0, 0).setName("Box 678")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 97, 49, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0.5f, -0.8f, 0, 0, -0.6f, 0, 0, -0.6f, 0, 0.5f, -0.8f, 0, 0.5f, 0, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0.5f, 0, 0)
			.setRotationPoint(-26.6f, -4.25f, -5.45f).setRotationAngle(0, 0, 0).setName("Box 679")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 113, 49, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-28.1f, -4.25f, -5.45f).setRotationAngle(0, 0, 0).setName("Box 680")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 121, 49, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, -0.6f, 0, 0.5f, -0.8f, 0, 0.5f, -0.8f, 0, 0, -0.6f, 0, 0, -0.2f, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, -0.2f, 0)
			.setRotationPoint(-31.6f, -4.25f, -5.45f).setRotationAngle(0, 0, 0).setName("Box 681")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 137, 49, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, -0.5f, -0.6f, 0, 0.5f, -0.8f, 0, 0.5f, -0.8f, 0, -0.5f, -0.6f, 0, -0.5f, -0.2f, 0, 0.5f, 0, 0, 0.5f, 0, 0, -0.5f, -0.2f, 0)
			.setRotationPoint(-31.6f, -4, -5.45f).setRotationAngle(0, 0, 0).setName("Box 682")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 153, 49, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-28.1f, -4, -5.45f).setRotationAngle(0, 0, 0).setName("Box 683")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 161, 49, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0.5f, -0.8f, 0, -0.5f, -0.6f, 0, -0.5f, -0.6f, 0, 0.5f, -0.8f, 0, 0.5f, 0, 0, -0.5f, -0.2f, 0, -0.5f, -0.2f, 0, 0.5f, 0, 0)
			.setRotationPoint(-26.6f, -4, -5.45f).setRotationAngle(0, 0, 0).setName("Box 684")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 177, 49, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-14.1f, -3, -5.45f).setRotationAngle(0, 0, 0).setName("Box 685")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 185, 49, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.5f, -0.8f, 0, -0.5f, -0.6f, 0, -0.5f, -0.6f, 0, 0.5f, -0.8f, 0, 0.5f, 0, 0, -0.5f, -0.2f, 0, -0.5f, -0.2f, 0, 0.5f, 0, 0)
			.setRotationPoint(-12.6f, -3, -5.45f).setRotationAngle(0, 0, 0).setName("Box 686")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 193, 49, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, -0.6f, 0, 0.5f, -0.8f, 0, 0.5f, -0.8f, 0, -0.5f, -0.6f, 0, -0.5f, -0.2f, 0, 0.5f, 0, 0, 0.5f, 0, 0, -0.5f, -0.2f, 0)
			.setRotationPoint(-15.6f, -3, -5.45f).setRotationAngle(0, 0, 0).setName("Box 687")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 201, 49, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.6f, 0, 0.5f, -0.8f, 0, 0.5f, -0.8f, 0, 0, -0.6f, 0, 0, -0.2f, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, -0.2f, 0)
			.setRotationPoint(-15.6f, -3.25f, -5.45f).setRotationAngle(0, 0, 0).setName("Box 688")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 209, 49, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-14.1f, -3.25f, -5.45f).setRotationAngle(0, 0, 0).setName("Box 689")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 217, 49, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0.5f, -0.8f, 0, -0.5f, -0.6f, 0, -0.5f, -0.6f, 0, 0.5f, -0.8f, 0, 0.5f, 0, 0, -0.5f, -0.2f, 0, -0.5f, -0.2f, 0, 0.5f, 0, 0)
			.setRotationPoint(-12.6f, -3.5f, -5.45f).setRotationAngle(0, 0, 0).setName("Box 690")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 225, 49, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.5f, -0.8f, 0, 0, -0.6f, 0, 0, -0.6f, 0, 0.5f, -0.8f, 0, 0.5f, 0, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0.5f, 0, 0)
			.setRotationPoint(-12.6f, -3.25f, -5.45f).setRotationAngle(0, 0, 0).setName("Box 691")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 233, 49, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-14.1f, -3.5f, -5.45f).setRotationAngle(0, 0, 0).setName("Box 692")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 241, 49, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, -0.5f, -0.6f, 0, 0.5f, -0.8f, 0, 0.5f, -0.8f, 0, -0.5f, -0.6f, 0, -0.5f, -0.2f, 0, 0.5f, 0, 0, 0.5f, 0, 0, -0.5f, -0.2f, 0)
			.setRotationPoint(-16.6f, -3.5f, -5.45f).setRotationAngle(0, 0, 0).setName("Box 693")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 249, 49, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, -0.6f, 0, 0.5f, -0.8f, 0, 0.5f, -0.8f, 0, 0, -0.6f, 0, 0, -0.2f, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, -0.2f, 0)
			.setRotationPoint(-16.6f, -3.75f, -5.45f).setRotationAngle(0, 0, 0).setName("Box 694")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 257, 49, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-14.1f, -3.75f, -5.45f).setRotationAngle(0, 0, 0).setName("Box 695")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 265, 49, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0.5f, -0.8f, 0, 0, -0.6f, 0, 0, -0.6f, 0, 0.5f, -0.8f, 0, 0.5f, 0, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0.5f, 0, 0)
			.setRotationPoint(-12.6f, -3.75f, -5.45f).setRotationAngle(0, 0, 0).setName("Box 696")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 273, 49, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0.5f, -0.8f, 0, 0, -0.6f, 0, 0, -0.6f, 0, 0.5f, -0.8f, 0, 0.5f, 0, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0.5f, 0, 0)
			.setRotationPoint(-12.6f, -4.25f, -5.45f).setRotationAngle(0, 0, 0).setName("Box 697")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 289, 49, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-14.1f, -4.25f, -5.45f).setRotationAngle(0, 0, 0).setName("Box 698")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 297, 49, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, -0.6f, 0, 0.5f, -0.8f, 0, 0.5f, -0.8f, 0, 0, -0.6f, 0, 0, -0.2f, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, -0.2f, 0)
			.setRotationPoint(-17.6f, -4.25f, -5.45f).setRotationAngle(0, 0, 0).setName("Box 699")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 313, 49, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, -0.5f, -0.6f, 0, 0.5f, -0.8f, 0, 0.5f, -0.8f, 0, -0.5f, -0.6f, 0, -0.5f, -0.2f, 0, 0.5f, 0, 0, 0.5f, 0, 0, -0.5f, -0.2f, 0)
			.setRotationPoint(-17.6f, -4, -5.45f).setRotationAngle(0, 0, 0).setName("Box 700")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 329, 49, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-14.1f, -4, -5.45f).setRotationAngle(0, 0, 0).setName("Box 701")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 337, 49, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0.5f, -0.8f, 0, -0.5f, -0.6f, 0, -0.5f, -0.6f, 0, 0.5f, -0.8f, 0, 0.5f, 0, 0, -0.5f, -0.2f, 0, -0.5f, -0.2f, 0, 0.5f, 0, 0)
			.setRotationPoint(-12.6f, -4, -5.45f).setRotationAngle(0, 0, 0).setName("Box 702")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 449, 1, textureX, textureY).addBox(0, 0, 0, 1, 1, 1)
			.setRotationPoint(-42.1f, -1.5f, -5.5f).setRotationAngle(0, 0, 0).setName("Box 151")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 457, 1, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.2f, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0)
			.setRotationPoint(-45.6f, -2.5f, -5.5f).setRotationAngle(0, 0, 0).setName("Box 152")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 465, 1, textureX, textureY).addBox(0, 0, 0, 1, 2, 1)
			.setRotationPoint(-45.61f, -4.5f, -5.5f).setRotationAngle(0, 0, 0).setName("Box 153")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 473, 1, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.2f, 0.2f, 0, -0.2f, 0.2f, 0, -0.2f, 0.2f, 0, -0.2f, 0.2f, 0, -0.2f, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0)
			.setRotationPoint(-42.1f, -3.5f, -5.5f).setRotationAngle(0, 0, 0).setName("Box 155")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 481, 1, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.2f, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0)
			.setRotationPoint(-38.6f, -2.5f, -5.5f).setRotationAngle(0, 0, 0).setName("Box 156")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 489, 1, textureX, textureY).addBox(0, 0, 0, 1, 2, 1)
			.setRotationPoint(-38.59f, -4.5f, -5.5f).setRotationAngle(0, 0, 0).setName("Box 157")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 337, 41, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-42.1f, -4, -5.45f).setRotationAngle(0, 0, 0).setName("Box 641")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 345, 41, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0.5f, -0.8f, 0, -0.5f, -0.6f, 0, -0.5f, -0.6f, 0, 0.5f, -0.8f, 0, 0.5f, 0, 0, -0.5f, -0.2f, 0, -0.5f, -0.2f, 0, 0.5f, 0, 0)
			.setRotationPoint(-40.6f, -4, -5.45f).setRotationAngle(0, 0, 0).setName("Box 642")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 361, 41, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-42.1f, -4.25f, -5.45f).setRotationAngle(0, 0, 0).setName("Box 646")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 369, 41, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0.5f, -0.8f, 0, 0, -0.6f, 0, 0, -0.6f, 0, 0.5f, -0.8f, 0, 0.5f, 0, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0.5f, 0, 0)
			.setRotationPoint(-40.6f, -4.25f, -5.45f).setRotationAngle(0, 0, 0).setName("Box 647")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 385, 41, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-42.1f, -3.75f, -5.45f).setRotationAngle(0, 0, 0).setName("Box 649")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 393, 41, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0.5f, -0.8f, 0, 0, -0.6f, 0, 0, -0.6f, 0, 0.5f, -0.8f, 0, 0.5f, 0, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0.5f, 0, 0)
			.setRotationPoint(-40.6f, -3.75f, -5.45f).setRotationAngle(0, 0, 0).setName("Box 650")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 401, 41, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-42.1f, -3.5f, -5.45f).setRotationAngle(0, 0, 0).setName("Box 652")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 409, 41, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0.5f, -0.8f, 0, -0.5f, -0.6f, 0, -0.5f, -0.6f, 0, 0.5f, -0.8f, 0, 0.5f, 0, 0, -0.5f, -0.2f, 0, -0.5f, -0.2f, 0, 0.5f, 0, 0)
			.setRotationPoint(-40.6f, -3.5f, -5.45f).setRotationAngle(0, 0, 0).setName("Box 653")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 417, 41, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-42.1f, -3.25f, -5.45f).setRotationAngle(0, 0, 0).setName("Box 656")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 425, 41, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.5f, -0.8f, 0, 0, -0.6f, 0, 0, -0.6f, 0, 0.5f, -0.8f, 0, 0.5f, 0, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0.5f, 0, 0)
			.setRotationPoint(-40.6f, -3.25f, -5.45f).setRotationAngle(0, 0, 0).setName("Box 657")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 433, 41, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.5f, -0.8f, 0, -0.5f, -0.6f, 0, -0.5f, -0.6f, 0, 0.5f, -0.8f, 0, 0.5f, 0, 0, -0.5f, -0.2f, 0, -0.5f, -0.2f, 0, 0.5f, 0, 0)
			.setRotationPoint(-40.6f, -3, -5.45f).setRotationAngle(0, 0, 0).setName("Box 658")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 441, 41, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-42.1f, -3, -5.45f).setRotationAngle(0, 0, 0).setName("Box 660")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 449, 41, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, -0.5f, -0.6f, 0, 0.5f, -0.8f, 0, 0.5f, -0.8f, 0, -0.5f, -0.6f, 0, -0.5f, -0.2f, 0, 0.5f, 0, 0, 0.5f, 0, 0, -0.5f, -0.2f, 0)
			.setRotationPoint(-44.6f, -3.5f, -5.45f).setRotationAngle(0, 0, 0).setName("Box 661")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 457, 41, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.6f, 0, 0.5f, -0.8f, 0, 0.5f, -0.8f, 0, 0, -0.6f, 0, 0, -0.2f, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, -0.2f, 0)
			.setRotationPoint(-43.6f, -3.25f, -5.45f).setRotationAngle(0, 0, 0).setName("Box 662")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 465, 41, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, -0.6f, 0, 0.5f, -0.8f, 0, 0.5f, -0.8f, 0, -0.5f, -0.6f, 0, -0.5f, -0.2f, 0, 0.5f, 0, 0, 0.5f, 0, 0, -0.5f, -0.2f, 0)
			.setRotationPoint(-43.6f, -3, -5.45f).setRotationAngle(0, 0, 0).setName("Box 663")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 473, 41, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, -0.6f, 0, 0.5f, -0.8f, 0, 0.5f, -0.8f, 0, 0, -0.6f, 0, 0, -0.2f, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, -0.2f, 0)
			.setRotationPoint(-44.6f, -3.75f, -5.45f).setRotationAngle(0, 0, 0).setName("Box 664")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 481, 41, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, -0.5f, -0.6f, 0, 0.5f, -0.8f, 0, 0.5f, -0.8f, 0, -0.5f, -0.6f, 0, -0.5f, -0.2f, 0, 0.5f, 0, 0, 0.5f, 0, 0, -0.5f, -0.2f, 0)
			.setRotationPoint(-45.6f, -4, -5.45f).setRotationAngle(0, 0, 0).setName("Box 665")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 497, 41, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, -0.6f, 0, 0.5f, -0.8f, 0, 0.5f, -0.8f, 0, 0, -0.6f, 0, 0, -0.2f, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, -0.2f, 0)
			.setRotationPoint(-45.6f, -4.25f, -5.45f).setRotationAngle(0, 0, 0).setName("Box 666")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 281, 377, textureX, textureY).addBox(0, 0, 0, 3, 3, 0)
			.setRotationPoint(-54.6f, -2.25f, 12.02f).setRotationAngle(0, 0, 0).setName("Box 1788")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 185, 137, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 9, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0)
			.setRotationPoint(-36.35f, -1.5f, -4.5f).setRotationAngle(0, 0, 0).setName("Box 1033")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 489, 105, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 9, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0.5f, -1, 0, 0.5f, -1, 0, 0.5f, -1, 0, 0.5f, -1, 0)
			.setRotationPoint(-35.85f, -2, -4.5f).setRotationAngle(0, 0, 0).setName("Box 1034")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 329, 137, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 9, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-36.85f, -0.5f, -4.5f).setRotationAngle(0, 0, 0).setName("Box 1039")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 353, 145, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 3, 0, 0, 0, 0, 0, 1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 1, -2, 0, 1, -2, 0, 0, 0, 0)
			.setRotationPoint(-44.6f, -6.3f, -10.5f).setRotationAngle(0, 0, 0).setName("Box 1714")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 393, 177, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 3, 0, 0, 0, 0, 0, -1, 0, -3, -1, 0, 2, 0, -1, 0, 0, 0, 0, -1, 0, -3, -1, 0, 2, 0, -1)
			.setRotationPoint(-44.6f, -5.3f, -10.5f).setRotationAngle(90, 0, 90).setName("Box 1715")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 385, 345, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 16, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0)
			.setRotationPoint(-60.6f, -7.3f, -10.5f).setRotationAngle(90, 0, 90).setName("Box 1716")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 473, 345, textureX, textureY).addBox(0, 0, 0, 1, 3, 16)
			.setRotationPoint(-60.6f, -6.3f, -10.5f).setRotationAngle(90, 0, 90).setName("Box 1717")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 89, 353, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 16, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0)
			.setRotationPoint(-60.6f, -5.3f, -10.5f).setRotationAngle(90, 0, 90).setName("Box 1718")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 153, 193, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 4, 0, 0, 0.25f, 0, 0.25f, -1, 0, 0.25f, -1, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0.25f, -1, 0, 0.25f, -1, 0, 0, 0.25f, 0)
			.setRotationPoint(-63.6f, -5.3f, -10.5f).setRotationAngle(90, 0, 90).setName("Box 1719")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 169, 193, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 4, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0.25f, 0)
			.setRotationPoint(-63.6f, -6.3f, -10.5f).setRotationAngle(90, 0, 90).setName("Box 1720")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 257, 193, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 4, 0, 0.25f, -1, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0.25f, -1, 0, 0.25f, -1, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0.25f, -1, 0)
			.setRotationPoint(-63.6f, -7.3f, -10.5f).setRotationAngle(90, 0, 90).setName("Box 1721")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 289, 321, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -1, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, -1, 0, 0, 0)
			.setRotationPoint(-44.6f, -7.3f, -10.5f).setRotationAngle(0, 0, 0).setName("Box 1560")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 289, 401, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 2, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-55.6f, -3.56f, -11.5f).setRotationAngle(60, 0, 0).setName("Box 1818")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 353, 401, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 2, 0, 0, -1, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0, -1, 0, 0, -1, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0, -1, 0)
			.setRotationPoint(-56.6f, -3.56f, -11.5f).setRotationAngle(60, 0, 0).setName("Box 1819")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 361, 401, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 2, 0, 0, 0, -0.25f, 0, -1, -0.25f, 0, -1, 0, 0, 0, 0, 0, 0, -0.25f, 0, -1, -0.25f, 0, -1, 0, 0, 0, 0)
			.setRotationPoint(-54.6f, -3.56f, -11.5f).setRotationAngle(60, 0, 0).setName("Box 1820")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 177, 321, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, -1, -1, 0, -1, 0, 0, 0, 0)
			.setRotationPoint(-44.6f, -7.3f, -8.5f).setRotationAngle(0, 0, 0).setName("Box 1713")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 137, 321, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 16, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0)
			.setRotationPoint(-61.1f, -7, -1.5f).setRotationAngle(90, 0, 90).setName("Box 1226")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 177, 321, textureX, textureY).addBox(0, 0, 0, 1, 3, 16)
			.setRotationPoint(-61.1f, -6, -1.5f).setRotationAngle(90, 0, 90).setName("Box 1227")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 265, 321, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 16, 0, 0, 0, 0, -0.25f, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, -0.25f, -1, 0, 0, -1, 0, 0, 0, 0)
			.setRotationPoint(-61.1f, -5, -1.5f).setRotationAngle(90, 0, 90).setName("Box 1228")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 1, 313, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -1, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, -1, 0, 0, 0)
			.setRotationPoint(-45.1f, -7, -1.5f).setRotationAngle(0, 0, 0).setName("Box 1254")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 33, 57, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 3, 0, 0, 0, 0, 0, 1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 1, -2, 0, 1, -2, 0, 0, 0, 0)
			.setRotationPoint(-45.1f, -6, -1.5f).setRotationAngle(0, 0, 0).setName("Box 1259")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 49, 57, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 3, 0, 0, 0, 0, 0, -1, 0, -3, -1, 0, 2, 0, -1, 0, 0, 0, 0, -1, 0, -3, -1, 0, 2, 0, -1)
			.setRotationPoint(-45.1f, -5, -1.5f).setRotationAngle(90, 0, 90).setName("Box 1260")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 305, 321, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, -0.25f, 0, -1, -0.25f, 0, -1, 0.125f, 0, 0, 0.125f, 0, 0, -0.25f, 0, -1, -0.25f, 0, -1, 0.125f, 0, 0, 0.125f)
			.setRotationPoint(-43.1f, -6.75f, -1.5f).setRotationAngle(90, 0, 0).setName("Box 1561")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 329, 321, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, -1, -0.25f, 0, 0, -0.25f, 0, 0, 0.125f, 0, -1, 0.125f, 0, -1, -0.25f, 0, 0, -0.25f, 0, 0, 0.125f, 0, -1, 0.125f)
			.setRotationPoint(-45.1f, -6.75f, -1.5f).setRotationAngle(90, 0, 0).setName("Box 1562")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 409, 321, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0.125f, 0, 0, 0.125f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0.125f, 0, 0, 0.125f)
			.setRotationPoint(-44.1f, -6.75f, -1.5f).setRotationAngle(90, 0, 0).setName("Box 1563")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 425, 313, textureX, textureY).addBox(0, 0, 0, 1, 3, 18)
			.setRotationPoint(-62.1f, -7.25f, -8.5f).setRotationAngle(0, 0, 0).setName("Box 1162")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 305, 321, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 18, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0)
			.setRotationPoint(-63.1f, -7.25f, -8.5f).setRotationAngle(0, 0, 0).setName("Box 1215")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 345, 321, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 18, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0)
			.setRotationPoint(-61.1f, -7.25f, -8.5f).setRotationAngle(0, 0, 0).setName("Box 1218")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 121, 65, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 3, 0, 0, 0, 0, 0, 1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 1, -2, 0, 1, -2, 0, 0, 0, 0)
			.setRotationPoint(-44.6f, -6.3f, 7.5f).setRotationAngle(0, 0, 0).setName("Box 1681")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 153, 65, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 3, 0, 0, 0, 0, 0, -1, 0, -3, -1, 0, 2, 0, -1, 0, 0, 0, 0, -1, 0, -3, -1, 0, 2, 0, -1)
			.setRotationPoint(-44.6f, -5.3f, 7.5f).setRotationAngle(90, 0, 90).setName("Box 1683")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 201, 337, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 16, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0)
			.setRotationPoint(-60.6f, -7.3f, 7.5f).setRotationAngle(90, 0, 90).setName("Box 1684")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 241, 337, textureX, textureY).addBox(0, 0, 0, 1, 3, 16)
			.setRotationPoint(-60.6f, -6.3f, 7.5f).setRotationAngle(90, 0, 90).setName("Box 1685")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 409, 337, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 16, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0)
			.setRotationPoint(-60.6f, -5.3f, 7.5f).setRotationAngle(90, 0, 90).setName("Box 1686")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 73, 321, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -1, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, -1, 0, 0, 0)
			.setRotationPoint(-44.6f, -7.3f, 7.5f).setRotationAngle(0, 0, 0).setName("Box 1687")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 297, 65, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 4, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0.25f, 0)
			.setRotationPoint(-63.6f, -6.3f, 7.5f).setRotationAngle(90, 0, 90).setName("Box 1688")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 313, 65, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 4, 0, 0.25f, -1, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0.25f, -1, 0, 0.25f, -1, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0.25f, -1, 0)
			.setRotationPoint(-63.6f, -7.3f, 7.5f).setRotationAngle(90, 0, 90).setName("Box 1689")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 329, 65, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 4, 0, 0, 0.25f, 0, 0.25f, -1, 0, 0.25f, -1, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0.25f, -1, 0, 0.25f, -1, 0, 0, 0.25f, 0)
			.setRotationPoint(-63.6f, -5.3f, 7.5f).setRotationAngle(90, 0, 90).setName("Box 1690")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 57, 321, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, -1, -1, 0, -1, 0, 0, 0, 0)
			.setRotationPoint(-44.6f, -7.3f, 9.5f).setRotationAngle(0, 0, 0).setName("Box 1682")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 161, 225, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 2, 0, -0.25f, 0, -0.35f, -0.5f, 0, -0.35f, -0.5f, 0, -0.35f, -0.25f, 0, -0.35f, 0.75f, 0, -0.35f, 0.25f, 0, -0.35f, 0.25f, 0, -0.35f, 0.75f, 0, -0.35f)
			.setRotationPoint(-39.1f, 3.25f, 7.5f).setRotationAngle(0, 0, 0).setName("Box 1756")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 177, 225, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 2, 0, -0.25f, 0, -0.35f, -0.5f, 0, -0.35f, -0.5f, 0, -0.35f, -0.25f, 0, -0.35f, -0.25f, -0.5f, -0.35f, -0.5f, -0.5f, -0.35f, -0.5f, -0.5f, -0.35f, -0.25f, -0.5f, -0.35f)
			.setRotationPoint(-39.1f, 2.75f, 7.5f).setRotationAngle(0, 0, 0).setName("Box 1757")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 193, 225, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 2, 0, 0.75f, 0, -0.35f, 0.25f, 0, -0.35f, 0.25f, 0, -0.35f, 0.75f, 0, -0.35f, -0.25f, 0, -0.35f, -0.5f, 0, -0.35f, -0.5f, 0, -0.35f, -0.25f, 0, -0.35f)
			.setRotationPoint(-39.1f, 1.75f, 7.5f).setRotationAngle(0, 0, 0).setName("Box 1758")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 209, 225, textureX, textureY).addBox(0, 0, 0, 12, 1, 1)
			.setRotationPoint(-50.1f, 2.5f, 8).setRotationAngle(0, 0, 0).setName("Box 1759")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 393, 225, textureX, textureY)
			.addShapeBox(0, 0, 0, 24, 1, 1, 0, -0.25f, 0.25f, -0.25f, -0.25f, 0.25f, -0.25f, -0.25f, 0.25f, -0.25f, -0.25f, 0.25f, -0.25f, -0.25f, 0.25f, -0.25f, -0.25f, 0.25f, -0.25f, -0.25f, 0.25f, -0.25f, -0.25f, 0.25f, -0.25f)
			.setRotationPoint(-37.1f, 2.5f, 8).setRotationAngle(0, 0, 8.4f).setName("Box 1761")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 353, 225, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0.25f, -0.25f, -0.65f, -0.5f, -0.25f, -0.65f, -0.5f, -0.15f, 0, 0.25f, -0.15f, 0, 0.25f, -0.25f, -0.65f, -0.5f, -0.25f, -0.65f, -0.5f, -0.15f, 0, 0.25f, -0.15f)
			.setRotationPoint(-12.85f, 6, 9.1f).setRotationAngle(0, 0, 0).setName("Box 1780")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 361, 225, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.65f, -0.5f, -0.25f, 0, 0.25f, -0.25f, 0, 0.25f, -0.15f, -0.65f, -0.5f, -0.15f, -0.65f, -0.5f, -0.25f, 0, 0.25f, -0.25f, 0, 0.25f, -0.15f, -0.65f, -0.5f, -0.15f)
			.setRotationPoint(-15.35f, 6, 9.1f).setRotationAngle(0, 0, 0).setName("Box 1781")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 369, 225, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.65f, -0.5f, -0.25f, 0, 0.25f, -0.25f, 0, 0.25f, -0.15f, -0.65f, -0.5f, -0.15f, -0.65f, -0.5f, -0.25f, 0, 0.25f, -0.25f, 0, 0.25f, -0.15f, -0.65f, -0.5f, -0.15f)
			.setRotationPoint(-14.1f, 8.25f, 9.1f).setRotationAngle(0, 0, -90).setName("Box 1782")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 457, 225, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 2, 1, 0, 0, 0.75f, -0.25f, -0.5f, 0.75f, -0.25f, -0.5f, 0.75f, -0.15f, 0, 0.75f, -0.15f, 0, 0.25f, -0.25f, -0.5f, 0.25f, -0.25f, -0.5f, 0.25f, -0.15f, 0, 0.25f, -0.15f)
			.setRotationPoint(-14.35f, 5, 9.1f).setRotationAngle(0, 0, 0).setName("Box 1783")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 489, 225, textureX, textureY)
			.addShapeBox(0, 0, 0, 10, 1, 1, 0, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, 0.25f, -0.25f, -0.25f, 0.25f, -0.25f, -0.25f, 0.25f, -0.25f, -0.25f, 0.25f, -0.25f)
			.setRotationPoint(-49.1f, -4, 9.55f).setRotationAngle(0, 0, 0).setName("Box 1784")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 377, 225, textureX, textureY)
			.addShapeBox(0, 0.5f, -1, 1, 6, 1, 0, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f)
			.setRotationPoint(-41.7f, -3.4f, 9.3f).setRotationAngle(0, -180, -8).setName("Box 1793")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 161, 233, textureX, textureY)
			.addShapeBox(0, 0, 0, 8, 1, 2, 0, -0.25f, -0.75f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.75f, -0.25f, -0.25f, 0.25f, -0.25f, -0.25f, 0.25f, -0.25f, -0.25f, 0.25f, -0.25f, -0.25f, 0.25f, -0.25f)
			.setRotationPoint(-48.85f, 0.5f, 7.5f).setRotationAngle(0, 0, 0).setName("Box 1838")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 185, 233, textureX, textureY)
			.addShapeBox(0, 0, 0, 10, 1, 2, 0, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, 0.25f, -0.25f, -0.25f, 0.25f, -0.25f, -0.25f, 0.25f, -0.25f, -0.25f, 0.25f, -0.25f)
			.setRotationPoint(-41.35f, 0.5f, 7.5f).setRotationAngle(0, 0, 0).setName("Box 1839")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 217, 233, textureX, textureY)
			.addShapeBox(0, 0, 0, 10, 1, 2, 0, -0.25f, 0.25f, -0.25f, -0.25f, 0.25f, -0.25f, -0.25f, 0.25f, -0.25f, -0.25f, 0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f)
			.setRotationPoint(-41.35f, 4.5f, 7.5f).setRotationAngle(0, 0, 0).setName("Box 1840")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 249, 233, textureX, textureY)
			.addShapeBox(0, 0, 0, 8, 1, 2, 0, -0.25f, 0.25f, -0.25f, -0.25f, 0.25f, -0.25f, -0.25f, 0.25f, -0.25f, -0.25f, 0.25f, -0.25f, -0.25f, -0.75f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.75f, -0.25f)
			.setRotationPoint(-48.85f, 4.5f, 7.5f).setRotationAngle(0, 0, 0).setName("Box 1841")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 473, 225, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0.75f, -0.25f, -0.5f, 0.75f, -0.25f, -0.5f, 0.75f, -0.15f, 0, 0.75f, -0.15f, 0, -1, -0.25f, -0.5f, -1, -0.25f, -0.5f, -1, -0.15f, 0, -1, -0.15f)
			.setRotationPoint(-13.85f, 5, 9.7f).setRotationAngle(0, 0, 0).setName("Box 1846")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 441, 305, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0.25f, -0.25f, -0.65f, -0.5f, -0.25f, -0.65f, -0.5f, -0.15f, 0, 0.25f, -0.15f, 0, 0.25f, -0.25f, -0.65f, -0.5f, -0.25f, -0.65f, -0.5f, -0.15f, 0, 0.25f, -0.15f)
			.setRotationPoint(-14.1f, 4.25f, 9.1f).setRotationAngle(0, 0, -90).setName("Box 2135")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 369, 329, textureX, textureY)
			.addShapeBox(-1.3f, -1, 0, 15, 1, 1, 0, -0.25f, -0.75f, -0.25f, -0.5f, -0.75f, -0.25f, -0.5f, -0.75f, -0.25f, -0.25f, -0.75f, -0.25f, -0.25f, 0.25f, -0.25f, -0.5f, 0.25f, -0.25f, -0.5f, 0.25f, -0.25f, -0.25f, 0.25f, -0.25f)
			.setRotationPoint(-26.45f, 1, 9.6f).setRotationAngle(0, 0, 15.4f).setName("Box 1571")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 417, 321, textureX, textureY)
			.addShapeBox(-1, 1.5f, -1, 1, 4, 1, 0, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f)
			.setRotationPoint(-18, -8, 9.1f).setRotationAngle(0, -180, -9).setName("Box 1572")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 1, 329, textureX, textureY)
			.addShapeBox(-1.3f, -1, 0, 8, 1, 1, 0, -0.25f, -0.75f, -0.25f, 0.05f, -0.75f, -0.25f, 0.05f, -0.75f, -0.25f, -0.25f, -0.75f, -0.25f, -0.25f, 0.25f, -0.25f, 0.05f, 0.25f, -0.25f, 0.05f, 0.25f, -0.25f, -0.25f, 0.25f, -0.25f)
			.setRotationPoint(-24.25f, -6.2f, 9.6f).setRotationAngle(0, 0, 0).setName("Box 1573")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 497, 321, textureX, textureY)
			.addShapeBox(-1, 1.5f, -1, 1, 5, 1, 0, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f)
			.setRotationPoint(-25.25f, -8, 9.1f).setRotationAngle(0, -180, -9).setName("Box 1574")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 465, 321, textureX, textureY)
			.addShapeBox(-1, 1.5f, -1, 1, 2, 1, 0, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f)
			.setRotationPoint(-27.25f, -2.4f, 9.1f).setRotationAngle(0, -180, -10).setName("Box 1579")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 65, 337, textureX, textureY)
			.addShapeBox(-3, -1, 0, 16, 1, 1, 0, -0.25f, -0.75f, -0.25f, -0.25f, -0.75f, -0.25f, -0.25f, -0.75f, -0.25f, -0.25f, -0.75f, -0.25f, -0.25f, 0.25f, -0.25f, -0.25f, 0.25f, -0.25f, -0.25f, 0.25f, -0.25f, -0.25f, 0.25f, -0.25f)
			.setRotationPoint(-29.75f, -1.5f, 10).setRotationAngle(0, -180, -9).setName("Box 1580")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 497, 369, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 2, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-55.6f, -2.3f, 8.5f).setRotationAngle(113, 0, 0).setName("Box 1762")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 505, 369, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 2, 0, 0, 0, -0.25f, 0, -1, -0.25f, 0, -1, 0, 0, 0, 0, 0, 0, -0.25f, 0, -1, -0.25f, 0, -1, 0, 0, 0, 0)
			.setRotationPoint(-54.6f, -2.3f, 8.5f).setRotationAngle(113, 0, 0).setName("Box 1763")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 41, 377, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 2, 0, 0, -1, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0, -1, 0, 0, -1, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0, -1, 0)
			.setRotationPoint(-56.6f, -2.3f, 8.5f).setRotationAngle(113, 0, 0).setName("Box 1764")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 457, 401, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 1)
			.setRotationPoint(-35.1f, 5, 8.4f).setRotationAngle(0, 0, 90).setName("Box 1849")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 465, 401, textureX, textureY).addBox(0, 0, 0, 4, 1, 1)
			.setRotationPoint(-35.1f, 1, 10.4f).setRotationAngle(0, 0, 90).setName("Box 1850")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 481, 401, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, 0, 0, -1, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 1, 0, 0, 0)
			.setRotationPoint(-35.1f, 0, 8.4f).setRotationAngle(0, 0, 90).setName("Box 1851")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 489, 401, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0.5f, 0)
			.setRotationPoint(-36.1f, -3.5f, 9.4f).setRotationAngle(0, 0, 0).setName("Box 1852")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 497, 401, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0)
			.setRotationPoint(-35.1f, -2.25f, 9.4f).setRotationAngle(0, 0, 0).setName("Box 1853")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 505, 401, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0)
			.setRotationPoint(-35.1f, -3.5f, 9.4f).setRotationAngle(0, 0, 0).setName("Box 1854")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 1, 409, textureX, textureY).addBox(0, 0, 0, 11, 2, 1)
			.setRotationPoint(-33.1f, -3.5f, 9.4f).setRotationAngle(0, 0, 0).setName("Box 1855")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 33, 409, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 3, 1, 0, 0, 2, 0, 0, 0, 0, 0, 0, 0, 0, 2, 0, 0, 0, 0, 0, -2, 0, 0, -2, 0, 0, 0, 0)
			.setRotationPoint(-27.2f, -3, 9.3f).setRotationAngle(0, 0, 0).setName("Box 1856")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 41, 409, textureX, textureY).addBox(0, 0, 0, 5, 1, 1)
			.setRotationPoint(-27.2f, -5, 9.3f).setRotationAngle(0, 0, 90).setName("Box 1857")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 473, 425, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0)
			.setRotationPoint(-22.1f, -3.5f, 9.4f).setRotationAngle(0, 0, 0).setName("Box 1859")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 305, 481, textureX, textureY).addBox(0, 0, 0, 14, 14, 0)
			.setRotationPoint(-48.75f, -4, 6.01f).setRotationAngle(0, 0, 0).setName("Box 1929")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 481, 489, textureX, textureY)
			.addShapeBox(0, 0, 0, 9, 1, 5, 0, 0, 0.1f, -1, -0.5f, 0.1f, -1, -0.5f, 0.1f, -1.5f, 0, 0.1f, -1.5f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(-57.35f, -4.5f, 7.5f).setRotationAngle(0, 0, 0).setName("Box 1961")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 33, 233, textureX, textureY)
			.addShapeBox(0, 0, 0, 27, 1, 1, 0, -0.25f, 0.25f, -0.25f, -0.25f, 0.25f, -0.25f, -0.25f, 0.25f, -0.25f, -0.25f, 0.25f, -0.25f, -0.25f, 0.25f, -0.25f, -0.25f, 0.25f, -0.25f, -0.25f, 0.25f, -0.25f, -0.25f, 0.25f, -0.25f)
			.setRotationPoint(-41.1f, 6, 5.8f).setRotationAngle(0, 0, 0).setName("Box 1762")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 241, 225, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0.75f, -0.25f, -0.5f, 0.75f, -0.25f, -0.5f, 0.75f, -0.15f, 0, 0.75f, -0.15f, 0, 0.25f, -0.25f, -0.5f, 0.25f, -0.25f, -0.5f, 0.25f, -0.15f, 0, 0.25f, -0.15f)
			.setRotationPoint(-14.35f, 6, 5.8f).setRotationAngle(0, 0, 0).setName("Box 1763")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 249, 225, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0.25f, -0.25f, -0.65f, -0.5f, -0.25f, -0.65f, -0.5f, -0.15f, 0, 0.25f, -0.15f, 0, 0.25f, -0.25f, -0.65f, -0.5f, -0.25f, -0.65f, -0.5f, -0.15f, 0, 0.25f, -0.15f)
			.setRotationPoint(-12.85f, 6, 5.8f).setRotationAngle(0, 0, 0).setName("Box 1764")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 257, 225, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.65f, -0.5f, -0.25f, 0, 0.25f, -0.25f, 0, 0.25f, -0.15f, -0.65f, -0.5f, -0.15f, -0.65f, -0.5f, -0.25f, 0, 0.25f, -0.25f, 0, 0.25f, -0.15f, -0.65f, -0.5f, -0.15f)
			.setRotationPoint(-14.1f, 8.25f, 5.8f).setRotationAngle(0, 0, -90).setName("Box 1765")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 265, 225, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.65f, -0.5f, -0.25f, 0, 0.25f, -0.25f, 0, 0.25f, -0.15f, -0.65f, -0.5f, -0.15f, -0.65f, -0.5f, -0.25f, 0, 0.25f, -0.25f, 0, 0.25f, -0.15f, -0.65f, -0.5f, -0.15f)
			.setRotationPoint(-15.35f, 6, 5.8f).setRotationAngle(0, 0, 0).setName("Box 1766")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 273, 225, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0.25f, -0.25f, -0.65f, -0.5f, -0.25f, -0.65f, -0.5f, -0.15f, 0, 0.25f, -0.15f, 0, 0.25f, -0.25f, -0.65f, -0.5f, -0.25f, -0.65f, -0.5f, -0.15f, 0, 0.25f, -0.15f)
			.setRotationPoint(-26.85f, 6, 5.8f).setRotationAngle(0, 0, 0).setName("Box 1771")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 289, 225, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.65f, -0.5f, -0.25f, 0, 0.25f, -0.25f, 0, 0.25f, -0.15f, -0.65f, -0.5f, -0.15f, -0.65f, -0.5f, -0.25f, 0, 0.25f, -0.25f, 0, 0.25f, -0.15f, -0.65f, -0.5f, -0.15f)
			.setRotationPoint(-28.1f, 8.25f, 5.8f).setRotationAngle(0, 0, -90).setName("Box 1772")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 297, 225, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0.75f, -0.25f, -0.5f, 0.75f, -0.25f, -0.5f, 0.75f, -0.15f, 0, 0.75f, -0.15f, 0, 0.25f, -0.25f, -0.5f, 0.25f, -0.25f, -0.5f, 0.25f, -0.15f, 0, 0.25f, -0.15f)
			.setRotationPoint(-28.35f, 6, 5.8f).setRotationAngle(0, 0, 0).setName("Box 1773")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 305, 225, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.65f, -0.5f, -0.25f, 0, 0.25f, -0.25f, 0, 0.25f, -0.15f, -0.65f, -0.5f, -0.15f, -0.65f, -0.5f, -0.25f, 0, 0.25f, -0.25f, 0, 0.25f, -0.15f, -0.65f, -0.5f, -0.15f)
			.setRotationPoint(-29.35f, 6, 5.8f).setRotationAngle(0, 0, 0).setName("Box 1774")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 313, 225, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0.25f, -0.25f, -0.65f, -0.5f, -0.25f, -0.65f, -0.5f, -0.15f, 0, 0.25f, -0.15f, 0, 0.25f, -0.25f, -0.65f, -0.5f, -0.25f, -0.65f, -0.5f, -0.15f, 0, 0.25f, -0.15f)
			.setRotationPoint(-40.85f, 6, 5.8f).setRotationAngle(0, 0, 0).setName("Box 1775")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 321, 225, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0.75f, -0.25f, -0.5f, 0.75f, -0.25f, -0.5f, 0.75f, -0.15f, 0, 0.75f, -0.15f, 0, 0.25f, -0.25f, -0.5f, 0.25f, -0.25f, -0.5f, 0.25f, -0.15f, 0, 0.25f, -0.15f)
			.setRotationPoint(-42.35f, 6, 5.8f).setRotationAngle(0, 0, 0).setName("Box 1776")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 329, 225, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.65f, -0.5f, -0.25f, 0, 0.25f, -0.25f, 0, 0.25f, -0.15f, -0.65f, -0.5f, -0.15f, -0.65f, -0.5f, -0.25f, 0, 0.25f, -0.25f, 0, 0.25f, -0.15f, -0.65f, -0.5f, -0.15f)
			.setRotationPoint(-43.35f, 6, 5.8f).setRotationAngle(0, 0, 0).setName("Box 1777")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 345, 225, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.65f, -0.5f, -0.25f, 0, 0.25f, -0.25f, 0, 0.25f, -0.15f, -0.65f, -0.5f, -0.15f, -0.65f, -0.5f, -0.25f, 0, 0.25f, -0.25f, 0, 0.25f, -0.15f, -0.65f, -0.5f, -0.15f)
			.setRotationPoint(-42.1f, 8.25f, 5.8f).setRotationAngle(0, 0, -90).setName("Box 1778")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 129, 49, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 3, 0, -0.25f, 0.25f, 0, -0.25f, 0.25f, 0, -0.25f, 0.25f, 0, -0.25f, 0.25f, 0, -0.25f, 0.25f, 0, -0.25f, 0.25f, 0, -0.25f, 0.25f, 0, -0.25f, 0.25f, 0)
			.setRotationPoint(-14.6f, 6, 6.5f).setRotationAngle(0, 0, 0).setName("Box 1779")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 1, 233, textureX, textureY)
			.addShapeBox(1, -1, 0, 6, 1, 1, 0, -0.25f, -0.75f, -0.25f, -0.25f, -0.75f, -0.25f, -0.25f, -0.75f, -0.25f, -0.25f, -0.75f, -0.25f, -0.25f, 0.25f, -0.25f, -0.25f, 0.25f, -0.25f, -0.25f, 0.25f, -0.25f, -0.25f, 0.25f, -0.25f)
			.setRotationPoint(-36.6f, 3, 9.9f).setRotationAngle(0, -180, 0).setName("Box 1794")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 481, 321, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0.75f, -0.25f, -0.5f, 0.75f, -0.25f, -0.5f, 0.75f, -0.15f, 0, 0.75f, -0.15f, 0, 0.25f, -0.25f, -0.5f, 0.25f, -0.25f, -0.5f, 0.25f, -0.15f, 0, 0.25f, -0.15f)
			.setRotationPoint(-30.6f, 6, 5.8f).setRotationAngle(0, 0, 0).setName("Box 1581")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 505, 321, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0.25f, -0.25f, -0.65f, -0.5f, -0.25f, -0.65f, -0.5f, -0.15f, 0, 0.25f, -0.15f, 0, 0.25f, -0.25f, -0.65f, -0.5f, -0.25f, -0.65f, -0.5f, -0.15f, 0, 0.25f, -0.15f)
			.setRotationPoint(-29.1f, 6, 5.8f).setRotationAngle(0, 0, 0).setName("Box 1582")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 25, 329, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.65f, -0.5f, -0.25f, 0, 0.25f, -0.25f, 0, 0.25f, -0.15f, -0.65f, -0.5f, -0.15f, -0.65f, -0.5f, -0.25f, 0, 0.25f, -0.25f, 0, 0.25f, -0.15f, -0.65f, -0.5f, -0.15f)
			.setRotationPoint(-31.6f, 6, 5.8f).setRotationAngle(0, 0, 0).setName("Box 1583")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 89, 329, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.65f, -0.5f, -0.25f, 0, 0.25f, -0.25f, 0, 0.25f, -0.15f, -0.65f, -0.5f, -0.15f, -0.65f, -0.5f, -0.25f, 0, 0.25f, -0.25f, 0, 0.25f, -0.15f, -0.65f, -0.5f, -0.15f)
			.setRotationPoint(-30.35f, 8.25f, 5.8f).setRotationAngle(0, 0, -90).setName("Box 1584")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 241, 481, textureX, textureY).addBox(0, 0, 0, 14, 14, 0)
			.setRotationPoint(-20.75f, -4, 6.01f).setRotationAngle(0, 0, 0).setName("Box 1927")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 273, 481, textureX, textureY).addBox(0, 0, 0, 14, 14, 0)
			.setRotationPoint(-34.75f, -4, 6.01f).setRotationAngle(0, 0, 0).setName("Box 1928")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 185, 9, textureX, textureY)
			.addShapeBox(0, 0, 0, 35, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-45.1f, -0.5f, 4.5f).setRotationAngle(0, 0, 0).setName("Box 136")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 25, 9, textureX, textureY).addBox(0, 0, 0, 1, 6, 1)
			.setRotationPoint(-11.1f, 0.5f, 4.5f).setRotationAngle(0, 0, 0).setName("Box 139")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 33, 9, textureX, textureY).addBox(0, 0, 0, 1, 6, 1)
			.setRotationPoint(-17.1f, 0.5f, 4.5f).setRotationAngle(0, 0, 0).setName("Box 140")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 89, 9, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-12.1f, 4, 4.5f).setRotationAngle(0, 0, 0).setName("Box 151")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 97, 9, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0)
			.setRotationPoint(-12.1f, 1, 4.5f).setRotationAngle(0, 0, 0).setName("Box 152")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 105, 9, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0)
			.setRotationPoint(-16.1f, 1, 4.5f).setRotationAngle(0, 0, 0).setName("Box 153")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 121, 9, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-16.1f, 4, 4.5f).setRotationAngle(0, 0, 0).setName("Box 154")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 129, 9, textureX, textureY).addBox(0, 0, 0, 1, 6, 1)
			.setRotationPoint(-45.1f, 0.5f, 4.5f).setRotationAngle(0, 0, 0).setName("Box 155")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 137, 9, textureX, textureY).addBox(0, 0, 0, 1, 6, 1)
			.setRotationPoint(-39.1f, 0.5f, 4.5f).setRotationAngle(0, 0, 0).setName("Box 156")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 161, 9, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-40.1f, 4, 4.5f).setRotationAngle(0, 0, 0).setName("Box 157")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 169, 9, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0)
			.setRotationPoint(-40.1f, 1, 4.5f).setRotationAngle(0, 0, 0).setName("Box 158")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 265, 9, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0)
			.setRotationPoint(-44.1f, 1, 4.5f).setRotationAngle(0, 0, 0).setName("Box 159")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 273, 9, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-44.1f, 4, 4.5f).setRotationAngle(0, 0, 0).setName("Box 160")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 281, 9, textureX, textureY).addBox(0, 0, 0, 5, 1, 1)
			.setRotationPoint(-44.1f, 5, 4.5f).setRotationAngle(0, 0, 0).setName("Box 161")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 313, 9, textureX, textureY).addBox(0, 0, 0, 5, 1, 1)
			.setRotationPoint(-16.1f, 5, 4.5f).setRotationAngle(0, 0, 0).setName("Box 167")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 393, 9, textureX, textureY)
			.addShapeBox(0, 0, 0, 9, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0)
			.setRotationPoint(-18.1f, 6.5f, 4.5f).setRotationAngle(0, 0, 0).setName("Box 192")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 417, 9, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.25f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.25f, -0.5f, 0)
			.setRotationPoint(-9.1f, 5.5f, 4.5f).setRotationAngle(0, 0, 0).setName("Box 193")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 425, 9, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-10.1f, 5.5f, 4.5f).setRotationAngle(0, 0, 0).setName("Box 194")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 433, 9, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-18.1f, 5.5f, 4.5f).setRotationAngle(0, 0, 0).setName("Box 195")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 441, 9, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, -0.5f, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(-19.1f, 5.5f, 4.5f).setRotationAngle(0, 0, 0).setName("Box 196")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 25, 17, textureX, textureY)
			.addShapeBox(0, 0, 0, 9, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0)
			.setRotationPoint(-46.1f, 6.5f, 4.5f).setRotationAngle(0, 0, 0).setName("Box 202")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 505, 9, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.25f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.25f, -0.5f, 0)
			.setRotationPoint(-37.1f, 5.5f, 4.5f).setRotationAngle(0, 0, 0).setName("Box 203")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 1, 17, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-38.1f, 5.5f, 4.5f).setRotationAngle(0, 0, 0).setName("Box 204")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 73, 17, textureX, textureY).addBox(0, 0, 0, 1, 1, 1)
			.setRotationPoint(-14.1f, -1.5f, 4.5f).setRotationAngle(0, 0, 0).setName("Box 207")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 201, 17, textureX, textureY).addBox(0, 0, 0, 1, 2, 1)
			.setRotationPoint(-17.61f, -4.5f, 4.5f).setRotationAngle(0, 0, 0).setName("Box 208")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 209, 17, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.2f, 0.2f, 0, -0.2f, 0.2f, 0, -0.2f, 0.2f, 0, -0.2f, 0.2f, 0, -0.2f, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0)
			.setRotationPoint(-14.1f, -3.5f, 4.5f).setRotationAngle(0, 0, 0).setName("Box 209")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 217, 17, textureX, textureY).addBox(0, 0, 0, 1, 2, 1)
			.setRotationPoint(-10.59f, -4.5f, 4.5f).setRotationAngle(0, 0, 0).setName("Box 210")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 225, 17, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.2f, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0)
			.setRotationPoint(-10.6f, -2.5f, 4.5f).setRotationAngle(0, 0, 0).setName("Box 211")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 233, 17, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.2f, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0)
			.setRotationPoint(-17.6f, -2.5f, 4.5f).setRotationAngle(0, 0, 0).setName("Box 212")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 89, 17, textureX, textureY).addBox(0, 0, 0, 1, 1, 1)
			.setRotationPoint(-28.1f, -1.5f, 4.5f).setRotationAngle(0, 0, 0).setName("Box 214")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 241, 17, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.2f, 0.2f, 0, -0.2f, 0.2f, 0, -0.2f, 0.2f, 0, -0.2f, 0.2f, 0, -0.2f, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0)
			.setRotationPoint(-28.1f, -3.5f, 4.5f).setRotationAngle(0, 0, 0).setName("Box 215")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 249, 17, textureX, textureY).addBox(0, 0, 0, 1, 2, 1)
			.setRotationPoint(-24.59f, -4.5f, 4.5f).setRotationAngle(0, 0, 0).setName("Box 217")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 257, 17, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.2f, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0)
			.setRotationPoint(-24.6f, -2.5f, 4.5f).setRotationAngle(0, 0, 0).setName("Box 218")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 265, 17, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.2f, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0)
			.setRotationPoint(-31.6f, -2.5f, 4.5f).setRotationAngle(0, 0, 0).setName("Box 219")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 273, 17, textureX, textureY).addBox(0, 0, 0, 1, 2, 1)
			.setRotationPoint(-31.61f, -4.5f, 4.5f).setRotationAngle(0, 0, 0).setName("Box 220")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 97, 17, textureX, textureY).addBox(0, 0, 0, 1, 1, 1)
			.setRotationPoint(-42.1f, -1.5f, 4.5f).setRotationAngle(0, 0, 0).setName("Box 228")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 281, 17, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.2f, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0)
			.setRotationPoint(-45.6f, -2.5f, 4.5f).setRotationAngle(0, 0, 0).setName("Box 229")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 289, 17, textureX, textureY).addBox(0, 0, 0, 1, 2, 1)
			.setRotationPoint(-45.61f, -4.5f, 4.5f).setRotationAngle(0, 0, 0).setName("Box 230")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 297, 17, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.2f, 0.2f, 0, -0.2f, 0.2f, 0, -0.2f, 0.2f, 0, -0.2f, 0.2f, 0, -0.2f, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0)
			.setRotationPoint(-42.1f, -3.5f, 4.5f).setRotationAngle(0, 0, 0).setName("Box 232")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 305, 17, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.2f, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0)
			.setRotationPoint(-38.6f, -2.5f, 4.5f).setRotationAngle(0, 0, 0).setName("Box 233")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 313, 17, textureX, textureY).addBox(0, 0, 0, 1, 2, 1)
			.setRotationPoint(-38.59f, -4.5f, 4.5f).setRotationAngle(0, 0, 0).setName("Box 234")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 81, 25, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 6, 1, 0, -0.2f, 0, 0, -0.3f, 0, 0, -0.3f, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0, -0.3f, 0, 0, -0.3f, 0, 0, -0.2f, 0, 0)
			.setRotationPoint(-10.3f, -0.5f, 4.5f).setRotationAngle(0, 0, 0).setName("Box 462")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 225, 25, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 3, 1, 0, 0, 0, -0.4f, 0, 0, -0.4f, 0, 0, -0.4f, 0, 0, -0.4f, 0, 0, -0.4f, 0, 0, -0.4f, 0, 0, -0.4f, 0, 0, -0.4f)
			.setRotationPoint(-44.1f, 1.5f, 4.5f).setRotationAngle(0, 0, 0).setName("Box 434")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 241, 25, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 3, 1, 0, 0, 0, -0.4f, 0, 0, -0.4f, 0, 0, -0.4f, 0, 0, -0.4f, 0, 0, -0.4f, 0, 0, -0.4f, 0, 0, -0.4f, 0, 0, -0.4f)
			.setRotationPoint(-16.1f, 1.5f, 4.5f).setRotationAngle(0, 0, 0).setName("Box 439")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 345, 25, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 6, 1, 0, -0.2f, 0, 0, -0.3f, 0, 0, -0.3f, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0, -0.3f, 0, 0, -0.3f, 0, 0, -0.2f, 0, 0)
			.setRotationPoint(-45.8f, -0.5f, 4.5f).setRotationAngle(0, 0, 0).setName("Box 506")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 353, 49, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-42.1f, -4.25f, 4.45f).setRotationAngle(0, 0, 0).setName("Box 721")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 361, 49, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0.5f, -0.8f, 0, 0, -0.6f, 0, 0, -0.6f, 0, 0.5f, -0.8f, 0, 0.5f, 0, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0.5f, 0, 0)
			.setRotationPoint(-40.6f, -4.25f, 4.45f).setRotationAngle(0, 0, 0).setName("Box 722")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 377, 49, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, -0.6f, 0, 0.5f, -0.8f, 0, 0.5f, -0.8f, 0, 0, -0.6f, 0, 0, -0.2f, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, -0.2f, 0)
			.setRotationPoint(-45.6f, -4.25f, 4.45f).setRotationAngle(0, 0, 0).setName("Box 723")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 393, 49, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, -0.5f, -0.6f, 0, 0.5f, -0.8f, 0, 0.5f, -0.8f, 0, -0.5f, -0.6f, 0, -0.5f, -0.2f, 0, 0.5f, 0, 0, 0.5f, 0, 0, -0.5f, -0.2f, 0)
			.setRotationPoint(-45.6f, -4, 4.45f).setRotationAngle(0, 0, 0).setName("Box 724")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 409, 49, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-42.1f, -4, 4.45f).setRotationAngle(0, 0, 0).setName("Box 725")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 417, 49, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0.5f, -0.8f, 0, -0.5f, -0.6f, 0, -0.5f, -0.6f, 0, 0.5f, -0.8f, 0, 0.5f, 0, 0, -0.5f, -0.2f, 0, -0.5f, -0.2f, 0, 0.5f, 0, 0)
			.setRotationPoint(-40.6f, -4, 4.45f).setRotationAngle(0, 0, 0).setName("Box 726")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 433, 49, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0.5f, -0.8f, 0, 0, -0.6f, 0, 0, -0.6f, 0, 0.5f, -0.8f, 0, 0.5f, 0, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0.5f, 0, 0)
			.setRotationPoint(-40.6f, -3.75f, 4.45f).setRotationAngle(0, 0, 0).setName("Box 727")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 441, 49, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-42.1f, -3.75f, 4.45f).setRotationAngle(0, 0, 0).setName("Box 728")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 449, 49, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, -0.6f, 0, 0.5f, -0.8f, 0, 0.5f, -0.8f, 0, 0, -0.6f, 0, 0, -0.2f, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, -0.2f, 0)
			.setRotationPoint(-44.6f, -3.75f, 4.45f).setRotationAngle(0, 0, 0).setName("Box 729")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 457, 49, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, -0.5f, -0.6f, 0, 0.5f, -0.8f, 0, 0.5f, -0.8f, 0, -0.5f, -0.6f, 0, -0.5f, -0.2f, 0, 0.5f, 0, 0, 0.5f, 0, 0, -0.5f, -0.2f, 0)
			.setRotationPoint(-44.6f, -3.5f, 4.45f).setRotationAngle(0, 0, 0).setName("Box 730")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 465, 49, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-42.1f, -3.5f, 4.45f).setRotationAngle(0, 0, 0).setName("Box 731")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 473, 49, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0.5f, -0.8f, 0, -0.5f, -0.6f, 0, -0.5f, -0.6f, 0, 0.5f, -0.8f, 0, 0.5f, 0, 0, -0.5f, -0.2f, 0, -0.5f, -0.2f, 0, 0.5f, 0, 0)
			.setRotationPoint(-40.6f, -3.5f, 4.45f).setRotationAngle(0, 0, 0).setName("Box 732")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 481, 49, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.5f, -0.8f, 0, 0, -0.6f, 0, 0, -0.6f, 0, 0.5f, -0.8f, 0, 0.5f, 0, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0.5f, 0, 0)
			.setRotationPoint(-40.6f, -3.25f, 4.45f).setRotationAngle(0, 0, 0).setName("Box 733")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 489, 49, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-42.1f, -3.25f, 4.45f).setRotationAngle(0, 0, 0).setName("Box 734")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 497, 49, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.6f, 0, 0.5f, -0.8f, 0, 0.5f, -0.8f, 0, 0, -0.6f, 0, 0, -0.2f, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, -0.2f, 0)
			.setRotationPoint(-43.6f, -3.25f, 4.45f).setRotationAngle(0, 0, 0).setName("Box 735")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 505, 49, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, -0.6f, 0, 0.5f, -0.8f, 0, 0.5f, -0.8f, 0, -0.5f, -0.6f, 0, -0.5f, -0.2f, 0, 0.5f, 0, 0, 0.5f, 0, 0, -0.5f, -0.2f, 0)
			.setRotationPoint(-43.6f, -3, 4.45f).setRotationAngle(0, 0, 0).setName("Box 736")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 1, 57, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-42.1f, -3, 4.45f).setRotationAngle(0, 0, 0).setName("Box 737")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 9, 57, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.5f, -0.8f, 0, -0.5f, -0.6f, 0, -0.5f, -0.6f, 0, 0.5f, -0.8f, 0, 0.5f, 0, 0, -0.5f, -0.2f, 0, -0.5f, -0.2f, 0, 0.5f, 0, 0)
			.setRotationPoint(-40.6f, -3, 4.45f).setRotationAngle(0, 0, 0).setName("Box 738")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 17, 57, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-28.1f, -4.25f, 4.45f).setRotationAngle(0, 0, 0).setName("Box 739")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 25, 57, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, -0.6f, 0, 0.5f, -0.8f, 0, 0.5f, -0.8f, 0, 0, -0.6f, 0, 0, -0.2f, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, -0.2f, 0)
			.setRotationPoint(-31.6f, -4.25f, 4.45f).setRotationAngle(0, 0, 0).setName("Box 740")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 41, 57, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0.5f, -0.8f, 0, 0, -0.6f, 0, 0, -0.6f, 0, 0.5f, -0.8f, 0, 0.5f, 0, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0.5f, 0, 0)
			.setRotationPoint(-26.6f, -4.25f, 4.45f).setRotationAngle(0, 0, 0).setName("Box 741")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 57, 57, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0.5f, -0.8f, 0, -0.5f, -0.6f, 0, -0.5f, -0.6f, 0, 0.5f, -0.8f, 0, 0.5f, 0, 0, -0.5f, -0.2f, 0, -0.5f, -0.2f, 0, 0.5f, 0, 0)
			.setRotationPoint(-26.6f, -4, 4.45f).setRotationAngle(0, 0, 0).setName("Box 742")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 73, 57, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-28.1f, -4, 4.45f).setRotationAngle(0, 0, 0).setName("Box 743")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 81, 57, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, -0.5f, -0.6f, 0, 0.5f, -0.8f, 0, 0.5f, -0.8f, 0, -0.5f, -0.6f, 0, -0.5f, -0.2f, 0, 0.5f, 0, 0, 0.5f, 0, 0, -0.5f, -0.2f, 0)
			.setRotationPoint(-31.6f, -4, 4.45f).setRotationAngle(0, 0, 0).setName("Box 744")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 97, 57, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, -0.6f, 0, 0.5f, -0.8f, 0, 0.5f, -0.8f, 0, 0, -0.6f, 0, 0, -0.2f, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, -0.2f, 0)
			.setRotationPoint(-30.6f, -3.75f, 4.45f).setRotationAngle(0, 0, 0).setName("Box 745")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 105, 57, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-28.1f, -3.75f, 4.45f).setRotationAngle(0, 0, 0).setName("Box 746")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 113, 57, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0.5f, -0.8f, 0, 0, -0.6f, 0, 0, -0.6f, 0, 0.5f, -0.8f, 0, 0.5f, 0, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0.5f, 0, 0)
			.setRotationPoint(-26.6f, -3.75f, 4.45f).setRotationAngle(0, 0, 0).setName("Box 747")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 121, 57, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0.5f, -0.8f, 0, -0.5f, -0.6f, 0, -0.5f, -0.6f, 0, 0.5f, -0.8f, 0, 0.5f, 0, 0, -0.5f, -0.2f, 0, -0.5f, -0.2f, 0, 0.5f, 0, 0)
			.setRotationPoint(-26.6f, -3.5f, 4.45f).setRotationAngle(0, 0, 0).setName("Box 748")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 129, 57, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-28.1f, -3.5f, 4.45f).setRotationAngle(0, 0, 0).setName("Box 749")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 137, 57, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, -0.5f, -0.6f, 0, 0.5f, -0.8f, 0, 0.5f, -0.8f, 0, -0.5f, -0.6f, 0, -0.5f, -0.2f, 0, 0.5f, 0, 0, 0.5f, 0, 0, -0.5f, -0.2f, 0)
			.setRotationPoint(-30.6f, -3.5f, 4.45f).setRotationAngle(0, 0, 0).setName("Box 750")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 145, 57, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.6f, 0, 0.5f, -0.8f, 0, 0.5f, -0.8f, 0, 0, -0.6f, 0, 0, -0.2f, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, -0.2f, 0)
			.setRotationPoint(-29.6f, -3.25f, 4.45f).setRotationAngle(0, 0, 0).setName("Box 751")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 153, 57, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-28.1f, -3.25f, 4.45f).setRotationAngle(0, 0, 0).setName("Box 752")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 161, 57, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.5f, -0.8f, 0, 0, -0.6f, 0, 0, -0.6f, 0, 0.5f, -0.8f, 0, 0.5f, 0, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0.5f, 0, 0)
			.setRotationPoint(-26.6f, -3.25f, 4.45f).setRotationAngle(0, 0, 0).setName("Box 753")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 169, 57, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.5f, -0.8f, 0, -0.5f, -0.6f, 0, -0.5f, -0.6f, 0, 0.5f, -0.8f, 0, 0.5f, 0, 0, -0.5f, -0.2f, 0, -0.5f, -0.2f, 0, 0.5f, 0, 0)
			.setRotationPoint(-26.6f, -3, 4.45f).setRotationAngle(0, 0, 0).setName("Box 754")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 177, 57, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-28.1f, -3, 4.45f).setRotationAngle(0, 0, 0).setName("Box 755")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 185, 57, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, -0.6f, 0, 0.5f, -0.8f, 0, 0.5f, -0.8f, 0, -0.5f, -0.6f, 0, -0.5f, -0.2f, 0, 0.5f, 0, 0, 0.5f, 0, 0, -0.5f, -0.2f, 0)
			.setRotationPoint(-29.6f, -3, 4.45f).setRotationAngle(0, 0, 0).setName("Box 756")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 193, 57, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-14.1f, -4.25f, 4.45f).setRotationAngle(0, 0, 0).setName("Box 757")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 201, 57, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, -0.6f, 0, 0.5f, -0.8f, 0, 0.5f, -0.8f, 0, 0, -0.6f, 0, 0, -0.2f, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, -0.2f, 0)
			.setRotationPoint(-17.6f, -4.25f, 4.45f).setRotationAngle(0, 0, 0).setName("Box 758")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 217, 57, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0.5f, -0.8f, 0, 0, -0.6f, 0, 0, -0.6f, 0, 0.5f, -0.8f, 0, 0.5f, 0, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0.5f, 0, 0)
			.setRotationPoint(-12.6f, -4.25f, 4.45f).setRotationAngle(0, 0, 0).setName("Box 759")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 233, 57, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0.5f, -0.8f, 0, -0.5f, -0.6f, 0, -0.5f, -0.6f, 0, 0.5f, -0.8f, 0, 0.5f, 0, 0, -0.5f, -0.2f, 0, -0.5f, -0.2f, 0, 0.5f, 0, 0)
			.setRotationPoint(-12.6f, -4, 4.45f).setRotationAngle(0, 0, 0).setName("Box 760")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 249, 57, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-14.1f, -4, 4.45f).setRotationAngle(0, 0, 0).setName("Box 761")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 257, 57, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, -0.5f, -0.6f, 0, 0.5f, -0.8f, 0, 0.5f, -0.8f, 0, -0.5f, -0.6f, 0, -0.5f, -0.2f, 0, 0.5f, 0, 0, 0.5f, 0, 0, -0.5f, -0.2f, 0)
			.setRotationPoint(-17.6f, -4, 4.45f).setRotationAngle(0, 0, 0).setName("Box 762")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 273, 57, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, -0.6f, 0, 0.5f, -0.8f, 0, 0.5f, -0.8f, 0, 0, -0.6f, 0, 0, -0.2f, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, -0.2f, 0)
			.setRotationPoint(-16.6f, -3.75f, 4.45f).setRotationAngle(0, 0, 0).setName("Box 763")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 281, 57, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-14.1f, -3.75f, 4.45f).setRotationAngle(0, 0, 0).setName("Box 764")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 289, 57, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0.5f, -0.8f, 0, 0, -0.6f, 0, 0, -0.6f, 0, 0.5f, -0.8f, 0, 0.5f, 0, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0.5f, 0, 0)
			.setRotationPoint(-12.6f, -3.75f, 4.45f).setRotationAngle(0, 0, 0).setName("Box 765")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 297, 57, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0.5f, -0.8f, 0, -0.5f, -0.6f, 0, -0.5f, -0.6f, 0, 0.5f, -0.8f, 0, 0.5f, 0, 0, -0.5f, -0.2f, 0, -0.5f, -0.2f, 0, 0.5f, 0, 0)
			.setRotationPoint(-12.6f, -3.5f, 4.45f).setRotationAngle(0, 0, 0).setName("Box 766")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 305, 57, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-14.1f, -3.5f, 4.45f).setRotationAngle(0, 0, 0).setName("Box 767")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 313, 57, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, -0.5f, -0.6f, 0, 0.5f, -0.8f, 0, 0.5f, -0.8f, 0, -0.5f, -0.6f, 0, -0.5f, -0.2f, 0, 0.5f, 0, 0, 0.5f, 0, 0, -0.5f, -0.2f, 0)
			.setRotationPoint(-16.6f, -3.5f, 4.45f).setRotationAngle(0, 0, 0).setName("Box 768")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 321, 57, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.6f, 0, 0.5f, -0.8f, 0, 0.5f, -0.8f, 0, 0, -0.6f, 0, 0, -0.2f, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, -0.2f, 0)
			.setRotationPoint(-15.6f, -3.25f, 4.45f).setRotationAngle(0, 0, 0).setName("Box 769")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 329, 57, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-14.1f, -3.25f, 4.45f).setRotationAngle(0, 0, 0).setName("Box 770")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 337, 57, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.5f, -0.8f, 0, 0, -0.6f, 0, 0, -0.6f, 0, 0.5f, -0.8f, 0, 0.5f, 0, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0.5f, 0, 0)
			.setRotationPoint(-12.6f, -3.25f, 4.45f).setRotationAngle(0, 0, 0).setName("Box 771")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 345, 57, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.5f, -0.8f, 0, -0.5f, -0.6f, 0, -0.5f, -0.6f, 0, 0.5f, -0.8f, 0, 0.5f, 0, 0, -0.5f, -0.2f, 0, -0.5f, -0.2f, 0, 0.5f, 0, 0)
			.setRotationPoint(-12.6f, -3, 4.45f).setRotationAngle(0, 0, 0).setName("Box 772")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 353, 57, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-14.1f, -3, 4.45f).setRotationAngle(0, 0, 0).setName("Box 773")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 361, 57, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, -0.6f, 0, 0.5f, -0.8f, 0, 0.5f, -0.8f, 0, -0.5f, -0.6f, 0, -0.5f, -0.2f, 0, 0.5f, 0, 0, 0.5f, 0, 0, -0.5f, -0.2f, 0)
			.setRotationPoint(-15.6f, -3, 4.45f).setRotationAngle(0, 0, 0).setName("Box 774")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 49, 297, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(-16.1f, 0.5f, 4.5f).setRotationAngle(0, 0, 0).setName("Box 2074")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 225, 305, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(-44.1f, 0.5f, 4.5f).setRotationAngle(0, 0, 0).setName("Box 2077")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 505, 1, textureX, textureY).addBox(0, 0, 0, 1, 6, 1)
			.setRotationPoint(-31.1f, 0.5f, 4.5f).setRotationAngle(0, 0, 0).setName("Box 137")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 1, 9, textureX, textureY).addBox(0, 0, 0, 1, 6, 1)
			.setRotationPoint(-25.1f, 0.5f, 4.5f).setRotationAngle(0, 0, 0).setName("Box 138")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 41, 9, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0)
			.setRotationPoint(-30.1f, 1, 4.5f).setRotationAngle(0, 0, 0).setName("Box 143")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 57, 9, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0)
			.setRotationPoint(-26.1f, 1, 4.5f).setRotationAngle(0, 0, 0).setName("Box 144")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 65, 9, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-26.1f, 4, 4.5f).setRotationAngle(0, 0, 0).setName("Box 145")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 73, 9, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-30.1f, 4, 4.5f).setRotationAngle(0, 0, 0).setName("Box 146")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 297, 9, textureX, textureY).addBox(0, 0, 0, 5, 1, 1)
			.setRotationPoint(-30.1f, 5, 4.5f).setRotationAngle(0, 0, 0).setName("Box 166")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 329, 9, textureX, textureY).addBox(0, 0, 0, 7, 1, 1)
			.setRotationPoint(-38.1f, 3.75f, 4.5f).setRotationAngle(0, 0, 0).setName("Box 171")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 353, 9, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-38.1f, 2.75f, 4.5f).setRotationAngle(0, 0, 0).setName("Box 180")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 361, 9, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-32.1f, 2.75f, 4.5f).setRotationAngle(0, 0, 0).setName("Box 181")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 369, 9, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0)
			.setRotationPoint(-32.1f, 0.5f, 4.5f).setRotationAngle(0, 0, 0).setName("Box 182")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 377, 9, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0)
			.setRotationPoint(-38.1f, 0.5f, 4.5f).setRotationAngle(0, 0, 0).setName("Box 183")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 385, 9, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0.25f, 0, 0, 0, 0, 0, 0, 0, 0, 0.25f, 0, 0, 0.25f, 0.25f, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0.25f, 0.25f, 0)
			.setRotationPoint(-35.1f, 0.5f, 4.5f).setRotationAngle(0, 0, 0).setName("Box 186")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 449, 9, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-24.1f, 5.5f, 4.5f).setRotationAngle(0, 0, 0).setName("Box 197")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 457, 9, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, -0.5f, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(-33.1f, 5.5f, 4.5f).setRotationAngle(0, 0, 0).setName("Box 198")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 465, 9, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-32.1f, 5.5f, 4.5f).setRotationAngle(0, 0, 0).setName("Box 199")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 473, 9, textureX, textureY)
			.addShapeBox(0, 0, 0, 9, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0)
			.setRotationPoint(-32.1f, 6.5f, 4.5f).setRotationAngle(0, 0, 0).setName("Box 200")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 497, 9, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.25f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.25f, -0.5f, 0)
			.setRotationPoint(-23.1f, 5.5f, 4.5f).setRotationAngle(0, 0, 0).setName("Box 201")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 169, 25, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 3, 1, 0, 0, 0, -0.4f, 0, 0, -0.4f, 0, 0, -0.4f, 0, 0, -0.4f, 0, 0, -0.4f, 0, 0, -0.4f, 0, 0, -0.4f, 0, 0, -0.4f)
			.setRotationPoint(-30.1f, 1.5f, 4.5f).setRotationAngle(0, 0, 0).setName("Box 429")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 65, 297, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(-30.1f, 0.5f, 4.5f).setRotationAngle(0, 0, 0).setName("Box 2076")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 257, 441, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-36.35f, 2.75f, 4.5f).setRotationAngle(0, 0, 0).setName("Box 1897")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 273, 441, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0)
			.setRotationPoint(-36.35f, 0.5f, 4.5f).setRotationAngle(0, 0, 0).setName("Box 1898")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 281, 441, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-34.1f, 2.75f, 4.5f).setRotationAngle(0, 0, 0).setName("Box 1899")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 289, 441, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0)
			.setRotationPoint(-34.1f, 0.5f, 4.5f).setRotationAngle(0, 0, 0).setName("Box 1900")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 313, 441, textureX, textureY).addBox(0, 0, 0, 7, 1, 1)
			.setRotationPoint(-24.1f, 3.75f, 4.5f).setRotationAngle(0, 0, 0).setName("Box 1911")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 297, 441, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-18.1f, 2.75f, 4.5f).setRotationAngle(0, 0, 0).setName("Box 1912")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 337, 441, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-20.1f, 2.75f, 4.5f).setRotationAngle(0, 0, 0).setName("Box 1913")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 345, 441, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0.25f, 0, 0, 0, 0, 0, 0, 0, 0, 0.25f, 0, 0, 0.25f, 0.25f, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0.25f, 0.25f, 0)
			.setRotationPoint(-21.1f, 0.5f, 4.5f).setRotationAngle(0, 0, 0).setName("Box 1914")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 353, 441, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-22.35f, 2.75f, 4.5f).setRotationAngle(0, 0, 0).setName("Box 1915")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 361, 441, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-24.1f, 2.75f, 4.5f).setRotationAngle(0, 0, 0).setName("Box 1916")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 369, 441, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0)
			.setRotationPoint(-24.1f, 0.5f, 4.5f).setRotationAngle(0, 0, 0).setName("Box 1917")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 377, 441, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0)
			.setRotationPoint(-22.35f, 0.5f, 4.5f).setRotationAngle(0, 0, 0).setName("Box 1918")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 385, 441, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0)
			.setRotationPoint(-20.1f, 0.5f, 4.5f).setRotationAngle(0, 0, 0).setName("Box 1919")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 393, 441, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0)
			.setRotationPoint(-18.1f, 0.5f, 4.5f).setRotationAngle(0, 0, 0).setName("Box 1920")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 57, 177, textureX, textureY).addBox(0, 0, 0, 2, 3, 22)
			.setRotationPoint(-69.35f, 0, -11).setRotationAngle(0, 0, 0).setName("Box 1103")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 329, 377, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 10, 6, 0, -4.35f, 0, -0.9f, 0.35f, 0, -0.9f, 0.35f, 0, 0, 1.3f, 0, 0, -4.35f, -0.8f, -0.9f, 0.35f, -0.8f, -0.9f, 0.35f, -0.8f, 0, 3.3f, -0.8f, 0)
			.setRotationPoint(-74.7f, 0, -7.5f).setRotationAngle(0, 0, 0).setName("Box 1080")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 353, 377, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 10, 3, 0, 0, 0, 0, -0.35f, 0, 0, -0.35f, 0, 0, 0, 0, 0, 2, -0.8f, 0, -0.35f, -0.8f, 0, -0.35f, -0.8f, 0, 2, -0.8f, 0)
			.setRotationPoint(-76, 0, -1.5f).setRotationAngle(0, 0, 0).setName("Box 1789")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 290, 378, textureX, textureY).addBox(0, 0, 0, 3, 2, 2)
			.setRotationPoint(-78, 1, -1).setRotationAngle(0, 0, 0).setName("Box 1791")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 377, 377, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 10, 6, 0, 1.3f, 0, 0, 0.35f, 0, 0, 0.35f, 0, -0.9f, -4.35f, 0, -0.9f, 3.3f, -0.8f, 0, 0.35f, -0.8f, 0, 0.35f, -0.8f, -0.9f, -4.35f, -0.8f, -0.9f)
			.setRotationPoint(-74.7f, 0, 1.5f).setRotationAngle(0, 0, 0).setName("Box 1792")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 377, 377, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 22, 0, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, -2)
			.setRotationPoint(-70.35f, 0, -11).setRotationAngle(0, 0, 0).setName("Box 1795")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 345, 377, textureX, textureY)
			.addShapeBox(0, -1, 0, 1, 2, 1, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(-77.6f, 2.75f, 0.75f).setRotationAngle(0, 0, 0).setName("Box 515")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 369, 377, textureX, textureY)
			.addShapeBox(0, -1, 0, 1, 1, 1, 0, 0, 0, -0.3f, -0.5f, 0, -0.3f, -0.5f, 0, 0, 0, 0, 0, 0, -0.5f, -0.4f, -0.5f, -0.5f, -0.4f, -0.5f, -0.5f, -0.1f, 0, -0.5f, -0.1f)
			.setRotationPoint(-77.6f, 4.75f, 0.85f).setRotationAngle(0, 0, 0).setName("Box 517")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 377, 377, textureX, textureY)
			.addShapeBox(0, -1, 0, 1, 1, 1, 0, -0.5f, -0.5f, -0.5f, 2, -0.5f, -0.5f, 2, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, -0.5f, 2, 0, -0.5f, 2, 0, 0, 0, 0, 0)
			.setRotationPoint(-77.6f, 1.75f, 0.75f).setRotationAngle(0, 0, 0).setName("Box 520")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 465, 433, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0.1f, 0, 0, 0.1f, 0, 0.3f, 0, 0, 0.3f, 0, -0.7f, 0, 0.1f, -0.7f, 0, 0.1f, -0.7f, 0.3f, 0, -0.7f, 0.3f)
			.setRotationPoint(-70.6f, 6.3f, 6.7f).setRotationAngle(0, 0, 0).setName("Box 1867")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 473, 433, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0.1f, 0, 0, 0.1f, 0, 0.3f, 0, 0, 0.3f, 0, -0.7f, 0, 0.1f, -0.7f, 0, 0.1f, -0.7f, 0.3f, 0, -0.7f, 0.3f)
			.setRotationPoint(-70.6f, 3.3f, 7.7f).setRotationAngle(0, 0, 0).setName("Box 1868")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 177, 545, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 6, 16, 0, 0, 0, 1, 0, 0, 1, 0, 0, 1, 0, 0, 1, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(-70.35f, 3, -8).setRotationAngle(0, 0, 0).setName("Box 1905")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 201, 537, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 6, 3, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, -1, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -3, 0, -0.5f, -3)
			.setRotationPoint(-70.35f, 3, 8).setRotationAngle(0, 0, 0).setName("Box 1910")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 1, 548, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 2, 0, -0.5f, 0.25f, 0.25f, 0, 0.25f, 0.25f, 0, 0.25f, 0.25f, -0.5f, 0.25f, 0.25f, 0, 0.25f, 0.25f, 0, 0.25f, 0.25f, 0, 0.25f, 0.25f, 0, 0.25f, 0.25f)
			.setRotationPoint(-77, 1, -1).setRotationAngle(0, 0, 0).setName("Box 1901")
		);
		groups.add(FrontEngine);
	}

	private final void initGroup_FrontEngine1(){
		TurboList FrontEngine = new TurboList("FrontEngine");
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 73, 9, textureX, textureY).addBox(0, 0, 0, 1, 1, 11)
			.setRotationPoint(-68.1f, 2, -5.5f).setRotationAngle(0, 0, 0).setName("Box 128")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 417, 329, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 8, 1, 0, -5, 0, 0, 5, 0, 0, 5, 0, -0.7f, -5, 0, -0.7f, 0, 0, 0, 0, 0, 0, 0, 0, -0.7f, 0, 0, -0.7f)
			.setRotationPoint(-69.6f, -8, 5.25f).setRotationAngle(0, 0, 0).setName("Box 1104")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 473, 329, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0.9f, 0, 0, 0.9f, 0, -0.7f, 0, 0, -0.7f, 0, 0, -0.7f, 0.9f, 0, -0.7f, 0.9f)
			.setRotationPoint(-64.85f, -7, 5.55f).setRotationAngle(0, 0, 0).setName("Box 1146")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 481, 329, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0.9f, 0, 0, 0.9f, 0, -0.7f, 0, 0, -0.7f, 0, 0, -0.7f, 0.9f, 0, -0.7f, 0.9f)
			.setRotationPoint(-66.45f, -4.5f, 5.55f).setRotationAngle(0, 0, 0).setName("Box 1147")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 497, 329, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0.9f, 0, 0, 0.9f, 0, -0.7f, 0, 0, -0.7f, 0, 0, -0.7f, 0.9f, 0, -0.7f, 0.9f)
			.setRotationPoint(-68.05f, -1.9f, 5.55f).setRotationAngle(0, 0, 0).setName("Box 1148")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 505, 329, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 8, 1, 0, -5, 0, 0, 5, 0, 0, 5, 0, -0.7f, -5, 0, -0.7f, 0, 0, 0, 0, 0, 0, 0, 0, -0.7f, 0, 0, -0.7f)
			.setRotationPoint(-69.6f, -8, 7.25f).setRotationAngle(0, 0, 0).setName("Box 1627")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 1, 369, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 6, 9, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(-67.35f, -6, -4.5f).setRotationAngle(0, 0, 0).setName("Box 1707")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 257, 369, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 6, 1, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f, 0, 0, 0, 0, 0, 0, 0, -0.75f, -0.75f, 0, -0.75f)
			.setRotationPoint(-68.35f, -5.75f, -4.5f).setRotationAngle(0, 0, 0).setName("Box 1708")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 273, 369, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 6, 1, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f, 0, 0, 0, 0, 0, 0, 0, -0.75f, -0.75f, 0, -0.75f)
			.setRotationPoint(-68.35f, -5.75f, 4.25f).setRotationAngle(0, 0, 0).setName("Box 1709")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 73, 369, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 9, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, -0.75f, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f, 0, 0, -0.75f, 0)
			.setRotationPoint(-67.6f, -6, -4.5f).setRotationAngle(0, 0, 0).setName("Box 1710")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 281, 369, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 6, 1, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.75f, 0, -0.5f, -0.75f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.75f, 0, -0.5f)
			.setRotationPoint(-68.35f, -5.75f, -0.25f).setRotationAngle(0, 0, 0).setName("Box 1720")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 433, 369, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 6, 1, 0, -2, 0, 0, 1.3f, 0, 0, 1.3f, 0, -0.7f, -2, 0, -0.7f, 0, 0, 0, -0.7f, 0, 0, -0.7f, 0, -0.7f, 0, 0, -0.7f)
			.setRotationPoint(-69.1f, -11.2f, 4.25f).setRotationAngle(0, 0, 0).setName("Box 1121")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 441, 369, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 5, 1, 0, 0, 0, 0, -0.7f, 0, 0, -0.7f, 0, -0.7f, 0, 0, -0.7f, 0, 0, 0, -0.7f, 0, 0, -0.7f, 0, -0.7f, 0, 0, -0.7f)
			.setRotationPoint(-69.1f, -5.2f, 4.25f).setRotationAngle(0, 0, 0).setName("Box 1142")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 457, 369, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, 0, -0.7f, 0, 0, -0.7f, 0, -0.7f, 0, 0, -0.7f, 0, 0, 0, -0.7f, 0, 0, -0.7f, 0, -0.7f, 0, 0, -0.7f)
			.setRotationPoint(-64.35f, -11.2f, 4.25f).setRotationAngle(0, 0, 0).setName("Box 1749")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 465, 369, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 5, 1, 0, 0, 0, 0, -0.7f, 0, 0, -0.7f, 0, -0.7f, 0, 0, -0.7f, 0, 0, 0, -0.7f, 0, 0, -0.7f, 0, -0.7f, 0, 0, -0.7f)
			.setRotationPoint(-69.1f, -5.2f, -4.45f).setRotationAngle(0, 0, 0).setName("Box 1750")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 473, 369, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, -0.5f, 0, -0.7f, 0, 0, -0.7f, 0, -0.7f, 0, -0.5f, -0.7f, 0, -0.5f, 0, -0.7f, 0, 0, -0.7f, 0, -0.7f, 0, -0.5f, -0.7f)
			.setRotationPoint(-64.1f, -11.5f, 4.25f).setRotationAngle(0, 0, 90).setName("Box 1752")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 481, 369, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, -0.5f, 0, -0.7f, 0, 0, -0.7f, 0, -0.7f, 0, -0.5f, -0.7f, 0, -0.5f, 0, -0.7f, 0, 0, -0.7f, 0, -0.7f, 0, -0.5f, -0.7f)
			.setRotationPoint(-64.1f, -11.5f, -4.45f).setRotationAngle(0, 0, 90).setName("Box 1753")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 489, 369, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 6, 1, 0, -2, 0, 0, 1.3f, 0, 0, 1.3f, 0, -0.7f, -2, 0, -0.7f, 0, 0, 0, -0.7f, 0, 0, -0.7f, 0, -0.7f, 0, 0, -0.7f)
			.setRotationPoint(-69.1f, -11.2f, -4.45f).setRotationAngle(0, 0, 0).setName("Box 1754")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 409, 377, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 18, 0, 0, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(-71.6f, -1.25f, -9).setRotationAngle(0, 0, 0).setName("Box 525")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 393, 377, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -1.5f, 0, -0.5f, 1, -0.5f, -0.5f, 1, -0.5f, 0, -1.5f, 0, 0, 0, -1, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, 0, 0, -1, 0)
			.setRotationPoint(-71.6f, 0.25f, 8).setRotationAngle(0, 0, 0).setName("Box 527")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 409, 377, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -1.5f, 0, -0.5f, 1, -0.5f, -0.5f, 1, -0.5f, 0, -1.5f, 0, 0, 0, -1, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, 0, 0, -1, 0)
			.setRotationPoint(-71.6f, 0.25f, -9.5f).setRotationAngle(0, 0, 0).setName("Box 528")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 417, 377, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(-71.6f, -0.75f, -0.75f).setRotationAngle(0, 0, 0).setName("Box 529")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 433, 377, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(-71.6f, -0.75f, -9.5f).setRotationAngle(0, 0, 0).setName("Box 1086")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 441, 377, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(-71.6f, -0.75f, 8).setRotationAngle(0, 0, 0).setName("Box 1087")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 505, 425, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0.1f, 0, 0, 0.1f, 0, 0.3f, 0, 0, 0.3f, 0, -0.7f, 0, 0.1f, -0.7f, 0, 0.1f, -0.7f, 0.3f, 0, -0.7f, 0.3f)
			.setRotationPoint(-70.6f, 6.3f, -8).setRotationAngle(0, 0, 0).setName("Box 1863")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 457, 433, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0.1f, 0, 0, 0.1f, 0, 0.3f, 0, 0, 0.3f, 0, -0.7f, 0, 0.1f, -0.7f, 0, 0.1f, -0.7f, 0.3f, 0, -0.7f, 0.3f)
			.setRotationPoint(-70.6f, 3.3f, -9).setRotationAngle(0, 0, 0).setName("Box 1864")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 97, 337, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 6, 3, 0, -1, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, -0.5f, -3, 0, -0.5f, -3, 0, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(-70.35f, 3, -11).setRotationAngle(0, 0, 0).setName("Box 1906")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 1, 337, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 8, 1, 0, -5, 0, 0, 5, 0, 0, 5, 0, -0.7f, -5, 0, -0.7f, 0, 0, 0, 0, 0, 0, 0, 0, -0.7f, 0, 0, -0.7f)
			.setRotationPoint(-69.6f, -8, -5.5f).setRotationAngle(0, 0, 0).setName("Box 1628")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 9, 337, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 8, 1, 0, -5, 0, 0, 5, 0, 0, 5, 0, -0.7f, -5, 0, -0.7f, 0, 0, 0, 0, 0, 0, 0, 0, -0.7f, 0, 0, -0.7f)
			.setRotationPoint(-69.6f, -8, -7.5f).setRotationAngle(0, 0, 0).setName("Box 1629")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 25, 337, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0.9f, 0, 0, 0.9f, 0, -0.7f, 0, 0, -0.7f, 0, 0, -0.7f, 0.9f, 0, -0.7f, 0.9f)
			.setRotationPoint(-66.45f, -4.5f, -7.2f).setRotationAngle(0, 0, 0).setName("Box 1630")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 105, 337, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0.9f, 0, 0, 0.9f, 0, -0.7f, 0, 0, -0.7f, 0, 0, -0.7f, 0.9f, 0, -0.7f, 0.9f)
			.setRotationPoint(-64.85f, -7, -7.2f).setRotationAngle(0, 0, 0).setName("Box 1631")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 121, 337, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0.9f, 0, 0, 0.9f, 0, -0.7f, 0, 0, -0.7f, 0, 0, -0.7f, 0.9f, 0, -0.7f, 0.9f)
			.setRotationPoint(-68.05f, -1.9f, -7.2f).setRotationAngle(0, 0, 0).setName("Box 1632")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 241, 369, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 21, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0.3f, 0, 0, 0.3f, 0, -0.7f, 0, 0.5f, -0.7f, 0, 0.5f, -0.7f, 0.3f, 0, -0.7f, 0.3f)
			.setRotationPoint(-64.6f, -8.3f, -10.63f).setRotationAngle(0, 0, 0).setName("Box 1116")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 33, 369, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, -0.9f, 0, 0, -0.9f, 0, -0.7f, 0, 0.5f, -0.7f, 0, 0.5f, -0.7f, -0.9f, 0, -0.7f, -0.9f)
			.setRotationPoint(-64.6f, -8.6f, 10.57f).setRotationAngle(0, 0, 0).setName("Box 2033")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 57, 369, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, -0.9f, 0, 0, -0.9f, 0, -0.7f, 0, 0.5f, -0.7f, 0, 0.5f, -0.7f, -0.9f, 0, -0.7f, -0.9f)
			.setRotationPoint(-64.6f, -8.6f, -10.63f).setRotationAngle(0, 0, 0).setName("Box 2035")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 49, 1, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 21, 0, 0, 0, -0.1f, -0.9f, 0, -0.1f, -0.9f, 0, 0.2f, 0, 0, 0.2f, 0, -0.7f, -0.1f, -0.9f, -0.7f, -0.1f, -0.9f, -0.7f, 0.2f, 0, -0.7f, 0.2f)
			.setRotationPoint(-60.2f, -8.6f, -10.63f).setRotationAngle(0, 0, 0).setName("Box 2036")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 289, 369, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0.3f, 0, 0, 0.3f, 0, -0.45f, 0, 0, -0.45f, 0, 0, -0.45f, 0.3f, 0, -0.45f, 0.3f)
			.setRotationPoint(-66.6f, -8.3f, -2.13f).setRotationAngle(0, 0, 0).setName("Box 1721")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 305, 369, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 8, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.75f, 0, 0, -0.75f)
			.setRotationPoint(-66.6f, -7.75f, -2.13f).setRotationAngle(0, 0, 0).setName("Box 1725")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 313, 369, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 8, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.75f, 0, 0, -0.75f)
			.setRotationPoint(-66.6f, -7.75f, 1.92f).setRotationAngle(0, 0, 0).setName("Box 1726")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 129, 369, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 9, 0, 0, 0, -0.1f, -0.9f, 0, -0.1f, -0.9f, 0, -0.5f, 0, 0, -0.5f, 0, -0.7f, -0.1f, -0.9f, -0.7f, -0.1f, -0.9f, -0.7f, -0.5f, 0, -0.7f, -0.5f)
			.setRotationPoint(-64.6f, -8.6f, -10.63f).setRotationAngle(0, 0, 0).setName("Box 1729")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 161, 369, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 9, 0, 0, 0, -0.6f, -0.9f, 0, -0.6f, -0.9f, 0, 0, 0, 0, 0, 0, -0.7f, -0.6f, -0.9f, -0.7f, -0.6f, -0.9f, -0.7f, 0, 0, -0.7f, 0)
			.setRotationPoint(-64.6f, -8.6f, 1.57f).setRotationAngle(0, 0, 0).setName("Box 1741")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 193, 369, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 10, 0, 0, 0, -0.25f, -0.8f, 0, -0.25f, -0.8f, 0, -0.95f, 0, 0, -0.95f, 0, -0.8f, -0.25f, -0.8f, -0.8f, -0.25f, -0.8f, -0.8f, -0.95f, 0, -0.8f, -0.95f)
			.setRotationPoint(-68.4f, -7.2f, -4.5f).setRotationAngle(0, 0, 0).setName("Box 1153")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 249, 369, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-67.1f, -11.4f, -1.5f).setRotationAngle(0, 0, 0).setName("Box 1607")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 337, 369, textureX, textureY).addBox(0, 0, 0, 1, 3, 1)
			.setRotationPoint(-67.1f, -11.4f, -0.5f).setRotationAngle(0, 0, 0).setName("Box 1608")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 345, 369, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0)
			.setRotationPoint(-67.1f, -11.4f, 0.5f).setRotationAngle(0, 0, 0).setName("Box 1609")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 353, 369, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0.5f, 0)
			.setRotationPoint(-66.1f, -10.9f, -1.5f).setRotationAngle(0, 0, 0).setName("Box 1611")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 361, 369, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0)
			.setRotationPoint(-66.1f, -11.4f, -0.5f).setRotationAngle(0, 0, 0).setName("Box 1613")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 369, 369, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0.5f, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, 0, 0, 0.5f, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, 0)
			.setRotationPoint(-66.1f, -10.9f, 0.5f).setRotationAngle(0, 0, 0).setName("Box 1614")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 377, 369, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-65.1f, -10.9f, -0.5f).setRotationAngle(0, 0, 0).setName("Box 1615")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 385, 369, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-65.1f, -10.9f, -1.5f).setRotationAngle(0, 0, 0).setName("Box 1616")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 393, 369, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f)
			.setRotationPoint(-65.1f, -10.9f, 0.5f).setRotationAngle(0, 0, 0).setName("Box 1617")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 393, 145, textureX, textureY).addBox(0, 0, 0, 3, 1, 0)
			.setRotationPoint(-67.1f, -10.4f, -1.5f).setRotationAngle(0, 10, 0).setName("Box 1842")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 345, 169, textureX, textureY).addBox(0, 0, 0, 3, 1, 0)
			.setRotationPoint(-67.1f, -10.4f, 1.5f).setRotationAngle(0, -10, 0).setName("Box 1843")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 401, 369, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.75f, 0.175f, 0, 0, 0.175f, 0, 0, 0.175f, -0.75f, -0.75f, 0.175f, -0.75f, -0.75f, 0, 0, 0, 0, 0, 0, 0, -0.75f, -0.75f, 0, -0.75f)
			.setRotationPoint(-65.35f, -9.25f, 0.7f).setRotationAngle(0, 0, 0).setName("Box 1742")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 409, 369, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.75f, 0.175f, 0, 0, 0.175f, 0, 0, 0.175f, -0.75f, -0.75f, 0.175f, -0.75f, -0.75f, 0, 0, 0, 0, 0, 0, 0, -0.75f, -0.75f, 0, -0.75f)
			.setRotationPoint(-66.35f, -9.25f, 0.7f).setRotationAngle(0, 0, 0).setName("Box 1743")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 417, 369, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.75f, 0.175f, 0, 0, 0.175f, 0, 0, 0.175f, -0.75f, -0.75f, 0.175f, -0.75f, -0.75f, 0, 0, 0, 0, 0, 0, 0, -0.75f, -0.75f, 0, -0.75f)
			.setRotationPoint(-66.35f, -9.25f, -0.9f).setRotationAngle(0, 0, 0).setName("Box 1744")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 425, 369, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.75f, 0.175f, 0, 0, 0.175f, 0, 0, 0.175f, -0.75f, -0.75f, 0.175f, -0.75f, -0.75f, 0, 0, 0, 0, 0, 0, 0, -0.75f, -0.75f, 0, -0.75f)
			.setRotationPoint(-65.35f, -9.25f, -0.9f).setRotationAngle(0, 0, 0).setName("Box 1745")
		);
		FrontEngine.add(new ModelRendererTurbo(FrontEngine, 449, 369, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, 0, -0.7f, 0, 0, -0.7f, 0, -0.7f, 0, 0, -0.7f, 0, 0, 0, -0.7f, 0, 0, -0.7f, 0, -0.7f, 0, 0, -0.7f)
			.setRotationPoint(-64.35f, -11.2f, -4.45f).setRotationAngle(0, 0, 0).setName("Box 1748")
		);
		groups.add(FrontEngine);
	}

	ModelNWClassAFrontBogie bogie = new ModelNWClassAFrontBogie();

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		super.render(entity, f, f1, f2, f3, f4, f5);
		bogie.render(entity, f, f1, f2, f3, f4, f5);
	}
}
