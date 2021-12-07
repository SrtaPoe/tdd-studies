package com.oliveira.calculofatorial;



public class Fatorial {
	
	int numero;
	
	int calculoFatorial(int numero) {
		int fat = 1;
		
		if(numero < 0) {
			throw new RuntimeException("Numeros negativos não são permitidos");
		}
		
		
		while(numero > 0) {
			if(numero == 0) {
				return fat = 0;
			}else {
				fat = fat * numero;
				numero--;
			}
			
		}
		
		return fat;
	}

}
