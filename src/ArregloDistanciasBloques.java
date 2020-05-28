import java.util.LinkedList;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
/**
 * Write a description of class ArregloDistanciasBloques here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ArregloDistanciasBloques extends QuickSort
{
   public LinkedList<DistanciasBloques> distblo = new LinkedList<>();
   
   public void leerDistancias()
   {
       try{
           File p = new File("DistanciasBloques.csv");
           Scanner scan = new Scanner(p);
           
           int t = 171;
           int c = 0;
           for(int i = 0; i < t; i++)
           {
               String linea = scan.nextLine();
               String [] s = linea.split(",");
               
               c++;
               int bi = Integer.parseInt(s[0]);
               int bf = Integer.parseInt(s[1]);
               int d = Integer.parseInt(s[2]);
               
               DistanciasBloques aux = new DistanciasBloques(bi, bf, d);
               
               distblo.add(aux);
           }
           
           for(int i = 0; i < t; i++)
           {
               System.out.println(distblo.get(i).getDistancia());
           }
       } catch (FileNotFoundException e) {
            System.out.println("¡El Archibo no existe!");
           }
   }
}
