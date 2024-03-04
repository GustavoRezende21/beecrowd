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
 * @brief Class Ex2
 */

import java.util.*;

public class Ex2 {

    public static void main(String[] args) {
        
	// Importar Scanner para leitura de entrada de dados
	Scanner ler = new Scanner(System.in);

	// Declaração de variáveis
	int A,B,C,D;
	
	// Leitura de todas as variáveis
	A = ler.nextInt();
	B = ler.nextInt();
	C = ler.nextInt();
	D = ler.nextInt();
	    
	// Condição para aceitar valores ou não
        if ((B > C) && (D > A) && ((C + D) > (A + B)) && (C > 0) && (D > 0) && (A % 2 == 0)) {
            System.out.println("Valores aceitos");
        } else {
            System.out.println("Valores nao aceitos");
            
        }
    }
}
