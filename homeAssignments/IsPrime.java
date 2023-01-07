package homeAssignments;

public class IsPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num = 40;
	    boolean IsNumber = false;
	    for (int i = 2; i <= num / 2; ++i) {
	     
	      if (num % i == 0) {
	    	  IsNumber = true;
	        break;
	      }
	    }

	    if (!IsNumber)
	      System.out.println(num + " is a prime number.");
	    else
	      System.out.println(num + " is not a prime number.");
	  }
	

	}


