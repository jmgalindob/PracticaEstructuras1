import java.util.LinkedList;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
/**
 * Esta clase permite la lectura de un archivo .csv llamado estudiantesCorto.csv.
 * Este archivo es un archivo recordado del archivo orginal llamado estudiantes.csv.
 * Este recorte se efectuó para permitir una prueba del buen funcionamiento del código.
 * Al efectuar a lectura de dicho archivo, la clase crea una LinkedList de Estudiantes 
 * que contiene todos los estudiantes entrados con sus respectivos códigos y discapacidades
 * 
 * @author Jose Miguel Galindo Barco 
 * @version 26/05/2020
 */
public class ArregloEstudiantes
{
   public LinkedList<Estudiantes> est = new LinkedList<Estudiantes>();
   
   /**
    * Método que permite la lectura del archivo estudiantesCorto.csv, crea 
    * una LinkedList de Estudiantes y lo llena con los elementos leidos.
    */
   public void leerEstudiantes()
   {
       try{
           File p = new File("estudiantesCorto.csv");
           Scanner scan = new Scanner(p);
           
           int tamaña = 20;
           int c =0;
           for(int i = 0; i < tamaña; i++)
           {
               String linea = scan.nextLine();
               String [] separado = linea.split(",");
               System.out.println(linea);
               
               int codigo = Integer.parseInt(separado[0]);
               int disEstudiante = Integer.parseInt(separado[1]);
               Estudiantes aux = new Estudiantes(codigo, disEstudiante);
               est.add(aux);
               
           } 
           
           for(int i = 0; i < tamaña; i++)
           {
               if(est.get(i).condicion() == 1)
               {
                  c++;
                 // System.out.println(est.get(i));
                }
            }
            
          } catch (FileNotFoundException e) {
            System.out.println("¡El Archibo no existe!");
           }
   }
}