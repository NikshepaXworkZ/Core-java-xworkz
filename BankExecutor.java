class BankExecutor {

     public static void main(String patien[]) {
	 
	 Bank bank=new Bank();
	 bank.setId(1);
	 System.out.println("the bank id is "+bank.getId());
	 
	 bank.setName("SBI");
	 System.out.println("the bank name is "+bank.getName());
	 
	 bank.setBranchName("guhwatti");
	 System.out.println("the bank branch Name is "+bank.getBranchName());
	 
	 bank.setNoOfWorkers(36);
	 System.out.println("In the bank noOfWorkers are "+bank.getNoOfWorkers());
	 
	 bank.setOpeningTimeInam(6);
	 System.out.println("the bank Opening Time In am is "+bank.getOpeningTimeInam());
	 
	 bank.setManagerName("mahesh");
	 System.out.println("the bank manager name is "+bank.getManagerName());
	 
	 bank.setLocation("assam");
	 System.out.println("the bank Locatiom is "+bank.getLocation());
	 }
}