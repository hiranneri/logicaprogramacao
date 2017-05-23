package devhiranneri.logica.ordenacao;

import java.util.Scanner;

public class OrdenacaoBolha {
	public static void main(String[] args) {
		 
		 String nomes[] = new String [5];  
		 Scanner sc = new Scanner(System.in);
		 for(int i=0;i<nomes.length;i++){
		    System.out.println("Digite o nome");
		    nomes[i] = sc.next(); 
		    

		 }

		 /** O algoritmo bolha, irá verificar de dois em dois se os elementos são maiores  
		  * ou menores entre eles, caso o primeiro elemento seja maior que o segundo  
		  * (o método compareTo irá retornar um número positivo (maior que 0(zero))).
		  * Para a comparação entre os dois elementos, eu utilizo dois for's encadeados,  
		  * sendo que o segundo, irá iteirar + 1 com o índice do primeiro for, para que  
		  * consiga ler o próximo elemento.  
		  * nomes.lenght-1 - É para que o índice da variável j não passe do maior número  do array, 
		  * e não lance uma exceção ArrayIndexOutOfBoundsException.
		  * Assim independente da ordem que o usuário for passar os nomes, 
		  * o algoritmo irá  verificar caractere por caractere e ordenando de forma alfabética.
		  */
		
		 for (int i = 0; i < nomes.length - 1; i++)  
			    for (int j = i + 1; j < nomes.length; j++)  
			        if (nomes[i].compareTo(nomes[j]) > 0) {  
			            String temp = nomes[i];  
			            nomes[i] = nomes[j];  
			            nomes[j] = temp;  
			        }
		 
		//Somente para mostrar, que foi salvo os nomes
		 for(String valores:nomes){
		   System.out.println(valores);
		 }
		 

	}
}
