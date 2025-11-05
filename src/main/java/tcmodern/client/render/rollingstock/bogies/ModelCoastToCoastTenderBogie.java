//FMT-Marker FVTM-1.5
//Using PER-GROUP-INIT mode with limit '500'!
package tcmodern.client.render.rollingstock.bogies;


import tmt.FVTMFormatBase;
import tmt.ModelRendererTurbo;
import tmt.Vec3f;

/** This file was exported via the FVTM Exporter v1.5 of<br>
 *  FMT (Fex's Modelling Toolbox) v.2.7.5 &copy; 2025 - Fexcraft.net<br>
 *  All rights reserved. For this Model's License contact the Author/Creator.
 */
public class ModelCoastToCoastTenderBogie extends FVTMFormatBase {

	public ModelCoastToCoastTenderBogie(){
		super();
		textureX = 128;
		textureY = 128;
		addToCreators("broscolotos");
		//
		initGroup_Tender_Truck_F0();
		initGroup_Tender_Truck_F1();
		for (FVTMFormatBase.TurboList l : groups) {
			tmt.ModelRendererTurbo[] arr = new tmt.ModelRendererTurbo[l.size()];
			l.toArray(arr);
			fixRotation(arr, false, true, true);
		}
	}

	private final void initGroup_Tender_Truck_F0(){
		TurboList Tender_Truck_F = new TurboList("Tender_Truck_F");
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 10, 108, textureX, textureY).addCylinder(0, 0, 0, 1, 14, 8, 1, 1, 0, null)
			.setRotationPoint(13.5f, 6.5f, -7).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 5, 108, textureX, textureY).addCylinder(0, 0, 0, 1, 14, 8, 1, 1, 0, null)
			.setRotationPoint(4.5f, 6.5f, -7).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 0, 108, textureX, textureY).addCylinder(0, 0, 0, 1, 14, 8, 1, 1, 0, null)
			.setRotationPoint(-4.5f, 6.5f, -7).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 97, 107, textureX, textureY).addCylinder(0, 0, 0, 1, 14, 8, 1, 1, 0, null)
			.setRotationPoint(-13.5f, 6.5f, -7).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 111, 12, textureX, textureY)
			.addShapeBox(0, 0, 0, 7, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f)
			.setRotationPoint(-8, 2, 7).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 42, 10, textureX, textureY)
			.addShapeBox(0, 0, 0, 8, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f)
			.setRotationPoint(-18, 2, 7).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 111, 8, textureX, textureY)
			.addShapeBox(0, 0, 0, 7, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f)
			.setRotationPoint(1, 2, 7).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 23, 10, textureX, textureY)
			.addShapeBox(0, 0, 0, 8, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f)
			.setRotationPoint(10, 2, 7).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 111, 4, textureX, textureY)
			.addShapeBox(0, 0, 0, 7, 2, 1, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-8, 2, -8).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 42, 6, textureX, textureY)
			.addShapeBox(0, 0, 0, 8, 2, 1, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-18, 2, -8).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 111, 0, textureX, textureY)
			.addShapeBox(0, 0, 0, 7, 2, 1, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(1, 2, -8).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 23, 6, textureX, textureY)
			.addShapeBox(0, 0, 0, 8, 2, 1, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(10, 2, -8).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 26, 35, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 2, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(18, 2, 5).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 61, 6, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 3, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(18, 2, -7.5f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 12, 35, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 2, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-19, 2, 5).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 0, 6, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 3, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-19, 2, -7.5f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 61, 0, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 1, 14, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-3, 2, -7).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 0, 6, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 14, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(7, 2, -7).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 88, 2, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 14, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-11, 2, -7).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 102, 42, textureX, textureY).newCylinderBuilder()
			.setPosition(0, 0, 0).setRadius(1, 1.0E-15f).setLength(2).setSegments(8, 2).setScale(1, 1).setDirection(5)
			.setTopOffset(null).setTopRotation(new Vec3f(0.0, 0.0, 0.0)).build()
			.setRotationPoint(18, 2, -7).setRotationAngle(0, 90, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 92, 107, textureX, textureY).newCylinderBuilder()
			.setPosition(0, 0, 0).setRadius(1, 0).setLength(2).setSegments(8, 2).setScale(1, 1).setDirection(5)
			.setTopOffset(null).setTopRotation(new Vec3f(0.0, 0.0, 0.0)).build()
			.setRotationPoint(18, 2, 7).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 67, 107, textureX, textureY).newCylinderBuilder()
			.setPosition(0, 0, 0).setRadius(1, 0).setLength(2).setSegments(8, 2).setScale(1, 1).setDirection(5)
			.setTopOffset(null).setTopRotation(new Vec3f(0.0, 0.0, 0.0)).build()
			.setRotationPoint(-18, 2, 7).setRotationAngle(0, 270, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 62, 107, textureX, textureY).newCylinderBuilder()
			.setPosition(0, 0, 0).setRadius(1, 0).setLength(2).setSegments(8, 2).setScale(1, 1).setDirection(5)
			.setTopOffset(null).setTopRotation(new Vec3f(0.0, 0.0, 0.0)).build()
			.setRotationPoint(-18, 2, -7).setRotationAngle(0, 180, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 105, 34, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f)
			.setRotationPoint(8, 3.5f, 7).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 38, 107, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0.5f, 0, 0, -0.25f, 0, 0, -0.25f, -0.25f, 0, 0.5f, -0.25f)
			.setRotationPoint(8, 2, 7).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 19, 107, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.25f, 0, 0, 0.5f, 0, 0, 0.5f, -0.25f, 0, -0.25f, -0.25f)
			.setRotationPoint(9, 2, 7).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 77, 34, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f)
			.setRotationPoint(-1, 3.5f, 7).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 122, 106, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0.5f, 0, 0, -0.25f, 0, 0, -0.25f, -0.25f, 0, 0.5f, -0.25f)
			.setRotationPoint(-1, 2, 7).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 87, 106, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.25f, 0, 0, 0.5f, 0, 0, 0.5f, -0.25f, 0, -0.25f, -0.25f)
			.setRotationPoint(0, 2, 7).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 35, 34, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f)
			.setRotationPoint(-10, 3.5f, 7).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 82, 106, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0.5f, 0, 0, -0.25f, 0, 0, -0.25f, -0.25f, 0, 0.5f, -0.25f)
			.setRotationPoint(-10, 2, 7).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 57, 106, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.25f, 0, 0, 0.5f, 0, 0, 0.5f, -0.25f, 0, -0.25f, -0.25f)
			.setRotationPoint(-9, 2, 7).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 63, 33, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(8, 3.5f, -8).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 49, 106, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0, 0, 0, 0, 0.5f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, 0, 0, 0.5f, 0)
			.setRotationPoint(8, 2, -8).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 33, 106, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0, 0, 0, 0, -0.25f, -0.25f, 0, 0.5f, -0.25f, 0, 0.5f, 0, 0, -0.25f, 0)
			.setRotationPoint(9, 2, -8).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 56, 33, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(-1, 3.5f, -8).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 105, 105, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0, 0, 0, 0, 0.5f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, 0, 0, 0.5f, 0)
			.setRotationPoint(-1, 2, -8).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 77, 105, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0, 0, 0, 0, -0.25f, -0.25f, 0, 0.5f, -0.25f, 0, 0.5f, 0, 0, -0.25f, 0)
			.setRotationPoint(0, 2, -8).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 21, 33, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(-10, 3.5f, -8).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 72, 105, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0, 0, 0, 0, 0.5f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, 0, 0, 0.5f, 0)
			.setRotationPoint(-10, 2, -8).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 44, 105, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0, 0, 0, 0, -0.25f, -0.25f, 0, 0.5f, -0.25f, 0, 0.5f, 0, 0, -0.25f, 0)
			.setRotationPoint(-9, 2, -8).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 0, 33, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 4, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.25f, 0, 0, -0.25f, 0, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, -0.25f, 0, -0.25f, -0.25f)
			.setRotationPoint(-16.25f, 4, 7).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 24, 105, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.25f, 0, 0, -0.25f, -0.375f, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, -0.25f, -0.375f, -0.25f, -0.25f)
			.setRotationPoint(-16.75f, 5, 7).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 10, 105, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.25f, 0.5f, 0, -0.25f, 0.25f, -0.75f, 0, -0.5f, -0.75f, 0, -0.5f, -0.75f, -0.25f, 0.25f, -0.75f, -0.25f)
			.setRotationPoint(-16.75f, 4.25f, 7).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 0, 105, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.25f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.25f, 0.25f, 0, -0.25f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.25f, 0, -0.5f, -0.25f)
			.setRotationPoint(-16.75f, 4.5f, 7).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 118, 104, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 1.25f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.25f, 1.25f, 0, -0.25f, 0.5f, -0.75f, 0, -0.5f, -0.75f, 0, -0.5f, -0.75f, -0.25f, 0.5f, -0.75f, -0.25f)
			.setRotationPoint(-16.75f, 4, 7).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 119, 32, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.25f, 0, 0, -0.25f, 0, -0.875f, 0, -0.5f, -0.75f, 0, -0.5f, -0.75f, -0.25f, 0, -0.875f, -0.25f)
			.setRotationPoint(-16.25f, 7.75f, 7).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 113, 104, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, -0.25f, 0, -0.375f, -0.25f, 0, -0.375f, -0.25f, -0.25f, -0.5f, -0.25f, -0.25f)
			.setRotationPoint(-11.25f, 5, 7).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 100, 104, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, 0, 0, 0.5f, 0, 0, 0.5f, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, -0.75f, 0, 0.25f, -0.75f, 0, 0.25f, -0.75f, -0.25f, -0.5f, -0.75f, -0.25f)
			.setRotationPoint(-11.25f, 4.25f, 7).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 95, 104, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, 0, 0, 0.25f, 0, 0, 0.25f, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.25f, -0.5f, -0.5f, -0.25f)
			.setRotationPoint(-11.25f, 4.5f, 7).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 67, 104, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, 0, 0, 1.25f, 0, 0, 1.25f, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, -0.75f, 0, 0.5f, -0.75f, 0, 0.5f, -0.75f, -0.25f, -0.5f, -0.75f, -0.25f)
			.setRotationPoint(-11.25f, 4, 7).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 91, 32, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, -0.75f, 0, 0, -0.875f, 0, 0, -0.875f, -0.25f, -0.5f, -0.75f, -0.25f)
			.setRotationPoint(-12.75f, 7.75f, 7).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 84, 32, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 4, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.25f, 0, 0, -0.25f, 0, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, -0.25f, 0, -0.25f, -0.25f)
			.setRotationPoint(-12.25f, 4, 7).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 42, 32, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, -0.25f, 0, 0, -0.25f, 0, -0.75f, 0, 0.5f, -0.75f, 0, 0.5f, -0.75f, -0.25f, 0, -0.75f, -0.25f)
			.setRotationPoint(-14.75f, 7.75f, 7).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 112, 31, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 3, 1, 0, 0, 0, 0, 0.25f, 0, 0, 0.25f, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0.25f, 0, 0, 0.25f, 0, -0.25f, 0, 0, -0.25f)
			.setRotationPoint(-14.625f, 4.75f, 7).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 62, 104, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.25f, -0.75f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, -0.25f, -0.25f, -0.75f, -0.25f, -0.25f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.25f, -0.25f, 0, -0.25f)
			.setRotationPoint(-14.1875f, 3.75f, 7).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 53, 104, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.25f, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f, -0.25f, 0, -0.25f, -0.25f, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.25f, 0, 0, -0.25f)
			.setRotationPoint(-13.3125f, 3.75f, 7).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 39, 104, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.75f, 0, -0.75f, -1, 0, -0.75f, -1, -0.25f, 0, -0.75f, -0.25f, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.25f, 0, 0, -0.25f)
			.setRotationPoint(-13.0625f, 3.75f, 7).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 29, 104, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.25f, -1, 0, -0.5f, -0.75f, 0, -0.5f, -0.75f, -0.25f, -0.25f, -1, -0.25f, -0.25f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.25f, -0.25f, 0, -0.25f)
			.setRotationPoint(-14.4375f, 3.75f, 7).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 123, 103, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.4375f, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, -0.25f, -0.4375f, -0.25f, -0.25f, -0.4375f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.25f, -0.4375f, 0, -0.25f)
			.setRotationPoint(-14.125f, 3.75f, 7).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 90, 103, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.4375f, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, -0.25f, -0.4375f, -0.25f, -0.25f, -0.4375f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.25f, -0.4375f, 0, -0.25f)
			.setRotationPoint(-13.8125f, 3.75f, 7).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 85, 103, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.4375f, -0.84375f, 0, -0.5f, -0.75f, 0, -0.5f, -0.75f, -0.25f, -0.4375f, -0.84375f, -0.25f, -0.4375f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.25f, -0.4375f, 0, -0.25f)
			.setRotationPoint(-13.875f, 3.75f, 7).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 48, 103, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.4375f, -0.875f, 0, -0.5f, -0.84375f, 0, -0.5f, -0.84375f, -0.25f, -0.4375f, -0.875f, -0.25f, -0.4375f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.25f, -0.4375f, 0, -0.25f)
			.setRotationPoint(-13.9375f, 3.75f, 7).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 34, 103, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.4375f, -0.84375f, 0, -0.5f, -0.875f, 0, -0.5f, -0.875f, -0.25f, -0.4375f, -0.84375f, -0.25f, -0.4375f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.25f, -0.4375f, 0, -0.25f)
			.setRotationPoint(-14, 3.75f, 7).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 20, 103, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.4375f, -0.75f, 0, -0.5f, -0.84375f, 0, -0.5f, -0.84375f, -0.25f, -0.4375f, -0.75f, -0.25f, -0.4375f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.25f, -0.4375f, 0, -0.25f)
			.setRotationPoint(-14.0625f, 3.75f, 7).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 15, 103, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f)
			.setRotationPoint(-12.25f, 4.625f, 7.75f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 5, 103, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f)
			.setRotationPoint(-15, 4.625f, 7.75f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 109, 102, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0.25f, 0, 0, 0.25f, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, 0.25f, -0.75f, 0, 0.25f, -0.75f, -0.75f, 0, -0.75f, -0.75f)
			.setRotationPoint(-14.125f, 3.75f, 7.75f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 80, 102, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.0625f, 0, 0, -0.6875f, 0, 0, -0.6875f, 0, -0.75f, -0.0625f, 0, -0.75f, 0, -0.75f, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f, -0.75f, 0, -0.75f, -0.75f)
			.setRotationPoint(-15, 4.375f, 7.75f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 75, 102, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.6875f, 0, 0, -0.0625f, 0, 0, -0.0625f, 0, -0.75f, -0.6875f, 0, -0.75f, -0.75f, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, -0.75f, -0.75f, -0.75f, -0.75f)
			.setRotationPoint(-13, 4.375f, 7.75f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 58, 102, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.0625f, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, -0.0625f, -0.75f, 0, -0.6875f, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f, -0.75f, 0, -0.6875f, -0.75f)
			.setRotationPoint(-14.375f, 3.75f, 7.75f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 43, 102, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.75f, 0, 0, 0, -0.0625f, 0, 0, -0.0625f, -0.75f, -0.75f, 0, -0.75f, -0.75f, -0.75f, 0, 0, -0.6875f, 0, 0, -0.6875f, -0.75f, -0.75f, -0.75f, -0.75f)
			.setRotationPoint(-13.625f, 3.75f, 7.75f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 0, 102, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.125f, 0, -0.8125f, 0, 0, -0.8125f, 0, -0.75f, 0, -0.125f, -0.75f, 0, -0.625f, 0, -0.8125f, -0.75f, 0, -0.8125f, -0.75f, -0.75f, 0, -0.625f, -0.75f)
			.setRotationPoint(-14.5625f, 3.8125f, 7.75f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 119, 101, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.125f, 0, 0, -0.625f, 0, 0, -0.625f, 0, -0.75f, -0.125f, 0, -0.75f, 0, -0.8125f, 0, -0.75f, -0.8125f, 0, -0.75f, -0.8125f, -0.75f, 0, -0.8125f, -0.75f)
			.setRotationPoint(-14.9375f, 4.1875f, 7.75f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 98, 101, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.625f, 0, 0, -0.125f, 0, 0, -0.125f, 0, -0.75f, -0.625f, 0, -0.75f, -0.75f, -0.8125f, 0, 0, -0.8125f, 0, 0, -0.8125f, -0.75f, -0.75f, -0.8125f, -0.75f)
			.setRotationPoint(-13.0625f, 4.1875f, 7.75f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 70, 101, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.8125f, 0, 0, 0, -0.125f, 0, 0, -0.125f, -0.75f, -0.8125f, 0, -0.75f, -0.8125f, -0.75f, 0, 0, -0.625f, 0, 0, -0.625f, -0.75f, -0.8125f, -0.75f, -0.75f)
			.setRotationPoint(-13.4375f, 3.8125f, 7.75f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 65, 101, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.75f, -0.125f, 0, 0, -0.375f, 0, 0, -0.375f, -0.75f, -0.75f, -0.125f, -0.75f, -0.75f, -0.625f, 0, 0, -0.625f, 0, 0, -0.625f, -0.75f, -0.75f, -0.625f, -0.75f)
			.setRotationPoint(-13.1875f, 3.8125f, 7.75f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 53, 101, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.375f, 0, -0.75f, -0.125f, 0, -0.75f, -0.125f, -0.75f, 0, -0.375f, -0.75f, 0, -0.625f, 0, -0.75f, -0.625f, 0, -0.75f, -0.625f, -0.75f, 0, -0.625f, -0.75f)
			.setRotationPoint(-14.8125f, 3.8125f, 7.75f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 38, 101, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, -0.25f, -0.75f, 0, -0.25f, -1, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, -0.25f, -1, -0.75f, -0.25f)
			.setRotationPoint(-13.25f, 4, 7).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 30, 101, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.25f, 0, 0, -0.25f, 0, -0.75f, 0, -1, -0.75f, 0, -1, -0.75f, -0.25f, 0, -0.75f, -0.25f)
			.setRotationPoint(-14.75f, 4, 7).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 0, 3, textureX, textureY)
			.addShapeBox(0, 0, 0, 36, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f)
			.setRotationPoint(-18, 2, 7.75f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 10, 101, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f, 0, -0.25f, 0, -0.75f, -0.25f, 0, -0.75f, -0.25f, -0.75f, 0, -0.25f, -0.75f)
			.setRotationPoint(-18, 2.25f, 7.75f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 114, 100, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f, 0, -0.25f, 0, -0.75f, -0.25f, 0, -0.75f, -0.25f, -0.75f, 0, -0.25f, -0.75f)
			.setRotationPoint(17.75f, 2.25f, 7.75f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 70, 30, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 4, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.25f, 0, 0, -0.25f, 0, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, -0.25f, 0, -0.25f, -0.25f)
			.setRotationPoint(-7.25f, 4, 7).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 104, 100, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.25f, 0, 0, -0.25f, -0.375f, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, -0.25f, -0.375f, -0.25f, -0.25f)
			.setRotationPoint(-7.75f, 5, 7).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 93, 100, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.25f, 0.5f, 0, -0.25f, 0.25f, -0.75f, 0, -0.5f, -0.75f, 0, -0.5f, -0.75f, -0.25f, 0.25f, -0.75f, -0.25f)
			.setRotationPoint(-7.75f, 4.25f, 7).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 88, 100, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.25f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.25f, 0.25f, 0, -0.25f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.25f, 0, -0.5f, -0.25f)
			.setRotationPoint(-7.75f, 4.5f, 7).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 48, 100, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 1.25f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.25f, 1.25f, 0, -0.25f, 0.5f, -0.75f, 0, -0.5f, -0.75f, 0, -0.5f, -0.75f, -0.25f, 0.5f, -0.75f, -0.25f)
			.setRotationPoint(-7.75f, 4, 7).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 63, 30, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.25f, 0, 0, -0.25f, 0, -0.875f, 0, -0.5f, -0.75f, 0, -0.5f, -0.75f, -0.25f, 0, -0.875f, -0.25f)
			.setRotationPoint(-7.25f, 7.75f, 7).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 25, 100, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, -0.25f, 0, -0.375f, -0.25f, 0, -0.375f, -0.25f, -0.25f, -0.5f, -0.25f, -0.25f)
			.setRotationPoint(-2.25f, 5, 7).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 5, 100, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, 0, 0, 0.5f, 0, 0, 0.5f, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, -0.75f, 0, 0.25f, -0.75f, 0, 0.25f, -0.75f, -0.25f, -0.5f, -0.75f, -0.25f)
			.setRotationPoint(-2.25f, 4.25f, 7).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 123, 99, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, 0, 0, 0.25f, 0, 0, 0.25f, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.25f, -0.5f, -0.5f, -0.25f)
			.setRotationPoint(-2.25f, 4.5f, 7).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 109, 99, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, 0, 0, 1.25f, 0, 0, 1.25f, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, -0.75f, 0, 0.5f, -0.75f, 0, 0.5f, -0.75f, -0.25f, -0.5f, -0.75f, -0.25f)
			.setRotationPoint(-2.25f, 4, 7).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 56, 30, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, -0.75f, 0, 0, -0.875f, 0, 0, -0.875f, -0.25f, -0.5f, -0.75f, -0.25f)
			.setRotationPoint(-3.75f, 7.75f, 7).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 49, 30, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 4, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.25f, 0, 0, -0.25f, 0, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, -0.25f, 0, -0.25f, -0.25f)
			.setRotationPoint(-3.25f, 4, 7).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 21, 30, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, -0.25f, 0, 0, -0.25f, 0, -0.75f, 0, 0.5f, -0.75f, 0, 0.5f, -0.75f, -0.25f, 0, -0.75f, -0.25f)
			.setRotationPoint(-5.75f, 7.75f, 7).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 14, 30, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 3, 1, 0, 0, 0, 0, 0.25f, 0, 0, 0.25f, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0.25f, 0, 0, 0.25f, 0, -0.25f, 0, 0, -0.25f)
			.setRotationPoint(-5.625f, 4.75f, 7).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 83, 99, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.25f, -0.75f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, -0.25f, -0.25f, -0.75f, -0.25f, -0.25f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.25f, -0.25f, 0, -0.25f)
			.setRotationPoint(-5.1875f, 3.75f, 7).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 78, 99, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.25f, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f, -0.25f, 0, -0.25f, -0.25f, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.25f, 0, 0, -0.25f)
			.setRotationPoint(-4.3125f, 3.75f, 7).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 61, 99, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.75f, 0, -0.75f, -1, 0, -0.75f, -1, -0.25f, 0, -0.75f, -0.25f, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.25f, 0, 0, -0.25f)
			.setRotationPoint(-4.0625f, 3.75f, 7).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 43, 99, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.25f, -1, 0, -0.5f, -0.75f, 0, -0.5f, -0.75f, -0.25f, -0.25f, -1, -0.25f, -0.25f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.25f, -0.25f, 0, -0.25f)
			.setRotationPoint(-5.4375f, 3.75f, 7).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 34, 99, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.4375f, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, -0.25f, -0.4375f, -0.25f, -0.25f, -0.4375f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.25f, -0.4375f, 0, -0.25f)
			.setRotationPoint(-5.125f, 3.75f, 7).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 0, 99, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.4375f, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, -0.25f, -0.4375f, -0.25f, -0.25f, -0.4375f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.25f, -0.4375f, 0, -0.25f)
			.setRotationPoint(-4.8125f, 3.75f, 7).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 100, 98, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.4375f, -0.84375f, 0, -0.5f, -0.75f, 0, -0.5f, -0.75f, -0.25f, -0.4375f, -0.84375f, -0.25f, -0.4375f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.25f, -0.4375f, 0, -0.25f)
			.setRotationPoint(-4.875f, 3.75f, 7).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 73, 98, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.4375f, -0.875f, 0, -0.5f, -0.84375f, 0, -0.5f, -0.84375f, -0.25f, -0.4375f, -0.875f, -0.25f, -0.4375f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.25f, -0.4375f, 0, -0.25f)
			.setRotationPoint(-4.9375f, 3.75f, 7).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 68, 98, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.4375f, -0.84375f, 0, -0.5f, -0.875f, 0, -0.5f, -0.875f, -0.25f, -0.4375f, -0.84375f, -0.25f, -0.4375f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.25f, -0.4375f, 0, -0.25f)
			.setRotationPoint(-5, 3.75f, 7).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 56, 98, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.4375f, -0.75f, 0, -0.5f, -0.84375f, 0, -0.5f, -0.84375f, -0.25f, -0.4375f, -0.75f, -0.25f, -0.4375f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.25f, -0.4375f, 0, -0.25f)
			.setRotationPoint(-5.0625f, 3.75f, 7).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 20, 98, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f)
			.setRotationPoint(-3.25f, 4.625f, 7.75f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 15, 98, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f)
			.setRotationPoint(-6, 4.625f, 7.75f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 10, 98, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0.25f, 0, 0, 0.25f, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, 0.25f, -0.75f, 0, 0.25f, -0.75f, -0.75f, 0, -0.75f, -0.75f)
			.setRotationPoint(-5.125f, 3.75f, 7.75f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 119, 97, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.0625f, 0, 0, -0.6875f, 0, 0, -0.6875f, 0, -0.75f, -0.0625f, 0, -0.75f, 0, -0.75f, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f, -0.75f, 0, -0.75f, -0.75f)
			.setRotationPoint(-6, 4.375f, 7.75f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 114, 97, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.6875f, 0, 0, -0.0625f, 0, 0, -0.0625f, 0, -0.75f, -0.6875f, 0, -0.75f, -0.75f, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, -0.75f, -0.75f, -0.75f, -0.75f)
			.setRotationPoint(-4, 4.375f, 7.75f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 95, 97, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.0625f, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, -0.0625f, -0.75f, 0, -0.6875f, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f, -0.75f, 0, -0.6875f, -0.75f)
			.setRotationPoint(-5.375f, 3.75f, 7.75f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 90, 97, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.75f, 0, 0, 0, -0.0625f, 0, 0, -0.0625f, -0.75f, -0.75f, 0, -0.75f, -0.75f, -0.75f, 0, 0, -0.6875f, 0, 0, -0.6875f, -0.75f, -0.75f, -0.75f, -0.75f)
			.setRotationPoint(-4.625f, 3.75f, 7.75f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 51, 97, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.125f, 0, -0.8125f, 0, 0, -0.8125f, 0, -0.75f, 0, -0.125f, -0.75f, 0, -0.625f, 0, -0.8125f, -0.75f, 0, -0.8125f, -0.75f, -0.75f, 0, -0.625f, -0.75f)
			.setRotationPoint(-5.5625f, 3.8125f, 7.75f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 39, 97, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.125f, 0, 0, -0.625f, 0, 0, -0.625f, 0, -0.75f, -0.125f, 0, -0.75f, 0, -0.8125f, 0, -0.75f, -0.8125f, 0, -0.75f, -0.8125f, -0.75f, 0, -0.8125f, -0.75f)
			.setRotationPoint(-5.9375f, 4.1875f, 7.75f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 5, 97, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.625f, 0, 0, -0.125f, 0, 0, -0.125f, 0, -0.75f, -0.625f, 0, -0.75f, -0.75f, -0.8125f, 0, 0, -0.8125f, 0, 0, -0.8125f, -0.75f, -0.75f, -0.8125f, -0.75f)
			.setRotationPoint(-4.0625f, 4.1875f, 7.75f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 85, 96, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.8125f, 0, 0, 0, -0.125f, 0, 0, -0.125f, -0.75f, -0.8125f, 0, -0.75f, -0.8125f, -0.75f, 0, 0, -0.625f, 0, 0, -0.625f, -0.75f, -0.8125f, -0.75f, -0.75f)
			.setRotationPoint(-4.4375f, 3.8125f, 7.75f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 80, 96, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.75f, -0.125f, 0, 0, -0.375f, 0, 0, -0.375f, -0.75f, -0.75f, -0.125f, -0.75f, -0.75f, -0.625f, 0, 0, -0.625f, 0, 0, -0.625f, -0.75f, -0.75f, -0.625f, -0.75f)
			.setRotationPoint(-4.1875f, 3.8125f, 7.75f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 64, 96, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.375f, 0, -0.75f, -0.125f, 0, -0.75f, -0.125f, -0.75f, 0, -0.375f, -0.75f, 0, -0.625f, 0, -0.75f, -0.625f, 0, -0.75f, -0.625f, -0.75f, 0, -0.625f, -0.75f)
			.setRotationPoint(-5.8125f, 3.8125f, 7.75f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 46, 96, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, -0.25f, -0.75f, 0, -0.25f, -1, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, -0.25f, -1, -0.75f, -0.25f)
			.setRotationPoint(-4.25f, 4, 7).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 34, 96, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.25f, 0, 0, -0.25f, 0, -0.75f, 0, -1, -0.75f, 0, -1, -0.75f, -0.25f, 0, -0.75f, -0.25f)
			.setRotationPoint(-5.75f, 4, 7).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 7, 30, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 4, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.25f, 0, 0, -0.25f, 0, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, -0.25f, 0, -0.25f, -0.25f)
			.setRotationPoint(1.75f, 4, 7).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 29, 96, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.25f, 0, 0, -0.25f, -0.375f, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, -0.25f, -0.375f, -0.25f, -0.25f)
			.setRotationPoint(1.25f, 5, 7).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 0, 96, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.25f, 0.5f, 0, -0.25f, 0.25f, -0.75f, 0, -0.5f, -0.75f, 0, -0.5f, -0.75f, -0.25f, 0.25f, -0.75f, -0.25f)
			.setRotationPoint(1.25f, 4.25f, 7).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 123, 95, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.25f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.25f, 0.25f, 0, -0.25f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.25f, 0, -0.5f, -0.25f)
			.setRotationPoint(1.25f, 4.5f, 7).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 110, 95, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 1.25f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.25f, 1.25f, 0, -0.25f, 0.5f, -0.75f, 0, -0.5f, -0.75f, 0, -0.5f, -0.75f, -0.25f, 0.5f, -0.75f, -0.25f)
			.setRotationPoint(1.25f, 4, 7).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 0, 30, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.25f, 0, 0, -0.25f, 0, -0.875f, 0, -0.5f, -0.75f, 0, -0.5f, -0.75f, -0.25f, 0, -0.875f, -0.25f)
			.setRotationPoint(1.75f, 7.75f, 7).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 105, 95, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, -0.25f, 0, -0.375f, -0.25f, 0, -0.375f, -0.25f, -0.25f, -0.5f, -0.25f, -0.25f)
			.setRotationPoint(6.75f, 5, 7).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 100, 95, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, 0, 0, 0.5f, 0, 0, 0.5f, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, -0.75f, 0, 0.25f, -0.75f, 0, 0.25f, -0.75f, -0.25f, -0.5f, -0.75f, -0.25f)
			.setRotationPoint(6.75f, 4.25f, 7).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 59, 95, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, 0, 0, 0.25f, 0, 0, 0.25f, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.25f, -0.5f, -0.5f, -0.25f)
			.setRotationPoint(6.75f, 4.5f, 7).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 24, 95, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, 0, 0, 1.25f, 0, 0, 1.25f, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, -0.75f, 0, 0.5f, -0.75f, 0, 0.5f, -0.75f, -0.25f, -0.5f, -0.75f, -0.25f)
			.setRotationPoint(6.75f, 4, 7).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 120, 29, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, -0.75f, 0, 0, -0.875f, 0, 0, -0.875f, -0.25f, -0.5f, -0.75f, -0.25f)
			.setRotationPoint(5.25f, 7.75f, 7).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 99, 29, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 4, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.25f, 0, 0, -0.25f, 0, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, -0.25f, 0, -0.25f, -0.25f)
			.setRotationPoint(5.75f, 4, 7).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 92, 29, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, -0.25f, 0, 0, -0.25f, 0, -0.75f, 0, 0.5f, -0.75f, 0, 0.5f, -0.75f, -0.25f, 0, -0.75f, -0.25f)
			.setRotationPoint(3.25f, 7.75f, 7).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 77, 29, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 3, 1, 0, 0, 0, 0, 0.25f, 0, 0, 0.25f, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0.25f, 0, 0, 0.25f, 0, -0.25f, 0, 0, -0.25f)
			.setRotationPoint(3.375f, 4.75f, 7).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 19, 95, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.25f, -0.75f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, -0.25f, -0.25f, -0.75f, -0.25f, -0.25f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.25f, -0.25f, 0, -0.25f)
			.setRotationPoint(3.8125f, 3.75f, 7).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 14, 95, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.25f, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f, -0.25f, 0, -0.25f, -0.25f, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.25f, 0, 0, -0.25f)
			.setRotationPoint(4.6875f, 3.75f, 7).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 9, 95, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.75f, 0, -0.75f, -1, 0, -0.75f, -1, -0.25f, 0, -0.75f, -0.25f, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.25f, 0, 0, -0.25f)
			.setRotationPoint(4.9375f, 3.75f, 7).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 118, 94, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.25f, -1, 0, -0.5f, -0.75f, 0, -0.5f, -0.75f, -0.25f, -0.25f, -1, -0.25f, -0.25f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.25f, -0.25f, 0, -0.25f)
			.setRotationPoint(3.5625f, 3.75f, 7).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 95, 94, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.4375f, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, -0.25f, -0.4375f, -0.25f, -0.25f, -0.4375f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.25f, -0.4375f, 0, -0.25f)
			.setRotationPoint(3.875f, 3.75f, 7).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 90, 94, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.4375f, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, -0.25f, -0.4375f, -0.25f, -0.25f, -0.4375f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.25f, -0.4375f, 0, -0.25f)
			.setRotationPoint(4.1875f, 3.75f, 7).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 54, 94, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.4375f, -0.84375f, 0, -0.5f, -0.75f, 0, -0.5f, -0.75f, -0.25f, -0.4375f, -0.84375f, -0.25f, -0.4375f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.25f, -0.4375f, 0, -0.25f)
			.setRotationPoint(4.125f, 3.75f, 7).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 42, 94, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.4375f, -0.875f, 0, -0.5f, -0.84375f, 0, -0.5f, -0.84375f, -0.25f, -0.4375f, -0.875f, -0.25f, -0.4375f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.25f, -0.4375f, 0, -0.25f)
			.setRotationPoint(4.0625f, 3.75f, 7).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 85, 93, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.4375f, -0.84375f, 0, -0.5f, -0.875f, 0, -0.5f, -0.875f, -0.25f, -0.4375f, -0.84375f, -0.25f, -0.4375f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.25f, -0.4375f, 0, -0.25f)
			.setRotationPoint(4, 3.75f, 7).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 80, 93, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.4375f, -0.75f, 0, -0.5f, -0.84375f, 0, -0.5f, -0.84375f, -0.25f, -0.4375f, -0.75f, -0.25f, -0.4375f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.25f, -0.4375f, 0, -0.25f)
			.setRotationPoint(3.9375f, 3.75f, 7).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 75, 93, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f)
			.setRotationPoint(5.75f, 4.625f, 7.75f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 70, 93, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f)
			.setRotationPoint(3, 4.625f, 7.75f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 65, 93, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0.25f, 0, 0, 0.25f, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, 0.25f, -0.75f, 0, 0.25f, -0.75f, -0.75f, 0, -0.75f, -0.75f)
			.setRotationPoint(3.875f, 3.75f, 7.75f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 49, 93, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.0625f, 0, 0, -0.6875f, 0, 0, -0.6875f, 0, -0.75f, -0.0625f, 0, -0.75f, 0, -0.75f, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f, -0.75f, 0, -0.75f, -0.75f)
			.setRotationPoint(3, 4.375f, 7.75f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 37, 93, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.6875f, 0, 0, -0.0625f, 0, 0, -0.0625f, 0, -0.75f, -0.6875f, 0, -0.75f, -0.75f, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, -0.75f, -0.75f, -0.75f, -0.75f)
			.setRotationPoint(5, 4.375f, 7.75f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 32, 93, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.0625f, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, -0.0625f, -0.75f, 0, -0.6875f, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f, -0.75f, 0, -0.6875f, -0.75f)
			.setRotationPoint(3.625f, 3.75f, 7.75f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 123, 92, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.75f, 0, 0, 0, -0.0625f, 0, 0, -0.0625f, -0.75f, -0.75f, 0, -0.75f, -0.75f, -0.75f, 0, 0, -0.6875f, 0, 0, -0.6875f, -0.75f, -0.75f, -0.75f, -0.75f)
			.setRotationPoint(4.375f, 3.75f, 7.75f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 114, 92, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.125f, 0, -0.8125f, 0, 0, -0.8125f, 0, -0.75f, 0, -0.125f, -0.75f, 0, -0.625f, 0, -0.8125f, -0.75f, 0, -0.8125f, -0.75f, -0.75f, 0, -0.625f, -0.75f)
			.setRotationPoint(3.4375f, 3.8125f, 7.75f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 109, 92, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.125f, 0, 0, -0.625f, 0, 0, -0.625f, 0, -0.75f, -0.125f, 0, -0.75f, 0, -0.8125f, 0, -0.75f, -0.8125f, 0, -0.75f, -0.8125f, -0.75f, 0, -0.8125f, -0.75f)
			.setRotationPoint(3.0625f, 4.1875f, 7.75f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 104, 92, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.625f, 0, 0, -0.125f, 0, 0, -0.125f, 0, -0.75f, -0.625f, 0, -0.75f, -0.75f, -0.8125f, 0, 0, -0.8125f, 0, 0, -0.8125f, -0.75f, -0.75f, -0.8125f, -0.75f)
			.setRotationPoint(4.9375f, 4.1875f, 7.75f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 60, 92, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.8125f, 0, 0, 0, -0.125f, 0, 0, -0.125f, -0.75f, -0.8125f, 0, -0.75f, -0.8125f, -0.75f, 0, 0, -0.625f, 0, 0, -0.625f, -0.75f, -0.8125f, -0.75f, -0.75f)
			.setRotationPoint(4.5625f, 3.8125f, 7.75f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 27, 92, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.75f, -0.125f, 0, 0, -0.375f, 0, 0, -0.375f, -0.75f, -0.75f, -0.125f, -0.75f, -0.75f, -0.625f, 0, 0, -0.625f, 0, 0, -0.625f, -0.75f, -0.75f, -0.625f, -0.75f)
			.setRotationPoint(4.8125f, 3.8125f, 7.75f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 22, 92, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.375f, 0, -0.75f, -0.125f, 0, -0.75f, -0.125f, -0.75f, 0, -0.375f, -0.75f, 0, -0.625f, 0, -0.75f, -0.625f, 0, -0.75f, -0.625f, -0.75f, 0, -0.625f, -0.75f)
			.setRotationPoint(3.1875f, 3.8125f, 7.75f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 17, 92, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, -0.25f, -0.75f, 0, -0.25f, -1, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, -0.25f, -1, -0.75f, -0.25f)
			.setRotationPoint(4.75f, 4, 7).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 12, 92, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.25f, 0, 0, -0.25f, 0, -0.75f, 0, -1, -0.75f, 0, -1, -0.75f, -0.25f, 0, -0.75f, -0.25f)
			.setRotationPoint(3.25f, 4, 7).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 29, 29, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 4, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.25f, 0, 0, -0.25f, 0, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, -0.25f, 0, -0.25f, -0.25f)
			.setRotationPoint(10.75f, 4, 7).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 4, 92, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.25f, 0, 0, -0.25f, -0.375f, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, -0.25f, -0.375f, -0.25f, -0.25f)
			.setRotationPoint(10.25f, 5, 7).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 94, 91, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.25f, 0.5f, 0, -0.25f, 0.25f, -0.75f, 0, -0.5f, -0.75f, 0, -0.5f, -0.75f, -0.25f, 0.25f, -0.75f, -0.25f)
			.setRotationPoint(10.25f, 4.25f, 7).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 55, 91, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.25f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.25f, 0.25f, 0, -0.25f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.25f, 0, -0.5f, -0.25f)
			.setRotationPoint(10.25f, 4.5f, 7).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 119, 90, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 1.25f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.25f, 1.25f, 0, -0.25f, 0.5f, -0.75f, 0, -0.5f, -0.75f, 0, -0.5f, -0.75f, -0.25f, 0.5f, -0.75f, -0.25f)
			.setRotationPoint(10.25f, 4, 7).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 64, 27, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.25f, 0, 0, -0.25f, 0, -0.875f, 0, -0.5f, -0.75f, 0, -0.5f, -0.75f, -0.25f, 0, -0.875f, -0.25f)
			.setRotationPoint(10.75f, 7.75f, 7).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 99, 90, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, -0.25f, 0, -0.375f, -0.25f, 0, -0.375f, -0.25f, -0.25f, -0.5f, -0.25f, -0.25f)
			.setRotationPoint(15.75f, 5, 7).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 84, 90, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, 0, 0, 0.5f, 0, 0, 0.5f, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, -0.75f, 0, 0.25f, -0.75f, 0, 0.25f, -0.75f, -0.25f, -0.5f, -0.75f, -0.25f)
			.setRotationPoint(15.75f, 4.25f, 7).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 79, 90, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, 0, 0, 0.25f, 0, 0, 0.25f, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.25f, -0.5f, -0.5f, -0.25f)
			.setRotationPoint(15.75f, 4.5f, 7).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 74, 90, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, 0, 0, 1.25f, 0, 0, 1.25f, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, -0.75f, 0, 0.5f, -0.75f, 0, 0.5f, -0.75f, -0.25f, -0.5f, -0.75f, -0.25f)
			.setRotationPoint(15.75f, 4, 7).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 57, 27, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, -0.75f, 0, 0, -0.875f, 0, 0, -0.875f, -0.25f, -0.5f, -0.75f, -0.25f)
			.setRotationPoint(14.25f, 7.75f, 7).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 36, 27, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 4, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.25f, 0, 0, -0.25f, 0, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, -0.25f, 0, -0.25f, -0.25f)
			.setRotationPoint(14.75f, 4, 7).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 120, 26, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, -0.25f, 0, 0, -0.25f, 0, -0.75f, 0, 0.5f, -0.75f, 0, 0.5f, -0.75f, -0.25f, 0, -0.75f, -0.25f)
			.setRotationPoint(12.25f, 7.75f, 7).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 113, 26, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 3, 1, 0, 0, 0, 0, 0.25f, 0, 0, 0.25f, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0.25f, 0, 0, 0.25f, 0, -0.25f, 0, 0, -0.25f)
			.setRotationPoint(12.375f, 4.75f, 7).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 69, 90, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.25f, -0.75f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, -0.25f, -0.25f, -0.75f, -0.25f, -0.25f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.25f, -0.25f, 0, -0.25f)
			.setRotationPoint(12.8125f, 3.75f, 7).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 64, 90, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.25f, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f, -0.25f, 0, -0.25f, -0.25f, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.25f, 0, 0, -0.25f)
			.setRotationPoint(13.6875f, 3.75f, 7).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 50, 90, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.75f, 0, -0.75f, -1, 0, -0.75f, -1, -0.25f, 0, -0.75f, -0.25f, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.25f, 0, 0, -0.25f)
			.setRotationPoint(13.9375f, 3.75f, 7).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 37, 90, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.25f, -1, 0, -0.5f, -0.75f, 0, -0.5f, -0.75f, -0.25f, -0.25f, -1, -0.25f, -0.25f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.25f, -0.25f, 0, -0.25f)
			.setRotationPoint(12.5625f, 3.75f, 7).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 32, 90, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.4375f, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, -0.25f, -0.4375f, -0.25f, -0.25f, -0.4375f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.25f, -0.4375f, 0, -0.25f)
			.setRotationPoint(12.875f, 3.75f, 7).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 8, 90, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.4375f, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, -0.25f, -0.4375f, -0.25f, -0.25f, -0.4375f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.25f, -0.4375f, 0, -0.25f)
			.setRotationPoint(13.1875f, 3.75f, 7).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 0, 90, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.4375f, -0.84375f, 0, -0.5f, -0.75f, 0, -0.5f, -0.75f, -0.25f, -0.4375f, -0.84375f, -0.25f, -0.4375f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.25f, -0.4375f, 0, -0.25f)
			.setRotationPoint(13.125f, 3.75f, 7).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 114, 89, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.4375f, -0.875f, 0, -0.5f, -0.84375f, 0, -0.5f, -0.84375f, -0.25f, -0.4375f, -0.875f, -0.25f, -0.4375f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.25f, -0.4375f, 0, -0.25f)
			.setRotationPoint(13.0625f, 3.75f, 7).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 109, 89, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.4375f, -0.84375f, 0, -0.5f, -0.875f, 0, -0.5f, -0.875f, -0.25f, -0.4375f, -0.84375f, -0.25f, -0.4375f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.25f, -0.4375f, 0, -0.25f)
			.setRotationPoint(13, 3.75f, 7).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 104, 89, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.4375f, -0.75f, 0, -0.5f, -0.84375f, 0, -0.5f, -0.84375f, -0.25f, -0.4375f, -0.75f, -0.25f, -0.4375f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.25f, -0.4375f, 0, -0.25f)
			.setRotationPoint(12.9375f, 3.75f, 7).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 89, 89, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f)
			.setRotationPoint(14.75f, 4.625f, 7.75f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 45, 89, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f)
			.setRotationPoint(12, 4.625f, 7.75f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 27, 89, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0.25f, 0, 0, 0.25f, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, 0.25f, -0.75f, 0, 0.25f, -0.75f, -0.75f, 0, -0.75f, -0.75f)
			.setRotationPoint(12.875f, 3.75f, 7.75f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 16, 89, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.0625f, 0, 0, -0.6875f, 0, 0, -0.6875f, 0, -0.75f, -0.0625f, 0, -0.75f, 0, -0.75f, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f, -0.75f, 0, -0.75f, -0.75f)
			.setRotationPoint(12, 4.375f, 7.75f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 55, 88, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.6875f, 0, 0, -0.0625f, 0, 0, -0.0625f, 0, -0.75f, -0.6875f, 0, -0.75f, -0.75f, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, -0.75f, -0.75f, -0.75f, -0.75f)
			.setRotationPoint(14, 4.375f, 7.75f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 121, 87, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.0625f, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, -0.0625f, -0.75f, 0, -0.6875f, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f, -0.75f, 0, -0.6875f, -0.75f)
			.setRotationPoint(12.625f, 3.75f, 7.75f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 100, 87, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.75f, 0, 0, 0, -0.0625f, 0, 0, -0.0625f, -0.75f, -0.75f, 0, -0.75f, -0.75f, -0.75f, 0, 0, -0.6875f, 0, 0, -0.6875f, -0.75f, -0.75f, -0.75f, -0.75f)
			.setRotationPoint(13.375f, 3.75f, 7.75f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 85, 87, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.125f, 0, -0.8125f, 0, 0, -0.8125f, 0, -0.75f, 0, -0.125f, -0.75f, 0, -0.625f, 0, -0.8125f, -0.75f, 0, -0.8125f, -0.75f, -0.75f, 0, -0.625f, -0.75f)
			.setRotationPoint(12.4375f, 3.8125f, 7.75f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 80, 87, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.125f, 0, 0, -0.625f, 0, 0, -0.625f, 0, -0.75f, -0.125f, 0, -0.75f, 0, -0.8125f, 0, -0.75f, -0.8125f, 0, -0.75f, -0.8125f, -0.75f, 0, -0.8125f, -0.75f)
			.setRotationPoint(12.0625f, 4.1875f, 7.75f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 75, 87, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.625f, 0, 0, -0.125f, 0, 0, -0.125f, 0, -0.75f, -0.625f, 0, -0.75f, -0.75f, -0.8125f, 0, 0, -0.8125f, 0, 0, -0.8125f, -0.75f, -0.75f, -0.8125f, -0.75f)
			.setRotationPoint(13.9375f, 4.1875f, 7.75f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 70, 87, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.8125f, 0, 0, 0, -0.125f, 0, 0, -0.125f, -0.75f, -0.8125f, 0, -0.75f, -0.8125f, -0.75f, 0, 0, -0.625f, 0, 0, -0.625f, -0.75f, -0.8125f, -0.75f, -0.75f)
			.setRotationPoint(13.5625f, 3.8125f, 7.75f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 65, 87, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.75f, -0.125f, 0, 0, -0.375f, 0, 0, -0.375f, -0.75f, -0.75f, -0.125f, -0.75f, -0.75f, -0.625f, 0, 0, -0.625f, 0, 0, -0.625f, -0.75f, -0.75f, -0.625f, -0.75f)
			.setRotationPoint(13.8125f, 3.8125f, 7.75f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 41, 87, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.375f, 0, -0.75f, -0.125f, 0, -0.75f, -0.125f, -0.75f, 0, -0.375f, -0.75f, 0, -0.625f, 0, -0.75f, -0.625f, 0, -0.75f, -0.625f, -0.75f, 0, -0.625f, -0.75f)
			.setRotationPoint(12.1875f, 3.8125f, 7.75f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 36, 87, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, -0.25f, -0.75f, 0, -0.25f, -1, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, -0.25f, -1, -0.75f, -0.25f)
			.setRotationPoint(13.75f, 4, 7).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 31, 87, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.25f, 0, 0, -0.25f, 0, -0.75f, 0, -1, -0.75f, 0, -1, -0.75f, -0.25f, 0, -0.75f, -0.25f)
			.setRotationPoint(12.25f, 4, 7).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 22, 87, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, -0.375f, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0.125f, -0.375f, -0.375f, 0.125f, -0.375f, -0.375f, 0.125f, -0.375f, -0.375f, 0.125f, -0.375f)
			.setRotationPoint(-8.75f, 4.125f, 6.5f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 106, 86, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.375f, 0, 0, -0.375f, 0, 0, -0.375f, 0, 0, -0.375f, 0, -0.75f, -0.375f, 0, -0.75f, -0.375f, 0, -0.75f, -0.375f, 0, -0.75f, -0.375f)
			.setRotationPoint(-8.25f, 7.125f, 6.75f).setRotationAngle(0.125f, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 95, 86, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, -0.375f, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0.125f, -0.375f, -0.375f, 0.125f, -0.375f, -0.375f, 0.125f, -0.375f, -0.375f, 0.125f, -0.375f)
			.setRotationPoint(-1.25f, 4.125f, 6.5f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 90, 86, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.375f, 0, 0, -0.375f, 0, 0, -0.375f, 0, 0, -0.375f, 0, -0.75f, -0.375f, 0, -0.75f, -0.375f, 0, -0.75f, -0.375f, 0, -0.75f, -0.375f)
			.setRotationPoint(-1.75f, 7.125f, 6.75f).setRotationAngle(0.125f, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 60, 86, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, -0.375f, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0.125f, -0.375f, -0.375f, 0.125f, -0.375f, -0.375f, 0.125f, -0.375f, -0.375f, 0.125f, -0.375f)
			.setRotationPoint(0.25f, 4.125f, 6.5f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 17, 86, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.375f, 0, 0, -0.375f, 0, 0, -0.375f, 0, 0, -0.375f, 0, -0.75f, -0.375f, 0, -0.75f, -0.375f, 0, -0.75f, -0.375f, 0, -0.75f, -0.375f)
			.setRotationPoint(0.75f, 7.125f, 6.75f).setRotationAngle(0.125f, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 4, 86, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, -0.375f, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0.125f, -0.375f, -0.375f, 0.125f, -0.375f, -0.375f, 0.125f, -0.375f, -0.375f, 0.125f, -0.375f)
			.setRotationPoint(7.75f, 4.125f, 6.5f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 55, 85, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.375f, 0, 0, -0.375f, 0, 0, -0.375f, 0, 0, -0.375f, 0, -0.75f, -0.375f, 0, -0.75f, -0.375f, 0, -0.75f, -0.375f, 0, -0.75f, -0.375f)
			.setRotationPoint(7.25f, 7.125f, 6.75f).setRotationAngle(0.125f, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 50, 85, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, -0.375f, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0.125f, -0.375f, -0.375f, 0.125f, -0.375f, -0.375f, 0.125f, -0.375f, -0.375f, 0.125f, -0.375f)
			.setRotationPoint(9.25f, 4.125f, 6.5f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 27, 85, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.375f, 0, 0, -0.375f, 0, 0, -0.375f, 0, 0, -0.375f, 0, -0.75f, -0.375f, 0, -0.75f, -0.375f, 0, -0.75f, -0.375f, 0, -0.75f, -0.375f)
			.setRotationPoint(9.75f, 7.125f, 6.75f).setRotationAngle(0.125f, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 12, 85, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, -0.375f, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0.125f, -0.375f, -0.375f, 0.125f, -0.375f, -0.375f, 0.125f, -0.375f, -0.375f, 0.125f, -0.375f)
			.setRotationPoint(16.75f, 4.125f, 6.5f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 121, 84, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.375f, 0, 0, -0.375f, 0, 0, -0.375f, 0, 0, -0.375f, 0, -0.75f, -0.375f, 0, -0.75f, -0.375f, 0, -0.75f, -0.375f, 0, -0.75f, -0.375f)
			.setRotationPoint(16.25f, 7.125f, 6.75f).setRotationAngle(0.125f, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 116, 84, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f)
			.setRotationPoint(-12.25f, 4.625f, -8).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 111, 84, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f)
			.setRotationPoint(-15, 4.625f, -8).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 102, 84, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0.25f, 0, 0, 0.25f, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, 0.25f, -0.75f, 0, 0.25f, -0.75f, -0.75f, 0, -0.75f, -0.75f)
			.setRotationPoint(-14.125f, 3.75f, -8).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 86, 84, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.0625f, 0, 0, -0.6875f, 0, 0, -0.6875f, 0, -0.75f, -0.0625f, 0, -0.75f, 0, -0.75f, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f, -0.75f, 0, -0.75f, -0.75f)
			.setRotationPoint(-15, 4.375f, -8).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 81, 84, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.6875f, 0, 0, -0.0625f, 0, 0, -0.0625f, 0, -0.75f, -0.6875f, 0, -0.75f, -0.75f, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, -0.75f, -0.75f, -0.75f, -0.75f)
			.setRotationPoint(-13, 4.375f, -8).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 66, 84, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.0625f, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, -0.0625f, -0.75f, 0, -0.6875f, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f, -0.75f, 0, -0.6875f, -0.75f)
			.setRotationPoint(-14.375f, 3.75f, -8).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 45, 84, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.75f, 0, 0, 0, -0.0625f, 0, 0, -0.0625f, -0.75f, -0.75f, 0, -0.75f, -0.75f, -0.75f, 0, 0, -0.6875f, 0, 0, -0.6875f, -0.75f, -0.75f, -0.75f, -0.75f)
			.setRotationPoint(-13.625f, 3.75f, -8).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 40, 84, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.125f, 0, -0.8125f, 0, 0, -0.8125f, 0, -0.75f, 0, -0.125f, -0.75f, 0, -0.625f, 0, -0.8125f, -0.75f, 0, -0.8125f, -0.75f, -0.75f, 0, -0.625f, -0.75f)
			.setRotationPoint(-14.5625f, 3.8125f, -8).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 35, 84, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.125f, 0, 0, -0.625f, 0, 0, -0.625f, 0, -0.75f, -0.125f, 0, -0.75f, 0, -0.8125f, 0, -0.75f, -0.8125f, 0, -0.75f, -0.8125f, -0.75f, 0, -0.8125f, -0.75f)
			.setRotationPoint(-14.9375f, 4.1875f, -8).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 22, 84, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.625f, 0, 0, -0.125f, 0, 0, -0.125f, 0, -0.75f, -0.625f, 0, -0.75f, -0.75f, -0.8125f, 0, 0, -0.8125f, 0, 0, -0.8125f, -0.75f, -0.75f, -0.8125f, -0.75f)
			.setRotationPoint(-13.0625f, 4.1875f, -8).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 0, 84, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.8125f, 0, 0, 0, -0.125f, 0, 0, -0.125f, -0.75f, -0.8125f, 0, -0.75f, -0.8125f, -0.75f, 0, 0, -0.625f, 0, 0, -0.625f, -0.75f, -0.8125f, -0.75f, -0.75f)
			.setRotationPoint(-13.4375f, 3.8125f, -8).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 61, 83, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.75f, -0.125f, 0, 0, -0.375f, 0, 0, -0.375f, -0.75f, -0.75f, -0.125f, -0.75f, -0.75f, -0.625f, 0, 0, -0.625f, 0, 0, -0.625f, -0.75f, -0.75f, -0.625f, -0.75f)
			.setRotationPoint(-13.1875f, 3.8125f, -8).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 107, 82, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.375f, 0, -0.75f, -0.125f, 0, -0.75f, -0.125f, -0.75f, 0, -0.375f, -0.75f, 0, -0.625f, 0, -0.75f, -0.625f, 0, -0.75f, -0.625f, -0.75f, 0, -0.625f, -0.75f)
			.setRotationPoint(-14.8125f, 3.8125f, -8).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 0, 0, textureX, textureY)
			.addShapeBox(0, 0, 0, 36, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f)
			.setRotationPoint(-18, 2, -8).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 97, 82, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f, 0, -0.25f, 0, -0.75f, -0.25f, 0, -0.75f, -0.25f, -0.75f, 0, -0.25f, -0.75f)
			.setRotationPoint(-18, 2.25f, -8).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 92, 82, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f, 0, -0.25f, 0, -0.75f, -0.25f, 0, -0.75f, -0.25f, -0.75f, 0, -0.25f, -0.75f)
			.setRotationPoint(17.75f, 2.25f, -8).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 76, 82, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f)
			.setRotationPoint(-3.25f, 4.625f, -8).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 71, 82, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f)
			.setRotationPoint(-6, 4.625f, -8).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 56, 82, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0.25f, 0, 0, 0.25f, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, 0.25f, -0.75f, 0, 0.25f, -0.75f, -0.75f, 0, -0.75f, -0.75f)
			.setRotationPoint(-5.125f, 3.75f, -8).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 51, 82, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.0625f, 0, 0, -0.6875f, 0, 0, -0.6875f, 0, -0.75f, -0.0625f, 0, -0.75f, 0, -0.75f, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f, -0.75f, 0, -0.75f, -0.75f)
			.setRotationPoint(-6, 4.375f, -8).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 31, 82, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.6875f, 0, 0, -0.0625f, 0, 0, -0.0625f, 0, -0.75f, -0.6875f, 0, -0.75f, -0.75f, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, -0.75f, -0.75f, -0.75f, -0.75f)
			.setRotationPoint(-4, 4.375f, -8).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 26, 82, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.0625f, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, -0.0625f, -0.75f, 0, -0.6875f, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f, -0.75f, 0, -0.6875f, -0.75f)
			.setRotationPoint(-5.375f, 3.75f, -8).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 120, 81, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.75f, 0, 0, 0, -0.0625f, 0, 0, -0.0625f, -0.75f, -0.75f, 0, -0.75f, -0.75f, -0.75f, 0, 0, -0.6875f, 0, 0, -0.6875f, -0.75f, -0.75f, -0.75f, -0.75f)
			.setRotationPoint(-4.625f, 3.75f, -8).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 115, 81, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.125f, 0, -0.8125f, 0, 0, -0.8125f, 0, -0.75f, 0, -0.125f, -0.75f, 0, -0.625f, 0, -0.8125f, -0.75f, 0, -0.8125f, -0.75f, -0.75f, 0, -0.625f, -0.75f)
			.setRotationPoint(-5.5625f, 3.8125f, -8).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 102, 81, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.125f, 0, 0, -0.625f, 0, 0, -0.625f, 0, -0.75f, -0.125f, 0, -0.75f, 0, -0.8125f, 0, -0.75f, -0.8125f, 0, -0.75f, -0.8125f, -0.75f, 0, -0.8125f, -0.75f)
			.setRotationPoint(-5.9375f, 4.1875f, -8).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 87, 81, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.625f, 0, 0, -0.125f, 0, 0, -0.125f, 0, -0.75f, -0.625f, 0, -0.75f, -0.75f, -0.8125f, 0, 0, -0.8125f, 0, 0, -0.8125f, -0.75f, -0.75f, -0.8125f, -0.75f)
			.setRotationPoint(-4.0625f, 4.1875f, -8).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 82, 81, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.8125f, 0, 0, 0, -0.125f, 0, 0, -0.125f, -0.75f, -0.8125f, 0, -0.75f, -0.8125f, -0.75f, 0, 0, -0.625f, 0, 0, -0.625f, -0.75f, -0.8125f, -0.75f, -0.75f)
			.setRotationPoint(-4.4375f, 3.8125f, -8).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 66, 81, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.75f, -0.125f, 0, 0, -0.375f, 0, 0, -0.375f, -0.75f, -0.75f, -0.125f, -0.75f, -0.75f, -0.625f, 0, 0, -0.625f, 0, 0, -0.625f, -0.75f, -0.75f, -0.625f, -0.75f)
			.setRotationPoint(-4.1875f, 3.8125f, -8).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 36, 81, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.375f, 0, -0.75f, -0.125f, 0, -0.75f, -0.125f, -0.75f, 0, -0.375f, -0.75f, 0, -0.625f, 0, -0.75f, -0.625f, 0, -0.75f, -0.625f, -0.75f, 0, -0.625f, -0.75f)
			.setRotationPoint(-5.8125f, 3.8125f, -8).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 17, 81, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f)
			.setRotationPoint(5.75f, 4.625f, -8).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 8, 81, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f)
			.setRotationPoint(3, 4.625f, -8).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 0, 81, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0.25f, 0, 0, 0.25f, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, 0.25f, -0.75f, 0, 0.25f, -0.75f, -0.75f, 0, -0.75f, -0.75f)
			.setRotationPoint(3.875f, 3.75f, -8).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 61, 80, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.0625f, 0, 0, -0.6875f, 0, 0, -0.6875f, 0, -0.75f, -0.0625f, 0, -0.75f, 0, -0.75f, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f, -0.75f, 0, -0.75f, -0.75f)
			.setRotationPoint(3, 4.375f, -8).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 22, 80, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.6875f, 0, 0, -0.0625f, 0, 0, -0.0625f, 0, -0.75f, -0.6875f, 0, -0.75f, -0.75f, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, -0.75f, -0.75f, -0.75f, -0.75f)
			.setRotationPoint(5, 4.375f, -8).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 111, 79, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.0625f, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, -0.0625f, -0.75f, 0, -0.6875f, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f, -0.75f, 0, -0.6875f, -0.75f)
			.setRotationPoint(3.625f, 3.75f, -8).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 106, 79, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.75f, 0, 0, 0, -0.0625f, 0, 0, -0.0625f, -0.75f, -0.75f, 0, -0.75f, -0.75f, -0.75f, 0, 0, -0.6875f, 0, 0, -0.6875f, -0.75f, -0.75f, -0.75f, -0.75f)
			.setRotationPoint(4.375f, 3.75f, -8).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 98, 79, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.125f, 0, -0.8125f, 0, 0, -0.8125f, 0, -0.75f, 0, -0.125f, -0.75f, 0, -0.625f, 0, -0.8125f, -0.75f, 0, -0.8125f, -0.75f, -0.75f, 0, -0.625f, -0.75f)
			.setRotationPoint(3.4375f, 3.8125f, -8).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 93, 79, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.125f, 0, 0, -0.625f, 0, 0, -0.625f, 0, -0.75f, -0.125f, 0, -0.75f, 0, -0.8125f, 0, -0.75f, -0.8125f, 0, -0.75f, -0.8125f, -0.75f, 0, -0.8125f, -0.75f)
			.setRotationPoint(3.0625f, 4.1875f, -8).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 78, 79, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.625f, 0, 0, -0.125f, 0, 0, -0.125f, 0, -0.75f, -0.625f, 0, -0.75f, -0.75f, -0.8125f, 0, 0, -0.8125f, 0, 0, -0.8125f, -0.75f, -0.75f, -0.8125f, -0.75f)
			.setRotationPoint(4.9375f, 4.1875f, -8).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 73, 79, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.8125f, 0, 0, 0, -0.125f, 0, 0, -0.125f, -0.75f, -0.8125f, 0, -0.75f, -0.8125f, -0.75f, 0, 0, -0.625f, 0, 0, -0.625f, -0.75f, -0.8125f, -0.75f, -0.75f)
			.setRotationPoint(4.5625f, 3.8125f, -8).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 56, 79, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.75f, -0.125f, 0, 0, -0.375f, 0, 0, -0.375f, -0.75f, -0.75f, -0.125f, -0.75f, -0.75f, -0.625f, 0, 0, -0.625f, 0, 0, -0.625f, -0.75f, -0.75f, -0.625f, -0.75f)
			.setRotationPoint(4.8125f, 3.8125f, -8).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 51, 79, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.375f, 0, -0.75f, -0.125f, 0, -0.75f, -0.125f, -0.75f, 0, -0.375f, -0.75f, 0, -0.625f, 0, -0.75f, -0.625f, 0, -0.75f, -0.625f, -0.75f, 0, -0.625f, -0.75f)
			.setRotationPoint(3.1875f, 3.8125f, -8).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 46, 79, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f)
			.setRotationPoint(14.75f, 4.625f, -8).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 41, 79, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f)
			.setRotationPoint(12, 4.625f, -8).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 27, 79, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0.25f, 0, 0, 0.25f, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, 0.25f, -0.75f, 0, 0.25f, -0.75f, -0.75f, 0, -0.75f, -0.75f)
			.setRotationPoint(12.875f, 3.75f, -8).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 13, 79, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.0625f, 0, 0, -0.6875f, 0, 0, -0.6875f, 0, -0.75f, -0.0625f, 0, -0.75f, 0, -0.75f, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f, -0.75f, 0, -0.75f, -0.75f)
			.setRotationPoint(12, 4.375f, -8).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 4, 79, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.6875f, 0, 0, -0.0625f, 0, 0, -0.0625f, 0, -0.75f, -0.6875f, 0, -0.75f, -0.75f, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, -0.75f, -0.75f, -0.75f, -0.75f)
			.setRotationPoint(14, 4.375f, -8).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 117, 78, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.0625f, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, -0.0625f, -0.75f, 0, -0.6875f, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f, -0.75f, 0, -0.6875f, -0.75f)
			.setRotationPoint(12.625f, 3.75f, -8).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 88, 78, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.75f, 0, 0, 0, -0.0625f, 0, 0, -0.0625f, -0.75f, -0.75f, 0, -0.75f, -0.75f, -0.75f, 0, 0, -0.6875f, 0, 0, -0.6875f, -0.75f, -0.75f, -0.75f, -0.75f)
			.setRotationPoint(13.375f, 3.75f, -8).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 83, 78, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.125f, 0, -0.8125f, 0, 0, -0.8125f, 0, -0.75f, 0, -0.125f, -0.75f, 0, -0.625f, 0, -0.8125f, -0.75f, 0, -0.8125f, -0.75f, -0.75f, 0, -0.625f, -0.75f)
			.setRotationPoint(12.4375f, 3.8125f, -8).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 68, 78, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.125f, 0, 0, -0.625f, 0, 0, -0.625f, 0, -0.75f, -0.125f, 0, -0.75f, 0, -0.8125f, 0, -0.75f, -0.8125f, 0, -0.75f, -0.8125f, -0.75f, 0, -0.8125f, -0.75f)
			.setRotationPoint(12.0625f, 4.1875f, -8).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 18, 78, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.625f, 0, 0, -0.125f, 0, 0, -0.125f, 0, -0.75f, -0.625f, 0, -0.75f, -0.75f, -0.8125f, 0, 0, -0.8125f, 0, 0, -0.8125f, -0.75f, -0.75f, -0.8125f, -0.75f)
			.setRotationPoint(13.9375f, 4.1875f, -8).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 102, 77, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.8125f, 0, 0, 0, -0.125f, 0, 0, -0.125f, -0.75f, -0.8125f, 0, -0.75f, -0.8125f, -0.75f, 0, 0, -0.625f, 0, 0, -0.625f, -0.75f, -0.8125f, -0.75f, -0.75f)
			.setRotationPoint(13.5625f, 3.8125f, -8).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 63, 77, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.75f, -0.125f, 0, 0, -0.375f, 0, 0, -0.375f, -0.75f, -0.75f, -0.125f, -0.75f, -0.75f, -0.625f, 0, 0, -0.625f, 0, 0, -0.625f, -0.75f, -0.75f, -0.625f, -0.75f)
			.setRotationPoint(13.8125f, 3.8125f, -8).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 37, 77, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.375f, 0, -0.75f, -0.125f, 0, -0.75f, -0.125f, -0.75f, 0, -0.375f, -0.75f, 0, -0.625f, 0, -0.75f, -0.625f, 0, -0.75f, -0.625f, -0.75f, 0, -0.625f, -0.75f)
			.setRotationPoint(12.1875f, 3.8125f, -8).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 106, 26, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 4, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.25f, 0, 0, -0.25f, 0, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, -0.25f, 0, -0.25f, -0.25f)
			.setRotationPoint(-16.25f, 4, -7.75f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 32, 77, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.25f, 0, 0, -0.25f, -0.375f, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, -0.25f, -0.375f, -0.25f, -0.25f)
			.setRotationPoint(-16.75f, 5, -7.75f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 23, 77, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.25f, 0.5f, 0, -0.25f, 0.25f, -0.75f, 0, -0.5f, -0.75f, 0, -0.5f, -0.75f, -0.25f, 0.25f, -0.75f, -0.25f)
			.setRotationPoint(-16.75f, 4.25f, -7.75f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 9, 77, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.25f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.25f, 0.25f, 0, -0.25f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.25f, 0, -0.5f, -0.25f)
			.setRotationPoint(-16.75f, 4.5f, -7.75f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 0, 77, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 1.25f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.25f, 1.25f, 0, -0.25f, 0.5f, -0.75f, 0, -0.5f, -0.75f, 0, -0.5f, -0.75f, -0.25f, 0.5f, -0.75f, -0.25f)
			.setRotationPoint(-16.75f, 4, -7.75f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 99, 26, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.25f, 0, 0, -0.25f, 0, -0.875f, 0, -0.5f, -0.75f, 0, -0.5f, -0.75f, -0.25f, 0, -0.875f, -0.25f)
			.setRotationPoint(-16.25f, 7.75f, -7.75f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 123, 76, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, -0.25f, 0, -0.375f, -0.25f, 0, -0.375f, -0.25f, -0.25f, -0.5f, -0.25f, -0.25f)
			.setRotationPoint(-11.25f, 5, -7.75f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 113, 76, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, 0, 0, 0.5f, 0, 0, 0.5f, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, -0.75f, 0, 0.25f, -0.75f, 0, 0.25f, -0.75f, -0.25f, -0.5f, -0.75f, -0.25f)
			.setRotationPoint(-11.25f, 4.25f, -7.75f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 97, 76, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, 0, 0, 0.25f, 0, 0, 0.25f, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.25f, -0.5f, -0.5f, -0.25f)
			.setRotationPoint(-11.25f, 4.5f, -7.75f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 92, 76, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, 0, 0, 1.25f, 0, 0, 1.25f, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, -0.75f, 0, 0.5f, -0.75f, 0, 0.5f, -0.75f, -0.25f, -0.5f, -0.75f, -0.25f)
			.setRotationPoint(-11.25f, 4, -7.75f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 92, 26, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, -0.75f, 0, 0, -0.875f, 0, 0, -0.875f, -0.25f, -0.5f, -0.75f, -0.25f)
			.setRotationPoint(-12.75f, 7.75f, -7.75f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 85, 26, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 4, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.25f, 0, 0, -0.25f, 0, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, -0.25f, 0, -0.25f, -0.25f)
			.setRotationPoint(-12.25f, 4, -7.75f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 78, 26, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, -0.25f, 0, 0, -0.25f, 0, -0.75f, 0, 0.5f, -0.75f, 0, 0.5f, -0.75f, -0.25f, 0, -0.75f, -0.25f)
			.setRotationPoint(-14.75f, 7.75f, -7.75f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 43, 26, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 3, 1, 0, 0, 0, 0, 0.25f, 0, 0, 0.25f, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0.25f, 0, 0, 0.25f, 0, -0.25f, 0, 0, -0.25f)
			.setRotationPoint(-14.625f, 4.75f, -7.75f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 79, 76, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.25f, -0.75f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, -0.25f, -0.25f, -0.75f, -0.25f, -0.25f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.25f, -0.25f, 0, -0.25f)
			.setRotationPoint(-14.1875f, 3.75f, -7.75f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 74, 76, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.25f, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f, -0.25f, 0, -0.25f, -0.25f, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.25f, 0, 0, -0.25f)
			.setRotationPoint(-13.3125f, 3.75f, -7.75f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 58, 76, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.75f, 0, -0.75f, -1, 0, -0.75f, -1, -0.25f, 0, -0.75f, -0.25f, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.25f, 0, 0, -0.25f)
			.setRotationPoint(-13.0625f, 3.75f, -7.75f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 53, 76, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.25f, -1, 0, -0.5f, -0.75f, 0, -0.5f, -0.75f, -0.25f, -0.25f, -1, -0.25f, -0.25f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.25f, -0.25f, 0, -0.25f)
			.setRotationPoint(-14.4375f, 3.75f, -7.75f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 48, 76, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.4375f, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, -0.25f, -0.4375f, -0.25f, -0.25f, -0.4375f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.25f, -0.4375f, 0, -0.25f)
			.setRotationPoint(-14.125f, 3.75f, -7.75f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 43, 76, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.4375f, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, -0.25f, -0.4375f, -0.25f, -0.25f, -0.4375f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.25f, -0.4375f, 0, -0.25f)
			.setRotationPoint(-13.8125f, 3.75f, -7.75f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 118, 75, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.4375f, -0.84375f, 0, -0.5f, -0.75f, 0, -0.5f, -0.75f, -0.25f, -0.4375f, -0.84375f, -0.25f, -0.4375f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.25f, -0.4375f, 0, -0.25f)
			.setRotationPoint(-13.875f, 3.75f, -7.75f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 87, 75, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.4375f, -0.875f, 0, -0.5f, -0.84375f, 0, -0.5f, -0.84375f, -0.25f, -0.4375f, -0.875f, -0.25f, -0.4375f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.25f, -0.4375f, 0, -0.25f)
			.setRotationPoint(-13.9375f, 3.75f, -7.75f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 69, 75, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.4375f, -0.84375f, 0, -0.5f, -0.875f, 0, -0.5f, -0.875f, -0.25f, -0.4375f, -0.84375f, -0.25f, -0.4375f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.25f, -0.4375f, 0, -0.25f)
			.setRotationPoint(-14, 3.75f, -7.75f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 28, 75, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.4375f, -0.75f, 0, -0.5f, -0.84375f, 0, -0.5f, -0.84375f, -0.25f, -0.4375f, -0.75f, -0.25f, -0.4375f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.25f, -0.4375f, 0, -0.25f)
			.setRotationPoint(-14.0625f, 3.75f, -7.75f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 19, 75, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, -0.25f, -0.75f, 0, -0.25f, -1, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, -0.25f, -1, -0.75f, -0.25f)
			.setRotationPoint(-13.25f, 4, -7.75f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 5, 75, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.25f, 0, 0, -0.25f, 0, -0.75f, 0, -1, -0.75f, 0, -1, -0.75f, -0.25f, 0, -0.75f, -0.25f)
			.setRotationPoint(-14.75f, 4, -7.75f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 71, 24, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 4, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.25f, 0, 0, -0.25f, 0, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, -0.25f, 0, -0.25f, -0.25f)
			.setRotationPoint(-7.25f, 4, -7.75f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 108, 74, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.25f, 0, 0, -0.25f, -0.375f, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, -0.25f, -0.375f, -0.25f, -0.25f)
			.setRotationPoint(-7.75f, 5, -7.75f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 103, 74, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.25f, 0.5f, 0, -0.25f, 0.25f, -0.75f, 0, -0.5f, -0.75f, 0, -0.5f, -0.75f, -0.25f, 0.25f, -0.75f, -0.25f)
			.setRotationPoint(-7.75f, 4.25f, -7.75f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 64, 74, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.25f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.25f, 0.25f, 0, -0.25f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.25f, 0, -0.5f, -0.25f)
			.setRotationPoint(-7.75f, 4.5f, -7.75f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 33, 74, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 1.25f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.25f, 1.25f, 0, -0.25f, 0.5f, -0.75f, 0, -0.5f, -0.75f, 0, -0.5f, -0.75f, -0.25f, 0.5f, -0.75f, -0.25f)
			.setRotationPoint(-7.75f, 4, -7.75f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 64, 24, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.25f, 0, 0, -0.25f, 0, -0.875f, 0, -0.5f, -0.75f, 0, -0.5f, -0.75f, -0.25f, 0, -0.875f, -0.25f)
			.setRotationPoint(-7.25f, 7.75f, -7.75f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 14, 74, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, -0.25f, 0, -0.375f, -0.25f, 0, -0.375f, -0.25f, -0.25f, -0.5f, -0.25f, -0.25f)
			.setRotationPoint(-2.25f, 5, -7.75f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 0, 74, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, 0, 0, 0.5f, 0, 0, 0.5f, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, -0.75f, 0, 0.25f, -0.75f, 0, 0.25f, -0.75f, -0.25f, -0.5f, -0.75f, -0.25f)
			.setRotationPoint(-2.25f, 4.25f, -7.75f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 123, 73, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, 0, 0, 0.25f, 0, 0, 0.25f, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.25f, -0.5f, -0.5f, -0.25f)
			.setRotationPoint(-2.25f, 4.5f, -7.75f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 98, 73, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, 0, 0, 1.25f, 0, 0, 1.25f, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, -0.75f, 0, 0.5f, -0.75f, 0, 0.5f, -0.75f, -0.25f, -0.5f, -0.75f, -0.25f)
			.setRotationPoint(-2.25f, 4, -7.75f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 57, 24, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, -0.75f, 0, 0, -0.875f, 0, 0, -0.875f, -0.25f, -0.5f, -0.75f, -0.25f)
			.setRotationPoint(-3.75f, 7.75f, -7.75f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 50, 24, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 4, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.25f, 0, 0, -0.25f, 0, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, -0.25f, 0, -0.25f, -0.25f)
			.setRotationPoint(-3.25f, 4, -7.75f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 44, 22, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, -0.25f, 0, 0, -0.25f, 0, -0.75f, 0, 0.5f, -0.75f, 0, 0.5f, -0.75f, -0.25f, 0, -0.75f, -0.25f)
			.setRotationPoint(-5.75f, 7.75f, -7.75f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 37, 22, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 3, 1, 0, 0, 0, 0, 0.25f, 0, 0, 0.25f, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0.25f, 0, 0, 0.25f, 0, -0.25f, 0, 0, -0.25f)
			.setRotationPoint(-5.625f, 4.75f, -7.75f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 93, 73, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.25f, -0.75f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, -0.25f, -0.25f, -0.75f, -0.25f, -0.25f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.25f, -0.25f, 0, -0.25f)
			.setRotationPoint(-5.1875f, 3.75f, -7.75f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 83, 73, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.25f, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f, -0.25f, 0, -0.25f, -0.25f, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.25f, 0, 0, -0.25f)
			.setRotationPoint(-4.3125f, 3.75f, -7.75f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 78, 73, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.75f, 0, -0.75f, -1, 0, -0.75f, -1, -0.25f, 0, -0.75f, -0.25f, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.25f, 0, 0, -0.25f)
			.setRotationPoint(-4.0625f, 3.75f, -7.75f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 73, 73, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.25f, -1, 0, -0.5f, -0.75f, 0, -0.5f, -0.75f, -0.25f, -0.25f, -1, -0.25f, -0.25f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.25f, -0.25f, 0, -0.25f)
			.setRotationPoint(-5.4375f, 3.75f, -7.75f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 59, 73, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.4375f, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, -0.25f, -0.4375f, -0.25f, -0.25f, -0.4375f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.25f, -0.4375f, 0, -0.25f)
			.setRotationPoint(-5.125f, 3.75f, -7.75f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 54, 73, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.4375f, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, -0.25f, -0.4375f, -0.25f, -0.25f, -0.4375f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.25f, -0.4375f, 0, -0.25f)
			.setRotationPoint(-4.8125f, 3.75f, -7.75f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 49, 73, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.4375f, -0.84375f, 0, -0.5f, -0.75f, 0, -0.5f, -0.75f, -0.25f, -0.4375f, -0.84375f, -0.25f, -0.4375f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.25f, -0.4375f, 0, -0.25f)
			.setRotationPoint(-4.875f, 3.75f, -7.75f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 44, 73, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.4375f, -0.875f, 0, -0.5f, -0.84375f, 0, -0.5f, -0.84375f, -0.25f, -0.4375f, -0.875f, -0.25f, -0.4375f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.25f, -0.4375f, 0, -0.25f)
			.setRotationPoint(-4.9375f, 3.75f, -7.75f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 24, 73, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.4375f, -0.84375f, 0, -0.5f, -0.875f, 0, -0.5f, -0.875f, -0.25f, -0.4375f, -0.84375f, -0.25f, -0.4375f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.25f, -0.4375f, 0, -0.25f)
			.setRotationPoint(-5, 3.75f, -7.75f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 9, 73, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.4375f, -0.75f, 0, -0.5f, -0.84375f, 0, -0.5f, -0.84375f, -0.25f, -0.4375f, -0.75f, -0.25f, -0.4375f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.25f, -0.4375f, 0, -0.25f)
			.setRotationPoint(-5.0625f, 3.75f, -7.75f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 88, 72, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, -0.25f, -0.75f, 0, -0.25f, -1, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, -0.25f, -1, -0.75f, -0.25f)
			.setRotationPoint(-4.25f, 4, -7.75f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 68, 72, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.25f, 0, 0, -0.25f, 0, -0.75f, 0, -1, -0.75f, 0, -1, -0.75f, -0.25f, 0, -0.75f, -0.25f)
			.setRotationPoint(-5.75f, 4, -7.75f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 30, 22, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 4, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.25f, 0, 0, -0.25f, 0, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, -0.25f, 0, -0.25f, -0.25f)
			.setRotationPoint(1.75f, 4, -7.75f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 39, 72, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.25f, 0, 0, -0.25f, -0.375f, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, -0.25f, -0.375f, -0.25f, -0.25f)
			.setRotationPoint(1.25f, 5, -7.75f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 29, 72, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.25f, 0.5f, 0, -0.25f, 0.25f, -0.75f, 0, -0.5f, -0.75f, 0, -0.5f, -0.75f, -0.25f, 0.25f, -0.75f, -0.25f)
			.setRotationPoint(1.25f, 4.25f, -7.75f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 19, 72, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.25f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.25f, 0.25f, 0, -0.25f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.25f, 0, -0.5f, -0.25f)
			.setRotationPoint(1.25f, 4.5f, -7.75f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 119, 71, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 1.25f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.25f, 1.25f, 0, -0.25f, 0.5f, -0.75f, 0, -0.5f, -0.75f, 0, -0.5f, -0.75f, -0.25f, 0.5f, -0.75f, -0.25f)
			.setRotationPoint(1.25f, 4, -7.75f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 23, 17, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.25f, 0, 0, -0.25f, 0, -0.875f, 0, -0.5f, -0.75f, 0, -0.5f, -0.75f, -0.25f, 0, -0.875f, -0.25f)
			.setRotationPoint(1.75f, 7.75f, -7.75f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 114, 71, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, -0.25f, 0, -0.375f, -0.25f, 0, -0.375f, -0.25f, -0.25f, -0.5f, -0.25f, -0.25f)
			.setRotationPoint(6.75f, 5, -7.75f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 109, 71, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, 0, 0, 0.5f, 0, 0, 0.5f, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, -0.75f, 0, 0.25f, -0.75f, 0, 0.25f, -0.75f, -0.25f, -0.5f, -0.75f, -0.25f)
			.setRotationPoint(6.75f, 4.25f, -7.75f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 14, 71, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, 0, 0, 0.25f, 0, 0, 0.25f, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.25f, -0.5f, -0.5f, -0.25f)
			.setRotationPoint(6.75f, 4.5f, -7.75f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 5, 71, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, 0, 0, 1.25f, 0, 0, 1.25f, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, -0.75f, 0, 0.5f, -0.75f, 0, 0.5f, -0.75f, -0.25f, -0.5f, -0.75f, -0.25f)
			.setRotationPoint(6.75f, 4, -7.75f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 6, 17, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, -0.75f, 0, 0, -0.875f, 0, 0, -0.875f, -0.25f, -0.5f, -0.75f, -0.25f)
			.setRotationPoint(5.25f, 7.75f, -7.75f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 30, 14, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 4, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.25f, 0, 0, -0.25f, 0, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, -0.25f, 0, -0.25f, -0.25f)
			.setRotationPoint(5.75f, 4, -7.75f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 23, 14, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, -0.25f, 0, 0, -0.25f, 0, -0.75f, 0, 0.5f, -0.75f, 0, 0.5f, -0.75f, -0.25f, 0, -0.75f, -0.25f)
			.setRotationPoint(3.25f, 7.75f, -7.75f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 7, 12, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 3, 1, 0, 0, 0, 0, 0.25f, 0, 0, 0.25f, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0.25f, 0, 0, 0.25f, 0, -0.25f, 0, 0, -0.25f)
			.setRotationPoint(3.375f, 4.75f, -7.75f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 0, 71, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.25f, -0.75f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, -0.25f, -0.25f, -0.75f, -0.25f, -0.25f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.25f, -0.25f, 0, -0.25f)
			.setRotationPoint(3.8125f, 3.75f, -7.75f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 99, 70, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.25f, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f, -0.25f, 0, -0.25f, -0.25f, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.25f, 0, 0, -0.25f)
			.setRotationPoint(4.6875f, 3.75f, -7.75f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 94, 70, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.75f, 0, -0.75f, -1, 0, -0.75f, -1, -0.25f, 0, -0.75f, -0.25f, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.25f, 0, 0, -0.25f)
			.setRotationPoint(4.9375f, 3.75f, -7.75f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 84, 70, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.25f, -1, 0, -0.5f, -0.75f, 0, -0.5f, -0.75f, -0.25f, -0.25f, -1, -0.25f, -0.25f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.25f, -0.25f, 0, -0.25f)
			.setRotationPoint(3.5625f, 3.75f, -7.75f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 79, 70, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.4375f, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, -0.25f, -0.4375f, -0.25f, -0.25f, -0.4375f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.25f, -0.4375f, 0, -0.25f)
			.setRotationPoint(3.875f, 3.75f, -7.75f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 74, 70, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.4375f, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, -0.25f, -0.4375f, -0.25f, -0.25f, -0.4375f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.25f, -0.4375f, 0, -0.25f)
			.setRotationPoint(4.1875f, 3.75f, -7.75f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 64, 70, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.4375f, -0.84375f, 0, -0.5f, -0.75f, 0, -0.5f, -0.75f, -0.25f, -0.4375f, -0.84375f, -0.25f, -0.4375f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.25f, -0.4375f, 0, -0.25f)
			.setRotationPoint(4.125f, 3.75f, -7.75f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 59, 70, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.4375f, -0.875f, 0, -0.5f, -0.84375f, 0, -0.5f, -0.84375f, -0.25f, -0.4375f, -0.875f, -0.25f, -0.4375f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.25f, -0.4375f, 0, -0.25f)
			.setRotationPoint(4.0625f, 3.75f, -7.75f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 54, 70, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.4375f, -0.84375f, 0, -0.5f, -0.875f, 0, -0.5f, -0.875f, -0.25f, -0.4375f, -0.84375f, -0.25f, -0.4375f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.25f, -0.4375f, 0, -0.25f)
			.setRotationPoint(4, 3.75f, -7.75f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 49, 70, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.4375f, -0.75f, 0, -0.5f, -0.84375f, 0, -0.5f, -0.84375f, -0.25f, -0.4375f, -0.75f, -0.25f, -0.4375f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.25f, -0.4375f, 0, -0.25f)
			.setRotationPoint(3.9375f, 3.75f, -7.75f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 44, 70, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, -0.25f, -0.75f, 0, -0.25f, -1, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, -0.25f, -1, -0.75f, -0.25f)
			.setRotationPoint(4.75f, 4, -7.75f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 25, 70, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.25f, 0, 0, -0.25f, 0, -0.75f, 0, -1, -0.75f, 0, -1, -0.75f, -0.25f, 0, -0.75f, -0.25f)
			.setRotationPoint(3.25f, 4, -7.75f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 0, 12, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 4, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.25f, 0, 0, -0.25f, 0, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, -0.25f, 0, -0.25f, -0.25f)
			.setRotationPoint(10.75f, 4, -7.75f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 104, 69, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.25f, 0, 0, -0.25f, -0.375f, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, -0.25f, -0.375f, -0.25f, -0.25f)
			.setRotationPoint(10.25f, 5, -7.75f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 89, 69, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.25f, 0.5f, 0, -0.25f, 0.25f, -0.75f, 0, -0.5f, -0.75f, 0, -0.5f, -0.75f, -0.25f, 0.25f, -0.75f, -0.25f)
			.setRotationPoint(10.25f, 4.25f, -7.75f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 69, 69, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.25f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.25f, 0.25f, 0, -0.25f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.25f, 0, -0.5f, -0.25f)
			.setRotationPoint(10.25f, 4.5f, -7.75f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 39, 69, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 1.25f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.25f, 1.25f, 0, -0.25f, 0.5f, -0.75f, 0, -0.5f, -0.75f, 0, -0.5f, -0.75f, -0.25f, 0.5f, -0.75f, -0.25f)
			.setRotationPoint(10.25f, 4, -7.75f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 88, 11, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.25f, 0, 0, -0.25f, 0, -0.875f, 0, -0.5f, -0.75f, 0, -0.5f, -0.75f, -0.25f, 0, -0.875f, -0.25f)
			.setRotationPoint(10.75f, 7.75f, -7.75f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 34, 69, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, -0.25f, 0, -0.375f, -0.25f, 0, -0.375f, -0.25f, -0.25f, -0.5f, -0.25f, -0.25f)
			.setRotationPoint(15.75f, 5, -7.75f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 20, 69, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, 0, 0, 0.5f, 0, 0, 0.5f, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, -0.75f, 0, 0.25f, -0.75f, 0, 0.25f, -0.75f, -0.25f, -0.5f, -0.75f, -0.25f)
			.setRotationPoint(15.75f, 4.25f, -7.75f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 10, 69, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, 0, 0, 0.25f, 0, 0, 0.25f, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.25f, -0.5f, -0.5f, -0.25f)
			.setRotationPoint(15.75f, 4.5f, -7.75f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 116, 68, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, 0, 0, 1.25f, 0, 0, 1.25f, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, -0.75f, 0, 0.5f, -0.75f, 0, 0.5f, -0.75f, -0.25f, -0.5f, -0.75f, -0.25f)
			.setRotationPoint(15.75f, 4, -7.75f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 67, 6, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, -0.75f, 0, 0, -0.875f, 0, 0, -0.875f, -0.25f, -0.5f, -0.75f, -0.25f)
			.setRotationPoint(14.25f, 7.75f, -7.75f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 95, 6, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 4, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.25f, 0, 0, -0.25f, 0, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, -0.25f, 0, -0.25f, -0.25f)
			.setRotationPoint(14.75f, 4, -7.75f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 6, 6, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, -0.25f, 0, 0, -0.25f, 0, -0.75f, 0, 0.5f, -0.75f, 0, 0.5f, -0.75f, -0.25f, 0, -0.75f, -0.25f)
			.setRotationPoint(12.25f, 7.75f, -7.75f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 88, 6, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 3, 1, 0, 0, 0, 0, 0.25f, 0, 0, 0.25f, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0.25f, 0, 0, 0.25f, 0, -0.25f, 0, 0, -0.25f)
			.setRotationPoint(12.375f, 4.75f, -7.75f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 111, 68, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.25f, -0.75f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, -0.25f, -0.25f, -0.75f, -0.25f, -0.25f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.25f, -0.25f, 0, -0.25f)
			.setRotationPoint(12.8125f, 3.75f, -7.75f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 29, 68, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.25f, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f, -0.25f, 0, -0.25f, -0.25f, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.25f, 0, 0, -0.25f)
			.setRotationPoint(13.6875f, 3.75f, -7.75f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 0, 68, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.75f, 0, -0.75f, -1, 0, -0.75f, -1, -0.25f, 0, -0.75f, -0.25f, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.25f, 0, 0, -0.25f)
			.setRotationPoint(13.9375f, 3.75f, -7.75f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 100, 67, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.25f, -1, 0, -0.5f, -0.75f, 0, -0.5f, -0.75f, -0.25f, -0.25f, -1, -0.25f, -0.25f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.25f, -0.25f, 0, -0.25f)
			.setRotationPoint(12.5625f, 3.75f, -7.75f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 95, 67, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.4375f, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, -0.25f, -0.4375f, -0.25f, -0.25f, -0.4375f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.25f, -0.4375f, 0, -0.25f)
			.setRotationPoint(12.875f, 3.75f, -7.75f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 85, 67, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.4375f, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, -0.25f, -0.4375f, -0.25f, -0.25f, -0.4375f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.25f, -0.4375f, 0, -0.25f)
			.setRotationPoint(13.1875f, 3.75f, -7.75f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 75, 67, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.4375f, -0.84375f, 0, -0.5f, -0.75f, 0, -0.5f, -0.75f, -0.25f, -0.4375f, -0.84375f, -0.25f, -0.4375f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.25f, -0.4375f, 0, -0.25f)
			.setRotationPoint(13.125f, 3.75f, -7.75f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 65, 67, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.4375f, -0.875f, 0, -0.5f, -0.84375f, 0, -0.5f, -0.84375f, -0.25f, -0.4375f, -0.875f, -0.25f, -0.4375f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.25f, -0.4375f, 0, -0.25f)
			.setRotationPoint(13.0625f, 3.75f, -7.75f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 60, 67, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.4375f, -0.84375f, 0, -0.5f, -0.875f, 0, -0.5f, -0.875f, -0.25f, -0.4375f, -0.84375f, -0.25f, -0.4375f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.25f, -0.4375f, 0, -0.25f)
			.setRotationPoint(13, 3.75f, -7.75f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 55, 67, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.4375f, -0.75f, 0, -0.5f, -0.84375f, 0, -0.5f, -0.84375f, -0.25f, -0.4375f, -0.75f, -0.25f, -0.4375f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.25f, -0.4375f, 0, -0.25f)
			.setRotationPoint(12.9375f, 3.75f, -7.75f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 50, 67, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, -0.25f, -0.75f, 0, -0.25f, -1, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, -0.25f, -1, -0.75f, -0.25f)
			.setRotationPoint(13.75f, 4, -7.75f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 45, 67, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.25f, 0, 0, -0.25f, 0, -0.75f, 0, -1, -0.75f, 0, -1, -0.75f, -0.25f, 0, -0.75f, -0.25f)
			.setRotationPoint(12.25f, 4, -7.75f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 122, 66, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, -0.375f, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0.125f, -0.375f, -0.375f, 0.125f, -0.375f, -0.375f, 0.125f, -0.375f, -0.375f, 0.125f, -0.375f)
			.setRotationPoint(-17.75f, 4.125f, -7.5f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 34, 66, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.375f, 0, 0, -0.375f, 0, 0, -0.375f, 0, 0, -0.375f, 0, -0.75f, -0.375f, 0, -0.75f, -0.375f, 0, -0.75f, -0.375f, 0, -0.75f, -0.375f)
			.setRotationPoint(-17.25f, 7.125f, -7.75f).setRotationAngle(0.125f, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 15, 66, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, -0.375f, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0.125f, -0.375f, -0.375f, 0.125f, -0.375f, -0.375f, 0.125f, -0.375f, -0.375f, 0.125f, -0.375f)
			.setRotationPoint(-10.25f, 4.125f, -7.5f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 10, 66, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.375f, 0, 0, -0.375f, 0, 0, -0.375f, 0, 0, -0.375f, 0, -0.75f, -0.375f, 0, -0.75f, -0.375f, 0, -0.75f, -0.375f, 0, -0.75f, -0.375f)
			.setRotationPoint(-10.75f, 7.125f, -7.75f).setRotationAngle(0.125f, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 5, 66, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, -0.375f, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0.125f, -0.375f, -0.375f, 0.125f, -0.375f, -0.375f, 0.125f, -0.375f, -0.375f, 0.125f, -0.375f)
			.setRotationPoint(-8.75f, 4.125f, -7.5f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 112, 65, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.375f, 0, 0, -0.375f, 0, 0, -0.375f, 0, 0, -0.375f, 0, -0.75f, -0.375f, 0, -0.75f, -0.375f, 0, -0.75f, -0.375f, 0, -0.75f, -0.375f)
			.setRotationPoint(-8.25f, 7.125f, -7.75f).setRotationAngle(0.125f, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 80, 65, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, -0.375f, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0.125f, -0.375f, -0.375f, 0.125f, -0.375f, -0.375f, 0.125f, -0.375f, -0.375f, 0.125f, -0.375f)
			.setRotationPoint(-1.25f, 4.125f, -7.5f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 29, 65, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.375f, 0, 0, -0.375f, 0, 0, -0.375f, 0, 0, -0.375f, 0, -0.75f, -0.375f, 0, -0.75f, -0.375f, 0, -0.75f, -0.375f, 0, -0.75f, -0.375f)
			.setRotationPoint(-1.75f, 7.125f, -7.75f).setRotationAngle(0.125f, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 24, 65, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, -0.375f, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0.125f, -0.375f, -0.375f, 0.125f, -0.375f, -0.375f, 0.125f, -0.375f, -0.375f, 0.125f, -0.375f)
			.setRotationPoint(0.25f, 4.125f, -7.5f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 0, 65, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.375f, 0, 0, -0.375f, 0, 0, -0.375f, 0, 0, -0.375f, 0, -0.75f, -0.375f, 0, -0.75f, -0.375f, 0, -0.75f, -0.375f, 0, -0.75f, -0.375f)
			.setRotationPoint(0.75f, 7.125f, -7.75f).setRotationAngle(0.125f, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 107, 64, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, -0.375f, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0.125f, -0.375f, -0.375f, 0.125f, -0.375f, -0.375f, 0.125f, -0.375f, -0.375f, 0.125f, -0.375f)
			.setRotationPoint(7.75f, 4.125f, -7.5f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 95, 64, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.375f, 0, 0, -0.375f, 0, 0, -0.375f, 0, 0, -0.375f, 0, -0.75f, -0.375f, 0, -0.75f, -0.375f, 0, -0.75f, -0.375f, 0, -0.75f, -0.375f)
			.setRotationPoint(7.25f, 7.125f, -7.75f).setRotationAngle(0.125f, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 90, 64, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, -0.375f, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0.125f, -0.375f, -0.375f, 0.125f, -0.375f, -0.375f, 0.125f, -0.375f, -0.375f, 0.125f, -0.375f)
			.setRotationPoint(9.25f, 4.125f, -7.5f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 75, 64, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.375f, 0, 0, -0.375f, 0, 0, -0.375f, 0, 0, -0.375f, 0, -0.75f, -0.375f, 0, -0.75f, -0.375f, 0, -0.75f, -0.375f, 0, -0.75f, -0.375f)
			.setRotationPoint(9.75f, 7.125f, -7.75f).setRotationAngle(0.125f, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 70, 64, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, -0.375f, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0.125f, -0.375f, -0.375f, 0.125f, -0.375f, -0.375f, 0.125f, -0.375f, -0.375f, 0.125f, -0.375f)
			.setRotationPoint(16.75f, 4.125f, -7.5f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 65, 64, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.375f, 0, 0, -0.375f, 0, 0, -0.375f, 0, 0, -0.375f, 0, -0.75f, -0.375f, 0, -0.75f, -0.375f, 0, -0.75f, -0.375f, 0, -0.75f, -0.375f)
			.setRotationPoint(16.25f, 7.125f, -7.75f).setRotationAngle(0.125f, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 60, 64, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, -0.40625f, -0.25f, -0.375f, -0.625f, -0.25f, -0.375f, -0.625f, -0.375f, -0.5f, -0.40625f, -0.375f, -0.5f, 0.34375f, -0.25f, -0.375f, 0.125f, -0.25f, -0.375f, 0.125f, -0.375f, -0.5f, 0.34375f, -0.375f)
			.setRotationPoint(16.625f, 5.5f, -7.4375f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 55, 64, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, -0.546875f, -0.25f, -0.375f, -0.625f, -0.25f, -0.375f, -0.625f, -0.375f, -0.5f, -0.546875f, -0.375f, -0.5625f, -0.125f, -0.25f, -0.375f, -0.125f, -0.25f, -0.375f, -0.125f, -0.375f, -0.5625f, -0.125f, -0.375f)
			.setRotationPoint(16.5f, 5.28125f, -7.4375f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 50, 64, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5625f, -0.125f, -0.25f, -0.375f, -0.125f, -0.25f, -0.375f, -0.125f, -0.375f, -0.5625f, -0.125f, -0.375f, -0.5f, -0.546875f, -0.25f, -0.375f, -0.625f, -0.25f, -0.375f, -0.625f, -0.375f, -0.5f, -0.546875f, -0.375f)
			.setRotationPoint(16.5f, 6.46875f, -7.4375f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 45, 64, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5625f, 0, -0.25f, -0.375f, 0, -0.25f, -0.375f, 0, -0.375f, -0.5625f, 0, -0.375f, -0.5625f, -0.5625f, -0.25f, -0.375f, -0.5625f, -0.25f, -0.375f, -0.5625f, -0.375f, -0.5625f, -0.5625f, -0.375f)
			.setRotationPoint(16.5f, 6.15625f, -7.4375f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 88, 0, textureX, textureY).addCylinder(0, 0, 0, 2, 1, 8, 1, 1, 4, new Vec3f(0.0, -0.75, 0.0))
			.setRotationPoint(0, 1.75f, 0).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 40, 64, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, -0.375f, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0.125f, -0.375f, -0.375f, 0.125f, -0.375f, -0.375f, 0.125f, -0.375f, -0.375f, 0.125f, -0.375f)
			.setRotationPoint(-17.75f, 4.125f, 6.5f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 122, 63, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.375f, 0, 0, -0.375f, 0, 0, -0.375f, 0, 0, -0.375f, 0, -0.75f, -0.375f, 0, -0.75f, -0.375f, 0, -0.75f, -0.375f, 0, -0.75f, -0.375f)
			.setRotationPoint(-17.25f, 7.125f, 6.75f).setRotationAngle(0.125f, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 117, 63, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, -0.375f, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0.125f, -0.375f, -0.375f, 0.125f, -0.375f, -0.375f, 0.125f, -0.375f, -0.375f, 0.125f, -0.375f)
			.setRotationPoint(-10.25f, 4.125f, 6.5f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 112, 62, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.375f, 0, 0, -0.375f, 0, 0, -0.375f, 0, 0, -0.375f, 0, -0.75f, -0.375f, 0, -0.75f, -0.375f, 0, -0.75f, -0.375f, 0, -0.75f, -0.375f)
			.setRotationPoint(-10.75f, 7.125f, 6.75f).setRotationAngle(0.125f, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 102, 63, textureX, textureY).newCylinderBuilder()
			.setPosition(0, 0, 0).setRadius(1, 0).setLength(1).setSegments(8, 2).setScale(0.125f, 0.125f).setDirection(0)
			.setTopOffset(new Vec3f(0.0, 0.0, -0.25)).setTopRotation(new Vec3f(0.0, 0.0, 0.0)).build()
			.setRotationPoint(10.75f, 7.75f, 7).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 85, 63, textureX, textureY).newCylinderBuilder()
			.setPosition(0, 0, 0).setRadius(1, 0).setLength(1).setSegments(8, 2).setScale(0.125f, 0.125f).setDirection(0)
			.setTopOffset(new Vec3f(0.0, 0.0, -0.25)).setTopRotation(new Vec3f(0.0, 0.0, 0.0)).build()
			.setRotationPoint(16.25f, 7.75f, 7).setRotationAngle(0, 0, -90)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 35, 62, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 0.09375f, 0.09375f, 0, new Vec3f(0.0, 0.0, -0.4375))
			.setRotationPoint(17.25f, 7.25f, 6.84375f).setRotationAngle(0, 0, -90)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 13, 82, textureX, textureY).addCylinder(0, 0, 0, 0.09375f, 0.40625f, 8, 1, 1, 0, null)
			.setRotationPoint(17.25f, 6.375f, 6.796875f).setRotationAngle(0, 0, -90)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 75, 42, textureX, textureY).newCylinderBuilder()
			.setPosition(0, 0, 0).setRadius(0.5f, 1.0E-15f).setLength(1).setSegments(8, 4).setScale(0.25f, 0.25f).setDirection(0)
			.setTopOffset(new Vec3f(0.0, 0.0, -0.6875)).setTopRotation(new Vec3f(0.0, 0.0, 0.0)).build()
			.setRotationPoint(17.25f, 6.375f, 6.84375f).setRotationAngle(0, 0, 180)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 20, 62, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 0.984375f, 1.109375f, 1, new Vec3f(0.0, 0.0, 0.875))
			.setRotationPoint(-13.5f, 6.5f, 6.875f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 15, 62, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 0.796875f, 0.984375f, 1, new Vec3f(0.0, 0.0, 0.9375))
			.setRotationPoint(-13.5f, 6.5f, 6.9375f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 10, 62, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 0.984375f, 1.109375f, 1, new Vec3f(0.0, 0.0, 0.875))
			.setRotationPoint(-4.5f, 6.5f, 6.875f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 5, 62, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 0.796875f, 0.984375f, 1, new Vec3f(0.0, 0.0, 0.9375))
			.setRotationPoint(-4.5f, 6.5f, 6.9375f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 80, 61, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 0.984375f, 1.109375f, 1, new Vec3f(0.0, 0.0, 0.875))
			.setRotationPoint(4.5f, 6.5f, 6.875f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 30, 61, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 0.796875f, 0.984375f, 1, new Vec3f(0.0, 0.0, 0.9375))
			.setRotationPoint(4.5f, 6.5f, 6.9375f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 25, 61, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 0.09375f, 0.0625f, 0, new Vec3f(0.0, 0.0, -0.9375))
			.setRotationPoint(13.5f, 7.125f, 7.9375f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 0, 61, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 0.984375f, 1.109375f, 1, new Vec3f(0.0, 0.0, 0.875))
			.setRotationPoint(13.5f, 6.5f, 6.875f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 107, 60, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 0.796875f, 0.984375f, 1, new Vec3f(0.0, 0.0, 0.9375))
			.setRotationPoint(13.5f, 6.5f, 6.9375f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 97, 60, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 0.09375f, 0.0625f, 0, new Vec3f(0.0, 0.0, -0.9375))
			.setRotationPoint(4.5f, 7.125f, 7.9375f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 92, 60, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 0.09375f, 0.0625f, 0, new Vec3f(0.0, 0.0, -0.9375))
			.setRotationPoint(-4.5f, 7.125f, 7.9375f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 75, 60, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 0.09375f, 0.0625f, 0, new Vec3f(0.0, 0.0, -0.9375))
			.setRotationPoint(-13.5f, 7.125f, 7.9375f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 70, 60, textureX, textureY).newCylinderBuilder()
			.setPosition(0, 0, 0).setRadius(1, 0).setLength(1).setSegments(8, 4).setScale(0.125f, 0.125f).setDirection(0)
			.setTopOffset(new Vec3f(0.0, 0.0, -0.75)).setTopRotation(new Vec3f(0.0, 0.0, 0.0)).build()
			.setRotationPoint(17.25f, 7.25f, 6.875f).setRotationAngle(0, 0, -90)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 31, 42, textureX, textureY).newCylinderBuilder()
			.setPosition(0, 0, 0).setRadius(1, 1.0E-15f).setLength(1).setSegments(8, 4).setScale(0.125f, 0.125f).setDirection(0)
			.setTopOffset(new Vec3f(0.0, 0.0, -0.75)).setTopRotation(new Vec3f(0.0, 0.0, 0.0)).build()
			.setRotationPoint(17.25f, 7.25f, 7.125f).setRotationAngle(0, 0, -180)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 65, 60, textureX, textureY).newCylinderBuilder()
			.setPosition(0, 0, 0).setRadius(1, 0).setLength(1).setSegments(8, 2).setScale(0.125f, 0.125f).setDirection(0)
			.setTopOffset(new Vec3f(0.0, 0.0, -0.25)).setTopRotation(new Vec3f(0.0, 0.0, 0.0)).build()
			.setRotationPoint(1.75f, 7.75f, 7).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 60, 60, textureX, textureY).newCylinderBuilder()
			.setPosition(0, 0, 0).setRadius(1, 0).setLength(1).setSegments(8, 2).setScale(0.125f, 0.125f).setDirection(0)
			.setTopOffset(new Vec3f(0.0, 0.0, -0.25)).setTopRotation(new Vec3f(0.0, 0.0, 0.0)).build()
			.setRotationPoint(7.25f, 7.75f, 7).setRotationAngle(0, 0, -90)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 55, 60, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 0.09375f, 0.09375f, 0, new Vec3f(0.0, 0.0, -0.4375))
			.setRotationPoint(8.25f, 7.25f, 6.84375f).setRotationAngle(0, 0, -90)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 5, 82, textureX, textureY).addCylinder(0, 0, 0, 0.09375f, 0.40625f, 8, 1, 1, 0, null)
			.setRotationPoint(8.25f, 6.375f, 6.796875f).setRotationAngle(0, 0, -90)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 109, 41, textureX, textureY).newCylinderBuilder()
			.setPosition(0, 0, 0).setRadius(0.5f, 1.0E-15f).setLength(1).setSegments(8, 4).setScale(0.25f, 0.25f).setDirection(0)
			.setTopOffset(new Vec3f(0.0, 0.0, -0.6875)).setTopRotation(new Vec3f(0.0, 0.0, 0.0)).build()
			.setRotationPoint(8.25f, 6.375f, 6.84375f).setRotationAngle(0, 0, 180)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 50, 60, textureX, textureY).newCylinderBuilder()
			.setPosition(0, 0, 0).setRadius(1, 0).setLength(1).setSegments(8, 4).setScale(0.125f, 0.125f).setDirection(0)
			.setTopOffset(new Vec3f(0.0, 0.0, -0.75)).setTopRotation(new Vec3f(0.0, 0.0, 0.0)).build()
			.setRotationPoint(8.25f, 7.25f, 6.875f).setRotationAngle(0, 0, -90)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 69, 41, textureX, textureY).newCylinderBuilder()
			.setPosition(0, 0, 0).setRadius(1, 1.0E-15f).setLength(1).setSegments(8, 4).setScale(0.125f, 0.125f).setDirection(0)
			.setTopOffset(new Vec3f(0.0, 0.0, -0.75)).setTopRotation(new Vec3f(0.0, 0.0, 0.0)).build()
			.setRotationPoint(8.25f, 7.25f, 7.125f).setRotationAngle(0, 0, -180)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 45, 60, textureX, textureY).newCylinderBuilder()
			.setPosition(0, 0, 0).setRadius(1, 0).setLength(1).setSegments(8, 2).setScale(0.125f, 0.125f).setDirection(0)
			.setTopOffset(new Vec3f(0.0, 0.0, -0.25)).setTopRotation(new Vec3f(0.0, 0.0, 0.0)).build()
			.setRotationPoint(-7.25f, 7.75f, 7).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 40, 60, textureX, textureY).newCylinderBuilder()
			.setPosition(0, 0, 0).setRadius(1, 0).setLength(1).setSegments(8, 2).setScale(0.125f, 0.125f).setDirection(0)
			.setTopOffset(new Vec3f(0.0, 0.0, -0.25)).setTopRotation(new Vec3f(0.0, 0.0, 0.0)).build()
			.setRotationPoint(-1.75f, 7.75f, 7).setRotationAngle(0, 0, -90)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 121, 59, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 0.09375f, 0.09375f, 0, new Vec3f(0.0, 0.0, -0.4375))
			.setRotationPoint(-0.75f, 7.25f, 6.84375f).setRotationAngle(0, 0, -90)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 125, 81, textureX, textureY).addCylinder(0, 0, 0, 0.09375f, 0.40625f, 8, 1, 1, 0, null)
			.setRotationPoint(-0.75f, 6.375f, 6.796875f).setRotationAngle(0, 0, -90)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 63, 41, textureX, textureY).newCylinderBuilder()
			.setPosition(0, 0, 0).setRadius(0.5f, 1.0E-15f).setLength(1).setSegments(8, 4).setScale(0.25f, 0.25f).setDirection(0)
			.setTopOffset(new Vec3f(0.0, 0.0, -0.6875)).setTopRotation(new Vec3f(0.0, 0.0, 0.0)).build()
			.setRotationPoint(-0.75f, 6.375f, 6.84375f).setRotationAngle(0, 0, 180)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 116, 59, textureX, textureY).newCylinderBuilder()
			.setPosition(0, 0, 0).setRadius(1, 0).setLength(1).setSegments(8, 4).setScale(0.125f, 0.125f).setDirection(0)
			.setTopOffset(new Vec3f(0.0, 0.0, -0.75)).setTopRotation(new Vec3f(0.0, 0.0, 0.0)).build()
			.setRotationPoint(-0.75f, 7.25f, 6.875f).setRotationAngle(0, 0, -90)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 57, 41, textureX, textureY).newCylinderBuilder()
			.setPosition(0, 0, 0).setRadius(1, 1.0E-15f).setLength(1).setSegments(8, 4).setScale(0.125f, 0.125f).setDirection(0)
			.setTopOffset(new Vec3f(0.0, 0.0, -0.75)).setTopRotation(new Vec3f(0.0, 0.0, 0.0)).build()
			.setRotationPoint(-0.75f, 7.25f, 7.125f).setRotationAngle(0, 0, -180)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 102, 59, textureX, textureY).newCylinderBuilder()
			.setPosition(0, 0, 0).setRadius(1, 0).setLength(1).setSegments(8, 2).setScale(0.125f, 0.125f).setDirection(0)
			.setTopOffset(new Vec3f(0.0, 0.0, -0.25)).setTopRotation(new Vec3f(0.0, 0.0, 0.0)).build()
			.setRotationPoint(-16.25f, 7.75f, 7).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 87, 59, textureX, textureY).newCylinderBuilder()
			.setPosition(0, 0, 0).setRadius(1, 0).setLength(1).setSegments(8, 2).setScale(0.125f, 0.125f).setDirection(0)
			.setTopOffset(new Vec3f(0.0, 0.0, -0.25)).setTopRotation(new Vec3f(0.0, 0.0, 0.0)).build()
			.setRotationPoint(-10.75f, 7.75f, 7).setRotationAngle(0, 0, -90)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 35, 58, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 0.09375f, 0.09375f, 0, new Vec3f(0.0, 0.0, -0.4375))
			.setRotationPoint(-9.75f, 7.25f, 6.84375f).setRotationAngle(0, 0, -90)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 20, 66, textureX, textureY).addCylinder(0, 0, 0, 0.09375f, 0.40625f, 8, 1, 1, 0, null)
			.setRotationPoint(-9.75f, 6.375f, 6.796875f).setRotationAngle(0, 0, -90)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 51, 41, textureX, textureY).newCylinderBuilder()
			.setPosition(0, 0, 0).setRadius(0.5f, 1.0E-15f).setLength(1).setSegments(8, 4).setScale(0.25f, 0.25f).setDirection(0)
			.setTopOffset(new Vec3f(0.0, 0.0, -0.6875)).setTopRotation(new Vec3f(0.0, 0.0, 0.0)).build()
			.setRotationPoint(-9.75f, 6.375f, 6.84375f).setRotationAngle(0, 0, 180)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 20, 58, textureX, textureY).newCylinderBuilder()
			.setPosition(0, 0, 0).setRadius(1, 0).setLength(1).setSegments(8, 4).setScale(0.125f, 0.125f).setDirection(0)
			.setTopOffset(new Vec3f(0.0, 0.0, -0.75)).setTopRotation(new Vec3f(0.0, 0.0, 0.0)).build()
			.setRotationPoint(-9.75f, 7.25f, 6.875f).setRotationAngle(0, 0, -90)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 45, 41, textureX, textureY).newCylinderBuilder()
			.setPosition(0, 0, 0).setRadius(1, 1.0E-15f).setLength(1).setSegments(8, 4).setScale(0.125f, 0.125f).setDirection(0)
			.setTopOffset(new Vec3f(0.0, 0.0, -0.75)).setTopRotation(new Vec3f(0.0, 0.0, 0.0)).build()
			.setRotationPoint(-9.75f, 7.25f, 7.125f).setRotationAngle(0, 0, -180)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 15, 58, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 0.09375f, 0.09375f, 0, new Vec3f(0.0, 0.0, -0.4375))
			.setRotationPoint(9.75f, 7.25f, 6.84375f).setRotationAngle(0, 0, -90)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 116, 56, textureX, textureY).addCylinder(0, 0, 0, 0.09375f, 0.40625f, 8, 1, 1, 0, null)
			.setRotationPoint(9.75f, 6.375f, 6.796875f).setRotationAngle(0, 0, -90)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 19, 41, textureX, textureY).newCylinderBuilder()
			.setPosition(0, 0, 0).setRadius(0.5f, 1.0E-15f).setLength(1).setSegments(8, 4).setScale(0.25f, 0.25f).setDirection(0)
			.setTopOffset(new Vec3f(0.0, 0.0, -0.6875)).setTopRotation(new Vec3f(0.0, 0.0, 0.0)).build()
			.setRotationPoint(9.75f, 6.375f, 6.84375f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 10, 58, textureX, textureY).newCylinderBuilder()
			.setPosition(0, 0, 0).setRadius(1, 0).setLength(1).setSegments(8, 4).setScale(0.125f, 0.125f).setDirection(0)
			.setTopOffset(new Vec3f(0.0, 0.0, -0.75)).setTopRotation(new Vec3f(0.0, 0.0, 0.0)).build()
			.setRotationPoint(9.75f, 7.25f, 6.875f).setRotationAngle(0, 0, -90)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 118, 40, textureX, textureY).newCylinderBuilder()
			.setPosition(0, 0, 0).setRadius(1, 1.0E-15f).setLength(1).setSegments(8, 4).setScale(0.125f, 0.125f).setDirection(0)
			.setTopOffset(new Vec3f(0.0, 0.0, -0.75)).setTopRotation(new Vec3f(0.0, 0.0, 0.0)).build()
			.setRotationPoint(9.75f, 7.25f, 7.125f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 5, 58, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 0.09375f, 0.09375f, 0, new Vec3f(0.0, 0.0, -0.4375))
			.setRotationPoint(0.75f, 7.25f, 6.84375f).setRotationAngle(0, 0, -90)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 102, 56, textureX, textureY).addCylinder(0, 0, 0, 0.09375f, 0.40625f, 8, 1, 1, 0, null)
			.setRotationPoint(0.75f, 6.375f, 6.796875f).setRotationAngle(0, 0, -90)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 96, 40, textureX, textureY).newCylinderBuilder()
			.setPosition(0, 0, 0).setRadius(0.5f, 1.0E-15f).setLength(1).setSegments(8, 4).setScale(0.25f, 0.25f).setDirection(0)
			.setTopOffset(new Vec3f(0.0, 0.0, -0.6875)).setTopRotation(new Vec3f(0.0, 0.0, 0.0)).build()
			.setRotationPoint(0.75f, 6.375f, 6.84375f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 82, 57, textureX, textureY).newCylinderBuilder()
			.setPosition(0, 0, 0).setRadius(1, 0).setLength(1).setSegments(8, 4).setScale(0.125f, 0.125f).setDirection(0)
			.setTopOffset(new Vec3f(0.0, 0.0, -0.75)).setTopRotation(new Vec3f(0.0, 0.0, 0.0)).build()
			.setRotationPoint(0.75f, 7.25f, 6.875f).setRotationAngle(0, 0, -90)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 90, 40, textureX, textureY).newCylinderBuilder()
			.setPosition(0, 0, 0).setRadius(1, 1.0E-15f).setLength(1).setSegments(8, 4).setScale(0.125f, 0.125f).setDirection(0)
			.setTopOffset(new Vec3f(0.0, 0.0, -0.75)).setTopRotation(new Vec3f(0.0, 0.0, 0.0)).build()
			.setRotationPoint(0.75f, 7.25f, 7.125f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 30, 57, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 0.09375f, 0.09375f, 0, new Vec3f(0.0, 0.0, -0.4375))
			.setRotationPoint(-8.25f, 7.25f, 6.84375f).setRotationAngle(0, 0, -90)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 125, 55, textureX, textureY).addCylinder(0, 0, 0, 0.09375f, 0.40625f, 8, 1, 1, 0, null)
			.setRotationPoint(-8.25f, 6.375f, 6.796875f).setRotationAngle(0, 0, -90)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 39, 40, textureX, textureY).newCylinderBuilder()
			.setPosition(0, 0, 0).setRadius(0.5f, 1.0E-15f).setLength(1).setSegments(8, 4).setScale(0.25f, 0.25f).setDirection(0)
			.setTopOffset(new Vec3f(0.0, 0.0, -0.6875)).setTopRotation(new Vec3f(0.0, 0.0, 0.0)).build()
			.setRotationPoint(-8.25f, 6.375f, 6.84375f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 25, 57, textureX, textureY).newCylinderBuilder()
			.setPosition(0, 0, 0).setRadius(1, 0).setLength(1).setSegments(8, 4).setScale(0.125f, 0.125f).setDirection(0)
			.setTopOffset(new Vec3f(0.0, 0.0, -0.75)).setTopRotation(new Vec3f(0.0, 0.0, 0.0)).build()
			.setRotationPoint(-8.25f, 7.25f, 6.875f).setRotationAngle(0, 0, -90)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 25, 40, textureX, textureY).newCylinderBuilder()
			.setPosition(0, 0, 0).setRadius(1, 1.0E-15f).setLength(1).setSegments(8, 4).setScale(0.125f, 0.125f).setDirection(0)
			.setTopOffset(new Vec3f(0.0, 0.0, -0.75)).setTopRotation(new Vec3f(0.0, 0.0, 0.0)).build()
			.setRotationPoint(-8.25f, 7.25f, 7.125f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 0, 57, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 0.09375f, 0.09375f, 0, new Vec3f(0.0, 0.0, -0.4375))
			.setRotationPoint(-17.25f, 7.25f, 6.84375f).setRotationAngle(0, 0, -90)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 106, 52, textureX, textureY).addCylinder(0, 0, 0, 0.09375f, 0.40625f, 8, 1, 1, 0, null)
			.setRotationPoint(-17.25f, 6.375f, 6.796875f).setRotationAngle(0, 0, -90)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 13, 40, textureX, textureY).newCylinderBuilder()
			.setPosition(0, 0, 0).setRadius(0.5f, 1.0E-15f).setLength(1).setSegments(8, 4).setScale(0.25f, 0.25f).setDirection(0)
			.setTopOffset(new Vec3f(0.0, 0.0, -0.6875)).setTopRotation(new Vec3f(0.0, 0.0, 0.0)).build()
			.setRotationPoint(-17.25f, 6.375f, 6.84375f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 111, 56, textureX, textureY).newCylinderBuilder()
			.setPosition(0, 0, 0).setRadius(1, 0).setLength(1).setSegments(8, 4).setScale(0.125f, 0.125f).setDirection(0)
			.setTopOffset(new Vec3f(0.0, 0.0, -0.75)).setTopRotation(new Vec3f(0.0, 0.0, 0.0)).build()
			.setRotationPoint(-17.25f, 7.25f, 6.875f).setRotationAngle(0, 0, -90)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 0, 39, textureX, textureY).newCylinderBuilder()
			.setPosition(0, 0, 0).setRadius(1, 1.0E-15f).setLength(1).setSegments(8, 4).setScale(0.125f, 0.125f).setDirection(0)
			.setTopOffset(new Vec3f(0.0, 0.0, -0.75)).setTopRotation(new Vec3f(0.0, 0.0, 0.0)).build()
			.setRotationPoint(-17.25f, 7.25f, 7.125f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 124, 41, textureX, textureY).addCylinder(0, 0, 0, 0.09375f, 0.40625f, 8, 1, 1, 0, null)
			.setRotationPoint(17.25f, 6.375f, -7.203125f).setRotationAngle(0, 0, -90)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 84, 38, textureX, textureY).newCylinderBuilder()
			.setPosition(0, 0, 0).setRadius(0.5f, 1.0E-15f).setLength(1).setSegments(8, 4).setScale(0.25f, 0.25f).setDirection(0)
			.setTopOffset(new Vec3f(0.0, 0.0, -0.6875)).setTopRotation(new Vec3f(0.0, 0.0, 0.0)).build()
			.setRotationPoint(17.25f, 6.375f, -7.15625f).setRotationAngle(0, 0, 180)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 97, 56, textureX, textureY).newCylinderBuilder()
			.setPosition(0, 0, 0).setRadius(1, 0).setLength(1).setSegments(8, 2).setScale(0.125f, 0.125f).setDirection(0)
			.setTopOffset(new Vec3f(0.0, 0.0, -0.25)).setTopRotation(new Vec3f(0.0, 0.0, 0.0)).build()
			.setRotationPoint(1.75f, 7.75f, -7.75f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 92, 56, textureX, textureY).newCylinderBuilder()
			.setPosition(0, 0, 0).setRadius(1, 0).setLength(1).setSegments(8, 2).setScale(0.125f, 0.125f).setDirection(0)
			.setTopOffset(new Vec3f(0.0, 0.0, -0.25)).setTopRotation(new Vec3f(0.0, 0.0, 0.0)).build()
			.setRotationPoint(7.25f, 7.75f, -7.75f).setRotationAngle(0, 0, -90)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 77, 56, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 0.09375f, 0.09375f, 0, new Vec3f(0.0, 0.0, -0.4375))
			.setRotationPoint(8.25f, 7.25f, -7.40625f).setRotationAngle(0, 0, -90)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 115, 41, textureX, textureY).addCylinder(0, 0, 0, 0.09375f, 0.40625f, 8, 1, 1, 0, null)
			.setRotationPoint(8.25f, 6.375f, -7.203125f).setRotationAngle(0, 0, -90)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 7, 38, textureX, textureY).newCylinderBuilder()
			.setPosition(0, 0, 0).setRadius(0.5f, 1.0E-15f).setLength(1).setSegments(8, 4).setScale(0.25f, 0.25f).setDirection(0)
			.setTopOffset(new Vec3f(0.0, 0.0, -0.6875)).setTopRotation(new Vec3f(0.0, 0.0, 0.0)).build()
			.setRotationPoint(8.25f, 6.375f, -7.15625f).setRotationAngle(0, 0, 180)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 72, 56, textureX, textureY).newCylinderBuilder()
			.setPosition(0, 0, 0).setRadius(1, 0).setLength(1).setSegments(8, 4).setScale(0.125f, 0.125f).setDirection(0)
			.setTopOffset(new Vec3f(0.0, 0.0, -0.75)).setTopRotation(new Vec3f(0.0, 0.0, 0.0)).build()
			.setRotationPoint(8.25f, 7.25f, -7.125f).setRotationAngle(0, 0, -90)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 103, 37, textureX, textureY).newCylinderBuilder()
			.setPosition(0, 0, 0).setRadius(1, 1.0E-15f).setLength(1).setSegments(8, 4).setScale(0.125f, 0.125f).setDirection(0)
			.setTopOffset(new Vec3f(0.0, 0.0, -0.75)).setTopRotation(new Vec3f(0.0, 0.0, 0.0)).build()
			.setRotationPoint(8.25f, 7.25f, -7.375f).setRotationAngle(0, 0, -180)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 67, 56, textureX, textureY).newCylinderBuilder()
			.setPosition(0, 0, 0).setRadius(1, 0).setLength(1).setSegments(8, 2).setScale(0.125f, 0.125f).setDirection(0)
			.setTopOffset(new Vec3f(0.0, 0.0, -0.25)).setTopRotation(new Vec3f(0.0, 0.0, 0.0)).build()
			.setRotationPoint(-7.25f, 7.75f, -7.75f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 62, 56, textureX, textureY).newCylinderBuilder()
			.setPosition(0, 0, 0).setRadius(1, 0).setLength(1).setSegments(8, 2).setScale(0.125f, 0.125f).setDirection(0)
			.setTopOffset(new Vec3f(0.0, 0.0, -0.25)).setTopRotation(new Vec3f(0.0, 0.0, 0.0)).build()
			.setRotationPoint(-1.75f, 7.75f, -7.75f).setRotationAngle(0, 0, -90)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 57, 56, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 0.09375f, 0.09375f, 0, new Vec3f(0.0, 0.0, -0.4375))
			.setRotationPoint(-0.75f, 7.25f, -7.40625f).setRotationAngle(0, 0, -90)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 125, 38, textureX, textureY).addCylinder(0, 0, 0, 0.09375f, 0.40625f, 8, 1, 1, 0, null)
			.setRotationPoint(-0.75f, 6.375f, -7.203125f).setRotationAngle(0, 0, -90)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 78, 37, textureX, textureY).newCylinderBuilder()
			.setPosition(0, 0, 0).setRadius(0.5f, 1.0E-15f).setLength(1).setSegments(8, 4).setScale(0.25f, 0.25f).setDirection(0)
			.setTopOffset(new Vec3f(0.0, 0.0, -0.6875)).setTopRotation(new Vec3f(0.0, 0.0, 0.0)).build()
			.setRotationPoint(-0.75f, 6.375f, -7.15625f).setRotationAngle(0, 0, 180)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 52, 56, textureX, textureY).newCylinderBuilder()
			.setPosition(0, 0, 0).setRadius(1, 0).setLength(1).setSegments(8, 4).setScale(0.125f, 0.125f).setDirection(0)
			.setTopOffset(new Vec3f(0.0, 0.0, -0.75)).setTopRotation(new Vec3f(0.0, 0.0, 0.0)).build()
			.setRotationPoint(-0.75f, 7.25f, -7.125f).setRotationAngle(0, 0, -90)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 33, 37, textureX, textureY).newCylinderBuilder()
			.setPosition(0, 0, 0).setRadius(1, 1.0E-15f).setLength(1).setSegments(8, 4).setScale(0.125f, 0.125f).setDirection(0)
			.setTopOffset(new Vec3f(0.0, 0.0, -0.75)).setTopRotation(new Vec3f(0.0, 0.0, 0.0)).build()
			.setRotationPoint(-0.75f, 7.25f, -7.375f).setRotationAngle(0, 0, -180)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 47, 56, textureX, textureY).newCylinderBuilder()
			.setPosition(0, 0, 0).setRadius(1, 0).setLength(1).setSegments(8, 2).setScale(0.125f, 0.125f).setDirection(0)
			.setTopOffset(new Vec3f(0.0, 0.0, -0.25)).setTopRotation(new Vec3f(0.0, 0.0, 0.0)).build()
			.setRotationPoint(-16.25f, 7.75f, -7.75f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 42, 56, textureX, textureY).newCylinderBuilder()
			.setPosition(0, 0, 0).setRadius(1, 0).setLength(1).setSegments(8, 2).setScale(0.125f, 0.125f).setDirection(0)
			.setTopOffset(new Vec3f(0.0, 0.0, -0.25)).setTopRotation(new Vec3f(0.0, 0.0, 0.0)).build()
			.setRotationPoint(-10.75f, 7.75f, -7.75f).setRotationAngle(0, 0, -90)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 120, 55, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 0.09375f, 0.09375f, 0, new Vec3f(0.0, 0.0, -0.4375))
			.setRotationPoint(-9.75f, 7.25f, -7.40625f).setRotationAngle(0, 0, -90)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 109, 37, textureX, textureY).addCylinder(0, 0, 0, 0.09375f, 0.40625f, 8, 1, 1, 0, null)
			.setRotationPoint(-9.75f, 6.375f, -7.203125f).setRotationAngle(0, 0, -90)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 112, 36, textureX, textureY).newCylinderBuilder()
			.setPosition(0, 0, 0).setRadius(0.5f, 1.0E-15f).setLength(1).setSegments(8, 4).setScale(0.25f, 0.25f).setDirection(0)
			.setTopOffset(new Vec3f(0.0, 0.0, -0.6875)).setTopRotation(new Vec3f(0.0, 0.0, 0.0)).build()
			.setRotationPoint(-9.75f, 6.375f, -7.15625f).setRotationAngle(0, 0, 180)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 106, 55, textureX, textureY).newCylinderBuilder()
			.setPosition(0, 0, 0).setRadius(1, 0).setLength(1).setSegments(8, 4).setScale(0.125f, 0.125f).setDirection(0)
			.setTopOffset(new Vec3f(0.0, 0.0, -0.75)).setTopRotation(new Vec3f(0.0, 0.0, 0.0)).build()
			.setRotationPoint(-9.75f, 7.25f, -7.125f).setRotationAngle(0, 0, -90)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 72, 36, textureX, textureY).newCylinderBuilder()
			.setPosition(0, 0, 0).setRadius(1, 1.0E-15f).setLength(1).setSegments(8, 4).setScale(0.125f, 0.125f).setDirection(0)
			.setTopOffset(new Vec3f(0.0, 0.0, -0.75)).setTopRotation(new Vec3f(0.0, 0.0, 0.0)).build()
			.setRotationPoint(-9.75f, 7.25f, -7.375f).setRotationAngle(0, 0, -180)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 39, 37, textureX, textureY).addCylinder(0, 0, 0, 0.09375f, 0.40625f, 8, 1, 1, 0, null)
			.setRotationPoint(9.75f, 6.375f, -7.203125f).setRotationAngle(0, 0, -90)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 66, 36, textureX, textureY).newCylinderBuilder()
			.setPosition(0, 0, 0).setRadius(0.5f, 1.0E-15f).setLength(1).setSegments(8, 4).setScale(0.25f, 0.25f).setDirection(0)
			.setTopOffset(new Vec3f(0.0, 0.0, -0.6875)).setTopRotation(new Vec3f(0.0, 0.0, 0.0)).build()
			.setRotationPoint(9.75f, 6.375f, -7.15625f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 87, 55, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 0.09375f, 0.09375f, 0, new Vec3f(0.0, 0.0, -0.4375))
			.setRotationPoint(0.75f, 7.25f, -7.40625f).setRotationAngle(0, 0, -90)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 125, 35, textureX, textureY).addCylinder(0, 0, 0, 0.09375f, 0.40625f, 8, 1, 1, 0, null)
			.setRotationPoint(0.75f, 6.375f, -7.203125f).setRotationAngle(0, 0, -90)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 60, 36, textureX, textureY).newCylinderBuilder()
			.setPosition(0, 0, 0).setRadius(0.5f, 1.0E-15f).setLength(1).setSegments(8, 4).setScale(0.25f, 0.25f).setDirection(0)
			.setTopOffset(new Vec3f(0.0, 0.0, -0.6875)).setTopRotation(new Vec3f(0.0, 0.0, 0.0)).build()
			.setRotationPoint(0.75f, 6.375f, -7.15625f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 37, 54, textureX, textureY).newCylinderBuilder()
			.setPosition(0, 0, 0).setRadius(1, 0).setLength(1).setSegments(8, 4).setScale(0.125f, 0.125f).setDirection(0)
			.setTopOffset(new Vec3f(0.0, 0.0, -0.75)).setTopRotation(new Vec3f(0.0, 0.0, 0.0)).build()
			.setRotationPoint(0.75f, 7.25f, -7.125f).setRotationAngle(0, 0, -90)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 54, 36, textureX, textureY).newCylinderBuilder()
			.setPosition(0, 0, 0).setRadius(1, 1.0E-15f).setLength(1).setSegments(8, 4).setScale(0.125f, 0.125f).setDirection(0)
			.setTopOffset(new Vec3f(0.0, 0.0, -0.75)).setTopRotation(new Vec3f(0.0, 0.0, 0.0)).build()
			.setRotationPoint(0.75f, 7.25f, -7.375f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 20, 54, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 0.09375f, 0.09375f, 0, new Vec3f(0.0, 0.0, -0.4375))
			.setRotationPoint(-8.25f, 7.25f, -7.40625f).setRotationAngle(0, 0, -90)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 61, 6, textureX, textureY).addCylinder(0, 0, 0, 0.09375f, 0.40625f, 8, 1, 1, 0, null)
			.setRotationPoint(-8.25f, 6.375f, -7.203125f).setRotationAngle(0, 0, -90)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 48, 36, textureX, textureY).newCylinderBuilder()
			.setPosition(0, 0, 0).setRadius(0.5f, 1.0E-15f).setLength(1).setSegments(8, 4).setScale(0.25f, 0.25f).setDirection(0)
			.setTopOffset(new Vec3f(0.0, 0.0, -0.6875)).setTopRotation(new Vec3f(0.0, 0.0, 0.0)).build()
			.setRotationPoint(-8.25f, 6.375f, -7.15625f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 15, 54, textureX, textureY).newCylinderBuilder()
			.setPosition(0, 0, 0).setRadius(1, 0).setLength(1).setSegments(8, 4).setScale(0.125f, 0.125f).setDirection(0)
			.setTopOffset(new Vec3f(0.0, 0.0, -0.75)).setTopRotation(new Vec3f(0.0, 0.0, 0.0)).build()
			.setRotationPoint(-8.25f, 7.25f, -7.125f).setRotationAngle(0, 0, -90)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 19, 36, textureX, textureY).newCylinderBuilder()
			.setPosition(0, 0, 0).setRadius(1, 1.0E-15f).setLength(1).setSegments(8, 4).setScale(0.125f, 0.125f).setDirection(0)
			.setTopOffset(new Vec3f(0.0, 0.0, -0.75)).setTopRotation(new Vec3f(0.0, 0.0, 0.0)).build()
			.setRotationPoint(-8.25f, 7.25f, -7.375f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 10, 54, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 0.09375f, 0.09375f, 0, new Vec3f(0.0, 0.0, -0.4375))
			.setRotationPoint(-17.25f, 7.25f, -7.40625f).setRotationAngle(0, 0, -90)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 0, 6, textureX, textureY).addCylinder(0, 0, 0, 0.09375f, 0.40625f, 8, 1, 1, 0, null)
			.setRotationPoint(-17.25f, 6.375f, -7.203125f).setRotationAngle(0, 0, -90)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 119, 35, textureX, textureY).newCylinderBuilder()
			.setPosition(0, 0, 0).setRadius(0.5f, 1.0E-15f).setLength(1).setSegments(8, 4).setScale(0.25f, 0.25f).setDirection(0)
			.setTopOffset(new Vec3f(0.0, 0.0, -0.6875)).setTopRotation(new Vec3f(0.0, 0.0, 0.0)).build()
			.setRotationPoint(-17.25f, 6.375f, -7.15625f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 5, 54, textureX, textureY).newCylinderBuilder()
			.setPosition(0, 0, 0).setRadius(1, 0).setLength(1).setSegments(8, 4).setScale(0.125f, 0.125f).setDirection(0)
			.setTopOffset(new Vec3f(0.0, 0.0, -0.75)).setTopRotation(new Vec3f(0.0, 0.0, 0.0)).build()
			.setRotationPoint(-17.25f, 7.25f, -7.125f).setRotationAngle(0, 0, -90)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 97, 35, textureX, textureY).newCylinderBuilder()
			.setPosition(0, 0, 0).setRadius(1, 1.0E-15f).setLength(1).setSegments(8, 4).setScale(0.125f, 0.125f).setDirection(0)
			.setTopOffset(new Vec3f(0.0, 0.0, -0.75)).setTopRotation(new Vec3f(0.0, 0.0, 0.0)).build()
			.setRotationPoint(-17.25f, 7.25f, -7.375f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 82, 53, textureX, textureY).newCylinderBuilder()
			.setPosition(0, 0, 0).setRadius(1, 0).setLength(1).setSegments(8, 2).setScale(0.125f, 0.125f).setDirection(0)
			.setTopOffset(new Vec3f(0.0, 0.0, -0.25)).setTopRotation(new Vec3f(0.0, 0.0, 0.0)).build()
			.setRotationPoint(10.75f, 7.75f, -7.75f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 32, 53, textureX, textureY).newCylinderBuilder()
			.setPosition(0, 0, 0).setRadius(1, 0).setLength(1).setSegments(8, 2).setScale(0.125f, 0.125f).setDirection(0)
			.setTopOffset(new Vec3f(0.0, 0.0, -0.25)).setTopRotation(new Vec3f(0.0, 0.0, 0.0)).build()
			.setRotationPoint(16.25f, 7.75f, -7.75f).setRotationAngle(0, 0, -90)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 27, 53, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 0.09375f, 0.09375f, 0, new Vec3f(0.0, 0.0, -0.4375))
			.setRotationPoint(17.25f, 7.25f, -7.40625f).setRotationAngle(0, 0, -90)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 0, 53, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 1.109375f, 0.984375f, 1, new Vec3f(0.0, 0.0, 0.875))
			.setRotationPoint(-13.5f, 6.5f, -8.75f).setRotationAngle(0, 0, 0)
		);
		groups.add(Tender_Truck_F);
	}

	private final void initGroup_Tender_Truck_F1(){
		TurboList Tender_Truck_F = new TurboList("Tender_Truck_F");
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 115, 52, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 0.984375f, 0.796875f, 1, new Vec3f(0.0, 0.0, 0.9375))
			.setRotationPoint(-13.5f, 6.5f, -8.875f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 101, 52, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 1.109375f, 0.984375f, 1, new Vec3f(0.0, 0.0, 0.875))
			.setRotationPoint(-4.5f, 6.5f, -8.75f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 96, 52, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 0.984375f, 0.796875f, 1, new Vec3f(0.0, 0.0, 0.9375))
			.setRotationPoint(-4.5f, 6.5f, -8.875f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 77, 52, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 1.109375f, 0.984375f, 1, new Vec3f(0.0, 0.0, 0.875))
			.setRotationPoint(4.5f, 6.5f, -8.75f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 72, 52, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 0.984375f, 0.796875f, 1, new Vec3f(0.0, 0.0, 0.9375))
			.setRotationPoint(4.5f, 6.5f, -8.875f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 67, 52, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 0.0625f, 0.09375f, 0, new Vec3f(0.0, 0.0, -0.9375))
			.setRotationPoint(13.5f, 7.125f, -8).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 62, 52, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 1.109375f, 0.984375f, 1, new Vec3f(0.0, 0.0, 0.875))
			.setRotationPoint(13.5f, 6.5f, -8.75f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 57, 52, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 0.984375f, 0.796875f, 1, new Vec3f(0.0, 0.0, 0.9375))
			.setRotationPoint(13.5f, 6.5f, -8.875f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 52, 52, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 0.0625f, 0.09375f, 0, new Vec3f(0.0, 0.0, -0.9375))
			.setRotationPoint(4.5f, 7.125f, -8).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 47, 52, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 0.0625f, 0.09375f, 0, new Vec3f(0.0, 0.0, -0.9375))
			.setRotationPoint(-4.5f, 7.125f, -8).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 42, 52, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 0.0625f, 0.09375f, 0, new Vec3f(0.0, 0.0, -0.9375))
			.setRotationPoint(-13.5f, 7.125f, -8).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 122, 51, textureX, textureY).newCylinderBuilder()
			.setPosition(0, 0, 0).setRadius(1, 0).setLength(1).setSegments(8, 4).setScale(0.125f, 0.125f).setDirection(0)
			.setTopOffset(new Vec3f(0.0, 0.0, -0.75)).setTopRotation(new Vec3f(0.0, 0.0, 0.0)).build()
			.setRotationPoint(17.25f, 7.25f, -7.125f).setRotationAngle(0, 0, -90)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 91, 35, textureX, textureY).newCylinderBuilder()
			.setPosition(0, 0, 0).setRadius(1, 1.0E-15f).setLength(1).setSegments(8, 4).setScale(0.125f, 0.125f).setDirection(0)
			.setTopOffset(new Vec3f(0.0, 0.0, -0.75)).setTopRotation(new Vec3f(0.0, 0.0, 0.0)).build()
			.setRotationPoint(17.25f, 7.25f, -7.375f).setRotationAngle(0, 0, -180)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 110, 51, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 0.09375f, 0.09375f, 0, new Vec3f(0.0, 0.0, -0.4375))
			.setRotationPoint(9.75f, 7.25f, -7.40625f).setRotationAngle(0, 0, -90)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 91, 51, textureX, textureY).newCylinderBuilder()
			.setPosition(0, 0, 0).setRadius(1, 0).setLength(1).setSegments(8, 4).setScale(0.125f, 0.125f).setDirection(0)
			.setTopOffset(new Vec3f(0.0, 0.0, -0.75)).setTopRotation(new Vec3f(0.0, 0.0, 0.0)).build()
			.setRotationPoint(9.75f, 7.25f, -7.125f).setRotationAngle(0, 0, -90)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 42, 35, textureX, textureY).newCylinderBuilder()
			.setPosition(0, 0, 0).setRadius(1, 1.0E-15f).setLength(1).setSegments(8, 4).setScale(0.125f, 0.125f).setDirection(0)
			.setTopOffset(new Vec3f(0.0, 0.0, -0.75)).setTopRotation(new Vec3f(0.0, 0.0, 0.0)).build()
			.setRotationPoint(9.75f, 7.25f, -7.375f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 37, 51, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.375f, -0.625f, -0.25f, -0.5f, -0.40625f, -0.25f, -0.5f, -0.40625f, -0.375f, -0.375f, -0.625f, -0.375f, -0.375f, 0.125f, -0.25f, -0.5f, 0.34375f, -0.25f, -0.5f, 0.34375f, -0.375f, -0.375f, 0.125f, -0.375f)
			.setRotationPoint(9.375f, 5.5f, -7.4375f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 22, 51, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.375f, -0.625f, -0.25f, -0.5f, -0.546875f, -0.25f, -0.5f, -0.546875f, -0.375f, -0.375f, -0.625f, -0.375f, -0.375f, -0.125f, -0.25f, -0.5625f, -0.125f, -0.25f, -0.5625f, -0.125f, -0.375f, -0.375f, -0.125f, -0.375f)
			.setRotationPoint(9.5f, 5.28125f, -7.4375f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 14, 51, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.375f, -0.125f, -0.25f, -0.5625f, -0.125f, -0.25f, -0.5625f, -0.125f, -0.375f, -0.375f, -0.125f, -0.375f, -0.375f, -0.625f, -0.25f, -0.5f, -0.546875f, -0.25f, -0.5f, -0.546875f, -0.375f, -0.375f, -0.625f, -0.375f)
			.setRotationPoint(9.5f, 6.46875f, -7.4375f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 9, 51, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.375f, 0, -0.25f, -0.5625f, 0, -0.25f, -0.5625f, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f, -0.5625f, -0.25f, -0.5625f, -0.5625f, -0.25f, -0.5625f, -0.5625f, -0.375f, -0.375f, -0.5625f, -0.375f)
			.setRotationPoint(9.5f, 6.15625f, -7.4375f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 86, 50, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, -0.40625f, -0.25f, -0.375f, -0.625f, -0.25f, -0.375f, -0.625f, -0.375f, -0.5f, -0.40625f, -0.375f, -0.5f, 0.34375f, -0.25f, -0.375f, 0.125f, -0.25f, -0.375f, 0.125f, -0.375f, -0.5f, 0.34375f, -0.375f)
			.setRotationPoint(7.625f, 5.5f, -7.4375f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 32, 50, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, -0.546875f, -0.25f, -0.375f, -0.625f, -0.25f, -0.375f, -0.625f, -0.375f, -0.5f, -0.546875f, -0.375f, -0.5625f, -0.125f, -0.25f, -0.375f, -0.125f, -0.25f, -0.375f, -0.125f, -0.375f, -0.5625f, -0.125f, -0.375f)
			.setRotationPoint(7.5f, 5.28125f, -7.4375f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 27, 50, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5625f, -0.125f, -0.25f, -0.375f, -0.125f, -0.25f, -0.375f, -0.125f, -0.375f, -0.5625f, -0.125f, -0.375f, -0.5f, -0.546875f, -0.25f, -0.375f, -0.625f, -0.25f, -0.375f, -0.625f, -0.375f, -0.5f, -0.546875f, -0.375f)
			.setRotationPoint(7.5f, 6.46875f, -7.4375f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 4, 50, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5625f, 0, -0.25f, -0.375f, 0, -0.25f, -0.375f, 0, -0.375f, -0.5625f, 0, -0.375f, -0.5625f, -0.5625f, -0.25f, -0.375f, -0.5625f, -0.25f, -0.375f, -0.5625f, -0.375f, -0.5625f, -0.5625f, -0.375f)
			.setRotationPoint(7.5f, 6.15625f, -7.4375f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 117, 49, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.375f, -0.625f, -0.25f, -0.5f, -0.40625f, -0.25f, -0.5f, -0.40625f, -0.375f, -0.375f, -0.625f, -0.375f, -0.375f, 0.125f, -0.25f, -0.5f, 0.34375f, -0.25f, -0.5f, 0.34375f, -0.375f, -0.375f, 0.125f, -0.375f)
			.setRotationPoint(0.375f, 5.5f, -7.4375f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 105, 49, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.375f, -0.625f, -0.25f, -0.5f, -0.546875f, -0.25f, -0.5f, -0.546875f, -0.375f, -0.375f, -0.625f, -0.375f, -0.375f, -0.125f, -0.25f, -0.5625f, -0.125f, -0.25f, -0.5625f, -0.125f, -0.375f, -0.375f, -0.125f, -0.375f)
			.setRotationPoint(0.5f, 5.28125f, -7.4375f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 100, 49, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.375f, -0.125f, -0.25f, -0.5625f, -0.125f, -0.25f, -0.5625f, -0.125f, -0.375f, -0.375f, -0.125f, -0.375f, -0.375f, -0.625f, -0.25f, -0.5f, -0.546875f, -0.25f, -0.5f, -0.546875f, -0.375f, -0.375f, -0.625f, -0.375f)
			.setRotationPoint(0.5f, 6.46875f, -7.4375f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 81, 49, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.375f, 0, -0.25f, -0.5625f, 0, -0.25f, -0.5625f, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f, -0.5625f, -0.25f, -0.5625f, -0.5625f, -0.25f, -0.5625f, -0.5625f, -0.375f, -0.375f, -0.5625f, -0.375f)
			.setRotationPoint(0.5f, 6.15625f, -7.4375f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 76, 49, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, -0.40625f, -0.25f, -0.375f, -0.625f, -0.25f, -0.375f, -0.625f, -0.375f, -0.5f, -0.40625f, -0.375f, -0.5f, 0.34375f, -0.25f, -0.375f, 0.125f, -0.25f, -0.375f, 0.125f, -0.375f, -0.5f, 0.34375f, -0.375f)
			.setRotationPoint(-1.375f, 5.5f, -7.4375f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 68, 49, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, -0.546875f, -0.25f, -0.375f, -0.625f, -0.25f, -0.375f, -0.625f, -0.375f, -0.5f, -0.546875f, -0.375f, -0.5625f, -0.125f, -0.25f, -0.375f, -0.125f, -0.25f, -0.375f, -0.125f, -0.375f, -0.5625f, -0.125f, -0.375f)
			.setRotationPoint(-1.5f, 5.28125f, -7.4375f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 63, 49, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5625f, -0.125f, -0.25f, -0.375f, -0.125f, -0.25f, -0.375f, -0.125f, -0.375f, -0.5625f, -0.125f, -0.375f, -0.5f, -0.546875f, -0.25f, -0.375f, -0.625f, -0.25f, -0.375f, -0.625f, -0.375f, -0.5f, -0.546875f, -0.375f)
			.setRotationPoint(-1.5f, 6.46875f, -7.4375f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 58, 49, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5625f, 0, -0.25f, -0.375f, 0, -0.25f, -0.375f, 0, -0.375f, -0.5625f, 0, -0.375f, -0.5625f, -0.5625f, -0.25f, -0.375f, -0.5625f, -0.25f, -0.375f, -0.5625f, -0.375f, -0.5625f, -0.5625f, -0.375f)
			.setRotationPoint(-1.5f, 6.15625f, -7.4375f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 53, 49, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.375f, -0.625f, -0.25f, -0.5f, -0.40625f, -0.25f, -0.5f, -0.40625f, -0.375f, -0.375f, -0.625f, -0.375f, -0.375f, 0.125f, -0.25f, -0.5f, 0.34375f, -0.25f, -0.5f, 0.34375f, -0.375f, -0.375f, 0.125f, -0.375f)
			.setRotationPoint(-8.625f, 5.5f, -7.4375f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 48, 49, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.375f, -0.625f, -0.25f, -0.5f, -0.546875f, -0.25f, -0.5f, -0.546875f, -0.375f, -0.375f, -0.625f, -0.375f, -0.375f, -0.125f, -0.25f, -0.5625f, -0.125f, -0.25f, -0.5625f, -0.125f, -0.375f, -0.375f, -0.125f, -0.375f)
			.setRotationPoint(-8.5f, 5.28125f, -7.4375f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 43, 49, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.375f, -0.125f, -0.25f, -0.5625f, -0.125f, -0.25f, -0.5625f, -0.125f, -0.375f, -0.375f, -0.125f, -0.375f, -0.375f, -0.625f, -0.25f, -0.5f, -0.546875f, -0.25f, -0.5f, -0.546875f, -0.375f, -0.375f, -0.625f, -0.375f)
			.setRotationPoint(-8.5f, 6.46875f, -7.4375f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 18, 49, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.375f, 0, -0.25f, -0.5625f, 0, -0.25f, -0.5625f, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f, -0.5625f, -0.25f, -0.5625f, -0.5625f, -0.25f, -0.5625f, -0.5625f, -0.375f, -0.375f, -0.5625f, -0.375f)
			.setRotationPoint(-8.5f, 6.15625f, -7.4375f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 123, 48, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, -0.40625f, -0.25f, -0.375f, -0.625f, -0.25f, -0.375f, -0.625f, -0.375f, -0.5f, -0.40625f, -0.375f, -0.5f, 0.34375f, -0.25f, -0.375f, 0.125f, -0.25f, -0.375f, 0.125f, -0.375f, -0.5f, 0.34375f, -0.375f)
			.setRotationPoint(-10.375f, 5.5f, -7.4375f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 112, 48, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, -0.546875f, -0.25f, -0.375f, -0.625f, -0.25f, -0.375f, -0.625f, -0.375f, -0.5f, -0.546875f, -0.375f, -0.5625f, -0.125f, -0.25f, -0.375f, -0.125f, -0.25f, -0.375f, -0.125f, -0.375f, -0.5625f, -0.125f, -0.375f)
			.setRotationPoint(-10.5f, 5.28125f, -7.4375f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 95, 48, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5625f, -0.125f, -0.25f, -0.375f, -0.125f, -0.25f, -0.375f, -0.125f, -0.375f, -0.5625f, -0.125f, -0.375f, -0.5f, -0.546875f, -0.25f, -0.375f, -0.625f, -0.25f, -0.375f, -0.625f, -0.375f, -0.5f, -0.546875f, -0.375f)
			.setRotationPoint(-10.5f, 6.46875f, -7.4375f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 90, 48, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5625f, 0, -0.25f, -0.375f, 0, -0.25f, -0.375f, 0, -0.375f, -0.5625f, 0, -0.375f, -0.5625f, -0.5625f, -0.25f, -0.375f, -0.5625f, -0.25f, -0.375f, -0.5625f, -0.375f, -0.5625f, -0.5625f, -0.375f)
			.setRotationPoint(-10.5f, 6.15625f, -7.4375f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 38, 48, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.375f, -0.625f, -0.25f, -0.5f, -0.40625f, -0.25f, -0.5f, -0.40625f, -0.375f, -0.375f, -0.625f, -0.375f, -0.375f, 0.125f, -0.25f, -0.5f, 0.34375f, -0.25f, -0.5f, 0.34375f, -0.375f, -0.375f, 0.125f, -0.375f)
			.setRotationPoint(-17.625f, 5.5f, -7.4375f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 23, 48, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.375f, -0.625f, -0.25f, -0.5f, -0.546875f, -0.25f, -0.5f, -0.546875f, -0.375f, -0.375f, -0.625f, -0.375f, -0.375f, -0.125f, -0.25f, -0.5625f, -0.125f, -0.25f, -0.5625f, -0.125f, -0.375f, -0.375f, -0.125f, -0.375f)
			.setRotationPoint(-17.5f, 5.28125f, -7.4375f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 13, 48, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.375f, -0.125f, -0.25f, -0.5625f, -0.125f, -0.25f, -0.5625f, -0.125f, -0.375f, -0.375f, -0.125f, -0.375f, -0.375f, -0.625f, -0.25f, -0.5f, -0.546875f, -0.25f, -0.5f, -0.546875f, -0.375f, -0.375f, -0.625f, -0.375f)
			.setRotationPoint(-17.5f, 6.46875f, -7.4375f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 8, 48, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.375f, 0, -0.25f, -0.5625f, 0, -0.25f, -0.5625f, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f, -0.5625f, -0.25f, -0.5625f, -0.5625f, -0.25f, -0.5625f, -0.5625f, -0.375f, -0.375f, -0.5625f, -0.375f)
			.setRotationPoint(-17.5f, 6.15625f, -7.4375f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 15, 22, textureX, textureY)
			.addShapeBox(0, 0, 0, 7, 7, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-17, 3, -6).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 0, 22, textureX, textureY)
			.addShapeBox(0, 0, 0, 7, 7, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-17, 3, 6).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 112, 18, textureX, textureY)
			.addShapeBox(0, 0, 0, 7, 7, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-8, 3, -6).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 97, 18, textureX, textureY)
			.addShapeBox(0, 0, 0, 7, 7, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-8, 3, 6).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 82, 18, textureX, textureY)
			.addShapeBox(0, 0, 0, 7, 7, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(1, 3, -6).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 67, 16, textureX, textureY)
			.addShapeBox(0, 0, 0, 7, 7, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(1, 3, 6).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 52, 16, textureX, textureY)
			.addShapeBox(0, 0, 0, 7, 7, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(10, 3, -6).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 37, 14, textureX, textureY)
			.addShapeBox(0, 0, 0, 7, 7, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(10, 3, 6).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 0, 48, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, -0.40625f, -0.375f, -0.375f, -0.625f, -0.375f, -0.375f, -0.625f, -0.25f, -0.5f, -0.40625f, -0.25f, -0.5f, 0.34375f, -0.375f, -0.375f, 0.125f, -0.375f, -0.375f, 0.125f, -0.25f, -0.5f, 0.34375f, -0.25f)
			.setRotationPoint(16.625f, 5.5f, 6.4375f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 85, 47, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, -0.546875f, -0.375f, -0.375f, -0.625f, -0.375f, -0.375f, -0.625f, -0.25f, -0.5f, -0.546875f, -0.25f, -0.5625f, -0.125f, -0.375f, -0.375f, -0.125f, -0.375f, -0.375f, -0.125f, -0.25f, -0.5625f, -0.125f, -0.25f)
			.setRotationPoint(16.5f, 5.28125f, 6.4375f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 72, 47, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5625f, -0.125f, -0.375f, -0.375f, -0.125f, -0.375f, -0.375f, -0.125f, -0.25f, -0.5625f, -0.125f, -0.25f, -0.5f, -0.546875f, -0.375f, -0.375f, -0.625f, -0.375f, -0.375f, -0.625f, -0.25f, -0.5f, -0.546875f, -0.25f)
			.setRotationPoint(16.5f, 6.46875f, 6.4375f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 33, 47, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5625f, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0, -0.25f, -0.5625f, 0, -0.25f, -0.5625f, -0.5625f, -0.375f, -0.375f, -0.5625f, -0.375f, -0.375f, -0.5625f, -0.25f, -0.5625f, -0.5625f, -0.25f)
			.setRotationPoint(16.5f, 6.15625f, 6.4375f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 28, 47, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.375f, -0.625f, -0.375f, -0.5f, -0.40625f, -0.375f, -0.5f, -0.40625f, -0.25f, -0.375f, -0.625f, -0.25f, -0.375f, 0.125f, -0.375f, -0.5f, 0.34375f, -0.375f, -0.5f, 0.34375f, -0.25f, -0.375f, 0.125f, -0.25f)
			.setRotationPoint(9.375f, 5.5f, 6.4375f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 119, 46, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.375f, -0.625f, -0.375f, -0.5f, -0.546875f, -0.375f, -0.5f, -0.546875f, -0.25f, -0.375f, -0.625f, -0.25f, -0.375f, -0.125f, -0.375f, -0.5625f, -0.125f, -0.375f, -0.5625f, -0.125f, -0.25f, -0.375f, -0.125f, -0.25f)
			.setRotationPoint(9.5f, 5.28125f, 6.4375f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 108, 46, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.375f, -0.125f, -0.375f, -0.5625f, -0.125f, -0.375f, -0.5625f, -0.125f, -0.25f, -0.375f, -0.125f, -0.25f, -0.375f, -0.625f, -0.375f, -0.5f, -0.546875f, -0.375f, -0.5f, -0.546875f, -0.25f, -0.375f, -0.625f, -0.25f)
			.setRotationPoint(9.5f, 6.46875f, 6.4375f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 80, 46, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.375f, 0, -0.375f, -0.5625f, 0, -0.375f, -0.5625f, 0, -0.25f, -0.375f, 0, -0.25f, -0.375f, -0.5625f, -0.375f, -0.5625f, -0.5625f, -0.375f, -0.5625f, -0.5625f, -0.25f, -0.375f, -0.5625f, -0.25f)
			.setRotationPoint(9.5f, 6.15625f, 6.4375f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 67, 46, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, -0.40625f, -0.375f, -0.375f, -0.625f, -0.375f, -0.375f, -0.625f, -0.25f, -0.5f, -0.40625f, -0.25f, -0.5f, 0.34375f, -0.375f, -0.375f, 0.125f, -0.375f, -0.375f, 0.125f, -0.25f, -0.5f, 0.34375f, -0.25f)
			.setRotationPoint(7.625f, 5.5f, 6.4375f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 62, 46, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, -0.546875f, -0.375f, -0.375f, -0.625f, -0.375f, -0.375f, -0.625f, -0.25f, -0.5f, -0.546875f, -0.25f, -0.5625f, -0.125f, -0.375f, -0.375f, -0.125f, -0.375f, -0.375f, -0.125f, -0.25f, -0.5625f, -0.125f, -0.25f)
			.setRotationPoint(7.5f, 5.28125f, 6.4375f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 57, 46, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5625f, -0.125f, -0.375f, -0.375f, -0.125f, -0.375f, -0.375f, -0.125f, -0.25f, -0.5625f, -0.125f, -0.25f, -0.5f, -0.546875f, -0.375f, -0.375f, -0.625f, -0.375f, -0.375f, -0.625f, -0.25f, -0.5f, -0.546875f, -0.25f)
			.setRotationPoint(7.5f, 6.46875f, 6.4375f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 52, 46, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5625f, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0, -0.25f, -0.5625f, 0, -0.25f, -0.5625f, -0.5625f, -0.375f, -0.375f, -0.5625f, -0.375f, -0.375f, -0.5625f, -0.25f, -0.5625f, -0.5625f, -0.25f)
			.setRotationPoint(7.5f, 6.15625f, 6.4375f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 47, 46, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.375f, -0.625f, -0.375f, -0.5f, -0.40625f, -0.375f, -0.5f, -0.40625f, -0.25f, -0.375f, -0.625f, -0.25f, -0.375f, 0.125f, -0.375f, -0.5f, 0.34375f, -0.375f, -0.5f, 0.34375f, -0.25f, -0.375f, 0.125f, -0.25f)
			.setRotationPoint(0.375f, 5.5f, 6.4375f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 42, 46, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.375f, -0.625f, -0.375f, -0.5f, -0.546875f, -0.375f, -0.5f, -0.546875f, -0.25f, -0.375f, -0.625f, -0.25f, -0.375f, -0.125f, -0.375f, -0.5625f, -0.125f, -0.375f, -0.5625f, -0.125f, -0.25f, -0.375f, -0.125f, -0.25f)
			.setRotationPoint(0.5f, 5.28125f, 6.4375f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 19, 46, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.375f, -0.125f, -0.375f, -0.5625f, -0.125f, -0.375f, -0.5625f, -0.125f, -0.25f, -0.375f, -0.125f, -0.25f, -0.375f, -0.625f, -0.375f, -0.5f, -0.546875f, -0.375f, -0.5f, -0.546875f, -0.25f, -0.375f, -0.625f, -0.25f)
			.setRotationPoint(0.5f, 6.46875f, 6.4375f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 4, 46, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.375f, 0, -0.375f, -0.5625f, 0, -0.375f, -0.5625f, 0, -0.25f, -0.375f, 0, -0.25f, -0.375f, -0.5625f, -0.375f, -0.5625f, -0.5625f, -0.375f, -0.5625f, -0.5625f, -0.25f, -0.375f, -0.5625f, -0.25f)
			.setRotationPoint(0.5f, 6.15625f, 6.4375f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 114, 45, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, -0.40625f, -0.375f, -0.375f, -0.625f, -0.375f, -0.375f, -0.625f, -0.25f, -0.5f, -0.40625f, -0.25f, -0.5f, 0.34375f, -0.375f, -0.375f, 0.125f, -0.375f, -0.375f, 0.125f, -0.25f, -0.5f, 0.34375f, -0.25f)
			.setRotationPoint(-1.375f, 5.5f, 6.4375f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 96, 45, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, -0.546875f, -0.375f, -0.375f, -0.625f, -0.375f, -0.375f, -0.625f, -0.25f, -0.5f, -0.546875f, -0.25f, -0.5625f, -0.125f, -0.375f, -0.375f, -0.125f, -0.375f, -0.375f, -0.125f, -0.25f, -0.5625f, -0.125f, -0.25f)
			.setRotationPoint(-1.5f, 5.28125f, 6.4375f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 91, 45, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5625f, -0.125f, -0.375f, -0.375f, -0.125f, -0.375f, -0.375f, -0.125f, -0.25f, -0.5625f, -0.125f, -0.25f, -0.5f, -0.546875f, -0.375f, -0.375f, -0.625f, -0.375f, -0.375f, -0.625f, -0.25f, -0.5f, -0.546875f, -0.25f)
			.setRotationPoint(-1.5f, 6.46875f, 6.4375f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 37, 45, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5625f, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0, -0.25f, -0.5625f, 0, -0.25f, -0.5625f, -0.5625f, -0.375f, -0.375f, -0.5625f, -0.375f, -0.375f, -0.5625f, -0.25f, -0.5625f, -0.5625f, -0.25f)
			.setRotationPoint(-1.5f, 6.15625f, 6.4375f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 24, 45, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.375f, -0.625f, -0.375f, -0.5f, -0.40625f, -0.375f, -0.5f, -0.40625f, -0.25f, -0.375f, -0.625f, -0.25f, -0.375f, 0.125f, -0.375f, -0.5f, 0.34375f, -0.375f, -0.5f, 0.34375f, -0.25f, -0.375f, 0.125f, -0.25f)
			.setRotationPoint(-8.625f, 5.5f, 6.4375f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 14, 45, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.375f, -0.625f, -0.375f, -0.5f, -0.546875f, -0.375f, -0.5f, -0.546875f, -0.25f, -0.375f, -0.625f, -0.25f, -0.375f, -0.125f, -0.375f, -0.5625f, -0.125f, -0.375f, -0.5625f, -0.125f, -0.25f, -0.375f, -0.125f, -0.25f)
			.setRotationPoint(-8.5f, 5.28125f, 6.4375f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 9, 45, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.375f, -0.125f, -0.375f, -0.5625f, -0.125f, -0.375f, -0.5625f, -0.125f, -0.25f, -0.375f, -0.125f, -0.25f, -0.375f, -0.625f, -0.375f, -0.5f, -0.546875f, -0.375f, -0.5f, -0.546875f, -0.25f, -0.375f, -0.625f, -0.25f)
			.setRotationPoint(-8.5f, 6.46875f, 6.4375f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 123, 44, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.375f, 0, -0.375f, -0.5625f, 0, -0.375f, -0.5625f, 0, -0.25f, -0.375f, 0, -0.25f, -0.375f, -0.5625f, -0.375f, -0.5625f, -0.5625f, -0.375f, -0.5625f, -0.5625f, -0.25f, -0.375f, -0.5625f, -0.25f)
			.setRotationPoint(-8.5f, 6.15625f, 6.4375f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 86, 44, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, -0.40625f, -0.375f, -0.375f, -0.625f, -0.375f, -0.375f, -0.625f, -0.25f, -0.5f, -0.40625f, -0.25f, -0.5f, 0.34375f, -0.375f, -0.375f, 0.125f, -0.375f, -0.375f, 0.125f, -0.25f, -0.5f, 0.34375f, -0.25f)
			.setRotationPoint(-10.375f, 5.5f, 6.4375f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 0, 44, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, -0.546875f, -0.375f, -0.375f, -0.625f, -0.375f, -0.375f, -0.625f, -0.25f, -0.5f, -0.546875f, -0.25f, -0.5625f, -0.125f, -0.375f, -0.375f, -0.125f, -0.375f, -0.375f, -0.125f, -0.25f, -0.5625f, -0.125f, -0.25f)
			.setRotationPoint(-10.5f, 5.28125f, 6.4375f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 81, 43, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5625f, -0.125f, -0.375f, -0.375f, -0.125f, -0.375f, -0.375f, -0.125f, -0.25f, -0.5625f, -0.125f, -0.25f, -0.5f, -0.546875f, -0.375f, -0.375f, -0.625f, -0.375f, -0.375f, -0.625f, -0.25f, -0.5f, -0.546875f, -0.25f)
			.setRotationPoint(-10.5f, 6.46875f, 6.4375f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 5, 43, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5625f, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0, -0.25f, -0.5625f, 0, -0.25f, -0.5625f, -0.5625f, -0.375f, -0.375f, -0.5625f, -0.375f, -0.375f, -0.5625f, -0.25f, -0.5625f, -0.5625f, -0.25f)
			.setRotationPoint(-10.5f, 6.15625f, 6.4375f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 70, 9, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.375f, -0.625f, -0.375f, -0.5f, -0.40625f, -0.375f, -0.5f, -0.40625f, -0.25f, -0.375f, -0.625f, -0.25f, -0.375f, 0.125f, -0.375f, -0.5f, 0.34375f, -0.375f, -0.5f, 0.34375f, -0.25f, -0.375f, 0.125f, -0.25f)
			.setRotationPoint(-17.625f, 5.5f, 6.4375f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 9, 9, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.375f, -0.625f, -0.375f, -0.5f, -0.546875f, -0.375f, -0.5f, -0.546875f, -0.25f, -0.375f, -0.625f, -0.25f, -0.375f, -0.125f, -0.375f, -0.5625f, -0.125f, -0.375f, -0.5625f, -0.125f, -0.25f, -0.375f, -0.125f, -0.25f)
			.setRotationPoint(-17.5f, 5.28125f, 6.4375f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 97, 3, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.375f, -0.125f, -0.375f, -0.5625f, -0.125f, -0.375f, -0.5625f, -0.125f, -0.25f, -0.375f, -0.125f, -0.25f, -0.375f, -0.625f, -0.375f, -0.5f, -0.546875f, -0.375f, -0.5f, -0.546875f, -0.25f, -0.375f, -0.625f, -0.25f)
			.setRotationPoint(-17.5f, 6.46875f, 6.4375f).setRotationAngle(0, 0, 0)
		);
		groups.add(Tender_Truck_F);
	}

}
