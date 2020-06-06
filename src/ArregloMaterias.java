import java.util.LinkedList;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

/**
 * Esta clase permite la lectura de un archivo .csv llamado mat20192Corto.csv.
 * Este archivo es un archivo recordado del archivo orginal llamado mat20192.csv.
 * Este recorte se efectuó para permitir una prueba del buen funcionamiento del código.
 * Al efectuar a lectura de dicho archivo, la clase crea una LinkedList de mat20192 
 * que contiene cada matricula leida con sus respectivos codigos de estudiantes, 
 * codigos de materias y grupos.
 * 
 * @author Jose Miguel Galindo Barco 
 * @version 26/05/2020
 */
public class ArregloMaterias
{
   public LinkedList<mat20192> mat = new LinkedList<>();
   
   /**
    * Método que permite la lectura del archivo mat20192Corto.csv, crea 
    * una LinkedList de mat20192 y lo llena con los elementos leidos en cada linea.
    */
   public void leerMaterias()
   {
       try{
        File p = new File("mat20192Corto.csv");
        Scanner scan = new Scanner(p);
        
        int t = 20;
        for(int i = 0; i < t; i++)
        {
            String linea = scan.nextLine();
            String [] separar= linea.split(",");
            int code = Integer.parseInt(separar[0]);
            String matiere = separar[1];
            int groupe = Integer.parseInt(separar[2]);
            
            mat20192 aux = new mat20192(code, matiere, groupe);
            mat.add(aux);
        }
        
        
        }catch (FileNotFoundException e) {
            System.out.println("¡El Archibo no existe!");
           }
   }
}
