class WashingMachine {
	
	 static boolean isConnected;
	 static int lowSpeed;
	 static int highSpeed=6;
	 static int currentSpeed;
	 
	   public static boolean on() {
       System.out.println("inside on");	 
	
        if(isConnected == false) {
	    isConnected = true ;
		System.out.println("the washing machine is turned onn,,,enjoy");
		} 
		else if(isConnected == true) {
	    isConnected = false ;
	    System.out.println("the washing machine is turned off");
		}
		System.out.println("end is on");
		return isConnected;
	 }
	 
	 
     public static void increaseSpeed() {
		 
      System.out.println("start of increase Speed"); 
        if ( isConnected == true) {
        if ( currentSpeed < highSpeed) {
        currentSpeed=currentSpeed +1;	
        System.out.println("the current Speed is "+currentSpeed); }
        else {System.out.println("high Speed is reached"); 
        }
        }else {System.out.println("first turn on the washing machine"); 
        }
        System.out.println("end of increase Speed"); 
    }	
	
        public static void decreaseSpeed() {
			
        System.out.println("start of decrease Speed"); 
		
        if ( isConnected == true) {
        if ( currentSpeed > lowSpeed) {
        currentSpeed=currentSpeed -1;	
        System.out.println("the current Speed is "+currentSpeed); }
        else { System.out.println("low Speed is reached"); 
        }
        }else {System.out.println("first turn on the washing machine"); 
        }
		System.out.println("end of decrease Speed"); 
     }
}