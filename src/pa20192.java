
/**
 * Write a description of class pa20192 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class pa20192
{
   String materia = null;
   int grupo = 0;
   int profesor = 0;
   String dia = null;
   String inicio = null;
   String fin = null;
   int aula = 0;
   
   public pa20192(String mat, int gp, int pr, String d, String ini, String fn, int sala)
   {
       materia = mat;
       grupo = gp;
       profesor = pr;
       dia = d;
       inicio = ini;
       fin = fn;
       aula = sala;
   }
   
   public String getMateria()
   {
       return materia;
   }
   
   public int getGrupo()
   {
       return grupo;
   }
   
   public int getProfesor()
   {
       return profesor;
   }
   
   public String getDia()
   {
       return dia;
   }
   
   public String getInicio()
   {
       return inicio;
   }
   
   public String getFin()
   {
       return fin;
   }
   
   public int getAula()
   {
       return aula;
   }
}
