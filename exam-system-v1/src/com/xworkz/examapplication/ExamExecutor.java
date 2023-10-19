package com.xworkz.examapplication;

import com.xworkz.examapplication.exam.Exam;
import com.xworkz.examapplication.exam.SupplementaryExam;
import com.xworkz.examapplication.hallticket.HallTicket;
public class ExamExecutor {
    public static void main(String args[])
    {
        HallTicket hallticket= new HallTicket(5255,"SOM","18CV81","Suresh","1GG19CV76");
//Hallticket ticket=null;
        //polymorphism types
        //Run time polymorphism-method over riding
        //decision making time
        //compile time polymorphism-method overloading
        //   Exam exam = new Exam(ticket);;
        Exam exam = new SupplementaryExam();
        exam.fees = 1300;
        exam.write(hallticket);
    }
//1 object behaving differently at a given instance of time =polymersim
    //Exam exam = new();
    //polymorphism
    //Exam exam1=new SupplemetaryExam();
    //Exam exam2=new CompetativeExam();
    //without inheritance polymorphism doesnot work
}
//Engineer eng = new Civil Engineer();
//Engineer eng1=new CsEngineer();
//to achieve polymorphyism
//1.overide
//2.polymerism reference-parent
//object-child
}
