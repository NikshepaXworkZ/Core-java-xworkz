class InteriorExecutor{
	public static void main(String materials[]){
		Interior interior=new Interior();
		interior.addMaterialName("Cement");
		interior.addMaterialName("Sand");
		interior.addMaterialName("Tiles");
		interior.addMaterialName("Iron");
		interior.addMaterialName("Steel");
		interior.addMaterialName("Glass");
		interior.addMaterialName("Play Wood");
		interior.addMaterialName("Latch");
		interior.addMaterialName("Handles");
		interior.addMaterialName("PVC pipe");
		interior.addMaterialName("Bricks");
		
		interior.getMaterials();
	}
}