class SensorExecutor{

    public static void main (String args[]){
	     
		 Sensors sensor1 = new Sensors();
		 sensor1.type = "Light Sensors" ;
         sensor1.mount = "Wall Mount" ;
	     sensor1.range = "3 to 80cms";
         sensor1.cost = 35000 ;
         sensor1.temp = "-40 to 80";
		 sensor1.details();
		 System.out.println("The type of sensor is : "+sensor1.type);
		 System.out.println("The mount type of sensor is : "+sensor1.mount);
		 System.out.println("The range of sensor is : "+sensor1.range);
		 System.out.println("The cost  of sensor is : "+sensor1.cost);
		 System.out.println("The temperature range of sensor is : "+sensor1.temp);
	     System.out.println("-------------------------------------------------\n");

		 
		 Sensors sensor2 = new Sensors();
		 sensor2.type = "Motion Sensors" ;
         sensor2.mount = "Floor Mount" ;
	     sensor2.range = "30 to 100cms";
         sensor2.cost = 84000 ;
         sensor2.temp = "-20 to 60";
		 System.out.println("The type of sensor is : "+sensor2.type);
		 System.out.println("The mount type of sensor is : "+sensor2.mount);
		 System.out.println("The range of sensor is : "+sensor2.range);
		 System.out.println("The cost  of sensor is : "+sensor2.cost);
		 System.out.println("The temperature range of sensor is : "+sensor2.temp);
		 System.out.println("-------------------------------------------------\n");
		 
		 Sensors sens2 = new Sensors();
		 sens2.type = "Light Sensors" ;
         sens2.mount = "Wall Mount" ;
	     sens2.range = "40 to 120cms";
         sens2.cost = 84000 ;
         sens2.temp = "-20 to 60";
		 System.out.println("The type of sensor is : "+sens2.type);
		 System.out.println("The mount type of sensor is : "+sens2.mount);
		 System.out.println("The range of sensor is : "+sens2.range);
		 System.out.println("The cost  of sensor is : "+sens2.cost);
		 System.out.println("The temperature range of sensor is : "+sens2.temp);
		 System.out.println("-------------------------------------------------\n");
		 
		 
		 
	}
}