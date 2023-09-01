class Apartment {

	int apartmentId;
    String apartmentName;
    String location;
    int noOfFloors;
    int noOfTwoBhkFlats;
    int noOfThreeBhkFlats;
	
    public Apartment(int apartId,String apartName,String area,int floors,int twobhks,int threebhks){
		apartmentId=apartId;
		apartmentName=apartName;
		location=area;
		noOfFloors=floors;
		noOfTwoBhkFlats=twobhks;
		noOfThreeBhkFlats=threebhks;
        System.out.println("Apartment Obejct Created");
		System.out.println("Apartment Id = " + apartmentId);
        System.out.println("Apartment Name = " + apartmentName);
        System.out.println("Apartment is in the  = " + location);
        System.out.println("No of Floors in the apartment = " +noOfFloors);
        System.out.println("Number of Two BHK Flats = " +noOfTwoBhkFlats);
        System.out.println("Number of Three BHK Flats = " +noOfThreeBhkFlats);
    }
	public static void provideAccomadation() {
		System.out.println("providing large space for accomadation");
	}


}
//2 types of over loading
//1.method over loading
//2.comstructor over loading