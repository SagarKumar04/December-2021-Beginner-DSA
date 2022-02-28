package Collections.Map;

/*
Let a map has key roll number and values as
data (name, father name, address and contact number)
and then a student has dropped the school.
Then, how to remove his data so that
sequence of roll number changes itself?
 */

import java.util.HashMap;
import java.util.Map;

public class HashMapExample2 {
    public static void main(String[] args) {
        Map<Integer, String> studentMap = new HashMap<Integer, String>();
        studentMap.put(1, "Asif");
        studentMap.put(2, "Saurabh");
        studentMap.put(3, "Rasika");
        studentMap.put(4, "Sagar");
        studentMap.put(5, "Sarfaraj");
        studentMap.put(6, "Jahid");
        studentMap.put(7, "Akshay");

        Map<Integer, String> newStudentMap = new HashMap<Integer, String>();

        for(Map.Entry<Integer, String> eachStudent : studentMap.entrySet()) {
            Integer rollNumber = eachStudent.getKey();
            String name = eachStudent.getValue();
            if(rollNumber < 4) {
                newStudentMap.put(rollNumber, name);
            }
            else if(rollNumber > 4) {
                newStudentMap.put(rollNumber - 1, name);
            }
            else {
                continue;
            }
        }

        System.out.println("Student Map: " + studentMap);
        System.out.println("New Student Map: " + newStudentMap);
    }
}
