//Iterate through the map and display Pass / Fail status for each student.


import java.util.HashMap;
import java.util.Map;
public class StudentResult {
     public static void main(String[] args) {

        // Step 1: Create a HashMap to store student names and marks
        HashMap<String, Integer> studentMarks = new HashMap<>();

        studentMarks.put("Rohit Sharma", 85);
        studentMarks.put("Virat Kohli", 45);
        studentMarks.put("Lokesh Kumar Rahul", 60);
        studentMarks.put("Mahendre Singh Dhoni ", 30);

        // Step 2: Iterate through the map
        for (Map.Entry<String, Integer> entry : studentMarks.entrySet()) {
            
            String name = entry.getKey();
            int marks = entry.getValue();

            // Step 3: Check Pass/Fail condition
            if (marks >= 50) {
                System.out.println(name + " : Pass");
            } else {
                System.out.println(name + " : Fail");
            }
        }
    }
}

