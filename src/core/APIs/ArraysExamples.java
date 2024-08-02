package core.APIs;

import java.util.Arrays;

public class ArraysExamples {
    public static void main(String[] args)
    {
//        //Creating an array
// int arr[] =new int[5];
//
// int[] moreNumbers = new int[] {42, 55, 99};// With initialization
//
//         int[] moreNumber ={42, 55, 99};
//      for(int p=0;p<moreNumber.length;p++){
//          System.out.print("\t"+moreNumber[p]);
//      }
//        System.out.println();
        int numAnimals4[]={9,8,0,2,4,3,1,6,5,11};
     for(int p=0;p<numAnimals4.length;p++){
      //     System.out.print("\t"+numAnimals4[p]);
      }
        System.out.println();
       // Sorting
//        Arrays.sort(numAnimals4);
//        System.out.println();
//        System.out.println("After Sorting" );
//        System.out.println();
//
//        for(int p=0;p<numAnimals4.length;p++){
//            System.out.print(" \t"+numAnimals4[p]);
//        }
//        System.out.println();
//        System.out.println("FOR....");
//        for(int Integer : numAnimals4){
//            System.out.print("\t"+Integer);
//        }
//        System.out.println();
//        System.out.println(Arrays.binarySearch(numAnimals4,11));

        //Using compare()
       // A negative number means the first array is smaller than the second.
        //A zero means the arrays are equal.
           // A positive number means the first array is larger than the second.

        System.out.println(Arrays.compare(new int[] {1}, new int[] {2}));

//Using mismatch()
        System.out.println(Arrays.mismatch(new int[] {2}, new int[] {5}));
    }
}
