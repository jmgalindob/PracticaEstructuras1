
/**
 * Write a description of class Aulas here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Aulas
{
   String identificacion = null;
   String tipoAula = null;
   int capacidad = 0;
   int acceso = 0;
   
   public Aulas(String id,String tipo, int cap, int acc)
   {
       identificacion = id;
       tipoAula = tipo;
       capacidad = cap;
       acceso = acc;
   }
   
   public String getId()
   {
       return identificacion;
   }
   
   public String getTipo()
   {
       return tipoAula;
   }
   
   public int getCap()
   {
       return capacidad;
   }
   
   public int getAcceso()
   {
       return acceso;
   }
}
