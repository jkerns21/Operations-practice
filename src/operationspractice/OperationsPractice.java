package operationspractice;

public class OperationsPractice 
{
	
	public static void main(String[]args)
	{
		int number; //Data type then variable name to declare a variable
		number = 20;
		System.out.println("number: " + number);
		number = number + 5;// number += 5
		System.out.println("add 5 to number: " + number);
		number /= 2;
		System.out.println("divide the number by 2: " + number);
		number *= 4;
		System.out.println("multiply the number by 4: " + number);
		number -= 6;
		System.out.println("subtract 6 from the number: " + number);
		number %= 2;
		System.out.println("modular divide the number by 2: " + number);
		
	}
	
}
