package core.APIs;

public class Math_APIs {
    public static void main(String[] args) {
        //  Finding the Minimum and Maximum

        System.out.println(Math.max(4,4));
        System.out.println(Math.min(0,0));

        //Rounding Numbers

        System.out.println(Math.round(123.56));
        System.out.println(Math.round(14.34));

        // Determining the Ceiling and Floor
        System.out.println(Math.ceil(12.4));// If it is a whole number, it returns the same value. If it has any fractional value, it rounds up to the next whole number
        System.out.println(Math.floor(10.97));//floor() method discards any values after the decimal.
        //  Generating Random Numbers
        System.out.println(Math.random());
    }
}
