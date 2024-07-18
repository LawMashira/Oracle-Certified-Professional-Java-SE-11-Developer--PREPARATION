package operators;

public class UnaryOperators {
    public static  void  main(String[] args)
    {
        int a=0;
            a=1;
            ++a;
        System.out.println("A after ++a "+ a);
        a=1;
        a++;
        System.out.println("a after a++ "+a);

        // What happens if we do this?
        System.out.println("----------Test 2 ----------");
        a = 1;
        System.out.println("a after ++a = " + ++a);
        a = 1;
        System.out.println("a after a++ = " + a++);
        System.out.println("And now the value of a is: " + a);

    }
}
