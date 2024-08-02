package control.statements;

//import java.util.concurrent.Callable;

enum  Colors{
    Red,
    Blue,
    Yellow
}
public class SwitchExample {
String getColours(Colors colors){
    //
   return switch (colors){
        case Blue->"Blue Colour";
        case Red -> "red";
        case Yellow -> "Yellow";
        default -> "Unkown";
    };

}


    public static void main(String[] args) {
   // SwitchExample switchExample= new SwitchExample();
      Colors colors =Colors.Red;
     var c=   switch (colors){
            case Blue-> "Blue Colour";
            case Red -> "red";
            case Yellow -> "Yellow";
            default ->  "Unknown";
        };
        System.out.println(c);
short a=3;
//        int[][] myComplexArray = {{5,2,1,3},{3,9,8,9},{5,7,12,7}};
//       OUTER_LOOP:for(int[] mySimpleArray : myComplexArray) {
//            INNER_LOOP:for(int i=0; i<mySimpleArray.length; i++) {
//                System.out.print(mySimpleArray[i]+"\t");
//            }
//            System.out.println();
//        }

        //System.out.println(a);
        int fish = 5;
        int length = 12;
        var name = switch (fish) {
            case 1 -> "Goldfish";
            case 2 -> {
                yield "Trout";
            }
            case 3 -> {
                if (length > 10) yield "Blobfish";
                else yield "Green";
            }
            default -> "Swordfish";
        };
    }
}
