package week1.day2;

public class Armstrongnumber {

	public static void main(String[] args) {
		int input = 153;
		int originalNum=input;
				int sum=0;
				int rem;
				while(input>0) {
					rem=input%10;
					sum = sum +(rem*rem*rem);
					

					
							input=input/10;
				}
if(originalNum==sum) {
	System.out.println("Given number is Amstrong");
	
}
	}

}
