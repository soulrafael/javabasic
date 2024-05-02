package calculadoraJv;

import java.util.Scanner;

public class calculadora {

	public static void main(String[] args) {
		System.out.println("Hello World!Calculadora Basica");
		System.out.println("New Hello World!Calculadora Basica");


		// variaveis de entrada e instanciamento 
				Scanner entrada=new Scanner(System.in);
				System.out.println("Entre com o primeiro valor:");
				int numero1=entrada.nextInt();
				System.out.println("Entre com o segundo valor:");
				int numero2=entrada.nextInt();
				System.out.println("Entre com a operação:");
				String operador=entrada.next();
				int resultado;
				switch(operador){
					case"+":
						resultado=numero1+numero2;
						System.out.println(resultado);
						break;
					case"-":
						resultado=numero1-numero2;
						System.out.println(resultado);
						break;
					case"*":
						resultado=numero1*numero2;
						System.out.println(resultado);
						break;
					case"/":
						resultado=numero1/numero2;
						System.out.println(resultado);
						break;
					case"%":
						resultado=numero1%numero2;
						System.out.println(resultado);
						break;
				default:
					System.out.println("Nenhuma OPeraÇÂo Seleciona");
				}

	}

}
