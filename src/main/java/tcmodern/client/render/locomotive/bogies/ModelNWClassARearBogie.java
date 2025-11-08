//FMT-Marker FVTM-1.5
//Using PER-GROUP-INIT mode with limit '500'!
package tcmodern.client.render.locomotive.bogies;


import tmt.FVTMFormatBase;
import tmt.ModelRendererTurbo;

/** This file was exported via the FVTM Exporter v1.5 of<br>
 *  FMT (Fex's Modelling Toolbox) v.2.7.5 &copy; 2025 - Fexcraft.net<br>
 *  All rights reserved. For this Model's License contact the Author/Creator.
 */
public class ModelNWClassARearBogie extends FVTMFormatBase {

	public ModelNWClassARearBogie(){
		super();
		textureX = 512;
		textureY = 1024;
		addToCreators("Riggs64");
		//
		initGroup_RearBogie();
		for (FVTMFormatBase.TurboList l : groups) {
			tmt.ModelRendererTurbo[] arr = new tmt.ModelRendererTurbo[l.size()];
			l.toArray(arr);
			fixRotation(arr, false, true, true);
		}
	}

	private final void initGroup_RearBogie(){
		TurboList RearBogie = new TurboList("RearBogie");
		RearBogie.add(new ModelRendererTurbo(RearBogie, 385, 25, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 3, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1)
			.setRotationPoint(45.4f, 6.5f, -1.5f).setRotationAngle(0, 0, 0).setName("Box 538")
		);
		RearBogie.add(new ModelRendererTurbo(RearBogie, 393, 25, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 1, 1, 0, 0, 0, -4, 0, 0, 0, 0, 0, 0, 0, 0, 4, 0, 0, -4, 0, 0, 0, 0, 0, 0, 0, 0, 4)
			.setRotationPoint(46.4f, 6.5f, -5.5f).setRotationAngle(0, 0, 0).setName("Box 542")
		);
		RearBogie.add(new ModelRendererTurbo(RearBogie, 457, 25, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0.2f, 0, 0, 0.2f, 0, 0, 0.2f, 0, 0, 0.2f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0)
			.setRotationPoint(44.4f, 5.5f, -0.5f).setRotationAngle(0, 0, 0).setName("Box 580")
		);
		RearBogie.add(new ModelRendererTurbo(RearBogie, 145, 345, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 13, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0)
			.setRotationPoint(82.9f, 5.5f, -6.5f).setRotationAngle(0, 0, 0).setName("Box 1726")
		);
		RearBogie.add(new ModelRendererTurbo(RearBogie, 289, 385, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 3, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(54.4f, 5.5f, -6.5f).setRotationAngle(0, 0, 0).setName("Box 1729")
		);
		RearBogie.add(new ModelRendererTurbo(RearBogie, 481, 385, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, 0, 0, 0.75f, 0, 0, 0.75f, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(56.4f, 5.5f, -6.5f).setRotationAngle(0, 0, 0).setName("Box 1730")
		);
		RearBogie.add(new ModelRendererTurbo(RearBogie, 489, 385, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 1, 0, 0, -0.25f, 0, 0, 1, 0, 0, 1, 0, 0, -0.25f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(57.4f, 4.5f, -6.5f).setRotationAngle(0, 0, 0).setName("Box 1731")
		);
		RearBogie.add(new ModelRendererTurbo(RearBogie, 497, 385, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 7, 1, 0, 0, -2.5f, 0, 0, 0, 0, 0, 0, 0, 0, -2.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(58.4f, 1, -6.5f).setRotationAngle(0, 0, 0).setName("Box 1732")
		);
		RearBogie.add(new ModelRendererTurbo(RearBogie, 505, 385, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 7, 1, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0.5f, 0)
			.setRotationPoint(59.4f, 0.5f, -6.5f).setRotationAngle(0, 0, 0).setName("Box 1733")
		);
		RearBogie.add(new ModelRendererTurbo(RearBogie, 1, 393, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 7, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0.5f, 0, 0, 1, 0, 0, 1, 0, 0, 0.5f, 0)
			.setRotationPoint(60.4f, 0.5f, -6.5f).setRotationAngle(0, 0, 0).setName("Box 1734")
		);
		RearBogie.add(new ModelRendererTurbo(RearBogie, 9, 393, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 6, 1, 0, 0, 0.5f, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0, 0.5f, 0, 0, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0, 0, 0)
			.setRotationPoint(65.4f, 1, -6.5f).setRotationAngle(0, 0, 0).setName("Box 1736")
		);
		RearBogie.add(new ModelRendererTurbo(RearBogie, 17, 393, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(66.65f, 1, -6.5f).setRotationAngle(0, 0, 0).setName("Box 1737")
		);
		RearBogie.add(new ModelRendererTurbo(RearBogie, 33, 393, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 6, 1, 0, 0.25f, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0, 0, 0, 0, 0, 0, 0.25f, 0, 0)
			.setRotationPoint(71.9f, 1, -6.5f).setRotationAngle(0, 0, 0).setName("Box 1738")
		);
		RearBogie.add(new ModelRendererTurbo(RearBogie, 41, 393, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 7, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 1, 0)
			.setRotationPoint(76.9f, 0.5f, -6.5f).setRotationAngle(0, 0, 0).setName("Box 1740")
		);
		RearBogie.add(new ModelRendererTurbo(RearBogie, 49, 393, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0)
			.setRotationPoint(81.9f, 5.5f, -6.5f).setRotationAngle(0, 0, 0).setName("Box 1741")
		);
		RearBogie.add(new ModelRendererTurbo(RearBogie, 57, 393, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 1, 0, 0, 1, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, 1, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(79.9f, 4.5f, -6.5f).setRotationAngle(0, 0, 0).setName("Box 1742")
		);
		RearBogie.add(new ModelRendererTurbo(RearBogie, 65, 393, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0.75f, 0, 0, 0, 0, 0, 0, 0, 0, 0.75f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(80.9f, 5.5f, -6.5f).setRotationAngle(0, 0, 0).setName("Box 1743")
		);
		RearBogie.add(new ModelRendererTurbo(RearBogie, 73, 393, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 7, 1, 0, 0, 0, 0, 0, -2.5f, 0, 0, -2.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(78.9f, 1, -6.5f).setRotationAngle(0, 0, 0).setName("Box 1744")
		);
		RearBogie.add(new ModelRendererTurbo(RearBogie, 81, 393, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 7, 1, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0.5f, 0)
			.setRotationPoint(77.9f, 0.5f, -6.5f).setRotationAngle(0, 0, 0).setName("Box 1745")
		);
		RearBogie.add(new ModelRendererTurbo(RearBogie, 153, 393, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 3, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(72.9f, 0.5f, -6.5f).setRotationAngle(0, 0, 0).setName("Box 1754")
		);
		RearBogie.add(new ModelRendererTurbo(RearBogie, 201, 393, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 3, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(61.4f, 0.5f, -6.5f).setRotationAngle(0, 0, 0).setName("Box 1757")
		);
		RearBogie.add(new ModelRendererTurbo(RearBogie, 33, 441, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 2, 1, 0, 0, -1, -1, 0, 0, 0, 0, 0, 0, 0, -1, 1, 0, 0, -1, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, 1)
			.setRotationPoint(51.4f, 5.5f, -6.5f).setRotationAngle(0, 0, 0).setName("Box 1874")
		);
		RearBogie.add(new ModelRendererTurbo(RearBogie, 169, 385, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(69.9f, 6.5f, -6.5f).setRotationAngle(0, 0, 0).setName("Box 1748")
		);
		RearBogie.add(new ModelRendererTurbo(RearBogie, 97, 393, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0.5f, 0, 0, 1, 0, 0, 1, 0, 0, 0.5f, 0)
			.setRotationPoint(71.9f, 6.5f, -6.5f).setRotationAngle(0, 0, 0).setName("Box 1749")
		);
		RearBogie.add(new ModelRendererTurbo(RearBogie, 105, 393, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0.5f, 0)
			.setRotationPoint(66.4f, 6.5f, -6.5f).setRotationAngle(0, 0, 0).setName("Box 1750")
		);
		RearBogie.add(new ModelRendererTurbo(RearBogie, 113, 393, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 1, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 1, 0)
			.setRotationPoint(65.4f, 6.5f, -6.5f).setRotationAngle(0, 0, 0).setName("Box 1751")
		);
		RearBogie.add(new ModelRendererTurbo(RearBogie, 361, 393, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, -0.5f, 0, -0.5f, -1, 0, -0.5f, -1, 0, 0, -0.5f, 0)
			.setRotationPoint(72.9f, 3, -6.5f).setRotationAngle(0, 0, 0).setName("Box 1770")
		);
		RearBogie.add(new ModelRendererTurbo(RearBogie, 369, 393, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, -1, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, -1, 0)
			.setRotationPoint(64.4f, 3, -6.5f).setRotationAngle(0, 0, 0).setName("Box 1771")
		);
		RearBogie.add(new ModelRendererTurbo(RearBogie, 449, 393, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, -0.5f, 0, -0.5f, -1, 0, -0.5f, -1, 0, 0, -0.5f, 0)
			.setRotationPoint(61.4f, 3, -6.5f).setRotationAngle(0, 0, 0).setName("Box 1772")
		);
		RearBogie.add(new ModelRendererTurbo(RearBogie, 457, 393, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, -1, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, -1, 0)
			.setRotationPoint(75.9f, 3, -6.5f).setRotationAngle(0, 0, 0).setName("Box 1773")
		);
		RearBogie.add(new ModelRendererTurbo(RearBogie, 481, 393, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, 0, -0.7f, 0, 0, -0.7f, 0, -0.7f, 0, 0, -0.7f, 0, -0.5f, 0, -0.7f, -0.5f, 0, -0.7f, -0.5f, -0.7f, 0, -0.5f, -0.7f)
			.setRotationPoint(64, 2.8f, -6.34f).setRotationAngle(0, 0, 0).setName("Box 1774")
		);
		RearBogie.add(new ModelRendererTurbo(RearBogie, 489, 393, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.6f, 0, 0, 0, 0, 0, 0, 0, 0, -0.6f, 0, 0, 0, 0, 0, -0.6f, 0, 0, -0.6f, 0, 0, 0, 0)
			.setRotationPoint(63.65f, 2.55f, -6.4f).setRotationAngle(0, 0, 0).setName("Box 1775")
		);
		RearBogie.add(new ModelRendererTurbo(RearBogie, 9, 401, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.6f, 0, 0, 0, 0, 0, 0, 0, 0, -0.6f, 0, 0, 0, 0, 0, -0.6f, 0, 0, -0.6f, 0, 0, 0, 0)
			.setRotationPoint(63.65f, 3, -6.4f).setRotationAngle(0, 0, 0).setName("Box 1776")
		);
		RearBogie.add(new ModelRendererTurbo(RearBogie, 17, 401, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.6f, 0, 0, 0, 0, 0, 0, 0, 0, -0.6f, 0, 0, 0, 0, 0, -0.6f, 0, 0, -0.6f, 0, 0, 0, 0)
			.setRotationPoint(63.65f, 3.45f, -6.4f).setRotationAngle(0, 0, 0).setName("Box 1777")
		);
		RearBogie.add(new ModelRendererTurbo(RearBogie, 25, 401, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.6f, 0, 0, 0, 0, 0, 0, 0, 0, -0.6f, 0, 0, 0, 0, 0, -0.6f, 0, 0, -0.6f, 0, 0, 0, 0)
			.setRotationPoint(62.15f, 2.55f, -6.4f).setRotationAngle(0, 0, 0).setName("Box 1779")
		);
		RearBogie.add(new ModelRendererTurbo(RearBogie, 33, 401, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.6f, 0, 0, 0, 0, 0, 0, 0, 0, -0.6f, 0, 0, 0, 0, 0, -0.6f, 0, 0, -0.6f, 0, 0, 0, 0)
			.setRotationPoint(62.15f, 3, -6.4f).setRotationAngle(0, 0, 0).setName("Box 1780")
		);
		RearBogie.add(new ModelRendererTurbo(RearBogie, 49, 401, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.6f, 0, 0, 0, 0, 0, 0, 0, 0, -0.6f, 0, 0, 0, 0, 0, -0.6f, 0, 0, -0.6f, 0, 0, 0, 0)
			.setRotationPoint(62.15f, 3.45f, -6.4f).setRotationAngle(0, 0, 0).setName("Box 1781")
		);
		RearBogie.add(new ModelRendererTurbo(RearBogie, 57, 401, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, 0, -0.7f, 0, 0, -0.7f, 0, -0.7f, 0, 0, -0.7f, 0, -0.5f, 0, -0.7f, -0.5f, 0, -0.7f, -0.5f, -0.7f, 0, -0.5f, -0.7f)
			.setRotationPoint(62.5f, 2.8f, -6.34f).setRotationAngle(0, 0, 0).setName("Box 1782")
		);
		RearBogie.add(new ModelRendererTurbo(RearBogie, 65, 401, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, 0, -0.7f, 0, 0, -0.7f, 0, -0.7f, 0, 0, -0.7f, 0, -0.5f, 0, -0.7f, -0.5f, 0, -0.7f, -0.5f, -0.7f, 0, -0.5f, -0.7f)
			.setRotationPoint(74, 2.8f, -6.34f).setRotationAngle(0, 0, 0).setName("Box 1783")
		);
		RearBogie.add(new ModelRendererTurbo(RearBogie, 89, 401, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, 0, -0.7f, 0, 0, -0.7f, 0, -0.7f, 0, 0, -0.7f, 0, -0.5f, 0, -0.7f, -0.5f, 0, -0.7f, -0.5f, -0.7f, 0, -0.5f, -0.7f)
			.setRotationPoint(75.5f, 2.8f, -6.34f).setRotationAngle(0, 0, 0).setName("Box 1784")
		);
		RearBogie.add(new ModelRendererTurbo(RearBogie, 97, 401, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.6f, 0, 0, 0, 0, 0, 0, 0, 0, -0.6f, 0, 0, 0, 0, 0, -0.6f, 0, 0, -0.6f, 0, 0, 0, 0)
			.setRotationPoint(75.15f, 3.45f, -6.4f).setRotationAngle(0, 0, 0).setName("Box 1785")
		);
		RearBogie.add(new ModelRendererTurbo(RearBogie, 105, 401, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.6f, 0, 0, 0, 0, 0, 0, 0, 0, -0.6f, 0, 0, 0, 0, 0, -0.6f, 0, 0, -0.6f, 0, 0, 0, 0)
			.setRotationPoint(75.15f, 3, -6.4f).setRotationAngle(0, 0, 0).setName("Box 1786")
		);
		RearBogie.add(new ModelRendererTurbo(RearBogie, 113, 401, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.6f, 0, 0, 0, 0, 0, 0, 0, 0, -0.6f, 0, 0, 0, 0, 0, -0.6f, 0, 0, -0.6f, 0, 0, 0, 0)
			.setRotationPoint(75.15f, 2.55f, -6.4f).setRotationAngle(0, 0, 0).setName("Box 1787")
		);
		RearBogie.add(new ModelRendererTurbo(RearBogie, 121, 401, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.6f, 0, 0, 0, 0, 0, 0, 0, 0, -0.6f, 0, 0, 0, 0, 0, -0.6f, 0, 0, -0.6f, 0, 0, 0, 0)
			.setRotationPoint(73.65f, 2.55f, -6.4f).setRotationAngle(0, 0, 0).setName("Box 1788")
		);
		RearBogie.add(new ModelRendererTurbo(RearBogie, 129, 401, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.6f, 0, 0, 0, 0, 0, 0, 0, 0, -0.6f, 0, 0, 0, 0, 0, -0.6f, 0, 0, -0.6f, 0, 0, 0, 0)
			.setRotationPoint(73.65f, 3, -6.4f).setRotationAngle(0, 0, 0).setName("Box 1789")
		);
		RearBogie.add(new ModelRendererTurbo(RearBogie, 137, 401, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.6f, 0, 0, 0, 0, 0, 0, 0, 0, -0.6f, 0, 0, 0, 0, 0, -0.6f, 0, 0, -0.6f, 0, 0, 0, 0)
			.setRotationPoint(73.65f, 3.45f, -6.4f).setRotationAngle(0, 0, 0).setName("Box 1790")
		);
		RearBogie.add(new ModelRendererTurbo(RearBogie, 57, 409, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 3, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(66.65f, 4, -6.5f).setRotationAngle(0, 0, 0).setName("Box 1814")
		);
		RearBogie.add(new ModelRendererTurbo(RearBogie, 73, 409, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(66.65f, 3, -6.5f).setRotationAngle(0, 0, 0).setName("Box 1815")
		);
		RearBogie.add(new ModelRendererTurbo(RearBogie, 81, 409, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(70.65f, 3, -6.5f).setRotationAngle(0, 0, 0).setName("Box 1816")
		);
		RearBogie.add(new ModelRendererTurbo(RearBogie, 89, 409, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(68.65f, 3, -6.5f).setRotationAngle(0, 0, 0).setName("Box 1817")
		);
		RearBogie.add(new ModelRendererTurbo(RearBogie, 393, 25, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 14, 0, 0, 0, 0, -0.3f, -0.3f, 0, -0.3f, -0.3f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(74.9f, 5, -7).setRotationAngle(0, 0, 0).setName("Box 544")
		);
		RearBogie.add(new ModelRendererTurbo(RearBogie, 425, 25, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 14, 0, -0.3f, -0.3f, 0, 0, 0, 0, 0, 0, 0, -0.3f, -0.3f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(73.9f, 5, -7).setRotationAngle(0, 0, 0).setName("Box 545")
		);
		RearBogie.add(new ModelRendererTurbo(RearBogie, 457, 25, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 14, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.3f, -0.3f, 0, 0, 0, 0, 0, 0, 0, -0.3f, -0.3f, 0)
			.setRotationPoint(73.9f, 6, -7).setRotationAngle(0, 0, 0).setName("Box 546")
		);
		RearBogie.add(new ModelRendererTurbo(RearBogie, 1, 33, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 14, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.3f, -0.3f, 0, -0.3f, -0.3f, 0, 0, 0, 0)
			.setRotationPoint(74.9f, 6, -7).setRotationAngle(0, 0, 0).setName("Box 547")
		);
		RearBogie.add(new ModelRendererTurbo(RearBogie, 449, 25, textureX, textureY).addBox(0, 0, 0, 2, 2, 1)
			.setRotationPoint(73.9f, 5, -6.75f).setRotationAngle(0, 0, 0).setName("Box 561")
		);
		RearBogie.add(new ModelRendererTurbo(RearBogie, 505, 305, textureX, textureY).addBox(0, 0, 0, 2, 2, 1)
			.setRotationPoint(62.4f, 5, -6.75f).setRotationAngle(0, 0, 0).setName("Box 1983")
		);
		RearBogie.add(new ModelRendererTurbo(RearBogie, 457, 313, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 14, 0, 0, 0, 0, -0.3f, -0.3f, 0, -0.3f, -0.3f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(63.4f, 5, -7).setRotationAngle(0, 0, 0).setName("Box 1985")
		);
		RearBogie.add(new ModelRendererTurbo(RearBogie, 17, 321, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 14, 0, -0.3f, -0.3f, 0, 0, 0, 0, 0, 0, 0, -0.3f, -0.3f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(62.4f, 5, -7).setRotationAngle(0, 0, 0).setName("Box 1986")
		);
		RearBogie.add(new ModelRendererTurbo(RearBogie, 49, 321, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 14, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.3f, -0.3f, 0, 0, 0, 0, 0, 0, 0, -0.3f, -0.3f, 0)
			.setRotationPoint(62.4f, 6, -7).setRotationAngle(0, 0, 0).setName("Box 1987")
		);
		RearBogie.add(new ModelRendererTurbo(RearBogie, 81, 321, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 14, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.3f, -0.3f, 0, -0.3f, -0.3f, 0, 0, 0, 0)
			.setRotationPoint(63.4f, 6, -7).setRotationAngle(0, 0, 0).setName("Box 1988")
		);
		RearBogie.add(new ModelRendererTurbo(RearBogie, 169, 393, textureX, textureY).addBox(0, 0, 0, 4, 4, 1)
			.setRotationPoint(72.9f, 4, -6.65f).setRotationAngle(0, 0, 0).setName("Box 1755")
		);
		RearBogie.add(new ModelRendererTurbo(RearBogie, 185, 393, textureX, textureY).addBox(0, 0, 0, 4, 4, 1)
			.setRotationPoint(61.4f, 4, -6.65f).setRotationAngle(0, 0, 0).setName("Box 1756")
		);
		RearBogie.add(new ModelRendererTurbo(RearBogie, 281, 393, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 1, 0, 0, 0, 0, 0, -1.5f, 0, 0, -1.5f, 0, 0, 0, 0, 0, 0, 0, 0, -1.5f, 0, 0, -1.5f, 0, 0, 0, 0)
			.setRotationPoint(76.9f, 4, -6.6f).setRotationAngle(0, 0, 0).setName("Box 1766")
		);
		RearBogie.add(new ModelRendererTurbo(RearBogie, 289, 393, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 1, 0, 0, -1.5f, 0, 0, 0, 0, 0, 0, 0, 0, -1.5f, 0, 0, -1.5f, 0, 0, 0, 0, 0, 0, 0, 0, -1.5f, 0)
			.setRotationPoint(71.9f, 4, -6.6f).setRotationAngle(0, 0, 0).setName("Box 1767")
		);
		RearBogie.add(new ModelRendererTurbo(RearBogie, 313, 393, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 1, 0, 0, 0, 0, 0, -1.5f, 0, 0, -1.5f, 0, 0, 0, 0, 0, 0, 0, 0, -1.5f, 0, 0, -1.5f, 0, 0, 0, 0)
			.setRotationPoint(65.4f, 4, -6.63f).setRotationAngle(0, 0, 0).setName("Box 1768")
		);
		RearBogie.add(new ModelRendererTurbo(RearBogie, 353, 393, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 1, 0, 0, -1.5f, 0, 0, 0, 0, 0, 0, 0, 0, -1.5f, 0, 0, -1.5f, 0, 0, 0, 0, 0, 0, 0, 0, -1.5f, 0)
			.setRotationPoint(60.4f, 4, -6.63f).setRotationAngle(0, 0, 0).setName("Box 1769")
		);
		RearBogie.add(new ModelRendererTurbo(RearBogie, 417, 25, textureX, textureY).addBox(0, 0, 0, 8, 8, 0)
			.setRotationPoint(70.9f, 2, -6.01f).setRotationAngle(0, 0, 0).setName("Box 552")
		);
		RearBogie.add(new ModelRendererTurbo(RearBogie, 481, 25, textureX, textureY).addBox(0, 0, 0, 8, 8, 0)
			.setRotationPoint(70.9f, 2, 6.01f).setRotationAngle(0, 0, 0).setName("Box 580")
		);
		RearBogie.add(new ModelRendererTurbo(RearBogie, 425, 313, textureX, textureY).addBox(0, 0, 0, 8, 8, 0)
			.setRotationPoint(59.4f, 2, 6.01f).setRotationAngle(0, 0, 0).setName("Box 1971")
		);
		RearBogie.add(new ModelRendererTurbo(RearBogie, 449, 313, textureX, textureY).addBox(0, 0, 0, 8, 8, 0)
			.setRotationPoint(59.4f, 2, -6.01f).setRotationAngle(0, 0, 0).setName("Box 1972")
		);
		RearBogie.add(new ModelRendererTurbo(RearBogie, 505, 377, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0)
			.setRotationPoint(81.9f, 5.5f, 5.5f).setRotationAngle(0, 0, 0).setName("Box 1706")
		);
		RearBogie.add(new ModelRendererTurbo(RearBogie, 209, 385, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0.75f, 0, 0, 0, 0, 0, 0, 0, 0, 0.75f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(80.9f, 5.5f, 5.5f).setRotationAngle(0, 0, 0).setName("Box 1707")
		);
		RearBogie.add(new ModelRendererTurbo(RearBogie, 217, 385, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 1, 0, 0, 1, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, 1, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(79.9f, 4.5f, 5.5f).setRotationAngle(0, 0, 0).setName("Box 1708")
		);
		RearBogie.add(new ModelRendererTurbo(RearBogie, 225, 385, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 3, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(72.9f, 0.5f, 5.5f).setRotationAngle(0, 0, 0).setName("Box 1709")
		);
		RearBogie.add(new ModelRendererTurbo(RearBogie, 297, 385, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 7, 1, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0.5f, 0)
			.setRotationPoint(77.9f, 0.5f, 5.5f).setRotationAngle(0, 0, 0).setName("Box 1710")
		);
		RearBogie.add(new ModelRendererTurbo(RearBogie, 305, 385, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 7, 1, 0, 0, 0, 0, 0, -2.5f, 0, 0, -2.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(78.9f, 1, 5.5f).setRotationAngle(0, 0, 0).setName("Box 1711")
		);
		RearBogie.add(new ModelRendererTurbo(RearBogie, 417, 385, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 6, 1, 0, 0, 0.5f, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0, 0.5f, 0, 0, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0, 0, 0)
			.setRotationPoint(65.4f, 1, 5.5f).setRotationAngle(0, 0, 0).setName("Box 1720")
		);
		RearBogie.add(new ModelRendererTurbo(RearBogie, 433, 385, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 6, 1, 0, 0.25f, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0, 0, 0, 0, 0, 0, 0.25f, 0, 0)
			.setRotationPoint(71.9f, 1, 5.5f).setRotationAngle(0, 0, 0).setName("Box 1721")
		);
		RearBogie.add(new ModelRendererTurbo(RearBogie, 473, 385, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 7, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 1, 0)
			.setRotationPoint(76.9f, 0.5f, 5.5f).setRotationAngle(0, 0, 0).setName("Box 1725")
		);
		RearBogie.add(new ModelRendererTurbo(RearBogie, 17, 385, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0.5f, 0, 0, 1, 0, 0, 1, 0, 0, 0.5f, 0)
			.setRotationPoint(71.9f, 6.5f, 5.5f).setRotationAngle(0, 0, 0).setName("Box 1743")
		);
		RearBogie.add(new ModelRendererTurbo(RearBogie, 41, 385, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(69.9f, 6.5f, 5.5f).setRotationAngle(0, 0, 0).setName("Box 1745")
		);
		RearBogie.add(new ModelRendererTurbo(RearBogie, 49, 385, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0.5f, 0)
			.setRotationPoint(66.4f, 6.5f, 5.5f).setRotationAngle(0, 0, 0).setName("Box 1746")
		);
		RearBogie.add(new ModelRendererTurbo(RearBogie, 73, 385, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 1, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 1, 0)
			.setRotationPoint(65.4f, 6.5f, 5.5f).setRotationAngle(0, 0, 0).setName("Box 1747")
		);
		RearBogie.add(new ModelRendererTurbo(RearBogie, 121, 393, textureX, textureY).addBox(0, 0, 0, 4, 4, 1)
			.setRotationPoint(72.9f, 4, 5.65f).setRotationAngle(0, 0, 0).setName("Box 1752")
		);
		RearBogie.add(new ModelRendererTurbo(RearBogie, 265, 393, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, -1, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, -1, 0)
			.setRotationPoint(75.9f, 3, 5.5f).setRotationAngle(0, 0, 0).setName("Box 1764")
		);
		RearBogie.add(new ModelRendererTurbo(RearBogie, 273, 393, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, -0.5f, 0, -0.5f, -1, 0, -0.5f, -1, 0, 0, -0.5f, 0)
			.setRotationPoint(72.9f, 3, 5.5f).setRotationAngle(0, 0, 0).setName("Box 1765")
		);
		RearBogie.add(new ModelRendererTurbo(RearBogie, 97, 409, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 3, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(66.65f, 4, 5.5f).setRotationAngle(0, 0, 0).setName("Box 1818")
		);
		RearBogie.add(new ModelRendererTurbo(RearBogie, 113, 409, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(66.65f, 3, 5.5f).setRotationAngle(0, 0, 0).setName("Box 1819")
		);
		RearBogie.add(new ModelRendererTurbo(RearBogie, 121, 409, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(68.65f, 3, 5.5f).setRotationAngle(0, 0, 0).setName("Box 1820")
		);
		RearBogie.add(new ModelRendererTurbo(RearBogie, 129, 409, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(70.65f, 3, 5.5f).setRotationAngle(0, 0, 0).setName("Box 1821")
		);
		RearBogie.add(new ModelRendererTurbo(RearBogie, 137, 409, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(66.65f, 1, 5.5f).setRotationAngle(0, 0, 0).setName("Box 1822")
		);
		RearBogie.add(new ModelRendererTurbo(RearBogie, 273, 385, textureX, textureY).addBox(0, 0, 0, 2, 2, 1)
			.setRotationPoint(73.9f, 5, 5.75f).setRotationAngle(0, 0, 0).setName("Box 1722")
		);
		RearBogie.add(new ModelRendererTurbo(RearBogie, 233, 393, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 1, 0, 0, -1.5f, 0, 0, 0, 0, 0, 0, 0, 0, -1.5f, 0, 0, -1.5f, 0, 0, 0, 0, 0, 0, 0, 0, -1.5f, 0)
			.setRotationPoint(71.9f, 4, 5.6f).setRotationAngle(0, 0, 0).setName("Box 1760")
		);
		RearBogie.add(new ModelRendererTurbo(RearBogie, 241, 393, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 1, 0, 0, 0, 0, 0, -1.5f, 0, 0, -1.5f, 0, 0, 0, 0, 0, 0, 0, 0, -1.5f, 0, 0, -1.5f, 0, 0, 0, 0)
			.setRotationPoint(76.9f, 4, 5.6f).setRotationAngle(0, 0, 0).setName("Box 1761")
		);
		RearBogie.add(new ModelRendererTurbo(RearBogie, 145, 401, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.6f, 0, 0, 0, 0, 0, 0, 0, 0, -0.6f, 0, 0, 0, 0, 0, -0.6f, 0, 0, -0.6f, 0, 0, 0, 0)
			.setRotationPoint(73.65f, 3.45f, 5.4f).setRotationAngle(0, 0, 0).setName("Box 1791")
		);
		RearBogie.add(new ModelRendererTurbo(RearBogie, 153, 401, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.6f, 0, 0, 0, 0, 0, 0, 0, 0, -0.6f, 0, 0, 0, 0, 0, -0.6f, 0, 0, -0.6f, 0, 0, 0, 0)
			.setRotationPoint(73.65f, 2.55f, 5.4f).setRotationAngle(0, 0, 0).setName("Box 1792")
		);
		RearBogie.add(new ModelRendererTurbo(RearBogie, 161, 401, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, 0, -0.7f, 0, 0, -0.7f, 0, -0.7f, 0, 0, -0.7f, 0, -0.5f, 0, -0.7f, -0.5f, 0, -0.7f, -0.5f, -0.7f, 0, -0.5f, -0.7f)
			.setRotationPoint(74, 2.8f, 5.96f).setRotationAngle(0, 0, 0).setName("Box 1793")
		);
		RearBogie.add(new ModelRendererTurbo(RearBogie, 169, 401, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.6f, 0, 0, 0, 0, 0, 0, 0, 0, -0.6f, 0, 0, 0, 0, 0, -0.6f, 0, 0, -0.6f, 0, 0, 0, 0)
			.setRotationPoint(73.65f, 3, 5.4f).setRotationAngle(0, 0, 0).setName("Box 1794")
		);
		RearBogie.add(new ModelRendererTurbo(RearBogie, 177, 401, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, 0, -0.7f, 0, 0, -0.7f, 0, -0.7f, 0, 0, -0.7f, 0, -0.5f, 0, -0.7f, -0.5f, 0, -0.7f, -0.5f, -0.7f, 0, -0.5f, -0.7f)
			.setRotationPoint(75.5f, 2.8f, 5.96f).setRotationAngle(0, 0, 0).setName("Box 1795")
		);
		RearBogie.add(new ModelRendererTurbo(RearBogie, 185, 401, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.6f, 0, 0, 0, 0, 0, 0, 0, 0, -0.6f, 0, 0, 0, 0, 0, -0.6f, 0, 0, -0.6f, 0, 0, 0, 0)
			.setRotationPoint(75.15f, 2.55f, 5.4f).setRotationAngle(0, 0, 0).setName("Box 1796")
		);
		RearBogie.add(new ModelRendererTurbo(RearBogie, 193, 401, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.6f, 0, 0, 0, 0, 0, 0, 0, 0, -0.6f, 0, 0, 0, 0, 0, -0.6f, 0, 0, -0.6f, 0, 0, 0, 0)
			.setRotationPoint(75.15f, 3, 5.4f).setRotationAngle(0, 0, 0).setName("Box 1797")
		);
		RearBogie.add(new ModelRendererTurbo(RearBogie, 201, 401, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.6f, 0, 0, 0, 0, 0, 0, 0, 0, -0.6f, 0, 0, 0, 0, 0, -0.6f, 0, 0, -0.6f, 0, 0, 0, 0)
			.setRotationPoint(75.15f, 3.45f, 5.4f).setRotationAngle(0, 0, 0).setName("Box 1798")
		);
		RearBogie.add(new ModelRendererTurbo(RearBogie, 361, 25, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 2, 1, 0, 0, -1, 1, 0, 0, 0, 0, 0, 0, 0, -1, -1, 0, 0, 1, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, -1)
			.setRotationPoint(51.4f, 5.5f, 5.5f).setRotationAngle(0, 0, 0).setName("Box 533")
		);
		RearBogie.add(new ModelRendererTurbo(RearBogie, 113, 41, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 1, 1, 0, 0, 0, 4, 0, 0, 0, 0, 0, 0, 0, 0, -4, 0, 0, 4, 0, 0, 0, 0, 0, 0, 0, 0, -4)
			.setRotationPoint(46.4f, 6.5f, 4.5f).setRotationAngle(0, 0, 0).setName("Box 643")
		);
		RearBogie.add(new ModelRendererTurbo(RearBogie, 241, 385, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, 0, 0, 0.75f, 0, 0, 0.75f, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(56.4f, 5.5f, 5.5f).setRotationAngle(0, 0, 0).setName("Box 1714")
		);
		RearBogie.add(new ModelRendererTurbo(RearBogie, 313, 385, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 1, 0, 0, -0.25f, 0, 0, 1, 0, 0, 1, 0, 0, -0.25f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(57.4f, 4.5f, 5.5f).setRotationAngle(0, 0, 0).setName("Box 1715")
		);
		RearBogie.add(new ModelRendererTurbo(RearBogie, 321, 385, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 7, 1, 0, 0, -2.5f, 0, 0, 0, 0, 0, 0, 0, 0, -2.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(58.4f, 1, 5.5f).setRotationAngle(0, 0, 0).setName("Box 1716")
		);
		RearBogie.add(new ModelRendererTurbo(RearBogie, 409, 385, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 7, 1, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0.5f, 0)
			.setRotationPoint(59.4f, 0.5f, 5.5f).setRotationAngle(0, 0, 0).setName("Box 1717")
		);
		RearBogie.add(new ModelRendererTurbo(RearBogie, 249, 385, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 3, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(61.4f, 0.5f, 5.5f).setRotationAngle(0, 0, 0).setName("Box 1718")
		);
		RearBogie.add(new ModelRendererTurbo(RearBogie, 281, 385, textureX, textureY).addBox(0, 0, 0, 2, 2, 1)
			.setRotationPoint(62.4f, 5, 5.75f).setRotationAngle(0, 0, 0).setName("Box 1723")
		);
		RearBogie.add(new ModelRendererTurbo(RearBogie, 465, 385, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 7, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0.5f, 0, 0, 1, 0, 0, 1, 0, 0, 0.5f, 0)
			.setRotationPoint(60.4f, 0.5f, 5.5f).setRotationAngle(0, 0, 0).setName("Box 1724")
		);
		RearBogie.add(new ModelRendererTurbo(RearBogie, 89, 393, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 3, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(54.4f, 5.5f, 5.5f).setRotationAngle(0, 0, 0).setName("Box 1747")
		);
		RearBogie.add(new ModelRendererTurbo(RearBogie, 137, 393, textureX, textureY).addBox(0, 0, 0, 4, 4, 1)
			.setRotationPoint(61.4f, 4, 5.65f).setRotationAngle(0, 0, 0).setName("Box 1753")
		);
		RearBogie.add(new ModelRendererTurbo(RearBogie, 217, 393, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 1, 0, 0, 0, 0, 0, -1.5f, 0, 0, -1.5f, 0, 0, 0, 0, 0, 0, 0, 0, -1.5f, 0, 0, -1.5f, 0, 0, 0, 0)
			.setRotationPoint(65.4f, 4, 5.57f).setRotationAngle(0, 0, 0).setName("Box 1758")
		);
		RearBogie.add(new ModelRendererTurbo(RearBogie, 225, 393, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 1, 0, 0, -1.5f, 0, 0, 0, 0, 0, 0, 0, 0, -1.5f, 0, 0, -1.5f, 0, 0, 0, 0, 0, 0, 0, 0, -1.5f, 0)
			.setRotationPoint(60.4f, 4, 5.57f).setRotationAngle(0, 0, 0).setName("Box 1759")
		);
		RearBogie.add(new ModelRendererTurbo(RearBogie, 249, 393, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, -0.5f, 0, -0.5f, -1, 0, -0.5f, -1, 0, 0, -0.5f, 0)
			.setRotationPoint(61.4f, 3, 5.5f).setRotationAngle(0, 0, 0).setName("Box 1762")
		);
		RearBogie.add(new ModelRendererTurbo(RearBogie, 257, 393, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, -1, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, -1, 0)
			.setRotationPoint(64.4f, 3, 5.5f).setRotationAngle(0, 0, 0).setName("Box 1763")
		);
		RearBogie.add(new ModelRendererTurbo(RearBogie, 209, 401, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.6f, 0, 0, 0, 0, 0, 0, 0, 0, -0.6f, 0, 0, 0, 0, 0, -0.6f, 0, 0, -0.6f, 0, 0, 0, 0)
			.setRotationPoint(63.65f, 2.55f, 5.4f).setRotationAngle(0, 0, 0).setName("Box 1799")
		);
		RearBogie.add(new ModelRendererTurbo(RearBogie, 217, 401, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, 0, -0.7f, 0, 0, -0.7f, 0, -0.7f, 0, 0, -0.7f, 0, -0.5f, 0, -0.7f, -0.5f, 0, -0.7f, -0.5f, -0.7f, 0, -0.5f, -0.7f)
			.setRotationPoint(64, 2.8f, 5.96f).setRotationAngle(0, 0, 0).setName("Box 1800")
		);
		RearBogie.add(new ModelRendererTurbo(RearBogie, 225, 401, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.6f, 0, 0, 0, 0, 0, 0, 0, 0, -0.6f, 0, 0, 0, 0, 0, -0.6f, 0, 0, -0.6f, 0, 0, 0, 0)
			.setRotationPoint(63.65f, 3.45f, 5.4f).setRotationAngle(0, 0, 0).setName("Box 1801")
		);
		RearBogie.add(new ModelRendererTurbo(RearBogie, 233, 401, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.6f, 0, 0, 0, 0, 0, 0, 0, 0, -0.6f, 0, 0, 0, 0, 0, -0.6f, 0, 0, -0.6f, 0, 0, 0, 0)
			.setRotationPoint(63.65f, 3, 5.4f).setRotationAngle(0, 0, 0).setName("Box 1802")
		);
		RearBogie.add(new ModelRendererTurbo(RearBogie, 241, 401, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.6f, 0, 0, 0, 0, 0, 0, 0, 0, -0.6f, 0, 0, 0, 0, 0, -0.6f, 0, 0, -0.6f, 0, 0, 0, 0)
			.setRotationPoint(62.15f, 2.55f, 5.4f).setRotationAngle(0, 0, 0).setName("Box 1803")
		);
		RearBogie.add(new ModelRendererTurbo(RearBogie, 249, 401, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, 0, -0.7f, 0, 0, -0.7f, 0, -0.7f, 0, 0, -0.7f, 0, -0.5f, 0, -0.7f, -0.5f, 0, -0.7f, -0.5f, -0.7f, 0, -0.5f, -0.7f)
			.setRotationPoint(62.5f, 2.8f, 5.96f).setRotationAngle(0, 0, 0).setName("Box 1804")
		);
		RearBogie.add(new ModelRendererTurbo(RearBogie, 257, 401, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.6f, 0, 0, 0, 0, 0, 0, 0, 0, -0.6f, 0, 0, 0, 0, 0, -0.6f, 0, 0, -0.6f, 0, 0, 0, 0)
			.setRotationPoint(62.15f, 3, 5.4f).setRotationAngle(0, 0, 0).setName("Box 1805")
		);
		RearBogie.add(new ModelRendererTurbo(RearBogie, 265, 401, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.6f, 0, 0, 0, 0, 0, 0, 0, 0, -0.6f, 0, 0, 0, 0, 0, -0.6f, 0, 0, -0.6f, 0, 0, 0, 0)
			.setRotationPoint(62.15f, 3.45f, 5.4f).setRotationAngle(0, 0, 0).setName("Box 1806")
		);
		groups.add(RearBogie);
	}

}
