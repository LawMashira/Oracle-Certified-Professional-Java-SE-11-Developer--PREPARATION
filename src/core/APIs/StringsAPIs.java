package core.APIs;

public class StringsAPIs
{
//    void printType(Object o) {
//        if (o instanceof Integer bat) {
//            System.out.print("int");
//            } else if (o instanceof Integer bat && bat < 10) {
//            System.out.print("small int");
//            }
//        else if(o instanceof Long bat <= 20) {
//                 System.out.print("long");
//                }
//    }


        public static void main(String[] args)
    {
//        int a=5;int b=5;
//        String name1 = new String("Fluffy");
//        String name2 = new String("Fluffy");
//        boolean res = name1==name2;
//        System.out.println("Reference Comparison "+name1==name2);
//        System.out.println("Content Comparison "+name1.equals(name2));
//        System.out.println(a==b);
//        System.out.println(name1==name2);
//        System.out.println(name1.hashCode());
//       System.out.println(name2.hashCode());

       // Getting a Single Character
        String animalName= "ANIMALS";
//        System.out.println(animalName.charAt(0));
//        System.out.println(animalName.length());
//        System.out.println(animalName.charAt(7));
//Finding an Index

//        System.out.println(animalName.indexOf('A'));  //0
//        System.out.println(animalName.indexOf("al",4));

// Substring

// System.out.println(animalName.substring(3));
//System.out.println(animalName.substring(3,8));//Exception in thread "main" java.lang.StringIndexOutOfBoundsException: begin 3, end 8, length 7


        System.out.println(animalName.toLowerCase());
        System.out.println("abcabc".replace('a', 'A')); // AbcAbc
        System.out.println("abcabc".replace("a", "A")); // AbcAbc

       String name="Lawson ";
       int age=34;
      System.out.println(name.length());
        System.out.println(name);
//        System.out.println(name.stripLeading().length());
//        System.out.println(name.stripTrailing().length());
//        System.out.println(name.strip().length());
//        System.out.println(name);
        System.out.println("%s is aged %d.".formatted(name,age));
        System.out.println(String.format("%s is getting old owning nothing about %d years.",name,age));
        var x = "Hello World";
        var y = "Hello World";
        System.out.println(x == y);    // true
        System.out.println(x.equals(y));//true


        /*============================================================*/

        // intern()
        /******************************************************/
        var nameH = "Hello World";
        var name2 = new String("Hello World").intern();
        System.out.println(nameH == name2);     // true

    }

}
