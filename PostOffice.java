public class PostOffice
{
   private int id;
   private String name;
   private String recruitmentName;
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
   public void setRecruitmentName(String recruitmentName){
	   this.recruitmentName=recruitmentName;
   }
   public String getRecruitmentName(){
	   return recruitmentName;
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
   