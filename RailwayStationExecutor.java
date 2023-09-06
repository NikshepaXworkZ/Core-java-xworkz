class RailwayStationExecutor {

     public static void main(String args[]) {
	 
	 RailwayStation railwayStation=new RailwayStation();
	 railwayStation.setId(1);
	 System.out.println("the railwayStation id is "+railwayStation.getId());
	 
	 railwayStation.setName("kranthiveera sangooli rayanna");
	 System.out.println("the railwayStation name is "+railwayStation.getName());
	 
	 railwayStation.setTtName("suresh");
	 System.out.println("the railwayStation Name is "+railwayStation.getTtName());
	 
	 railwayStation.setNoOfWorkers(46);
	 System.out.println("In the railwayStation noOfWorkers are "+railwayStation.getNoOfWorkers());
	 
	 railwayStation.setOpeningTimeInam(6);
	 System.out.println("the railwayStation Opening Time In am is "+railwayStation.getOpeningTimeInam());
	 
	 railwayStation.setManagerName("mahesh");
	 System.out.println("the railwayStation manager name is "+railwayStation.getManagerName());
	 
	 railwayStation.setLocation("Majestic");
	 System.out.println("the railwayStation Locatiom is "+railwayStation.getLocation());
	 }
}