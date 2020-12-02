
// practica de arreglo 
//El programa escrito a continuación lee NUM enteros en un arreglo, multiplica los elementos del arreglo y visualiza el producto
package practicas.de.arreglos;
 import java.util.Scanner;//se declara el tipo de importacion a utilizar
/**
 *
 * @author JOSE
 */
public class PracticasDeArreglos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
    Scanner entrada = new Scanner(System.in); //se declara el tipo de entrada para utilizar  
    int NUM = 10;//se declara el numero de elemento
    
    int []nums= new int[NUM];// se declara el arreglo desde el teclado
    int total = 1; //se declara numero de inicio
    System.out.println("Por favor, introduzca " + NUM + " datos");// se introduce el mensaj  desde el inicio
    for (int i = 0; i < NUM; i++)// se utiliza un for para iterar
{
    nums[i] = entrada.nextInt();// se lee el mensaje 
}
    System.out.print("\nLista de números: ");// se introduce el mensaje desde el teclado
    for (int i = 0; i < NUM; i++)// se utiliza un for para iterar la funcion
{
    System.out.print(" " + nums[i]);// se lee el mensaje de los datos introducidos
    total *= nums[i];// se multiplica la funcion de los numeros introducidos desde el teclado
}
    System.out.println("\nEl producto de los números es " + total); //se imprime el resultados de los numeros introducidos
}
    }
    
     
