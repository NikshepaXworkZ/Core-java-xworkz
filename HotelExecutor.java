class HotelExecutor{
	public static void main(String hotelsMenu[]){
		Hotel hotel =new Hotel();
		hotel.addMenu("Dose");
		hotel.addMenu("Butter Dose");
		hotel.addMenu("Masal DOse");
		hotel.addMenu("Set Dose");
		hotel.addMenu("Onion Dose");
		hotel.addMenu("Paper Dose");
		hotel.addMenu("Egg Dose");
		hotel.addMenu("Chicken Dose");
		hotel.addMenu("Mutton Dose");
		hotel.addMenu("Fish Dose");
		
		hotel.getFoodMenu();
	}
}