//Use a HashMap<String, Integer> to store student names and marks.


import java.util.HashMap;

public class StudentMarks {
    public static void main(String[] arg){
    
       //Create  a HashMap
       HashMap<String,Integer> studentMark =new HashMap<>(); 

       //Add student names and marks
       studentMark.put("Sudhanshu",95);
       studentMark.put("Rishu",95);
       studentMark.put("Raj",95);
       studentMark.put("Yash",95);


       //Display all asatudent name and their marks 
       System.out.println("Student Marks");
       for(String name : studentMark.keySet()){
          System.out.println(name +" : " + studentMark.get(name));

       }
       //Get marks of a specific student 
       System.out.println("\nMarks of Sudhanshu:" +studentMark.get("Sudhanshu"));
    

    }
    
}
