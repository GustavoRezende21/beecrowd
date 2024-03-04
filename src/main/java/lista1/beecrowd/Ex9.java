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
 * @brief Class Ex9
 */

import java.util.*;

public class Ex9 {

    public static void main(String[] args) {
        
	// Importar Scanner para leitura de entrada de dados
	Scanner ler = new Scanner (System.in);
		
	// Declarar variáveis
	int N, X;
	
	// Ler o valor N	
	N = ler.nextInt();
	
	// Estrutura de repetição para definir i igual 0, i tem que ser menor que N com incremento 1	
	for (int i = 0; i < N; i++) {
	// Ler a variável X
		X = ler.nextInt();
	// Declarar variável soma igual a 0
		int soma = 0;
	// Estrutura de repetição para definir j igual 1, j tem que ser menor que X com incremento 1	
		for (int j = 1; j < X; j++) {
	// Se X tiver resto em j igual a 0, somar a variável soma mais j
		if (X % j == 0) {
                    soma += j;
			}
		}
			
	// Soma igual X, o número é perfeito
	if (soma == X) {
		System.out.println(X + " eh perfeito");
	}else {
	// Se diferente, não é perfeito
		System.out.println(X + " nao eh perfeito");
			}
		}
	}	
}
