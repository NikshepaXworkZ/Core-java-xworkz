class EatsureExecutor
{
 public static void main (String args[] ) {
		   System.out.println("main started");
		    double price= Eatsure.search("kulcha");
			System.out.println("kulcha price is" +price);
			
			double pricewithquantity= Eatsure.search("kulcha",7);
			System.out.println("kulcha price is" +pricewithquantity);
			   System.out.println("main ended");
 }
}