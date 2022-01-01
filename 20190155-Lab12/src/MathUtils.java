// ****************************************************************
// MathUtils.java
//
// Provides static mathematical utility functions.
//          
// ****************************************************************

public class MathUtils
{
    //-------------------------------------------------------------
    // Returns the factorial of the argument given
    //-------------------------------------------------------------
    public static int factorial(int n) throws IllegalArgumentException
    {
    	try {
	    	if(n < 0) {
	    		throw new IllegalArgumentException("n �� 0���� �۽��ϴ�!!");
	    	}
	    	
	    	if(n >= 17) {
	    		throw new IllegalArgumentException("n �� 17�̻��Դϴ�!!");
	    	}
    	}catch(IllegalArgumentException e) {
    		System.out.println(e.getMessage());
    		return -1;
    	}
    	
		int fac = 1;
		for (int i=n; i>0; i--)
		    fac *= i;
		return fac;
    }
}