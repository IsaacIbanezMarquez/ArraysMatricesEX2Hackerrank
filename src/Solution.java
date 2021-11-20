

import java.io.*;
import java.util.*;



// ENUNCIADO:

// Suma arrays:

/* Donat un array, suma la última posició a tots els elements d'aquest array i imprimeix-ne el resultat.

Input Format

N: tamany de l'array. Introduïm N nombres enters per l'array.

Constraints

NO n'hi ha.

Output Format

Imprimim l'array amb l'últim element sumat.

Sample Input 0

5
100 200 300 400 500
Sample Output 0

600 700 800 900 1000

 */

public class Solution
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int grosor = sc.nextInt();

        int miArray [] = new int [grosor];



        for (int i = 0; i < grosor; i++)
        {
            miArray[i] = sc.nextInt();

        }

        int valorASumar = miArray[grosor-1];

        for (int i = 0; i < grosor; i++)
        {
            valorASumar = valorASumar + miArray[i];

            System.out.print(miArray[i] + miArray[grosor-1] + " ");
        }


    }
}
