class Chatshop{
	String chatNames[]=new String[10];
	int items;
	
	public boolean addChats(String chatName){
		System.out.println("Inside AddChats()");
		boolean isAdded=false;//initializing 
		
		if(chatName!=null){
			System.out.println("validation is proper..proceed to add the Chats");
			chatNames[items]=chatName;
			items++;
			isAdded=true;
			
			System.out.println(chatName+" is Added Successfully");
		}
			System.out.println("End of Add Chats");
		return isAdded;
	}
	
	
	public void getChats(){
		System.out.println("The Chats names are : ");
		for(int index=0;index<chatNames.length;index++){
			System.out.println(chatNames[index]);
		}
	}
}