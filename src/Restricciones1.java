import java.io.*;
import java.util.LinkedList;
/**
 * Write a description of class Restricciones here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Restricciones1
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
        
        
        
        String iguales = null;
        String m = null;
        for(int i =0;i < tpa -1;i++)
        {
            
                 if(planAcademico.get(i).getProfesor() == 1 && planAcademico.get(i).getProfesor() != planAcademico.get(i+1).getProfesor())
                {
                    for(int j = 1;j < tpa;j++)
                    {   
                    if(planAcademico.get(i).getDia().compareTo(planAcademico.get(j).getDia()) == 1)
                    {
                    c++;
                    iguales = planAcademico.get(j).getMateria();
                    m= planAcademico.get(j).getDia();
                    System.out.println(iguales + "   " + m);
                    }
                }
            }
        }
        System.out.println(c);
        
        
    }
}
