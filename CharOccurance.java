package week1.day2;

public class CharOccurance {

	public static void main(String[] args) {
		String str="Welcom to Chennai";
		int count=0;
		int strlen=str.length();
		for (int i=0;i<strlen;i++) {
			if(str.charAt(i) =='e') {
				
			count++;
		
			}
				System.out.println("The occurance of e:" +count); 
				
				 
			}
			
		}

	}


