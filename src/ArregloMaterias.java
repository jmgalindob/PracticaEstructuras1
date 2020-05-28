import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
public class ArregloMaterias
{
   
   public LinkedList<mat20192> mat = new LinkedList<mat20192>();
   
   public void leerMaterias()
   {
       try{
        File p = new File("mat20192.csv");
        Scanner scan = new Scanner(p);
        
        int t = 111525;
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
        
        for(int i = 0; i < t; i++)
        {
            System.out.println(mat.get(i).getCodigoEstudiante());
        }
        }catch (FileNotFoundException e) {
            System.out.println("¡El Archibo no existe!");
           }
   }
}
