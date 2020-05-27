
public class Estudiantes
{
   int nmEstudiante = 0;
   int discapacidad = 0;
   
   public Estudiantes(int numero, int dis)
  {
      nmEstudiante = numero;
      discapacidad = dis;
  }
  
  public int codigoEstudiante()
  {
      return nmEstudiante;
  }
  
  public int condicion()
  {
      return discapacidad;
  }
}
