class Netflix {
	static String englishMovies [] = {"Avengers-end game","scream6","titanic","open heimer","fast series","spider man","mission impossible","avathar","lion king","after we collide"}; 
	public static void main (String[] film) 
	 {
		 System.out.println("main started");
	  System.out.println(englishMovies.length);
	//for                  expression
	//                   0<12
	for ( int englishMoviesindex=11 ; englishMoviesindex >=englishMovies.length ; englishMoviesindex-- ) {
	System.out.println(englishMovies[englishMoviesindex]);
	}
	 System.out.println("main ended");
	 }
	
}
//sequential order -array
//for lrngth = .length
//length cannot be provided for normal variable
//index= where data is added [0] or position
//index=length-1
//for loop-
//relational operator=<> true or false condition