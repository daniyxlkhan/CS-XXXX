/*
*	Answer the following questions by running the code 
*	with various inputs.
*	
*	Which values will print the following messages in the output?
*	1. Finally - main
*	2. Finally - methodA
*	3. methodB
*	4. Array Index Out of Bounds
*	5. ArithmeticException
*	6. No Such Method
*	7. General
*		
*/

public class ExceptionPractice{
	public static void main(String[] args){
		try{
			int value = Integer.parseInt(args[0]);
			methodA(value);
		}
		catch(ArrayIndexOutOfBoundsException aiobe){
			System.out.println("Array Index Out of Bounds");
		}
		catch(NoSuchMethodException nsme){
			System.out.println("No Such Method");
		}
		catch(Exception e){
			System.out.println("General");
		}
		finally{
			System.out.println("Finally - main");
		}

		
	}

	public static void methodA(int value) throws NoSuchMethodException{
		try{
			int[] array = new int[value];
			array[value - 1] = value;

			if(value > 100){
				throw new NoSuchMethodException();
			}
			else{
				methodB(value);
			}
		}
		catch(ArithmeticException ae){
			System.out.println("ArithmeticException");
		}
		finally{
			System.out.println("Finally - methodA");
		}
		
	}

	public static void methodB(int value){
		int newVal = value / (value - 2);
		System.out.println("methodB");
	}
} 