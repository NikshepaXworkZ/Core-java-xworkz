class ShoeShowroom
//primary key=identify 
{
       int id;
	   int noOfWorkers;
	   String[] brands={"puma","nike","sparx","bata","liberty"};
	   String location;
	   
	   public ShoeShowroom(int noId,int workers,String[] nameOfBrand,String place){
		   id=noId;
noOfWorkers=workers;
brands=nameOfBrand;
location=place;		
System.out.println("Cloth ID : "+id +"\n"+"Number of Workers : "+noOfWorkers +" \n"+"showroom Location : "+location);   
	/*	System.out.println("ShoeShowroom object is created");
		System.out.println("ShoeShowroom id is "+id);
		System.out.println("ShoeShowroom noOfWorkers "+noOfWorkers);
		System.out.println("ShoeShowroom brands "+brands);
		System.out.println("ShoeShowroom location "+location);*/
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