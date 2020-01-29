package junit;

public class First {
	boolean primenum(int n) {
		for(int i=2;i<=Math.sqrt(n);i++) {
			if(n%i==0) {
				return false;
			}
		}
		return true;
	}
}
