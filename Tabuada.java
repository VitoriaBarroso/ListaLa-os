import java.util.Scanner;
public class Tabuada {
	public static void main(String[]args) {
		Scanner in = new Scanner (System.in);
		int i,n,resu;
		i=1;
		System.out.println("Digite um numero");
		n=in.nextInt();
		while(i<=10) {
			resu=n*i;
			System.out.println(n+"x"+i+"="+ resu);
			i++;
		}
		in.close();
		
	}

}
