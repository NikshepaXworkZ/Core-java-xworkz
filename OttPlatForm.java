class OttPlatform {
	String movieNames[]= new String[4];
	int index;
	
	//create /add/save
	public boolean addMovieName(String movieName) {
		System.out.println("Inside addMovieName()");
		boolean isAdded = false;
		if (movieName!= null) {
			System.out.println("validation is proper..proceed to add movie name");
			movieNames[index]=movieName;
			index++;
			isAdded =true ;
		}
		return isAdded;
	}
		public static void getMovieNames(){
			System.out.println("list of movieNames");
			for (int index=0;index<movieNames.length;index++)
			{
				System.out.println(movieNames[index]);
			}
}

}