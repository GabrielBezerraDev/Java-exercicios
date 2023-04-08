package ribeiraoPreto;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

//1) Observe o trecho de código abaixo:
//public class Main {

//	public static void main(String[] args) {
//		int indice = 13, soma = 0, k = 0;
//		while(k < indice) {
//			k++;
//			soma+= k;
//			System.out.println(soma);
//		}
//		System.out.printf("Soma vai valer: %d", soma);
//	}
//
//}

//2) Dado a sequência de Fibonacci, onde se inicia por 0 e 1 e o próximo valor sempre será a soma dos 2 valores anteriores 
//(exemplo: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34...), escreva um programa na linguagem que desejar onde, informado um número, 
//ele calcule a sequência de Fibonacci e retorne uma mensagem avisando se o número informado pertence ou não a sequência.

//public class Main{
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.print("Digite um número para checar se pertence a sequência de Fibonacci: ");
//		int numero = sc.nextInt();
//		int contador = 1;
//		List<Integer> teste = new ArrayList();
//		for(int i = 0; i < numero; i++) {
//			if(i == 0) {
//				teste.add(0);
//				teste.add(1);
//			}
//			int resultado = teste.get(i) + teste.get(i+1);
//			teste.add(resultado);
//			contador++;
//			if(numero == resultado) {
//				System.out.printf("%dºelemento da sequência de Fibonacci: %d%n", contador-1, resultado);
//				System.out.printf("Sim, o número %d pertence a sequência de Fibonacci e está na posição %dº." , resultado, contador-1);
//				break;
//			}
//			if(i+1 == numero) System.out.printf("%n%nNão, o número %d não pertence a sequência de Fibonacci." , resultado, contador-1);
//		}
//		sc.close();
//	}
//}

//5) Escreva um programa que inverta os caracteres de um string.
public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite a String que vai ser investida: ");
		String invertendo = sc.nextLine();
		String novaString = "";
		for( int i = 0; i < invertendo.length(); i++) {
			novaString += invertendo.charAt((invertendo.length()-1)-i);
		}
		System.out.println(novaString);
		sc.close();
	}
}


