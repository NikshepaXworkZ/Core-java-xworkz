class PostOfficeExecutor {

     public static void main(String args[]) {
	 
	 PostOffice postOffice=new PostOffice();
	 postOffice.setId(1123);
	 System.out.println("the postOffice id is "+postOffice.getId());
	 
	 postOffice.setName("indian post office");
	 System.out.println("the postOffice name is "+postOffice.getName());
	 
	 postOffice.setRecruitmentName("post man");
	 System.out.println("the postOffice recruitment is "+postOffice.getRecruitmentName());
	 
	 postOffice.setNoOfWorkers(26);
	 System.out.println("In the postOffice noOfWorkers are "+postOffice.getNoOfWorkers());
	 
	 postOffice.setOpeningTimeInam(10);
	 System.out.println("the postOffice Opening Time In am is "+postOffice.getOpeningTimeInam());
	 
	 postOffice.setManagerName("mahesh");
	 System.out.println("the postOffice manager name is "+postOffice.getManagerName());
	 
	 postOffice.setLocation("cpt");
	 System.out.println("the postOffice Location is "+postOffice.getLocation());
	 }
}