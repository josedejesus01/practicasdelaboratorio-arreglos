
package practicas.de.arreglos;
import java.util.Scanner;//se declara el tipo de importacion a utilizar
/**
 *
 * @author JOSE
 */
public class arreglo_multidimensional {
   
    public static void main(String[] args) {
        
      
      int[][][][] numeros=new int[4][4][4][4];// se declara el arreglo desde el teclado
        int numero=1;// se introduce nuestro variable a utilizar
       
        { 
            // se añade un for de forma aninado para la funcion de los arreglos
        for (int i= 0; i < numeros.length; i++) 
            for (int j= 0; j < numeros[i].length; j++) 
                for (int k= 0; k < numeros[j].length; k++) 
                for (int l= 0; l < numeros[k].length; l++)      
                    numeros[i][j][k][l] = numero++;//se almacena las variables para indicar que son iguales al numero para la iteracion
                                                
                
        {
        // para mostrar los datos almanacenados se realiza la misma forma de for anidados 
        for (int i= 0; i < numeros.length; i++){ //se agrega el operador para separar los datos introducidos en 4 columnas*4filas
            for (int j= 0; j < numeros[i].length; j++){//se agrega otro operador para separar los datos en 4filas * 4columnas
                for (int k= 0; k < numeros[j].length; k++){// se agrega otro operador para separar los datos de 4filas por 4 columnas
                     for (int l= 0; l < numeros[k].length; l++)
                    System.out.print(numeros[i][j][k][l]+"");// se imprime los numeros introducidos en nuestro arreglo
                System.out.println("   ");// se introduce un mensaje de tipo vacio para generar espacio en los arreglos
                }
            System.out.println("");// se introduce otro mensaje para generar espacio en nuestro resultado
            }
        }
    }
    }
}
}

