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
        int i = 0;
        int j = 1;
        
        String iguales = null;
        while(i < tpa -1)
        {
            while(j < tpa)
            {
                 if(planAcademico.get(i).getProfesor() == 1 && planAcademico.get(i).getProfesor() != planAcademico.get(j).getProfesor())
                {
                    if(planAcademico.get(i).getDia().compareTo(planAcademico.get(j).getDia()) == 1)
                    {
                    c++;
                    iguales = planAcademico.get(j).getMateria();
                    System.out.println(iguales);
                    }
                }
                j++;
            }
            i++;
        }
        System.out.println(c);
        
        
    }
}
