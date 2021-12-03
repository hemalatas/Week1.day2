package week1.day2;

public class Calculator {
	public int sub(int num1,int num2) {
		return num1-num2;
		
	}

	public static void main(String[] args) {
		Calculator calc = new Calculator();
		System.out.println(calc.sub(50, 30));
		
	}

}
