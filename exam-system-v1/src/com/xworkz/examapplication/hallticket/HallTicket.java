package com.xworkz.examapplication.hallticket;

public class HallTicket {
    int no;
    String subName;
    String subCode;
    String sName;
    String usn;

    public HallTicket()
    {

    }
    public HallTicket(int no,String subName,String subCode,String sName,String usn){
        this.no=no;
        this.subCode=subCode;
        this.subName=subName;
        this.sName=sName;
        this.usn=usn;
    }
    public void displayDetails(){
        //has a relationship-sop
//printing statement = class.  variable(which is of another of class type) .method
        System.out.println("hall ticket no is "+no);
        System.out.println("subject code is "+subCode);
        System.out.println("subject name is "+subName);
        System.out.println("student name is "+sName);
        System.out.println("student usn is "+usn);
    }
}
