import java.util.Scanner;
public class Potencia {
	public static void main(String[]args) {
		Scanner in = new Scanner (System.in);
		int b,e,p,i;
		i=1;
		p=0;
        System.out.println("Digite o valor da base");
        b =in.nextInt();
        System.out.println("Digite o expoente");
        e =in.nextInt();
        p = b;
        while(i<e) {
        	p =p*b;
        	i++;
        }
        System.out.println("A potencia é"+p);
        in.close();
	}
}
