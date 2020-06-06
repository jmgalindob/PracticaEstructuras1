import java.util.*;
import java.io.*;
import java.util.LinkedList;
/**
 * Write a description of class main here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class main
{
    public static void main (String [] args){
        Restricciones r = new Restricciones();
        try {
            r.retriccion();

            Scanner Scan = new Scanner(System.in);
            System.out.println("ingrese: 1. Profesor o 2.Estudiante");
            int numero = Scan.nextInt();
            if (numero == 1) {
                System.out.println("Ingrese codigo profesor: ");
                int codigoProfe = Scan.nextInt();
                for (int i = 0; i < r.tArregloFinal + 1 ; i++ ){
                    int cp = r.planFinal.get(i).getProfesor();
                    if(codigoProfe == cp ){
                        System.out.println("Su horario de clases es el siguiente:");
                        int profee = r.planFinal.get(i).getProfesor();
                        String mate = r.planFinal.get(i).getMateria();
                        String inii = r.planFinal.get(i).getInicio();
                        String finn = r.planFinal.get(i).getFin();
                        System.out.println("Dia: " + profee + " " + mate + " " + inii + " " + finn  );
                    } 
                    else
                    {
                        System.out.println("El código ingresado no es valido");
                    }
                }
            } else if (numero == 2){
                System.out.println("Ingrese codigo Estudiante: ");
                int codigoEst = Scan.nextInt();
                for(int i = 0; i < r.tMat; i++)
                {
                    int ce = r.materiaN.get(i).getCodigoEstudiante();
                    if(codigoEst == ce)
                    {
                        String cm = r.materiaN.get(i).getMateria20192();
                        for(int j = 0; j < r.tArregloFinal; j++)
                        {
                            String cmpa = r.planFinal.get(j).getMateria();
                            if(cm.equalsIgnoreCase(cmpa))
                            {
                                System.out.println("Su horario de clases es el siguiente:");
                                int profee = r.planFinal.get(j).getProfesor();
                                String mate = r.planFinal.get(j).getMateria();
                                String inii = r.planFinal.get(j).getInicio();
                                String finn = r.planFinal.get(j).getFin();
                                System.out.println("Dia: " + profee + " " + mate + " " + inii + " " + finn  );

                                break;
                            }

                        }

                    }

                }

            } else {
                System.out.println("Orden no valida, ingrese solo 1 o 2");
            }
        }catch(Exception e){
        }
    }
}