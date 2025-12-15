package excepptionhandling;

public class votingsystem {
	// Custom Exception Class
	static class UnderAgeException extends Exception {
	    UnderAgeException(String msg) {
	        super(msg);
	    }
	}
	  static void checkVote(int age) throws UnderAgeException {
	        if (age < 18)
	            throw new UnderAgeException("You are not eligible to vote! Age must be 18 or above.");
	        else
	            System.out.println("You are eligible to vote!");
	    }

	    public static void main(String[] args) {
	        try {
	            checkVote(16);   // This will throw exception
	            checkVote(20);   // This will execute only if no exception earlier
	        }
	        catch (UnderAgeException e) {
	            System.out.println(" " + e.getMessage());
	        }
	    }
	}


