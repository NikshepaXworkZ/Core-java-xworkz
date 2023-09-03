class Fastrack {
	
     int fastrackId;
	 String displayType;
	 int diaInmm;
	 int price;
	 String color;
	 String strap;
	 
	 public Fastrack(int id,String type,int dia,int cost,String colour,String strsps){
		fastrackId=id;
		displayType=type;
		diaInmm=dia;
		price=cost;
		color=colour;
		strap=strsps;
		
   		 System.out.println("Fastrack is created");
		 System.out.println("Fastrack id "+fastrackId);
		 System.out.println("Fastrack displayType is "+displayType);
		 System.out.println("Fastrack diaInmm "+dia);
		 System.out.println("Fastrack price is "+price);
		 System.out.println("Fastrack color is "+color);
		 System.out.println("Fastrack strap is "+strap);
	 } 
	
	public static void provideFashion() {
		System.out.println("providing time and it add a touch of style to any outfit");
	}


}