import java.util.Scanner;
public class test1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter age");
		int age=sc.nextInt();

		if(age<18) {
			System.out.println("u r still minor");
		}
		else if(age>65) {
			System.out.println("u r senior");
		}
		else {
			System.out.println("party");
		}
	}
}