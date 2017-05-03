package devhiranneri.logicaprogramacao.conversaominutos;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Conversor {
	public static void main(String[]args){
		boolean statusDoValor=true;
		Scanner sc = new Scanner(System.in);
		int horas = 0,minutos=0,valorEmMinutosInformado=0;

		System.out.println("Digite o valor em minutos");
		while(statusDoValor){
			try{
				
				valorEmMinutosInformado = sc.nextInt(); 
				minutos=valorEmMinutosInformado; 
				
				while(minutos>=60){

					horas++;
					minutos-=60;
			   	}
				statusDoValor=false;
			}catch(InputMismatchException e){
			     System.out.println("Valor informado esta incorreto.");
			     System.out.println("Digite novamente ..."); 
				statusDoValor=true;
				sc.next();
			 }
			
		}
		System.out.println(valorEmMinutosInformado+" minutos equivale a "+horas+
				" horas e "+minutos+" minutos"); 
		}
}
