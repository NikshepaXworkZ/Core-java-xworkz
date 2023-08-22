class SwiggyN {

 public static double search (String foodName ) {
   double price =0.0;
		   System.out.println("invoked search: foodName (String)");
		   if (foodName == "masala dosa ") {
			   price=60.00; 
		   }
              // return price;}
               if (foodName == "idli") {
			    price=35.00;
                 //return price;
				 }
				 if (foodName == "set dosa") {
			   price=65.00;
                return price;}
				 if (foodName == "onion dosa") {
			    price=245.00;
                return price;}
				if (foodName == "kaali dosa") {
			    price=30.00;
                return price;}
				 if (foodName == "butter dosa") {
			   price=70.00;
               return price;}
               if (foodName == "plain dosa") {
			    price=30.00;
                 return price;}
				 if (foodName == "rave idli") {
			   price=45.00;
                return price;}
				 if (foodName == "palav") {
			    price=50.00;
                return price;}
				if (foodName == "vegetable palav") {
			    price=160.20;
                return price;}
				 if (foodName == "tomato palav") {
			   price=150.00;
               return price;}
               if (foodName == "curd rice") {
			    price=90.00;
                 return price;}
				 if (foodName == "lemon rice") {
			   price=60.00;
                return price;}
				 if (foodName == "pulliogre") {
			    price=50.00;
                return price;}
				if (foodName == "kabab") {
			    price=200.00;
                return price;}
				 if (foodName == "chow chow bath") {
			   price=160.00;
               return price;}
               if (foodName == "nir dhose") {
			    price=90.00;
                 return price;}
				 if (foodName == "bisibelebath") {
			   price=60.00;
                return price;}
				 if (foodName == "chicken masala") {
			    price=260.00;
                return price;}
				if (foodName == "shawarma") {
			    price=180.00;
                return price;}
				 if (foodName == "ragi ball") {
			   price=40.00;
               return price;}
               if (foodName == "buttermilk") {
			    price=90.60;
                 return price;}
				 if (foodName == "biryani rice") {
			   price=45.00;
                return price;}
				 if (foodName == "moongdal") {
			    price=80.00;
                return price;}
				if (foodName == "ghee rice") {
			    price=90.00;
                return price;}
				 if (foodName == "egg palav") {
			   price=160.00;
               return price;}
               if (foodName == "omlet") {
			    price=30.00;
                 return price;}
				 if (foodName == "double omlet") {
			   price=60.00;
                return price;}
				 if (foodName == "bevarages") {
			    price=260.00;
                return price;}
				if (foodName == "lemon juice") {
			    price=35.00;
                return price;}
				 if (foodName == "pineapple juice") {
			   price=80.00;
               return price;}
               if (foodName == "apple juice") {
			    price=80.00;
                 return price;}
				 if (foodName == "watermelon juice") {
			   price=60.20;
                return price;}
				 if (foodName == "chickoo juice") {
			    price=45.00;
                return price;}
				if (foodName == "Hyderbadi masala") {
			    price=260.00;
                return price;}
				 if (foodName == "rasgoola") {
			   price=150.00;
               return price;}
               if (foodName == "pani puri") {
			    price=30.00;
                 return price;}
				 if (foodName == "sev puri") {
			   price=35.00;
                return price;}
				 if (foodName == "masala puri") {
			    price=30.00;
                return price;}
				if (foodName == "dahi puri") {
			    price=45.00;
                return price;}
				
				 if (foodName == "groundnut masala") {
			   price=35.00;
               return price;}
               if (foodName == "nippat masala") {
			    price=35.00;
                 return price;}
				 if (foodName == "cucumber masala") {
			   price=35.00;
                return price;}
				 if (foodName == "soampapudi") {
			    price=260.00;
                return price;}
				if (foodName == "peda") {
			    price=220.00;
                return price;}
				 if (foodName == "gobi manchuri") {
			   price=70.00;
               return price;}
               if (foodName == "paneer manchuri") {
			    price=150.00;
                 return price;}
				 if (foodName == "vada pav") {
			   price=60.00;
                return price;}
				 if (foodName == "pav bhaji") {
			    price=80.00;
                return price;}
				if (foodName == "chicken manchuri") {
			    price=220.00;
                return price;}
				System.out.println("end of search with 1 parameter");
				return price;
}
public static double search (String foodName, int quantity ) {
   double price =0.0;
		   System.out.println("invoked search: foodName (String),quantity(int)");
		   if (foodName == "masala dosa ") {
			   price=60.00*quantity; 
		   }
              // return price;}
               if (foodName == "idli") {
			    price=35.00*quantity;
                 //return price;
				 }
				 if (foodName == "set dosa") {
			   price=65.00*quantity;
                return price;}
				 if (foodName == "onion dosa") {
			    price=245.00*quantity;
                return price;}
				if (foodName == "kaali dosa") {
			    price=30.00*quantity;
                return price;}
				 if (foodName == "butter dosa") {
			   price=70.00*quantity;
               return price;}
               if (foodName == "plain dosa") {
			    price=30.00*quantity;
                 return price;}
				 if (foodName == "rave idli") {
			   price=45.00*quantity;
                return price;}
				 if (foodName == "palav") {
			    price=50.00*quantity;
                return price;}
				if (foodName == "vegetable palav") {
			    price=160.20*quantity;
                return price;}
				 if (foodName == "tomato palav") {
			   price=150.00*quantity;
               return price;}
               if (foodName == "curd rice") {
			    price=90.00*quantity;
                 return price;}
				 if (foodName == "lemon rice") {
			   price=60.00*quantity;
                return price;}
				 if (foodName == "pulliogre") {
			    price=50.00*quantity;
                return price;}
				if (foodName == "kabab") {
			    price=200.00*quantity;
                return price;}
				 if (foodName == "chow chow bath") {
			   price=160.00*quantity;
               return price;}
               if (foodName == "nir dhose") {
			    price=90.00*quantity;
                 return price;}
				 if (foodName == "bisibelebath") {
			   price=60.00*quantity;
                return price;}
				 if (foodName == "chicken masala") {
			    price=260.00*quantity;
                return price;}
				if (foodName == "shawarma") {
			    price=180.00*quantity;
                return price;}
				 if (foodName == "ragi ball") {
			   price=40.00*quantity;
               return price;}
               if (foodName == "buttermilk") {
			    price=90.60*quantity;
                 return price;}
				 if (foodName == "biryani rice") {
			   price=45.00*quantity;
                return price;}
				 if (foodName == "moongdal") {
			    price=80.00*quantity;
                return price;}
				if (foodName == "ghee rice") {
			    price=90.00*quantity;
                return price;}
				 if (foodName == "egg palav") {
			   price=160.00*quantity;
               return price;}
               if (foodName == "omlet") {
			    price=30.00*quantity;
                 return price;}
				 if (foodName == "double omlet") {
			   price=60.00*quantity;
                return price;}
				 if (foodName == "bevarages") {
			    price=260.00*quantity;
                return price;}
				if (foodName == "lemon juice") {
			    price=35.00*quantity;
                return price;}
				 if (foodName == "pineapple juice") {
			   price=80.00*quantity;
               return price;}
               if (foodName == "apple juice") {
			    price=80.00*quantity;
                 return price;}
				 if (foodName == "watermelon juice") {
			   price=60.20*quantity;
                return price;}
				 if (foodName == "chickoo juice") {
			    price=45.00*quantity;
                return price;}
				if (foodName == "Hyderbadi masala") {
			    price=260.00*quantity;
                return price;}
				 if (foodName == "rasgoola") {
			   price=150.00*quantity;
               return price;}
               if (foodName == "pani puri") {
			    price=30.00*quantity;
                 return price;}
				 if (foodName == "sev puri") {
			   price=35.00*quantity;
                return price;}
				 if (foodName == "masala puri") {
			    price=30.00*quantity;
                return price;}
				if (foodName == "dahi puri") {
			    price=45.00*quantity;
                return price;}
				
				 if (foodName == "groundnut masala") {
			   price=35.00*quantity;
               return price;}
               if (foodName == "nippat masala") {
			    price=35.00*quantity;
                 return price;}
				 if (foodName == "cucumber masala") {
			   price=35.00*quantity;
                return price;}
				 if (foodName == "soampapudi") {
			    price=260.00*quantity;
                return price;}
				if (foodName == "peda") {
			    price=220.00*quantity;
                return price;}
				 if (foodName == "gobi manchuri") {
			   price=70.00*quantity;
               return price;}
               if (foodName == "paneer manchuri") {
			    price=150.00*quantity;
                 return price;}
				 if (foodName == "vada pav") {
			   price=60.00*quantity;
                return price;}
				 if (foodName == "pav bhaji") {
			    price=80.00*quantity;
                return price;}
				if (foodName == "chicken manchuri") {
			    price=220.00*quantity;
                return price;}
				System.out.println("end of search with 2 parameter");
				return price;
}
}
///