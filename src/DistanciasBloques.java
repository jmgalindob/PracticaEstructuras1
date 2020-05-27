
/**
 * Write a description of class DistanciasBloques here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class DistanciasBloques
{
    int bloqueInicial = 0;
    int bloqueFinal = 0;
    int distancia = 0;
    
    public DistanciasBloques(int bloquei, int bloquef, int dist)
    {
        bloqueInicial = bloquei;
        bloqueFinal = bloquef;
        distancia = dist;
    }
    
    public int GetBloqueInicial()
    {
        return bloqueInicial;
    }
    
    public int GetBloqueFinal()
    {
        return bloqueFinal;
    }
    
    public int  getDistancia()
    {
        return distancia;
    }
}
