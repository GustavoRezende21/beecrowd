/*
 * Copyright (C) 2024 Gustavo Rezende <gustavorezendegabriel@hotmail.com>
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package lista1.beecrowd;

/**
 *
 * @author Gustavo Rezende <gustavorezendegabriel@hotmail.com>
 * @date 03/03/2024
 * @brief Class Ex4
 */

import java.util.*;

public class Ex4 {

    public static void main(String[] args) {
        
	// Importar Scanner para leitura de entrada de dados
    	Scanner ler = new Scanner(System.in);

	// Declaração de variável
    	double num;

	// Ler variável
   	num = ler.nextDouble();

	// Se a variável for maior ou igual e 0 e menor ou igual a 25, escreva o intervalo
    	if (num >= 0 && num <= 25){
    	    System.out.println("Intervalo [0,25]");

	// Se a variável for maior que 25 e menor ou igual a 50, escreva o intervalo
   	}else if (num > 25 && num <= 50){
   	    System.out.println("Intervalo (25,50]");  

	// Se a variável for maior que 50 e menor ou igual a 75, escreva o intervalo
   	}else if (num > 50 && num <= 75){
   	    System.out.println("Intervalo (50,75]");

	// Se a variável for maior que 75 e menor ou igual a 100, escreva o intervalo
  	}else if (num > 75 && num <= 100){
  	    System.out.println("Intervalo (75,100]");

	// Senão, está fora do intervalo
   	 }else {
   	     System.out.println("Fora de intervalo");
  	  }
    }
}
