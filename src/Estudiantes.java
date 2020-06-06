/**
 * Esta clase permite la creación y definición del objeto Estustudiantes.
 * Este objeto de cuento con 2 atributos de tipo entero, el primer atributo
 * lleva el nombre de nmEstudiante que corresponde el codigo del estudiante, 
 * el segundo atributo lleva el nombre de discapacidad corresponde a la paraticulidad 
 * que el estudiante puede tener, es decir que si el estudiante tiene una discapacidad
 * el valor es este atributo sera 1.
 * @autor: Jose Miguel Galindo
 * @version: 26/05/2020
 */
public class Estudiantes
{
   int nmEstudiante = 0;
   int discapacidad = 0;
   
   /**
    * Constructor que permite la inicialización de cada Estudiante especificandole
    * su codigo y su discapacidad, si tiene una
    * @param numero El parametro número define el número del código del estudiante
    * @param dis El parametro dis define si el estudiante tiene una discapacidad o no
    */
   public Estudiantes(int numero, int dis)
  {
      nmEstudiante = numero;
      discapacidad = dis;
  }
  
  /**
   * Método que devuelve número del código del Estudiante
   * @return El codigo del estudiante en cuestión
   */
  public int codigoEstudiante()
  {
      return nmEstudiante;
  }
  
  /**
   * Método que devuelve 1 si el estudiante tiene una discapacidad
   * ó 0 si no tiene una discapacidad
   * @return 1 ó 0
   */
  public int condicion()
  {
      return discapacidad;
  }
}
