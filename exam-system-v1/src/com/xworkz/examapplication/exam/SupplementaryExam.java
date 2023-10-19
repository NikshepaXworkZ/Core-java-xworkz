package com.xworkz.examapplication.exam;

import com.xworkz.examapplication.hallticket.HallTicket;

public class SupplementaryExam extends Exam{
    public int noOfAttempts=2;
    @Override
    //only for inhritance
    //
    public boolean write(HallTicket ticket){
        System.out.println("write of suplementary exam");
        if(noOfAttempts>1)
            return super.write(ticket);
        return false;
    }
}
