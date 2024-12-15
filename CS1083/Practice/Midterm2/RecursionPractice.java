public class RecursionPractice{
	public static void main(String[] args){
		System.out.println(factorial(20));
		System.out.println(exp(2, 1));

		try{
			System.out.println(sumDigits(123));
		}
		catch(IllegalArgumentException iae){
			System.out.println(iae.getMessage());
			iae.printStackTrace();
		}

	}

	public static long factorial(int n) { //throws Exception
		if(n == 1){
			return 1;
		}
		else if(n > 1){	
			return n * factorial(n-1);
		}

		return 1;
		/*
		else{
			throw new Exception("Error: don't give this function values less than 1");
		}
		*/
	}

	public static int exp (int base, int exp){
		if(exp == 1){
			return base;
		}
		else if(exp == 0){
			return 1;
		}
		else {
			return base * exp(base, exp - 1);
		}

	}

	public static int sumDigits(int n) throws IllegalArgumentException{
		if(n == 0){
			return 0;

		}
		else if(n > 0){
			return (n % 10) + sumDigits(n / 10);
		}
		else{
			throw new IllegalArgumentException("Can only give values >= 0");
		}

	}


}