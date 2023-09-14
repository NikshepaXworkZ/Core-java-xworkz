class Spotify{
	String songsName[]=new String[11];
	int index;
	
	public boolean addSongs(String songName){
		System.out.println("Inside Add Songs()");
		boolean isAdded=false;
		if(songName!=null){
			System.out.println("validation is proper..proceed to add the Song Names");
			songsName[index]=songName;
			index++;
			isAdded=true;
			
			System.out.println(songName+" is Added Successfully");
		}
		System.out.println("End of Add Songs");
		return isAdded;
	}
	
	public void getSongNames(){
		System.out.println("The List of Song Names : ");
		for(int index=0;index<songsName.length;index++){
			System.out.println(songsName[index]);
		}
	}
}