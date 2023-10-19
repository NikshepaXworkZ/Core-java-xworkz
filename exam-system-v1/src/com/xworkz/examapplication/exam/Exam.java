package com.xworkz.examapplication.exam;
import com.xworkz.examapplication.hallticket.HallTicket
public class Exam {
    HallTicket ticket;
    public int fees;
    //has a relation
    public Exam(HallTicket ticket){
        this.ticket=ticket;
    }
    public boolean write(){
        boolean isAllowed = false;
        if(fees >= 1200){
            System.out.println("fees is paid..now you can collect the HallTicket");
            if(ticket != null){
                System.out.println("issuing the HallTicket");
//this.ticket=ticket;
                this.ticket.displayDetails();
                System.out.println("in HallTicket details is displayed...proceed to write exam");
                isAllowed = true;
            }
            else {
                System.out.println("HallTicket details not found");
            }
        }
        else {
            System.out.println("fees is not paid");
        }
//isAllowed = true;
        return isAllowed;
    }
}
