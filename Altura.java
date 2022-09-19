import java.util.Scanner;
public class Altura {
	public static void  main (String[]args) {
		Scanner in = new Scanner (System.in);
		int ano;
		double j,p;
		ano=1;
		j = 134;
		p = 145;
		while(j<=p) {
			j=j+2.5;
			p=p+2;
			ano++;
			System.out.println("idade joao"+j  /100 +"metros");
			System.out.println("idade joao"+p  /100 +"metros");
		}
		 System.out.println(ano+"necessario para joao ficar mais alto que pedro");
		 in.close();
	}
}
