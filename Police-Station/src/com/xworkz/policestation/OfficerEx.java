package com.xworkz.policestation;

import com.xworkz.policestation.officers.Officer;
import com.xworkz.policestation.policestation.PoliceStation;
import sun.awt.geom.AreaOp;

import java.sql.SQLOutput;
import java.util.Scanner;


public class OfficerEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the no of officers to be added");
        int size;
        size = sc.nextInt();
        PoliceStation policeStation = new PoliceStation(size);


        for (int index = 0; index < size; index++) {
            Officer officer = new Officer();
         //   System.out.println("enter the officer id");
       //     int officerId = sc.nextInt();
          //  officer.setOfficerId(officerId);
            System.out.println("enter the officer name");
            officer.setName(sc.next());
            System.out.println("enter the gender");
            officer.setGender(sc.next());
            System.out.println("enter thr officer age");
            officer.setAge(sc.nextInt());
            System.out.println("enter thr officer post");
            officer.setPostName(sc.next());
            System.out.println("enter thr officer blood group");
            officer.setBloodGroup(sc.next());
            System.out.println("enter thr officer location");
            officer.setAddress(sc.next());
            policeStation.addOfficers(officer);

        }
        policeStation.getAllOfficer();

        /*   PoliceStation policeStation = new PoliceStation();
        policeStation.addOfficers(officer);
        //policeStation.getAllOfficer();*/

      /*  Officer officer1 = new Officer();
        officer1.setOfficerId(2);
        officer1.setName("Suresh");
        officer1.setGender("Male");
        officer1.setAge(32);
        officer1.setPostName("Sub Inspector");
        officer1.setBloodGroup("AB+");
        officer1.setAddress("Channapatna");

        policeStation.addOfficers(officer1);
        // policeStation.getAllOfficer();

        Officer officer2 = new Officer();
        officer2.setOfficerId(3);
        officer2.setName("akshu");
        officer2.setGender("Female");
        officer2.setAge(23);
        officer2.setPostName("Sp");
        officer2.setBloodGroup("A+");
        officer2.setAddress("Maddur");

        policeStation.addOfficers(officer2);
        //policeStation.getAllOfficer();

        Officer officer3 = new Officer();
        officer3.setOfficerId(4);
        officer3.setName("Mahesh");
        officer3.setGender("male");
        officer3.setAge(23);
        officer3.setPostName("SI");
        officer3.setBloodGroup("AB+");
        officer3.setAddress("Akkur");

        policeStation.addOfficers(officer3);
        //policeStation.getAllOfficer();

        Officer officer4 = new Officer();
        officer4.setOfficerId(5);
        officer4.setName("Varun");
        officer4.setGender("Male");
        officer4.setAge(33);
        officer4.setPostName("constable");
        officer4.setBloodGroup("AB-");
        officer4.setAddress("Channapatna");

        policeStation.addOfficers(officer4);
        //policeStation.getAllOfficer();

        String address = policeStation.getAddressById(2);
        System.out.println(address);

//System.out.println("Enter the id to get office info");
//policeStation.getOfficeInfoById(sc.next());


        Officer offic = policeStation.getOfficeInfoById("Shruthi");
        System.out.println(offic.getOfficerId() + " " + offic.getName() + " " + offic.getGender() + " " + offic.getAge() + " " + offic.getPostName() + " " + offic.getAddress() + " " + offic.getBloodGroup());

        int age = policeStation.getOfficerAgeByName("Varun");
        System.out.println(age);

        String postName = policeStation.getPostNameByName("akshu");
        System.out.println(postName);

        String postName1 = policeStation.getPostNameById(5);
        System.out.println(postName1);

        policeStation.updatePostNameByOfficerName("CI", "akshu");

        policeStation.deleteOfficerById(4);

        do{
        switch(tyoe){
        }
        }while(conditions)





        System.out.println("Enter the id to get office info");
policeStation.getOfficeInfoById(sc.next());*/

String input=null;

        do{
            System.out.println("press 1 : to get details");
            System.out.println("press 2 : to get details");
            System.out.println("press 3 : to get details");
            System.out.println("press 4 : to get details");
            System.out.println("press 5 : to get details");
            System.out.println("press 6 : to get details");

            int options= sc.nextInt();
            switch (options)
            {
                case 1 :
                    policeStation.getAllOfficer();
                    break;

                case 2 :
                    System.out.println("enter the id");
                    String address = policeStation.getAddressById(sc.nextInt());
                    System.out.println(address);
                    break;

                case 3:
                    System.out.println("enter the name");
                    String officerName=policeStation.getPostNameByName(sc.next());
                    System.out.println(officerName);
                    break;

                case 4:
                    System.out.println("enter the id");
                    String officerId=policeStation.getPostNameById(sc.nextInt());
                    System.out.println(officerId);
                    break;

                case 5:
                    System.out.println("enter the name");
                    int officersName=policeStation.getOfficerAgeByName(sc.next());
                    System.out.println(officersName);
                    break;

                case 6:
                    System.out.println("enter the id");
                    Officer id=policeStation.getOfficeInfoById(sc.next());
                    System.out.println(id);
                    break;

                default:
                    System.out.println("please choose the correct options");
            break;
            }
            System.out.println("do u want to continue yes/no");
            input = sc.next();
        }
        while(input.equals("yes"));
        System.out.println("tqww");
    }
}
