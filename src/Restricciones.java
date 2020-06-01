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
    
    public void retriccion()
    {
        ArregloPa20192 refPa = new ArregloPa20192();

        refPa.leerpa();
        planAcademico = refPa.pa;

        int tpa = planAcademico.size();
        int c = 0;
        int o = 0;

        String iguales = null;
        String m = null;
        
        System.out.println("Evaluamos la primera restricción y una parte de la tercera restricción");
        for(int i =0;i < tpa - 1 ;i++)
        {

            if(planAcademico.get(i).getProfesor() == 1)
            {
                System.out.println( planAcademico.get(i).getMateria() + " no tiene profesor asignado");
            }

            if(planAcademico.get(i).getProfesor() != 1 && planAcademico.get(i).getProfesor() == planAcademico.get(i+1).getProfesor())
            {

                for(int j = i + 1; j < tpa ; j++)
                {
                    if(planAcademico.get(i).getDia().equalsIgnoreCase(planAcademico.get(j).getDia()) )
                    {
                        //System.out.println(planAcademico.get(i).getDia() + "   "+ planAcademico.get(j).getDia());
                        //break;

                        if(planAcademico.get(i).getInicio().equalsIgnoreCase( planAcademico.get(i + 1).getInicio()))
                        {
                            planAcademico.get(j).setInicio("00:00") ;
                            planAcademico.get(j).setFin("00:00");
                           
                        } 

                    }
                }
                System.out.println(planAcademico.get(i).getMateria() + " tiene profesor asignado.");
            }
            
        }
        
        System.out.println("Las materias a las que se les cambio el horario son: ");
        //ArregloPa20192 refModifPa = new ArregloPa20192();
        for(int i = 0; i < tpa; i++)
        {
            //System.out.println(planAcademico.get(i).getInicio());
            //c++;
            if(planAcademico.get(i).getInicio().equalsIgnoreCase("00:00"))
            {
                
                
                System.out.println(planAcademico.get(i).getMateria());
            }
        }
        System.out.println(c);
        
        System.out.println("Evaluamos la segunda restricción y la otra parte de la tercera restricción");
        for(int i =0;i < tpa - 1 ;i++)
        {

            if(planAcademico.get(i).getAula() == 0)
            {
                System.out.println( planAcademico.get(i).getProfesor() + " no tiene aula asignada asignado");
            }

            if(planAcademico.get(i).getAula() != 0 && planAcademico.get(i).getAula() == planAcademico.get(i+1).getAula())
            {
                //System.out.println(planAcademico.get(i).getMateria() + " tiene aula asignada");
                for(int j = i + 1; j < tpa ; j++)
                {
                    if(planAcademico.get(i).getDia().equalsIgnoreCase(planAcademico.get(j).getDia()) )
                    {
                        //System.out.println(planAcademico.get(i).getDia() + "   "+ planAcademico.get(j).getDia());
                        //break;

                        if(planAcademico.get(i).getInicio().equalsIgnoreCase( planAcademico.get(i + 1).getInicio()))
                        {
                            planAcademico.get(j).setInicio("00:00") ;
                            planAcademico.get(j).setFin("00:00");
                        } 
                        
                    }
                }
                
            }
            
        }
        
        //ArregloPa20192 refModifPa = new ArregloPa20192();
        for(int i = 0; i < tpa; i++)
        {
            //System.out.println(planAcademico.get(i).getInicio());
            //7c++;
            if(planAcademico.get(i).getInicio().equalsIgnoreCase("00:00"))
            {
               
                System.out.println(planAcademico.get(i).getProfesor());
            }
        }
        //System.out.println(c);
    }
}
