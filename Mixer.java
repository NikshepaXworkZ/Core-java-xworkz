class Mixer {
	
	 static boolean isConnected;
	 static int minStir;
	 static int maxStir=3;
	 static int currentStir;
	 
	  public static boolean on() {
    
	 System.out.println("inside on");	 
	
        if(isConnected == false) {
	    isConnected = true ;
		System.out.println("the mixer is turned onn,,,enjoy");
		} 
		else if(isConnected == true) {
	    isConnected = false ;
		System.out.println("the mixer is turned off");
		}
		System.out.println("end is on");
	    return isConnected;
	 }
       
	   public static void increaseStir() {
   
     System.out.println("start of increase Stir speed"); 
    
	  if ( isConnected == true) {
      if ( currentStir < maxStir) {
      currentStir=currentStir +1;	
      System.out.println("the current Stir speed is "+currentStir); }
      else {System.out.println("maximum Stir speed is reached"); 
      }
      }else {System.out.println("first turn on the mixer"); 
      }
      System.out.println("end of increase Stir speed"); 
   }	
	
	
         public static void decreaseStir() {
      
	  System.out.println("start of decrease Stir speed"); 
 
        if ( isConnected == true) {
        if ( currentStir > minStir) {
        currentStir=currentStir -1;	
        System.out.println("the current Stir speed is "+currentStir); }
        else {System.out.println("minimum Stir speed is reached"); 
        }
        }else {System.out.println("first turn on the mixer"); 
        }
		System.out.println("end of decrease Stir speed"); 
        }
}
