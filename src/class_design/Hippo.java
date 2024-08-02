package class_design;
public class Hippo extends Animal  {
    public static void main(String[] grass) {
        System.out.print("C");
        new Hippo();
        new Hippo();
        new Hippo();

        System.out.println(  new Hippo().getMethod());
       Hippo hippo= new Hippo();
        System.out.println(hippo.getMethod2());

    }
    static { System.out.print("B");}
   public String getMethod(){
       System.out.println("In Child Class");
       return null;
   }

}

