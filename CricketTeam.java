class CricketTeam{
	String playerNames[]=new String[11];
	int index;
	
	public boolean addPlayer(String playerName){
					System.out.println("Inside AddPlayer()");
		boolean isAdded=false;
		if(playerName!=null){
			System.out.println("validation is proper..proceed to add the Players");
			playerNames[index]=playerName;
			index++;
			isAdded=true;
			
						System.out.println(playerName+" is Added Successfully");
			
		}
		System.out.println("End of Add Player");
		return isAdded;
		
	}
	
	public void getPlayerNames(){
		System.out.println("The Cricket Player Names are :");
		for(int index=0;index<playerNames.length;index++){
			System.out.println(playerNames[index]);
		}
	}

}