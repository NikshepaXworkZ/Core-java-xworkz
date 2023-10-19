package com.xworkz.policestation.policestation;

import com.xworkz.policestation.officers.Officer;
import java.util.Arrays;

public class PoliceStation {
    Officer officer[];
    public PoliceStation(int size){
         officer=new Officer[size];
    }

    int index;
    int id=1;
    public boolean addOfficers(Officer officer){
        System.out.println("invoke addOfficers");
        boolean isAdded = false;
        if(officer != null){
            //setter method has to be added
       /*     public int setId(int idNo){
                int idNo;
                for(int index=0;index<idNo.length;index++) {

                }

            }*/
            officer.setOfficerId(id++);
            this.officer[index++] = officer;
            isAdded = true;
        }
        return isAdded ;
    }
    public void getAllOfficer(){
        System.out.println("Officer lists are");
        for(int index = 0; index < officer.length; index++)
        {
            System.out.println(officer[index].getOfficerId()+" "+officer[index].getName()+" "+officer[index].getGender()+" "+officer[index].getAge()+" "+officer[index].getPostName()+" "+officer[index].getBloodGroup()+" "+officer[index].getAddress());
        }
    }
    public String getAddressById(int id){
        String address = null ;
        for (int officerIndex = 0; officerIndex < this.officer.length; officerIndex++)
        {
            if (officer[officerIndex].getOfficerId() == id)
            {
                address = officer[officerIndex].getAddress();
                System.out.println("details  name found.... please collect it in executor");

            }
        }
        return address;
    }

    public Officer getOfficeInfoById(String officerName){
        Officer officer1 = null;
        for (int officerIndex = 0; officerIndex < this.officer.length; officerIndex++) {
            if ( officer[officerIndex].getName() == officerName ){
                officer1 = officer[officerIndex];
                System.out.println("details found.... please collect it in executor");
            }
        }
        return officer1;
    }
    public int getOfficerAgeByName(String officersName){
        int age = 0;
        for (int officerIndex = 0; officerIndex < this.officer.length; officerIndex++) {
            if ( officer[officerIndex].getName() == officersName ){
                age = officer[officerIndex].getAge();
                System.out.println("details found.... please collect it in executor");
            }
        }
        return age;
    }
    public String getPostNameByName(String officerName){
        String postName = null;
        for (int officerIndex = 0; officerIndex < this.officer.length; officerIndex++) {
            if ( officer[officerIndex].getName() == officerName ){
                postName = officer[officerIndex].getPostName();
                System.out.println("details found.... please collect it in executor");
            }
        }
        return postName;
    }
    public String getPostNameById(int officerId){
        String postName = null;
        for (int officerIndex = 0; officerIndex < this.officer.length; officerIndex++) {
            if ( officer[officerIndex].getOfficerId() == officerId ){
                postName = officer[officerIndex].getPostName();
                System.out.println("details found.... please collect it in executor");
            }
        }
        return postName;
    }
    public boolean updatePostNameByOfficerName(String updatedPostName, String exisistingOfficerName){
        boolean isPostNameUpdated = false ;
        for (int officerIndex = 0; officerIndex < this.officer.length; officerIndex++) {
            if ( officer[officerIndex].getName() == exisistingOfficerName ){
                officer[officerIndex].setPostName(updatedPostName);
                isPostNameUpdated = true;
            }
        }
        return isPostNameUpdated;
    }
    public void deleteOfficerById(int id) {
        System.out.println("invoked deleteOfficerById ");
        int index, newIndex;
        for (index = 0, newIndex = 0; index < this.officer.length; index++) {
            if (officer[index].getOfficerId() != id) {
                officer[newIndex++] = officer[index];
            }
            else {
                System.out.println("Given Name has been deleted from the list");
            }
        }
        officer = Arrays.copyOf(officer, newIndex);
        getAllNewApplication(officer);
    }
    public void getAllNewApplication(Officer application[]){
        System.out.println("Get all new application");
        for (int index = 0; index < application.length; index++) {
            System.out.println(officer[index].getOfficerId()+" "+officer[index].getName()+" "+officer[index].getGender()+" "+officer[index].getAge()+" "+officer[index].getPostName()+" "+officer[index].getBloodGroup()+" "+officer[index].getAddress());
        }
    }
}
