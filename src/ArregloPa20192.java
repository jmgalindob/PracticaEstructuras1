import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
/**
 * Write a description of class ArregloPa20192 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ArregloPa20192
{
   public ArrayList<pa20192> pa = new ArrayList<pa20192>();
   
   public void leerpa()
   {
       try {
           File p = new File ("pa20192.csv");
           Scanner scan = new Scanner(p);
           
           int tamaño = 3302;
           int count = 0;
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
           
           for(int i = 0; i < tamaño; i++)
           {
               if(pa.get(i).getAula() ==0)
               {
                  count++;
               }
            }
            System.out.println(count);
           }catch (FileNotFoundException e) {
            System.out.println("¡El Archibo no existe!");
           }
   }
}
