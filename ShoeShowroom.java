class ShoeShowroom
//primary key=identify 
{
       int id;
	   int noOfWorkers;
	   String[] brands;
	   String location;
	   
	   public ShoeShowroom() {
		System.out.println("ShoeShowroom object is created");
	}
	   
	 public void sellingShoes(){
		 
	 }
	  
     public void doBusiness(){
		 
	 }
	  public void getAllBrands(String[] brands){
		  for (int index=0;index<brands.length;index++){
		  System.out.println(brands[index]);
		  }
	  }

}