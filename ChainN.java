class ChainN
 {
     int chainNId;
	 String type;
	 int weightInGrams;
	 int price;
	 String design;
	 String occasion;
	 
	 public ChainN(int id,String chainType,int wght,int cost,String dsgn,String occcsion){
		 chainNId=id;
		 type=chainType;
		 weightInGrams=wght;
		 price=cost;
		 design=dsgn;
		 occasion=occcsion;
		 System.out.println("The constructor chainN is created");
		 System.out.println("chainN id is "+chainNId);
		 System.out.println("chainN type is "+chainType);
		 System.out.println("chainN weight In Grams "+weightInGrams);
		 System.out.println("chainN price is "+price);
		 System.out.println("chainN design is "+design);
		 System.out.println("chainN occasion is "+occasion);
	 }
	public static void provideStyle()
	{
	System.out.println("providing attire to clothes");
	}


}