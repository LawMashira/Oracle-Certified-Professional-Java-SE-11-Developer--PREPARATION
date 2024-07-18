package core.java.telusko;

import java.util.Scanner;

public class ABC {
    Scanner scanner = new Scanner(System.in);
    int a;
    public void anInt(){

            System.out.println("Enter first number");
            try {
                int firstNumber = scanner.nextInt();
                System.out.println("Enter second number");
                int secondNumber = scanner.nextInt();
                int res = firstNumber + secondNumber;
                System.out.println("The result = " + res);
            } catch (Exception e) {
                System.out.println("invalid number");

        }

    }
    public ABC (){
       System.out.println("In Constructor ABC");
        a=10;
    }

}
class  AYZ{
    public AYZ(){
        super();
        System.out.println("in AYZ");
    }
}