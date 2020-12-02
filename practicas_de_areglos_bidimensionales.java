//Codificar un programa para dar entrada y posterior visualización de un arreglo bidimensional.
package practicas.de.arreglos;

import java.util.Scanner;

/**
 *
 * @author JOSE
 */
public class practicas_de_areglos_bidimensionales {

    public static void main(String[] arg) {

        int v[][] = new int[3][3];// se declara el arreglo de dos dimensiones
        leer(v);// se declara el metodo leer para los elementos de la matriz
        visualizar(v);// se declara visualizar para la muestra de valores en la pantalla
    }

    static void leer(int a[][]) {//El método leer() da entrada a los elementos de la matriz que se pasa como argumento,
        int i, j;// se declara las variables a utilizar
        Scanner entrada = new Scanner(System.in);// se introduce el escanner para realizar la operacion segun el tipo
        System.out.println("Entrada de datos de la matriz");// se introduce el mensaje desde el teclado
        for (i = 0; i < a.length; i++) {// se utiliza un for para iterar los datos 
            System.out.println("Fila: " + i);// se introduce el mensaje desde le teclado
            for (j = 0; j < a[i].length; j++) {// se utiliza el for para iterar la operacion de la fila
                a[i][j] = entrada.nextInt();// se introduce as va
            }
        }
    }

    static void visualizar(int a[][]) {//y el método visualizar() muestra la tabla en la pantalla.
        int i, j;// se declara un las variables para la visualizacion 
        System.out.println("\n\t Matriz leída\n");// se introduce el mensaje desde el teclado
        for (i = 0; i < a.length; i++) {// se utiliza el for para la iteracion de la variable i
            for (j = 0; j < a[i].length; j++) {// se utiliza el for para la visualizacion de la variable j
                System.out.print(a[i][j] + " ");// se imprime el mensaje 
            }
            System.out.println(" ");// se imprime el mensaje vacio para la separacion de los valores introducidos
        }
    }
}
