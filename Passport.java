class Passport{
          String passportOffice;
		  String givenName;
		  String surName;
          String dob;
		  String email;
		  String password;
		  String confirmPassword;
		  
				 
	public boolean verifyPassword(String password,String confirmPassword){
		System.out.println("inside verifyPassword");
		boolean isPasswordVerified = false ;
		if(password == confirmPassword) {
			System.out.println("password is verified.....the given details are;");
			isPasswordVerified=true;
			//displayUserDetails();
			} 
			else {
				System.out.println("please enter vallid password");
			}
			return isPasswordVerified;
	}	
    
	public boolean lengthPassword(String password){
	System.out.println("inside verifyPassword");
	boolean isPasswordVerified=false;
	
	if (password.length()>6 && password.length()<=16){
		System.out.println("password length is with in the range");
	  isPasswordVerified=true;
	    displayUsersDeatails();
	}
	else{
		System.out.println("please enter the valid password with in range");
	}
	return isPasswordVerified;	
	}
		public void displayUsersDeatails(){
			System.out.println("the password office is "+passportOffice);
			System.out.println("the password  name is "+givenName);
			System.out.println("the password surName "+surName);
			System.out.println("the password  dob "+dob);
			System.out.println("the password email "+email);
			System.out.println("the password password "+password);
	    }
	}
