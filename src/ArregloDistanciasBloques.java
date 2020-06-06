import java.util.LinkedList;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
/**
 * Esta clase permite la lectura de un archivo .csv llamado DistanciasBloquesCorto.csv.
 * Este archivo es un archivo recordado del archivo orginal llamado DistanciasBloques.csv.
 * Este recorte se efectuó para permitir una prueba del buen funcionamiento del código.
 * Al efectuar a lectura de dicho archivo, la clase crea una LinkedList de DistanciasBloques
 * que contiene datos correspondientes a las distancias entre los bloques. 
 * 
 * @author Santiago Ospina
 * @version 26/06/2020
 */
public class ArregloDistanciasBloques 
{
   public LinkedList<DistanciasBloques> distblo = new LinkedList<>();
   
   /**
    * Método que permite la lectura del archivo DistanciasBloquesCorto.csv, crea 
    * una LinkedList de DistanciasBloques y lo llena con los elementos leidos.
    */
   public void leerDistancias()
   {
       try{
           File p = new File("DistanciasBloquesCorto.csv");
           Scanner scan = new Scanner(p);
           
           int t = 20;
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
