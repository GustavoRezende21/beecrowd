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
 * @brief Class Ex3
 */

import java.util.*;

public class Ex3 {

    public static void main(String[] args) {
        
	// Importar Scanner para leitura de entrada de dados
    	Scanner ler = new Scanner(System.in);
        
        // Declarar variáveis
        double A, B, C, delta, R1, R2; 
        
        // Ler as variáveis
        A  = ler.nextDouble();
        B  = ler.nextDouble();
        C  = ler.nextDouble();

        // Cálculo da forma de Delta
        delta = (Math.pow(B,2)) -4*A*C; 
        
        // Raiz quadrada de Delta
        delta = (Math.sqrt(delta));
        
        // Executar condição
        // Se Delta > 0 e A for diferente de 0, escrever os resultados com 5 casas decimais
        if(delta > 0 && A !=0 ){
            R1 = -(B)+delta;
            R2 = -(B)-delta;
            
            R1 = R1 / (2*A);
            R2 = R2 / (2*A);
            System.out.printf("R1 = %.5f%n", R1);
            System.out.printf("R2 = %.5f%n", R2);
           
        // Caso a condição será negativa, responder impossível calcular
        }else{
            System.out.printf("Impossivel calcular");
   	 }
    }   
}
