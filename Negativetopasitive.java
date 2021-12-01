package week1day2;

public class Negativetopasitive {

	public static void main(String[] args) {
		int i = -40;
		int num = 35;
		int n;
		if(i<0) {
			n=i*(-1);
			System.out.println(n);
			
		}
		if(num>0) {
			System.out.println(num+" is positive number");
		}
		else if(num<0) {
			System.out.println(num+" is negative number");
		}
		
		else
			System.out.println("negative or positive");
			
		
	}

}
