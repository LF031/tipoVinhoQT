import java.util.*;
public class Exercicio3_3 {

	public static void main(String[] args) {
		// 1 - variaveis
		char tipoVinho = ' ';
		int contCabernet = 0;
		int contMalbec = 0;
		int contTanat = 0;
		Scanner leia = new Scanner(System.in);
		
		System.out.println("tipos de vinho: C - cabernet");
		System.out.println("tipos de vinho: M - Malbec");
		System.out.println("tipos de vinho: T - Tanat");
		while (tipoVinho != 'F') {
			System.out.println("Digite o tipo de vinho (F para finalizar): ");
			tipoVinho = leia.next().charAt(0);
			
			if (tipoVinho == 'F') {
				break;
			} else if (tipoVinho == 'C') {
				contCabernet ++;
			} else if (tipoVinho == 'M') {
				contMalbec ++;
			} else if (tipoVinho == 'T'){
				contTanat ++;
			}
		}
		System.out.println("Quantidade total de vinhos: " + (contCabernet + 
				contMalbec + contTanat) );
		System.out.println("Quantidade de vinhos Cabernet: " + contCabernet);
		System.out.println("Quantidade de vinhos Malbec: " + contMalbec);
		System.out.println("Quantidade de vinhos Tanat: " + contTanat);
		
	}

}
