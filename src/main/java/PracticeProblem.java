import java.util.Scanner;

public class PracticeProblem {

	public static void main(String args[]) {
		q1();
		q2();
		q3();
		q4();
		q5();
		q6();
		q7();
	}

	public static void q1() {
		//Write question 1 code here

		Scanner in = new Scanner(System.in);
		System.out.print("In: ");
		String word = in.nextLine();
		System.out.println(word.charAt(0));
		
	}

	public static void q2() {
		//Write question 2 code here
		
		Scanner in = new Scanner(System.in);
		System.out.print("In: ");
		boolean input = in.nextBoolean();
		in.nextLine();
		System.out.println(!input);
	
	}

	public static void q3() {
		//Write question 3 code here
		
		Scanner in = new Scanner(System.in);
		System.out.print("In: ");
		int value = in.nextInt();
		in.nextLine();
		System.out.println(value > 5);

	}

	public static void q4() {
		//Write question 4 code here
		
		Scanner in = new Scanner(System.in);
		System.out.print("In: ");
		double value = in.nextDouble();
		in.nextLine();
		System.out.println(value >= -2 && value <= 2);
	}

	public static void q5() {
		//Write question 5 code here
		
		Scanner in = new Scanner(System.in);
		System.out.print("In: ");
		String sentence = in.nextLine();
		System.out.println(sentence.equals("Hello World"));
	}

	public static void q6() {
		//Write question 6 code here
		
		Scanner in = new Scanner(System.in);
		System.out.print("In: ");
		int one = in.nextInt();
		in.nextLine();
		System.out.print("In: ");
		int two = in.nextInt();
		in.nextLine();
		System.out.println(one <= two);

	}

	public static void q7() {
		//Write question 7 code here
		
		Scanner in = new Scanner(System.in);
		System.out.print("In: ");
		double one = in.nextDouble();
		in.nextLine();
		System.out.print("In: ");
		double two = in.nextDouble();
		in.nextLine();
		System.out.println(one > two);
	}

}
