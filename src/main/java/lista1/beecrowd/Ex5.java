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
 * @brief Class Ex5
 */

import java.util.*;

public class Ex5 {

    public static void main(String[] args) {
        
	// Importar Scanner para leitura de entrada de dados
    	Scanner ler = new Scanner(System.in);
    
	// Declarar variáveis
   	 float X, Y;
    
	// Leitura das variáveis
   	 X = ler.nextFloat();
   	 Y = ler.nextFloat();
    
	// Se X for igual a 0 e Y diferente de 0, está no eixo Y
   	 if(X == 0 && Y != 0){
    	    System.out.printf("Eixo Y%n");

	// Se X for diferente de 0 e Y igual a 0, está no eixo X
   	 }else if(X != 0 && Y == 0){
   	     System.out.printf("Eixo X%n");

	// Se X for maior que 0 e Y maior que 0, está no quadrante 1
   	 }else if(X > 0 && Y > 0){
   	     System.out.printf("Q1%n");

	// Se X for menor que 0 e Y for maior 0, está no quadrante 2
   	 }else if(X < 0 && Y > 0){
   	     System.out.printf("Q2%n");

	// Se X for menor que 0 e Y for menor 0, está no quadrante 3
   	 }else if(X < 0 && Y < 0){
   	     System.out.printf("Q3%n");

	// Se X for maior que 0 e Y for menor 0, está no quadrnate
   	 }else if(X > 0 && Y < 0){
   	     System.out.printf("Q4%n");

	// Se X for igual a 0 e Y for igual 0, está na origem
  	  }else if(X == 0 && Y == 0){
   	     System.out.printf("Origem%n");
    	}
  }
}
