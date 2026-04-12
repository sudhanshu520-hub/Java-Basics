 class StudentParent {

    // parent class properties 
    int rollNo=101;
    String name = "Sudhanshu";

    //parent class method 
    void showStudentDetail(){
        System.out.println("RollNo:" + rollNo);
         System.out.println("name:" + name);
    }
        
    }
    //child class inherit parent class 
     public class CollegeStudent extends StudentParent{
        //child class property
        String CollegeName= "Greater Noida  College";

        //child class method 
        void ShowCollegeDetail(){
            System.out.println("College Name:" +CollegeName  );
        }
        public static void main(String[] args){

            //create object of child class 
            CollegeStudent cs=new CollegeStudent();

            //access parent class method 
            cs.showStudentDetail();

            //acess child class method 
            cs.ShowCollegeDetail();
        }

    }
    

