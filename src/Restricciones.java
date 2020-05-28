import java.io.*;
import java.util.LinkedList;
/**
 * Write a description of class Restricciones here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Restricciones
{
    LinkedList<Estudiantes> estudiante;
    LinkedList<pa20192>  planAcademico;
    LinkedList<mat20192> materia;
    LinkedList<Aulas> aula;
    LinkedList<DistanciasBloques> distb;
    
    public void retriccionProfesor()
    {
        ArregloPa20192 refPa = new ArregloPa20192();
        
        refPa.leerpa();
        planAcademico = refPa.pa;
        
        int tpa = planAcademico.size();
        int c = 0;
        int o = 0;
        for(int i = 0; i < tpa ; i++)
        {
            o++;
            System.out.println(o);
            for(int j = 1; j < tpa ; i++)
            {
                   //if(planAcademico.get(i).getProfesor() == planAcademico.get(i).getProfesor())
                   //{
                    c++; 
                    System.out.println(c);
                   //}
            
             }
            
        }
        
        
    }
}
