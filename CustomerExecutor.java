class CustomerExecutor  {
	
	
     public static void main(String cus[]) {
	 
	 Customer customer=new Customer();
	 //invoking setter for customerId variable
	 customer.setCustomerId(1);
	 System.out.println("the customer id is "+customer.getCustomerId());
	 
	 customer.setCustomerName("Nikshepa");
	 System.out.println("the customer name is "+customer.getCustomerName());
	 
	 customer.setAddress("channapatna");
	 System.out.println("customer address is "+customer.getAddress());
	 

	 customer.setPhoneNO(8217886263L);
	 System.out.println("the customer phone no is "+customer.getPhoneNo());
	 
	 customer.setEmail("nikshepas63@gmail.com");
	 System.out.println("the customer id is "+customer.getEmail());
	 
	 customer.setDob("01-07-2001");
	 System.out.println("the customer id is "+customer.getDob());
	 
	 customer.setGender("female");
	 System.out.println("the customer id is "+customer.getGender());
	 

 }
}

//patient-id name attender name disease name,ward no,admitted date,hospital name,patient address,gender,consultant doctor
//bank-name id  branch name no of workers
//railway station
//