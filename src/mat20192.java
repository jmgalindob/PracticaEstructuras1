
/**
 * Esta clase define y crea el objeto mat20192 que corresponde a la matircuala para 
 * el semestre 2 del año 2019. Este objeto esta confromado por 3 datos o 3 variables.
 * La primera lleva el nombre de código, representa el codidigo del estudiante que esta
 * cursando una materia, esta variable es del tipo entero. La segunda lleva el nombre de materia
 * que corresponde al código de la materia matriculada, esta variable es del tipo String o cadena
 * de caracteres. La tercera y ultima variable lleva el nombre de grupo y corresponde al grupo
 * de la materia en la cual el estudiante esta matriculado, esta variable es del tipo entero.
 * 
 * @author Jose Miguel Galindo
 * @version 26/05/2020
 */
public class mat20192
{
   int codigo = 0;
   String materia = null;
   int grupo = 0;
   /**
    * Constructor que permite la instanciación de la cada variable del objeto 
    * mat20192.
    * @param codigo Este parametro corresponde al código del estudiante matriculado
    * @param mat Este parametro corresponde al código de la materia matriculada
    * @param g Este parametro corresponde al grupo de la materia matriculada
    */
   public mat20192(int c, String mat, int g)
   {
       codigo = c;
       materia = mat;
       grupo = g;
   }
   
   /**
    * Método que devuelve el código del estudiante
    * @return el código del estudiante
    */
   public int getCodigoEstudiante()
   {
       return codigo;
   }
   
   /**
    * Método que devuelve el código de la materia
    * @return La materia matriculada
    */
   public String getMateria20192()
   {
       return materia;
   }
   
   /**
    * Método que delvuelve el grupo de la materia matricula
    * @return El grupo de la materia matricula 
    */
   public int getGroupe()
   {
       return grupo;
   }
}
