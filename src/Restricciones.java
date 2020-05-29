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
        
        
        
    }
}
