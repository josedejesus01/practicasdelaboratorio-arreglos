// este arreglo tiene forma de cubo y almacena 27 numeros enteros
package practicas.de.arreglos;

public class practicas_de_arreglos_tridimensional {
   
public static void main(String[] args) {
       
    int[][][] numeros = new int[3][3][3];// se introduce un arreglo de tres dimensiones 
    int numero = 1; // se introduce un numero para la iteracion
        
   
    {  // se añade un for de forma aninado para la funcion de los arreglos
        for (int i= 0; i < numeros.length; i++) 
            for (int j= 0; j < numeros[i].length; j++) 
                for (int k= 0; k < numeros[j].length; k++) 
                    numeros[i][j][k] = numero++;//se almacena las variables para indicar que son iguales al numero para la iteracion
                                                
                
        {
        // para mostrar los datos almanacenados se realiza la misma forma de for anidados 
        for (int i= 0; i < numeros.length; i++){ //se agrega el operador para separar los datos introducidos en 3 columnas*9filas
            for (int j= 0; j < numeros[i].length; j++){//se agrega otro operador para separar los datos en 3filas *3columnas
                for (int k= 0; k < numeros[j].length; k++)// aqui ya no se le añade ninguno porque mostraria en pantalla de una sola orden
                    System.out.print(numeros[i][j][k]+"");// se imprime los numeros introducidos en nuestro arreglo
                System.out.println("   ");// se introduce un mensaje de tipo vacio para generar espacio en los arreglos
                }
            System.out.println("");// se introduce otro mensaje para generar espacio en nuestro resultado
            }
        }
    }
    }
}




               
            
            
        
         
    


   
                   
                   
