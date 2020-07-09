package be.edu.univas.main;

import java.util.Scanner;

public class Questao_3 {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		double t = 0;
		
		for(int i=0;i<10;i++) {
			double s = sc.nextDouble();
			t = t+s;
		}
		double au = (t*15)/100;
		double sala = t + au;
		System.out.println("Folha Salarial Antes: "+t);
		System.out.println("Folha Salarial Depois: "+sala);
		sc.close();
	}

}
