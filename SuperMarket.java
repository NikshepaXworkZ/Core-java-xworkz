class SuperMarket {
	 static String chocalates[] ={"dairy milk","milky bar","perk","5 star","munch","dark chocalate","candyman","kitkate","ferror rocher","melody","sneakers","kinder","coffee bite","bounty","hersheys"};
	 static String biscuits[] ={"mari gold","50-50","chaska maska","oreo","bourbon","good day","britannia","parle g","patanjali","sunfeast ","chocalate cram biscuit","fab","momos magic","hifi","lemon puff"};
	 static String perfumes[] ={"fog","black opium","miss dior","secret","nike","yardley","engage","denver","vanderbilt","rahil","angelo","born wild","gucci","mixed emotions","versace"};
	 static String fruits[] ={"apple","mango","orange","grapes","kivi","jackfruit","pineapple","papaya","gooseberry","cherry","strawberry","pomegranate","coconut","pear","banana"};
	 static String vegetables[] ={"tomato","onion","spinach","carrot","beetroot","beans","potato","radish","lady's finger","peas","broccoli","pumpkin","mushroom","capsicum","drumstick"};
	 static String snacks[] ={"lays","kurkure","cake","bread","popcorn","candies","brownies","puffcorn","crackers","namkeen","mixture","moongdal","corn snacks","gems","orbit"};
	 static String groceries[] ={"rice","wheat flour","ragi flour","egg","pasta","maggie","yipee","corn flour","pepper powder","chilli powder","chicken masala","mutton masala","meat","butter","cooking oil"};
	 static String iceCream[] ={"black current","venilla","cookie n cream","mint chocalate chip","buttered pecan","cookie dough","neapolitan","pistachio","rocky load","butter pecan","coffee pudge","pranline and cream","salted caramel","almond ","sundae"};
	 static String softDrinks[] ={"pepsi ","coke","merinda","fanta","sprite","7up","artos","soda","power drink","sunkist","maaza","limda","frooti","slice","tizer"};
	 static String soaps[] ={"santoor","pears","arasan","rin","vim","dove","lux","dettol","lifebuoy","himalaya","medimix","cinthol","mysore sandal","hamam","nivea"};
	 public static void main (String args[]) {
		 getChocalates();
		 System.out.println("-------------------------------------------------------");
		 getReversedChocalates();
		 System.out.println("------------------------------------------------------------------------------------------------------------------------");
		 getBiscuits();
		 System.out.println("*******************************************************");
		 getReversedBiscuits();
		 System.out.println("************************************************************************************************************************");
		 getPerfumes();
		 System.out.println("______________________________________________________");
		 getReversedPerfumes();
		 System.out.println("________________________________________________________________________________________________________________________");
		 getFruits();
		 System.out.println(".....................................................");
		 getReversedFruits();
		 System.out.println("........................................................................................................................");
		 getVegetables();
		 System.out.println("======================================================");
		 getReversedVegetables();
		 System.out.println("========================================================================================================================");
		 getSnacks();
		 System.out.println("------------------------------------------------------");
		 getReversedSnacks();
		 System.out.println("------------------------------------------------------------------------------------------------------------------------");
		 getGroceries();
		 System.out.println("*******************************************************");
		 getReversedGroceries();
		 System.out.println("************************************************************************************************************************");
		 getIceCream();
		 System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
		 getReversedIceCream();
		 System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
		 getSoftDrinks();
		 System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		 getReversedSoftDrinks();
		 System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		 getSoaps();
		 System.out.println(".............................................");
		 getReversedSoaps();
		 System.out.println(".........................................................................................................................");
		 
	 }
public static void getChocalates() {
	 System.out.println(chocalates.length);
	 System.out.println("the available chocalates are");
 for (int nik=0; nik<chocalates.length ; nik++) {
	 System.out.println(chocalates[nik]) ; 
	 }
}
public static void getReversedChocalates() {
	 System.out.println("the reversible chocalates list is");
 for (int nik=chocalates.length-1 ; nik>=0 ; nik--) {
	  System.out.println(chocalates[nik]);
	  }
}
	 
public static void getBiscuits() {
	 System.out.println(biscuits.length);
	 System.out.println("the available biscuits are");
 for (int doll=0; doll<biscuits.length ; doll++) {
      System.out.println(biscuits[doll]) ;
	  }
}
public static void getReversedBiscuits() {
	 System.out.println("the reversible biscuits list is");
 for (int doll=biscuits.length-1 ; doll>=0 ; doll--) {
	 System.out.println(biscuits[doll]);
	 }
}
	 
public static void getPerfumes() {
	 System.out.println(perfumes.length);
	 System.out.println("the available perfumes are");
 for (int swag=0; swag<perfumes.length ; swag++) {
	 System.out.println(perfumes[swag]) ;
	 }
}
public static void getReversedPerfumes() {
	 System.out.println("the reversible perfumes list is");
 for (int swag=perfumes.length-1 ; swag>=0 ; swag--) {
	 System.out.println(perfumes[swag]);
	 }
}
	 
public static void getFruits() {
	 System.out.println(fruits.length);
	 System.out.println("the available fruits are");
 for (int clg=0; clg<fruits.length ; clg++) {
	 System.out.println(fruits[clg]) ;
	 }
}
public static void getReversedFruits() {
	 System.out.println("the reversible fruits list is");
 for (int clg=fruits.length-1 ; clg>=0 ; clg--) {
	 System.out.println(fruits[clg]); 
	 }
}
	 
public static void getVegetables() {
	 System.out.println(vegetables.length);
	 System.out.println("the available vegetables are");
 for (int jay=0; jay<vegetables.length ; jay++) {
	 System.out.println(vegetables[jay]) ;
	 }
}
public static void getReversedVegetables() {
	 System.out.println("the reversible vegetables list is");
 for (int jay=vegetables.length-1 ; jay>=0 ; jay--) {
	 System.out.println(vegetables[jay]);
	 }
}
	 
public static void getSnacks() {
	 System.out.println(snacks.length);
	 System.out.println("the available snacks are");
 for (int maa=0; maa<snacks.length ; maa++) {
	 System.out.println(snacks[maa]) ; 
	 }
}
public static void getReversedSnacks() {
	 System.out.println("the reversible snacks list is");
 for (int maa=snacks.length-1 ; maa>=0 ; maa--) {
	 System.out.println(snacks[maa]);
	 }
}
	 
public static void getGroceries() {
	 System.out.println(groceries.length);
	 System.out.println("     the available grocieries are   ");
 for (int pink=0; pink<groceries.length ; pink++) {
	 System.out.println(groceries[pink]) ;
	 }
}
public static void getReversedGroceries() {
	 System.out.println("the reversible groceries list is");
 for (int pink=groceries.length-1 ; pink>=0 ; pink--) {
	 System.out.println(groceries[pink]);
	 }
}
	 
public static void getIceCream() {
	 System.out.println(iceCream.length);
	 System.out.println("the available iceCream are");
 for (int lap=0; lap<iceCream.length ; lap++) {
	 System.out.println(iceCream[lap]) ;
	 }
}
public static void getReversedIceCream() {
	 System.out.println("the reversible iceCream list is");
 for (int lap=iceCream.length-1 ; lap>=0 ; lap--) {
	 System.out.println(iceCream[lap]); 
	 }
}
	 
public static void getSoftDrinks() {
     System.out.println(softDrinks.length);
	 System.out.println("the available softDrinks are");
 for (int cls=0; cls<softDrinks.length ; cls++) {
	 System.out.println(softDrinks[cls]) ;
	 }
}
public static void getReversedSoftDrinks() {
	 System.out.println("the reversible softDrinks list is");
 for (int cls=softDrinks.length-1 ; cls>=0 ; cls--) {
	 System.out.println(softDrinks[cls]);
	 }
}
	 
public static void getSoaps() {
	 System.out.println(soaps.length);
	 System.out.println("the available soaps are");
 for (int song=0; song<soaps.length ; song++) {
	 System.out.println(soaps[song]) ;
	 }
}
public static void getReversedSoaps() {
	 System.out.println("the reversible soaps list is");
for (int song=soaps.length-1 ; song>=0 ; song--) {
	 System.out.println(soaps[song]);
	 }
}
}


/*soaps,perfumes,fruits begetables snacks grocceries ice cream biscuiy soft drinks
getChocalates();
mian= to invoke method*/	 
