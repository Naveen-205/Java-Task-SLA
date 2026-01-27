package task;

class InvalidAgeException extends Exception {
    InvalidAgeException(String message) {
        super(message);
    }
}

public class Hr_Validation {
    public static void main(String[] args) {
        int age = 16;

        try {
            if (age < 18) 
            {
                throw new InvalidAgeException("Age must be 18 or above.");
            }
            else {
            	System.out.println("Employee registered successfully");
            }
        }
        catch (InvalidAgeException e) {
            System.out.println(e.getMessage());
        }
    }
}
