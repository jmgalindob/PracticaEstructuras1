import java.util.LinkedList;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
/**
 * Esta clase permite la lectura de un archivo .csv llamado pa20192Corto.csv.
 * Este archivo es un archivo recordado del archivo orginal llamado pa20192.csv.
 * Este recorte se efectuó para permitir una prueba del buen funcionamiento del código.
 * Al efectuar a lectura de dicho archivo, la clase crea una LinkedList de pa20192 
 * que contiene datos correspondientes al plan academico del segundo semestre del 2019.
 * 
 * @author Jose Miguel Galindo y Santiago Ospina
 * @version 02/06/202
 */
public class ArregloPa20192
{
   public LinkedList<pa20192> pa = new LinkedList<pa20192>();
   
   /**
    * Método que permite la lectura del archivo pa20192Corto.csv, crea 
    * una LinkedList de pa20192 y lo llena con los elementos leidos.
    */
   public void leerpa()
   {
       try {
           File p = new File ("pa20192Corto.csv");
           Scanner scan = new Scanner(p);
           
           int tamaño = 21;
           int count = 0;
           int c = 0;
           for(int i = 0; i < tamaño; i++)
           {
               String linea = scan.nextLine();
               
               
               String [] separo = linea.split(",");
               
               String asignatura = separo[0];
               int clase = Integer.parseInt(separo[1]);
               int profe = Integer.parseInt(separo[2]);
               String dia = separo[3];
               String comienzo = separo[4];
               String finish = separo[5];
               
               int salon = Integer.parseInt(separo[6]);
               
               
               
               
               pa20192 aux = new pa20192(asignatura, clase, profe, dia, comienzo, finish,salon);
               pa.add(aux);
               
               
           }
           
           }catch (FileNotFoundException e) {
            System.out.println("¡El Archibo no existe!");
           }
   }
   
}
