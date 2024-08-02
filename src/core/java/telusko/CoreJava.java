package core.java.telusko;
import  java.util.*;
import java.sql.Date;
public class CoreJava {
    private int numForks;

    public   static  void  main(final String[] args){
        var coreJava = new CoreJava();
        System.out.println(coreJava.numForks);
               var var1=9;

      //java.util.Date date ;
      //java.sql.Date  date1;
        //converts a String to a Long
        var num1 = Long.parseLong("100");
        //  converts a String to a  Long wrapper class.
        var num2 = Long.valueOf("100");
        System.out.println(Long.max(num1, num2));
        double a=5;
        int b=7;
       int  c= (int) a+b;


       // ABC abc = new ABC();
        //AYZ ayz=new AYZ();
       // abc.anInt();
        StringBuffer stringBuffer = new StringBuffer("Lawson ");
        stringBuffer.append("Matutu");
      //  System.out.println(   stringBuffer);
        String str="Lawson";

        OuterClass outerClass= new OuterClass();
            // outerClass.outerClass();
            //OuterClass.InnerClass innerClass = outerClass.new InnerClass();
            //innerClass.innerClass();

//        final int score1 = 8, score2 = 3;
//         char myScore = 7;
//        var goal = switch (myScore) {
//               default -> {if(10>score1) yield "unknown";}
//                    case score1 -> "great";
//                    case 2, 4, 6 -> "good";
//                    case score2, 0 -> {"bad";}
//                 };
//         System.out.println(goal);


    }
}
