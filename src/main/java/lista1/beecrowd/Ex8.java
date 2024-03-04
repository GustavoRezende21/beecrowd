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
 * @brief Class Ex8
 */

import java.util.*;

public class Ex8 {

    public static void main(String[] args) {
        
	// Importar Scanner para leitura de entrada de dados
	Scanner ler = new Scanner (System.in);
		
	// Declarar variável N
	int N;
		
	// Ler variável N
	N = ler.nextInt();
		
	// Estrutura de repetição iniciando i como i, i tem que ser menor ou igual a N, com incremento 1
	for (int i = 1; i <= N; i++) {
		
	// Se N tiver resto i igual a zero, exibir na tela
	if (N % i == 0) {
	System.out.println(i);
		}
	}
    }
}
