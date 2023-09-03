class Sensor{
	
	 int sensorId;
	 String sensorType;
	 String battery;
	 int productPrice;
	 String brand;
	 int dimensionInmm;
	 
	 public Sensor(int id,String type,String typeBattery,int price,String brnd,int dim){
		 sensorId=id;
	     sensorType=type;
		 battery=typeBattery;
		 productPrice=price;
		 brand=brnd;
		 dimensionInmm=dim;
		 System.out.println("sensor Obejct Created");
		 System.out.println("sensorId "+sensorId);
		 System.out.println("sensor sensorType "+sensorType);
	System.out.println("sensor battery "+battery);
	System.out.println("sensor productPrice "+productPrice);
	System.out.println("sensor brand "+brand);
	System.out.println("sensor dimensionInmm "+dimensionInmm);
	 }
	 
	public static void provideDetection() {
		System.out.println("it senses or detects a physcical phenomenon");
	}
}