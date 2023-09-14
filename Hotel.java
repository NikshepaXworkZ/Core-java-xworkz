class Hotel{
	String foodsMenu[]=new String[10];
	int index;
	
	public boolean addMenu(String foodMenu){
			System.out.println("Inside AddMenu()");
		boolean isAdded=false;
		if(foodMenu!=null){
			System.out.println("validation is proper..proceed to add the Menu");
			foodsMenu[index]=foodMenu;
			index++;
			isAdded=true;
			
			System.out.println(foodMenu+" is Added Successfully");
		}
		System.out.println("End of Add Menu");
		return isAdded;
		
	}
	
	public void getFoodMenu(){
		System.out.println("The food names are");
		for(int index=0;index<foodsMenu.length;index++){
			System.out.println(foodsMenu[index]);
		}
	}
}