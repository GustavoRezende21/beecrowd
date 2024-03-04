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
 * @brief Class Ex7
 */

import java.util.*;

public class Ex7 {

    public static void main(String[] args) {
        // Importar Scanner para leitura de entrada de dados
        Scanner ler = new Scanner(System.in);

        // Declarar variáveis e definir seu valor
        int X, Y;

        while (true) {
            // Ler valores de X e Y
            X = ler.nextInt();
            Y = ler.nextInt();

            // Se X for maior que 0 e Y for maior que 0, está no primeiro quadrante
            if (X > 0 && Y > 0) {
                System.out.println("primeiro");
            } else if (X < 0 && Y > 0) {
                // Se X for menor que 0 e Y for maior que 0, está no segundo quadrante
                System.out.println("segundo");
            } else if (X < 0 && Y < 0) {
                // Se X for menor que 0 e Y for menor que zero, está no terceiro quadrante
                System.out.println("terceiro");
            } else if (X > 0 && Y < 0) {
                // Se X for maior que 0 e Y for menor que 0, está no quarto quadrante
                System.out.println("quarto");
            } else {
                // Se X e Y forem iguais a zero, encerrar o programa
                break;
            }
        }
    }
}
