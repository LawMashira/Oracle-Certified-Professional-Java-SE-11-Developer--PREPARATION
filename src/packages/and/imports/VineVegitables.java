package packages.and.imports;

import testing.PoliceBox;

public class VineVegitables {
    public static void  main(String[] args){
        System.out.println("I am a vegetable that grows on a vine.");

        // Any class from other packages must be fully qualified or imported
        testing.TestFQDN.main(args);

        // Using simple coz we specified location in the import statement
        PoliceBox.main(args);
    }
}
