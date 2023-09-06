class PatientExecutor {

     public static void main(String patien[]) {
	 
	 Patient patient=new Patient();
	 patient.setId(1);
	 System.out.println("the patient id is "+patient.getId());
	 
	 patient.setName("Mr.Bean");
	 System.out.println("the patient name is "+patient.getName());
	 
	 patient.setHospitalName("KIMS");
	 System.out.println("the hospital name is "+patient.getHospitalName());
	 
	 patient.setConsultantDoctor("Surendra");
	 System.out.println("the patient consultant Doctor name is "+patient.getConsultantDoctor());
	 
	 patient.setDiseaseName("cancer");
	 System.out.println("the patient disease name is "+patient.getDiseaseName());
	 
	 patient.setWardNo(22);
	 System.out.println("the patient wardNo is "+patient.getWardNo());
	 
	 patient.setAdmittedDate("01-05-2023");
	 System.out.println("the patient admitted date is "+patient.getAdmittedDate());
	 
	 patient.setAttenderName("sushila");
	 System.out.println("the patient attender name is "+patient.getAttenderName());
	 
	 patient.setAddress("Bangalore");
	 System.out.println("the patient address is "+patient.getAddress());
	 
	 patient.setGender("male");
	 System.out.println("the patient gender is "+patient.getGender());
	 
	 }
}
	 
	 