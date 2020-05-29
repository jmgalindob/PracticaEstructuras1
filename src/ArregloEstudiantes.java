import java.util.LinkedList;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
/**
 * Write a description of class ArregloEstudiantes here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ArregloEstudiantes
{
   public LinkedList<Estudiantes> est = new LinkedList<Estudiantes>();
   
   public void leerEstudiantes()
   {
       try{
           File p = new File("estudiantes.csv");
           Scanner scan = new Scanner(p);
           
           int tamaña = 12222;
           int c =0;
           for(int i = 0; i < tamaña; i++)
           {
               String linea = scan.nextLine();
               String [] separado = linea.split(",");
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
                }
            }
            System.out.println(c);
          } catch (FileNotFoundException e) {
            System.out.println("¡El Archibo no existe!");
           }
   }
}