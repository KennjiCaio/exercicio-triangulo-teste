package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		/*
		 * Esse Programinha mostra o tipo de triangulo:
		 * Equilátero;
		 * Isósceles
		 * Escaleno
		 * */
		
		int l1, l2, l3;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Informe o lado 1 do triangulo: ");
		l1 = sc.nextInt();
		System.out.print("Informe o lado 2 do triangulo: ");
		l2 = sc.nextInt();
		System.out.print("Informe o lado 3 do triangulo: ");
		l3 = sc.nextInt();
		
		if(l1 + l2 >= l3 && l1 + l3 >= l2 && l2 + l3 >= l1) {
			if(l1 == l2 && l2 == l3 && l3 == l1) {
				System.out.println("Triangulo Equilatero");
			}
			else if(l1 == l2 || l2 == l3 || l3 == l1) {
				System.out.println("Triangulo Isosceles");
			}
			else if(l1 != l2 && l2 != l3 && l3 != l1) {
				System.out.println("Triangulo Escaleno");
			}
		}
		else {
			System.out.println("Valores invalidos para formar um triangulo");
		}
		
		sc.close();
	}

}
