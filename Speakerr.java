class Speakerr {
	 static boolean isConnected;
	 static int minVolume;
	 static int maxVolume=15;
	 static int currentVolume;
	 
	  public static boolean on() {
		  
      System.out.println("inside on");	 
	
            if(isConnected == false) {
	          isConnected = true ;
			System.out.println("the speaker is turned onn,,,enjoy");
			} 
			else if(isConnected == true) {
	        isConnected = false ;
			System.out.println("the speaker is turned off");
			}
			System.out.println("end is on");
			return isConnected;
	   }
	   
	   
          public static void increaseVolume() {
			  
          System.out.println("start of increase volume"); 
		  
         if ( isConnected == true) {
         if ( currentVolume < maxVolume) {
         currentVolume=currentVolume +1;	
         System.out.println("the current Volume is "+currentVolume); }
         else {System.out.println("maximum volume is reached"); 
         }
         }else {System.out.println("first turn on the iron box"); 
         }
         System.out.println("end of increase volume"); 
         }	
	
       public static void decreaseVolume() {
		   
        System.out.println("start of decrease Volume"); 
		
        if ( isConnected == true) {
        if ( currentVolume > minVolume) {
        currentVolume=currentVolume -1;	
        System.out.println("the currentVolume is "+currentVolume); }
        else {System.out.println("minimum Volume is reached"); 
        }
        }else {System.out.println("first turn on the speaker"); 
        }
        System.out.println("end of decrease Volume"); 
     }
 }