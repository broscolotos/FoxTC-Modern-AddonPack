//FMT-Marker FVTM-1.5
//Using PER-GROUP-INIT mode with limit '500'!
package tcmodern.client.render.locomotive.bogies;

import tmt.FVTMFormatBase;
import tmt.ModelRendererTurbo;

/** This file was exported via the FVTM Exporter v1.5 of<br>
 *  FMT (Fex's Modelling Toolbox) v.2.7.5 &copy; 2025 - Fexcraft.net<br>
 *  All rights reserved. For this Model's License contact the Author/Creator.
 */
public class ModelL3aFrontBogie extends FVTMFormatBase {

	public ModelL3aFrontBogie(){
		super();
		textureX = 512;
		textureY = 256;
		addToCreators("broscolotos");
		//
		initGroup_FrontBogie();
	}

	private final void initGroup_FrontBogie(){
		TurboList FrontBogie = new TurboList("FrontBogie");
		FrontBogie.add(new ModelRendererTurbo(FrontBogie, 272, 42, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 6, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-10.28125f, 4, 6.01f).setRotationAngle(0, 0, 0)
		);
		FrontBogie.add(new ModelRendererTurbo(FrontBogie, 389, 37, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 6, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-10.28125f, 4, -6.01f).setRotationAngle(0, 0, 0)
		);
		FrontBogie.add(new ModelRendererTurbo(FrontBogie, 389, 30, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 6, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(4.28125f, 4, 6.01f).setRotationAngle(0, 0, 0)
		);
		FrontBogie.add(new ModelRendererTurbo(FrontBogie, 284, 25, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 6, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(4.28125f, 4, -6.01f).setRotationAngle(0, 0, 0)
		);
		FrontBogie.add(new ModelRendererTurbo(FrontBogie, 54, 27, textureX, textureY).addBox(0, 0, 0, 18, 3, 12)
			.setRotationPoint(-8.96875f, 5.5f, -6).setRotationAngle(0, 0, 0).setName("Box 107")
		);
		groups.add(FrontBogie);
	}

}
