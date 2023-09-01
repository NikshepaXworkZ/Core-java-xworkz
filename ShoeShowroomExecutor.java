class ShoeShowroomExecutor {
    public static void main(String clothing[]) {
		String[] brands={"puma","nike","sparx","bata","liberty"};
//classname          refe= new cls(arguments);
    ShoeShowroom showroom=new ShoeShowroom();
	showroom.id=1;
    showroom.noOfWorkers=5;
	showroom.brands=brands;
	showroom.location="Channapatna";
	showroom.sellingShoes();
	System.out.println(showroom.id+"   "+showroom.noOfWorkers+"    "+showroom.location);
    System.out.println("the list of shoe brands available in showroom are:");
    showroom.getAllBrands(showroom.brands);
	
    }
}