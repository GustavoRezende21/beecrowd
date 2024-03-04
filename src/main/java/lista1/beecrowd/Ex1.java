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
 * @brief Class Ex1
 */

import java.util.*;

public class Ex1 {

    public static void main(String[] args) {
        
		// Importar Scanner para leitura de entrada de dados
		Scanner ler = new Scanner(System.in);
		
		// Declaração de variáveis
		int QuantidadeHoras, QuantidadeMinutos, QuantidadeSegundos;
		
		// Solicitar ao usuário que informe a quantidade de segundos e o programa realizará a leitura
		System.out.print("");
		QuantidadeSegundos = ler.nextInt();
		
		// A quantidade de horas é a divisão dos segundos dividido por 3600
		QuantidadeHoras = QuantidadeSegundos / 3600;
		// O resto 36000 são os segundos
		QuantidadeSegundos = QuantidadeSegundos % 3600;
		
		// A quantidade de minutos é a quantidade de segundos divido por 60
		QuantidadeMinutos = QuantidadeSegundos / 60;
		// A quantidade de segundos é o resto 60
		QuantidadeSegundos = QuantidadeSegundos % 60;
		
		// Adicionar a variável
		QuantidadeSegundos = QuantidadeSegundos;
		
		// Imprimir resultados
		System.out.println(QuantidadeHoras + ":" + QuantidadeMinutos + ":" + QuantidadeSegundos);
    }
 
}
