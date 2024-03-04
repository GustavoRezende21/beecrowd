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
 * @brief Class Ex6
 */

import java.util.*;

public class Ex6 {
    
    public static void main(String[] args) {
    
	// Importar Scanner para leitura de entrada de dados
    	Scanner ler = new Scanner(System.in);
    
	// Declarar variáveis
   	int A, B, C; 
   	int l, m, n;
        
	// Ler variáveis
        A = ler.nextInt();
        B = ler.nextInt();
        C = ler.nextInt();

	// Definir valor das variáveis
        l = 0;
        m = 0;
        n = 0;

	// Condição para ordenar os valores
        if(A > B && A >C){
            l = A;
            if(B > C){
                m = B;
                n = C;
            }else{
                m = C;
                n = B;
            }
            
	// Condição para ordenar os valores
        }else if( B > A && B >C){
            l = B;
            if(A > C){
                m = A;
                n = C;
            }else{
                m = C;
                n = A;
            }
            
	// Condição para ordenar os valores
        }else if(C > B && C > A){
            l = C;
            if(B > A){
                m = B;
                n = A;
            }else{
                m= A;
                n = B;
            }
            
        }
        
	// Exibir os valores na tela
        System.out.printf("%d%n",n);
        System.out.printf("%d%n",m);
        System.out.printf("%d%n",l);
        System.out.printf("%d%n",A);
        System.out.printf("%d%n",B);
        System.out.printf("%d%n",C);
    }
}
