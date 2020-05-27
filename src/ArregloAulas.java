import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

/**
 * Write a description of class ArregloAulas here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ArregloAulas
{
   public ArrayList<Aulas> aula = new ArrayList<Aulas>();
    
   public void leerAulas()
   {
       try{
           File p = new File("aulas.csv");
           Scanner scan = new Scanner(p);
           
           int t= 385;
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
