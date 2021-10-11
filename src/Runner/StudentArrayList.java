package Runner;

import java.util.ArrayList;
import Class.Student;

public class StudentArrayList {
    public static void main(String[] args) {
        //Declare and instance an ArrayList
        ArrayList<Student>signedIn = new ArrayList<>();

        //Declare and instance the students of the current class

        Student studentNumber1 = new Student("Juan", "Perez", 16, 4.5f);
        Student studentNumber2 = new Student("Ricardo", "Mongola", 15, 4.0f);
        Student studentNumber3 = new Student("Juan", "Gallego", 16, 3.9f);
        Student studentNumber4 = new Student("Roberto", "Fuentes", 17, 4.1f);

        //Add the students to the ArrayList
        signedIn.add(studentNumber1);
        signedIn.add(studentNumber2);
        signedIn.add(studentNumber3);
        signedIn.add(studentNumber4);

        //Size of the ArrayList
        System.out.println(signedIn.size());

        //Get an element
        System.out.println(signedIn.get(1).getLastName());
        System.out.println(signedIn.get(3).getAverage());

        //Eliminate an element
        signedIn.remove(2);
        System.out.println(signedIn.size());
    }
}
