package Case3;

public class MathUtil {
	public static int factorial (int n){
		if(n < 0) throw new IllegalArgumentException("Negative is not allowed") ;     	// throwing exception dalam kasus kurang dari 0
		if(n > 16) throw new IllegalArgumentException("Argument over 16 not allowed") ; // throwing exception dalam kasus lebih dari 16
		
		int fac = 1;
		
		for (int i=n; i>0; i--)
			fac *= i;
				return fac;
	}
}
