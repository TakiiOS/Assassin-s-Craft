//Made with Blockbench
//Paste this code into your mod.

public static class Modelcustom_model extends ModelBase {
	private final ModelRenderer cuerpo;
	private final ModelRenderer plumasatrasizquierda;
	private final ModelRenderer plumasatrasderecha;
	private final ModelRenderer aladerecha;
	private final ModelRenderer plumasderecha1;
	private final ModelRenderer plumasderecha2;
	private final ModelRenderer plumasderecha3;
	private final ModelRenderer plumasderecha4;
	private final ModelRenderer plumasderecha5;
	private final ModelRenderer plumasderecha6;
	private final ModelRenderer plumasderecha7;
	private final ModelRenderer plumasderecha8;
	private final ModelRenderer alaizquierda;
	private final ModelRenderer plumaizquierda1;
	private final ModelRenderer plumaizquierda2;
	private final ModelRenderer plumaizquierda3;
	private final ModelRenderer plumaizquierda4;
	private final ModelRenderer plumaizquierda5;
	private final ModelRenderer plumaizquierda6;
	private final ModelRenderer plumaizquierda7;
	private final ModelRenderer plumaizquierda8;
	private final ModelRenderer plumaizquierda9;
	private final ModelRenderer plumaizquierda10;

	public Modelcustom_model() {
		textureWidth = 128;
		textureHeight = 128;

		cuerpo = new ModelRenderer(this);
		cuerpo.setRotationPoint(0.0F, 13.0F, 0.0F);
		setRotationAngle(cuerpo, 0.0F, 3.1416F, 0.0F);
		cuerpo.cubeList.add(new ModelBox(cuerpo, 66, 112, -6.0F, -4.0F, 7.0F,
				5, 4, 2, 0.0F, false));
		cuerpo.cubeList.add(new ModelBox(cuerpo, 96, 9, -5.5F, -4.0F, 9.0F, 4,
				4, 4, 0.0F, false));
		cuerpo.cubeList.add(new ModelBox(cuerpo, 22, 35, -6.0F, -4.0F, -3.0F,
				5, 4, 3, 0.0F, false));
		cuerpo.cubeList.add(new ModelBox(cuerpo, 29, 42, -5.5F, -3.0F, -6.0F,
				4, 2, 3, 0.0F, false));
		cuerpo.cubeList.add(new ModelBox(cuerpo, 0, 44, -3.0F, -1.0F, -7.0F, 1,
				1, 4, 0.0F, false));
		cuerpo.cubeList.add(new ModelBox(cuerpo, 54, 29, -3.5F, -2.0F, -9.0F,
				2, 1, 3, 0.0F, false));
		cuerpo.cubeList.add(new ModelBox(cuerpo, 54, 29, -5.5F, -2.0F, -9.0F,
				2, 1, 3, 0.0F, false));
		cuerpo.cubeList.add(new ModelBox(cuerpo, 0, 44, -5.0F, -1.0F, -7.0F, 1,
				1, 4, 0.0F, false));
		cuerpo.cubeList.add(new ModelBox(cuerpo, 42, 4, -7.0F, -5.0F, 0.0F, 7,
				5, 7, 0.0F, false));
		cuerpo.cubeList.add(new ModelBox(cuerpo, 16, 16, -4.5F, -2.0F, 13.0F,
				2, 2, 2, 0.0F, false));
		cuerpo.cubeList.add(new ModelBox(cuerpo, 16, 16, -4.5F, -1.0F, 15.0F,
				2, 1, 1, 0.0F, false));

		plumasatrasizquierda = new ModelRenderer(this);
		plumasatrasizquierda.setRotationPoint(0.0F, 0.0F, 0.0F);
		setRotationAngle(plumasatrasizquierda, 0.0F, 0.3491F, 0.0F);
		cuerpo.addChild(plumasatrasizquierda);
		plumasatrasizquierda.cubeList.add(new ModelBox(plumasatrasizquierda,
				43, 96, -4.0F, -4.0F, -11.0F, 1, 1, 5, 0.0F, false));
		plumasatrasizquierda.cubeList.add(new ModelBox(plumasatrasizquierda,
				43, 96, -3.0F, -4.0F, -11.0F, 1, 1, 5, 0.0F, false));
		plumasatrasizquierda.cubeList.add(new ModelBox(plumasatrasizquierda,
				43, 96, -2.0F, -4.0F, -11.0F, 1, 1, 5, 0.0F, false));

		plumasatrasderecha = new ModelRenderer(this);
		plumasatrasderecha.setRotationPoint(0.0F, 0.0F, 0.0F);
		setRotationAngle(plumasatrasderecha, 0.0F, -0.4363F, 0.0F);
		cuerpo.addChild(plumasatrasderecha);
		plumasatrasderecha.cubeList.add(new ModelBox(plumasatrasderecha, 43,
				97, -6.0F, -4.0F, -8.0F, 1, 1, 5, 0.0F, false));
		plumasatrasderecha.cubeList.add(new ModelBox(plumasatrasderecha, 43,
				96, -5.0F, -4.0F, -8.0F, 1, 1, 5, 0.0F, false));
		plumasatrasderecha.cubeList.add(new ModelBox(plumasatrasderecha, 43,
				97, -4.0F, -4.0F, -8.0F, 1, 1, 5, 0.0F, false));

		aladerecha = new ModelRenderer(this);
		aladerecha.setRotationPoint(0.0F, 24.0F, 0.0F);
		setRotationAngle(aladerecha, 0.0F, -0.1745F, 0.1745F);
		aladerecha.cubeList.add(new ModelBox(aladerecha, 43, 7, -10.0F, -16.0F,
				-6.0F, 9, 1, 1, 0.0F, false));
		aladerecha.cubeList.add(new ModelBox(aladerecha, 43, 7, -16.0F, -16.0F,
				-7.0F, 7, 1, 1, 0.0F, false));
		aladerecha.cubeList.add(new ModelBox(aladerecha, 43, 7, -23.0F, -16.0F,
				-8.0F, 8, 1, 1, 0.0F, false));

		plumasderecha1 = new ModelRenderer(this);
		plumasderecha1.setRotationPoint(-0.5209F, 2.0F, -2.9544F);
		aladerecha.addChild(plumasderecha1);
		plumasderecha1.cubeList.add(new ModelBox(plumasderecha1, 33, 5, -4.0F,
				-18.0F, -2.0F, 1, 1, 7, 0.0F, false));
		plumasderecha1.cubeList.add(new ModelBox(plumasderecha1, 33, 5, -3.0F,
				-18.0F, -2.0F, 1, 1, 10, 0.0F, false));
		plumasderecha1.cubeList.add(new ModelBox(plumasderecha1, 33, 5, -2.0F,
				-18.0F, -2.0F, 1, 1, 8, 0.0F, false));
		plumasderecha1.cubeList.add(new ModelBox(plumasderecha1, 33, 5, -5.0F,
				-18.0F, -3.0F, 1, 1, 9, 0.0F, false));
		plumasderecha1.cubeList.add(new ModelBox(plumasderecha1, 33, 5, -6.0F,
				-18.0F, -3.0F, 1, 1, 10, 0.0F, false));
		plumasderecha1.cubeList.add(new ModelBox(plumasderecha1, 33, 5, -7.0F,
				-18.0F, -3.0F, 1, 1, 9, 0.0F, false));
		plumasderecha1.cubeList.add(new ModelBox(plumasderecha1, 33, 5, -8.0F,
				-18.0F, -3.0F, 1, 1, 8, 0.0F, false));
		plumasderecha1.cubeList.add(new ModelBox(plumasderecha1, 33, 5, -9.0F,
				-18.0F, -3.0F, 1, 1, 9, 0.0F, false));
		plumasderecha1.cubeList.add(new ModelBox(plumasderecha1, 33, 5, -10.0F,
				-18.0F, -3.0F, 1, 1, 10, 0.0F, false));
		plumasderecha1.cubeList.add(new ModelBox(plumasderecha1, 33, 5, -11.0F,
				-18.0F, -3.0F, 1, 1, 10, 0.0F, false));

		plumasderecha2 = new ModelRenderer(this);
		plumasderecha2.setRotationPoint(0.0F, 0.0F, 2.7808F);
		setRotationAngle(plumasderecha2, 0.0F, -0.2618F, 0.0F);
		aladerecha.addChild(plumasderecha2);
		plumasderecha2.cubeList.add(new ModelBox(plumasderecha2, 44, 6,
				-12.4942F, -16.0F, -6.0F, 1, 1, 11, 0.0F, false));
		plumasderecha2.cubeList.add(new ModelBox(plumasderecha2, 44, 6,
				-13.4942F, -16.0F, -6.0F, 1, 1, 9, 0.0F, false));
		plumasderecha2.cubeList.add(new ModelBox(plumasderecha2, 44, 6,
				-14.4942F, -16.0F, -6.0F, 1, 1, 10, 0.0F, false));
		plumasderecha2.cubeList.add(new ModelBox(plumasderecha2, 44, 6,
				-15.4942F, -16.0F, -5.0F, 1, 1, 11, 0.0F, false));
		plumasderecha2.cubeList.add(new ModelBox(plumasderecha2, 44, 6,
				-16.4942F, -16.0F, -5.0F, 1, 1, 10, 0.0F, false));
		plumasderecha2.cubeList.add(new ModelBox(plumasderecha2, 44, 6,
				-17.4942F, -16.0F, -5.0F, 1, 1, 12, 0.0F, false));
		plumasderecha2.cubeList.add(new ModelBox(plumasderecha2, 44, 6,
				-18.4942F, -16.0F, -6.0F, 1, 1, 11, 0.0F, false));
		plumasderecha2.cubeList.add(new ModelBox(plumasderecha2, 44, 6,
				-19.4942F, -16.0F, -6.0F, 1, 1, 13, 0.0F, false));

		plumasderecha3 = new ModelRenderer(this);
		plumasderecha3.setRotationPoint(1.6223F, 0.0F, -2.3169F);
		setRotationAngle(plumasderecha3, 0.0F, -0.3491F, 0.0F);
		aladerecha.addChild(plumasderecha3);
		plumasderecha3.cubeList.add(new ModelBox(plumasderecha3, 33, 2, -20.0F,
				-16.0F, 2.0F, 1, 1, 11, 0.0F, false));

		plumasderecha4 = new ModelRenderer(this);
		plumasderecha4.setRotationPoint(1.6223F, 0.0F, -2.3169F);
		setRotationAngle(plumasderecha4, 0.0F, -0.3491F, 0.0F);
		aladerecha.addChild(plumasderecha4);
		plumasderecha4.cubeList.add(new ModelBox(plumasderecha4, 33, 2, -21.0F,
				-16.0F, 2.0F, 1, 1, 10, 0.0F, false));

		plumasderecha5 = new ModelRenderer(this);
		plumasderecha5.setRotationPoint(1.6223F, 0.0F, -2.3169F);
		setRotationAngle(plumasderecha5, 0.0F, -0.3491F, 0.0F);
		aladerecha.addChild(plumasderecha5);
		plumasderecha5.cubeList.add(new ModelBox(plumasderecha5, 33, 2, -22.0F,
				-16.0F, 2.0F, 1, 1, 12, 0.0F, false));

		plumasderecha6 = new ModelRenderer(this);
		plumasderecha6.setRotationPoint(1.6223F, 0.0F, -2.3169F);
		setRotationAngle(plumasderecha6, 0.0F, -0.3491F, 0.0F);
		aladerecha.addChild(plumasderecha6);
		plumasderecha6.cubeList.add(new ModelBox(plumasderecha6, 33, 2, -23.0F,
				-16.0F, 3.0F, 1, 1, 12, 0.0F, false));

		plumasderecha7 = new ModelRenderer(this);
		plumasderecha7.setRotationPoint(1.6223F, 0.0F, -2.3169F);
		setRotationAngle(plumasderecha7, 0.0F, -0.3491F, 0.0F);
		aladerecha.addChild(plumasderecha7);
		plumasderecha7.cubeList.add(new ModelBox(plumasderecha7, 33, 2, -24.0F,
				-16.0F, 3.0F, 1, 1, 10, 0.0F, false));

		plumasderecha8 = new ModelRenderer(this);
		plumasderecha8.setRotationPoint(1.6223F, 0.0F, -2.3169F);
		setRotationAngle(plumasderecha8, 0.0F, -0.3491F, 0.0F);
		aladerecha.addChild(plumasderecha8);
		plumasderecha8.cubeList.add(new ModelBox(plumasderecha8, 33, 2, -25.0F,
				-16.0F, 3.0F, 1, 1, 11, 0.0F, false));

		alaizquierda = new ModelRenderer(this);
		alaizquierda.setRotationPoint(7.0F, 24.0F, 0.0F);
		setRotationAngle(alaizquierda, 0.0F, 0.1745F, -0.1745F);
		alaizquierda.cubeList.add(new ModelBox(alaizquierda, 23, 2, 1.0F,
				-16.0F, -6.0F, 9, 1, 1, 0.0F, false));
		alaizquierda.cubeList.add(new ModelBox(alaizquierda, 23, 2, 9.0F,
				-16.0F, -7.0F, 8, 1, 1, 0.0F, false));
		alaizquierda.cubeList.add(new ModelBox(alaizquierda, 23, 2, 16.0F,
				-16.0F, -8.0F, 8, 1, 1, 0.0F, false));

		plumaizquierda1 = new ModelRenderer(this);
		plumaizquierda1.setRotationPoint(0.0F, 0.0F, 0.0F);
		alaizquierda.addChild(plumaizquierda1);
		plumaizquierda1.cubeList.add(new ModelBox(plumaizquierda1, 34, 8, 3.0F,
				-16.0F, -5.0F, 1, 1, 8, 0.0F, false));
		plumaizquierda1.cubeList.add(new ModelBox(plumaizquierda1, 34, 8, 2.0F,
				-16.0F, -6.0F, 1, 1, 8, 0.0F, false));
		plumaizquierda1.cubeList.add(new ModelBox(plumaizquierda1, 34, 8, 1.0F,
				-16.0F, -4.0F, 1, 1, 8, 0.0F, false));
		plumaizquierda1.cubeList.add(new ModelBox(plumaizquierda1, 34, 8, 4.0F,
				-16.0F, -5.0F, 1, 1, 7, 0.0F, false));
		plumaizquierda1.cubeList.add(new ModelBox(plumaizquierda1, 34, 8, 5.0F,
				-16.0F, -5.0F, 1, 1, 9, 0.0F, false));
		plumaizquierda1.cubeList.add(new ModelBox(plumaizquierda1, 34, 8, 6.0F,
				-16.0F, -5.0F, 1, 1, 8, 0.0F, false));
		plumaizquierda1.cubeList.add(new ModelBox(plumaizquierda1, 34, 8, 7.0F,
				-16.0F, -5.0F, 1, 1, 10, 0.0F, false));
		plumaizquierda1.cubeList.add(new ModelBox(plumaizquierda1, 34, 8, 8.0F,
				-16.0F, -5.0F, 1, 1, 11, 0.0F, false));
		plumaizquierda1.cubeList.add(new ModelBox(plumaizquierda1, 34, 8, 9.0F,
				-16.0F, -5.0F, 1, 1, 9, 0.0F, false));
		plumaizquierda1.cubeList.add(new ModelBox(plumaizquierda1, 34, 8,
				10.0F, -16.0F, -6.0F, 1, 1, 11, 0.0F, false));

		plumaizquierda2 = new ModelRenderer(this);
		plumaizquierda2.setRotationPoint(0.0F, 0.0F, 0.0F);
		setRotationAngle(plumaizquierda2, 0.0F, 0.0873F, 0.0F);
		alaizquierda.addChild(plumaizquierda2);
		plumaizquierda2.cubeList.add(new ModelBox(plumaizquierda2, 34, 8,
				11.0F, -16.0F, -5.0F, 1, 1, 13, 0.0F, false));

		plumaizquierda3 = new ModelRenderer(this);
		plumaizquierda3.setRotationPoint(0.0F, 0.0F, 0.0F);
		setRotationAngle(plumaizquierda3, 0.0F, 0.0873F, 0.0F);
		alaizquierda.addChild(plumaizquierda3);
		plumaizquierda3.cubeList.add(new ModelBox(plumaizquierda3, 34, 8,
				12.0F, -16.0F, -5.0F, 1, 1, 11, 0.0F, false));

		plumaizquierda4 = new ModelRenderer(this);
		plumaizquierda4.setRotationPoint(0.0F, 0.0F, 0.0F);
		setRotationAngle(plumaizquierda4, 0.0F, 0.0873F, 0.0F);
		alaizquierda.addChild(plumaizquierda4);
		plumaizquierda4.cubeList.add(new ModelBox(plumaizquierda4, 34, 8,
				13.0F, -16.0F, -5.0F, 1, 1, 12, 0.0F, false));

		plumaizquierda5 = new ModelRenderer(this);
		plumaizquierda5.setRotationPoint(0.0F, 0.0F, 0.0F);
		setRotationAngle(plumaizquierda5, 0.0F, 0.0873F, 0.0F);
		alaizquierda.addChild(plumaizquierda5);
		plumaizquierda5.cubeList.add(new ModelBox(plumaizquierda5, 34, 8,
				14.0F, -16.0F, -5.0F, 1, 1, 13, 0.0F, false));

		plumaizquierda6 = new ModelRenderer(this);
		plumaizquierda6.setRotationPoint(0.0F, 0.0F, 0.0F);
		setRotationAngle(plumaizquierda6, 0.0F, 0.0873F, 0.0F);
		alaizquierda.addChild(plumaizquierda6);
		plumaizquierda6.cubeList.add(new ModelBox(plumaizquierda6, 34, 8,
				15.0F, -16.0F, -5.0F, 1, 1, 12, 0.0F, false));

		plumaizquierda7 = new ModelRenderer(this);
		plumaizquierda7.setRotationPoint(0.0F, 0.0F, 0.0F);
		setRotationAngle(plumaizquierda7, 0.0F, 0.0873F, 0.0F);
		alaizquierda.addChild(plumaizquierda7);
		plumaizquierda7.cubeList.add(new ModelBox(plumaizquierda7, 34, 8,
				16.0F, -16.0F, -5.0F, 1, 1, 11, 0.0F, false));

		plumaizquierda8 = new ModelRenderer(this);
		plumaizquierda8.setRotationPoint(0.0F, 0.0F, 0.0F);
		setRotationAngle(plumaizquierda8, 0.0F, 0.0873F, 0.0F);
		alaizquierda.addChild(plumaizquierda8);
		plumaizquierda8.cubeList.add(new ModelBox(plumaizquierda8, 34, 8,
				18.0F, -16.0F, -6.0F, 1, 1, 11, 0.0F, false));

		plumaizquierda9 = new ModelRenderer(this);
		plumaizquierda9.setRotationPoint(0.0F, 0.0F, 0.0F);
		setRotationAngle(plumaizquierda9, 0.0F, 0.0873F, 0.0F);
		alaizquierda.addChild(plumaizquierda9);
		plumaizquierda9.cubeList.add(new ModelBox(plumaizquierda9, 34, 8,
				17.0F, -16.0F, -6.0F, 1, 1, 13, 0.0F, false));

		plumaizquierda10 = new ModelRenderer(this);
		plumaizquierda10.setRotationPoint(0.0F, 0.0F, 0.0F);
		setRotationAngle(plumaizquierda10, 0.0F, 0.1745F, 0.0F);
		alaizquierda.addChild(plumaizquierda10);
		plumaizquierda10.cubeList.add(new ModelBox(plumaizquierda10, 26, 11,
				19.0F, -16.0F, -4.0F, 1, 1, 12, 0.0F, false));
		plumaizquierda10.cubeList.add(new ModelBox(plumaizquierda10, 26, 11,
				20.0F, -16.0F, -4.0F, 1, 1, 10, 0.0F, false));
		plumaizquierda10.cubeList.add(new ModelBox(plumaizquierda10, 26, 11,
				21.0F, -16.0F, -4.0F, 1, 1, 11, 0.0F, false));
		plumaizquierda10.cubeList.add(new ModelBox(plumaizquierda10, 26, 11,
				22.0F, -16.0F, -4.0F, 1, 1, 12, 0.0F, false));
		plumaizquierda10.cubeList.add(new ModelBox(plumaizquierda10, 26, 11,
				23.0F, -16.0F, -4.0F, 1, 1, 10, 0.0F, false));
		plumaizquierda10.cubeList.add(new ModelBox(plumaizquierda10, 26, 11,
				24.0F, -16.0F, -4.0F, 1, 1, 11, 0.0F, false));
		plumaizquierda10.cubeList.add(new ModelBox(plumaizquierda10, 26, 11,
				18.0F, -16.0F, -4.0F, 1, 1, 11, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3,
			float f4, float f5) {
		cuerpo.render(f5);
		aladerecha.render(f5);
		alaizquierda.render(f5);
	}
	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y,
			float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}

	public void setRotationAngles(float f, float f1, float f2, float f3,
			float f4, float f5, Entity e) {
		super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
	}
}