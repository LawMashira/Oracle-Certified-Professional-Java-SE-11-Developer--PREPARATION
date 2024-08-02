// School.java
package my.city;
import my.school.*;

import java.util.Locale;

public class School {
    public static void main(String[] args) {
            System.out.println(Classroom.globalKey);
            Classroom room = new Classroom(101, "Mrs. Anderson");
              System.out.println(room.roomNumber);
              System.out.println(Classroom.floor);
              System.out.println(Classroom.teacherName);
        System.out.println(Locale.getDefault());
        System.out.println();
    } }