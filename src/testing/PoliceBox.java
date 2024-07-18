package testing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PoliceBox {
    static int start =2;
    final int end;
    public PoliceBox(int x) {
        x = 10;
        end = x;
        System.out.println("From Constructor" );
    }
    public void fly(int distance) {
        System.out.print(end-start+" ");
       // System.out.print(distance);
    }
    {
        System.out.println("From Instance Initializer");
    }
    static
    {
        String name;
        System.out.println("From Static Initializer");
    }

    public static void main(String[] time) {
        

new  PoliceBox(8).fly(5);
       List<String> stringList = Arrays.asList("Law","Kaylee","Aku","Vision");
       // stringList.forEach(System.out::print);
      //  stringList.stream()
             //   .filter(n->n.startsWith("A"))
               // .forEach(System.out::println);
        var builder = "54321";
        builder = builder.substring(2);
       // System.out.println(builder.charAt(2));

    }

}



