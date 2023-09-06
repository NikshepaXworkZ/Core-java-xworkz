class BusStandExecutor {

     public static void main(String args[]) {
	 
	 BusStand busStand=new BusStand();
	 busStand.setId(1);
	 System.out.println("the busStand id is "+busStand.getId());
	 
	 busStand.setName("kranthiveera sangooli rayanna");
	 System.out.println("the busStand name is "+busStand.getName());
	 
	 busStand.setTtName("suresh");
	 System.out.println("the busStand Name is "+busStand.getTtName());
	 
	 busStand.setNoOfWorkers(46);
	 System.out.println("In the busStand noOfWorkers are "+busStand.getNoOfWorkers());
	 
	 busStand.setOpeningTimeInam(6);
	 System.out.println("the busStand Opening Time In am is "+busStand.getOpeningTimeInam());
	 
	 busStand.setManagerName("mahesh");
	 System.out.println("the busStand manager name is "+busStand.getManagerName());
	 
	 busStand.setLocation("Majestic");
	 System.out.println("the busStand Location is "+busStand.getLocation());
	 }
}