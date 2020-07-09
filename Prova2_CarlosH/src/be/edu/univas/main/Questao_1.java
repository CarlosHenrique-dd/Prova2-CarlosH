package be.edu.univas.main;

import java.util.Scanner;

public class Questao_1 {
public static void main (String[]args) {
	Scanner sc = new Scanner(System.in);
	double[] a = new double[12];
	double[] b= new double[12];
	double ma = 0,mea = 0,ta = 0,mb = 0,meb = 0,tb = 0;
	
	System.out.println("Contas Primeiro Morador.");
	for(int i=0; i<12; i++) {
		a[i] = sc.nextDouble();
		if(mea == 0) {mea = a[i];}
		if(mea > a[i]){mea = a[i];}
		if(a[i]>ma) {ma=a[i];}
		ta = ta + a[i];}
	
	System.out.println("Contas Segundo Morador.");
	for(int i=0;i<12;i++) {
		b[i] = sc.nextDouble();
		if(meb == 0){meb = b[i];}
		if(meb > b[i]) {meb = b[i];}
		if(b[i]>mb) {mb=b[i];}
		tb = tb + b[i];
	}
	System.out.println("Primeiro Morador.");
	System.out.println("Maior conta: "+ma);
	System.out.println("Menor conta: "+mea);
	System.out.printf("Media de Contas: %.2f",ta/12);
	System.out.println("");
	System.out.println("Segundo Morador.");
	System.out.println("Maior conta: "+mb);
	System.out.println("Menor conta: "+meb);
	System.out.printf("Media de Contas: %.2f",tb/12);

	sc.close();
			}

}
