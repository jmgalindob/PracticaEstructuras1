
/**
 * Esta clase permite la definición y la creación del objeto pa20192
 * que corresponde al plan academico para el segundo semestre academico 
 * del 2019.Este objeto cuanta con 7 variables diferentes. La primera lleva 
 * el nombre de materia y corresponde a la materia registrada, es del tipo String.
 * El segundo corresponde al grupo de la materia registrada y es del tipo entero.
 * El tercero lleva el nombre de profesor y corresponde al código de profesor a
 * asignado a esta materia, es del tipo entero. El cuarto, lleva el nombre de día,
 * corrspode al día que se dara la clase de la amteria asignada y es del tipo String.
 * El quinto, lleva el nombre de inicio y corresponde alhorario de inicio de de la clase y 
 * es del tipo String. El sexto, lleva el nombre de fin y corresponde al horario de finalización
 * del curso, es del tipo String. El septimo y ultimo, lleva el nombre de aula, corresponde al 
 * codigo del aula asignada para que el curso se desarrolle, es del tipo entero.
 * 
 * @author Jose Miguel Galindo y Santiago Ospina 
 * @version 02/06/202
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
   
   /**
    * Constructor de de la clase pa20192.
    * Este constructor permite la inicialización de cada una de las variables
    * atribuyendoles las especificaciones correspondientes.
    * @param mat El parametro mat inicializa el código de la materia con un código en especifico
    * @param gp El parametro gp inializa el grupo con un numero de grupo en especifico
    * @param pr El parametro pr inializa el código del profesor con un código en especifico
    * @param d El parametro d inializa el dia con un día en especifico
    * @param ini El parametro ini inializa el horario de inicio de la clase con una hora en especifico
    * @param fn El parametro fn inializa el horario de fin de la clase con una hora en especifico
    * @param sala El parametro sala inializa el aula donde se llevara a cabo la clase con un aula en especifico
    * 
    */
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
   
   /**
    * Método que devuelve el código de la materia
    * @return Código de la materia
    */
   public String getMateria()
   {
       return materia;
   }
   
   /**
    * Método que devuelve el número del grupo
    * @return número del grupo
    */
   public int getGrupo()
   {
       return grupo;
   }
   
   /**
    * Método que devuelve el código del profesor
    * @return código del profesor
    */
   public int getProfesor()
   {
       return profesor;
   }
   
   /**
    * Método que atribuye un nuevo código de profesor a la variable profesor
    * @param prof El parametro prof corresponde a un nuevo código de profesor 
    */
   public void setProfesor(int prof)
   {
       profesor = prof;
   }
   
   /**
    * Método que devuelve el día que se llevara a cabo la clase
    * @return día en el que se desarrollara la clase
    */
   public String getDia()
   {
       return dia;
   }
   
   /**
    * Método que devuelve la hora de inicio de la clase
    * @return hora de inicio de la clase
    */
   public String getInicio()
   {
       return inicio;
   }
   
   /**
    * Método que cambia la hora de inicio de una clase por una nueva hora de inicio
    * @param ini El parametro ini corresponde a la nueva hora de inicio de la clase
    */
   public void setInicio(String ini)
   {
       inicio = ini;
   }
   
   /**
    * Método que devuelve la de de finalización de la clase
    * @return hora de finalización de la clase
    */
   public String getFin()
   {
       return fin;
   }
   
   /**
    * Método que cambia la hora de fin de una clase por una nueva hora de fin
    * @param fn El parametro ini corresponde a la nueva hora de fin de la clase
    */
   public void setFin(String fn)
   {
       fin = fn;
   }
   
   /**
    * Método que devuelve el aula en la que se llevara a cabo la clase
    * @return aula en la que se desarrola la clase
    */
   public int getAula()
   {
       return aula;
   }
   
   /**
    * Método que cambia el aula en la que se desarrollara la clase por una nueva aula
    * @param salon El parametro salon corresponde al código de la nueva aula de clase
    */
   public void setAula(int salon)
   {
       aula = salon;
   }
}
