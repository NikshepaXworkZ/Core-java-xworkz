class Interior{
	String materialsName[]=new String[11];
	int index;
	
	public boolean addMaterialName(String materialName){
			System.out.println("Inside Add Materials()");
		boolean isAdded=false;
		if(materialName!=null){
			System.out.println("validation is proper..proceed to add the Materials");
			materialsName[index]=materialName;
			index++;
			isAdded=true;
			
			System.out.println(materialName+" is Added Successfully");
			
		}
		System.out.println("End of Add Materials");
		return isAdded;
	}
	
	public void getMaterials(){
		System.out.println("The list of materials name are : ");
		for(int index=0;index<materialsName.length;index++){
			System.out.println(materialsName[index]);
		}
	}
}