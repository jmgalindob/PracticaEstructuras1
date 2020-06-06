import java.util.LinkedList;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

/**
 * Esta clase permite la lectura de un archivo .csv llamado AulasCorto.csv.
 * Este archivo es un archivo recordado del archivo orginal llamado Aulas.csv.
 * Este recorte se efectuó para permitir una prueba del buen funcionamiento del código.
 * Al efectuar a lectura de dicho archivo, la clase crea una LinkedList de Aulas 
 * que contiene datos correspondientes a las diferentes aulas de la universidad con sus
 * respectivas caracteristicas, tales como: codigo, tipo de aula, capadidad y acceso.
 * 
 * @author Jose Miguel Galindo y Santiago Ospina
 * @version 02/06/202
 */
public class ArregloAulas
{
   public LinkedList<Aulas> aula = new LinkedList<Aulas>();
    
   /**
    * Método que permite la lectura del archivo AulasCorto.csv, crea 
    * una LinkedList de Aulas y lo llena con los elementos leidos.
    */
   public void leerAulas()
   {
       try{
           File p = new File("aulasCorto.csv");
           Scanner scan = new Scanner(p);
           
           int t= 19;
           for( int i = 0; i < t; i++)
           {
               String linea = scan.nextLine();
               
               String [] s = linea.split(",");
               //System.out.println(s[0]);
               String ide = s[0];
               String tip =  s[1];
               int capa = Integer.parseInt(s[2].trim());
               String toto = s[3];
               toto=toto.replace(";","");
               
               if(toto == "1\"")
               {
                   System.out.println(s[0]);
               }
               //System.out.println("123456789");
               int access = Integer.parseInt(toto.trim());
              Aulas aux = new Aulas(ide, tip, capa, access);
               
               aula.add(aux);
           }
           
           for(int i = 0; i < t; i++)
           {
               System.out.println(aula.get(i).getId());
           }
           
        }catch (FileNotFoundException e) {
            System.out.println("¡El Archibo no existe!");
           }
    }
}
