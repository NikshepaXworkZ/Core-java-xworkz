class PassportExecutor{

  public static void main (String pass[]) {
    Passport passport=new Passport();
    passport.passportOffice="BANGALORE";
	passport.givenName="Nikshepa";
    passport.email="nikshepas63@gmailcom";
	passport.surName="gowda";
	passport.dob="01-july-2001";
	passport.password="nik1285";
    passport.confirmPassword="nik1285";
	passport.verifyPassword(passport.password ,passport.confirmPassword);
	passport.lengthPassword(passport.password);
	System.out.println("**************************************************************************");
	
	Passport passport1=new Passport();
    passport1.passportOffice="Delhi";
	passport1.givenName="akshatha";
    passport1.email="akshatha3@gmailcom";
	passport1.surName="n s";
	passport1.dob="21-aug-2001";
	passport1.password="nsakshu1522222";
    passport1.confirmPassword="nsakshu1522222";
	passport1.verifyPassword(passport1.password ,passport1.confirmPassword);
	passport1.lengthPassword(passport1.password);
	System.out.println("**************************************************************************");
	
	Passport passport2=new Passport();
    passport2.passportOffice="Kolkatha";
	passport2.givenName="shwetha";
    passport2.email="shwetha163@gmailcom";
	passport2.surName="naik";
	passport2.dob="11-jun-2001";
	passport2.password="shw23";
    passport2.confirmPassword="shw23";
	passport2.verifyPassword(passport2.password ,passport2.confirmPassword);
	passport2.lengthPassword(passport2.password);
	System.out.println("**************************************************************************");
	
	Passport passport3=new Passport();
    passport3.passportOffice="Ramanagar";
	passport3.givenName="rani";
    passport3.email="rani123@gmailcom";
	passport3.surName="s";
	passport3.dob="02-mar-2001";
	passport3.password="rani@123456789066";
    passport3.confirmPassword="rani@123456789066";
	passport3.verifyPassword(passport3.password ,passport3.confirmPassword);
	passport3.lengthPassword(passport3.password);
	System.out.println("**************************************************************************");
	
	Passport passport4=new Passport();
    passport4.passportOffice="Mysore";
	passport4.givenName="Jashvith";
    passport4.email="jashvith263@gmailcom";
	passport4.surName="gowda";
	passport4.dob="28-apr-2008";
	passport4.password="jayu14";
    passport4.confirmPassword="nik1285";
	passport4.verifyPassword(passport4.password ,passport4.confirmPassword);
	passport4.lengthPassword(passport4.password);
	System.out.println("**************************************************************************");
}
}