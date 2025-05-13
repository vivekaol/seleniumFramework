package practiceProgramming;

public class armstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 153, result=0, rem=0;
		//int org_num = num;
		
		/*while(num) {
			rem = num % 10;
			result = result + (rem*rem*rem + rem*rem*rem +rem*rem*rem);
			num = num/10;
			
		}*/
		
		if(result == num)
			System.out.println("Given number is armstrong number");
		else
			System.out.println("Given number is not armstrong number");
	}

}
