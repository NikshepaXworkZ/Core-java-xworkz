public class RailwayStation
{
   private int id;
   private String name;
   private String ttName;
   private int noOfWorkers;
   private int openingTimeInam;
   private String managerName;
   private String location;
   
   public void setId(int id){
	   this.id=id;
   }
   public int getId(){
	   return id;
   }
   public void setName(String name){
	   this.name=name;
   }
   public String getName(){
	   return name;
   }
   public void setTtName(String ttName){
	   this.ttName=ttName;
   }
   public String getTtName(){
	   return ttName;
   }

   public void setNoOfWorkers(int noOfWorkers){
	   this.noOfWorkers=noOfWorkers;
   }
   public int getNoOfWorkers(){
	   return noOfWorkers;
   }
   
   public void setOpeningTimeInam(int openingTimeInam){
	   this.openingTimeInam=openingTimeInam;
   }
   public int getOpeningTimeInam(){
	   return openingTimeInam;
   }
   public void setManagerName(String managerName){
	   this.managerName=managerName;
   }
   public String getManagerName(){
	   return managerName;
   }
   public void setLocation(String location){
	   this.location=location;
   }
   public String getLocation(){
	   return location;
   }

}
   