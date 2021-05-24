//Made with Blockbench
//Paste this code into your mod.

public static class Modelcapucha_altair extends ModelBase {
	private final ModelRenderer helmet;

	public Modelcapucha_altair() {
		textureWidth = 32;
		textureHeight = 32;

		helmet = new ModelRenderer(this);
		helmet.setRotationPoint(0.0F, 0.0F, 0.0F);
		helmet.cubeList.add(new ModelBox(helmet, 0, 0, -4.0F, -8.0F, 4.0F, 8, 8, 1, 0.0F, false));
		helmet.cubeList.add(new ModelBox(helmet, 0, 0, -4.0F, -8.0F, -5.0F, 8, 3, 1, 0.0F, false));
		helmet.cubeList.add(new ModelBox(helmet, 0, 0, -4.0F, -9.0F, -4.0F, 8, 1, 8, 0.0F, false));
		helmet.cubeList.add(new ModelBox(helmet, 0, 0, -4.0F, -5.0F, -5.0F, 2, 1, 1, 0.0F, false));
		helmet.cubeList.add(new ModelBox(helmet, 0, 0, -1.0F, -5.0F, -5.0F, 2, 1, 1, 0.0F, false));
		helmet.cubeList.add(new ModelBox(helmet, 0, 0, 2.0F, -5.0F, -5.0F, 2, 1, 1, 0.0F, false));
		helmet.cubeList.add(new ModelBox(helmet, 0, 0, -5.0F, -8.0F, -5.0F, 1, 8, 1, 0.0F, false));
		helmet.cubeList.add(new ModelBox(helmet, 0, 0, 4.0F, -8.0F, -5.0F, 1, 8, 1, 0.0F, false));
		helmet.cubeList.add(new ModelBox(helmet, 0, 0, -5.0F, -8.0F, -4.0F, 1, 8, 8, 0.0F, false));
		helmet.cubeList.add(new ModelBox(helmet, 0, 0, 4.0F, -8.0F, -4.0F, 1, 8, 8, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		helmet.render(f5);
	}
	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}