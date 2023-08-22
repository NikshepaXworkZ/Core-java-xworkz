class Modulus {
 public static void main (String[] args ) {
		   System.out.println("main started");
            System.out.println(mod(22,58,54,62,12));
            System.out.println(mod(128,78,321,58,21));
			System.out.println(mod(22,588,45,65,250));
			System.out.println(mod(554,55,25,52,52));
			System.out.println(mod(2231,252,76,26,28));
			System.out.println(mod(45,32,98,872,92));
			System.out.println(mod(897,457,83,5554,542));
			System.out.println(mod(65,889,55,55,84));
			System.out.println(mod(45,52,875,521,63));
			System.out.println(mod(78,85,821,778,862));
			System.out.println(mod(52,12,809,631,584));
			System.out.println(mod(656,321,7845,525,85));
			System.out.println(mod(789,654,8712,12,23));
			System.out.println(mod(23,17,851,54,30));
			System.out.println(mod(45,21,837,3873,938));
			System.out.println(mod(784,855,93,938,938));
			System.out.println(mod(562,44,937,48,894));
			System.out.println(mod(7852,6321,588,452,12));
			System.out.println(mod(551,489,123,456,123));
			System.out.println(mod(22,33,78,56,23));
 }
 public static int mod(int a, int b, int c,int d,int e){
	//  System.out.println((a+b)-c/(d*e));
	int f=(a+b)-c/(d*e);
	return c;
 }
}