import java.util.Scanner;
public class Fatorial {
	public static void main(String[]args) {
		Scanner in = new Scanner (System.in);
		int n,fat;
		System.out.println("Digite um valor maior que zero");
		n =in.nextInt();
		fat = n;
		while (n > 1) {
			System.out.println(n+"x");
			fat = fat *(n-1);
			n = n-1;
		}
		System.out.println("fatorial");
		in.close();
	}

}
