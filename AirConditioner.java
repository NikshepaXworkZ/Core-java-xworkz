class AirConditioner {
	static boolean isConnected;
	static int minTemp;
	static int maxTemp=5;
	static int currentTemp;
	public static boolean on() {
		System.out.println("inside on");	 
	     
		  if(isConnected == false) {
	         isConnected = true ;
			 System.out.println("the ac is turned onn,,,enjoy");
			} 
			else if(isConnected == true) {
	        isConnected = false ;
			System.out.println("the ac is turned off");
			}
			System.out.println("end is on");
			return isConnected;
	    }
		
    
      public static void increaseTemp() {
      
	  System.out.println("start of increase temperature"); 
      if ( isConnected == true) {
      if ( currentTemp < maxTemp) {
      currentTemp=currentTemp +1;	
      System.out.println("the current temperature is "+currentTemp); }
      else {System.out.println("maximum temperature is reached"); 
      }
      }else {System.out.println("first turn on the air conditioner"); 
      }
      System.out.println("end of increase temperature"); 
      }	
	
	
      public static void decreaseTemp() {
      System.out.println("start of decreased temperature"); 
      if ( isConnected == true) {
      if ( currentTemp > minTemp) {
      currentTemp=currentTemp -1;	
      System.out.println("the current temperature is "+currentTemp); }
      else {System.out.println("minimum temperature is reached"); 
       }
      }else {System.out.println("first turn on the ac"); 
      }
      System.out.println("end of decreased temperature"); 
      }
}