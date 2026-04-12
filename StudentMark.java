//Throw a custom exception if marks are negative or exceed 100.


// Step 1: Custom Exception Class
class InvalidMarksException extends Exception {
    public InvalidMarksException(String message) {
        super(message);
    }
}

public class StudentMark {

    // Step 2: Method to validate marks
    static void checkMarks(int marks) throws InvalidMarksException {

        // Step 3: Condition check
        if (marks < 0 || marks > 100) {
            throw new InvalidMarksException("Marks should be between 0 and 100.");
        } else {
            System.out.println("Valid marks: " + marks);
        }
    }
    public static void main(String[] args) {

        try {
            checkMarks(85);    // Valid
            checkMarks(-10);   // Invalid
            checkMarks(120);   // Invalid

        } catch (InvalidMarksException e) {   // Step 4: Handling exception
            System.out.println("Exception: " + e.getMessage());
        }
    }
}


    

