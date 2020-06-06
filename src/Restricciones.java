import java.io.*;
import java.util.LinkedList;

public class Restricciones
{
    LinkedList<Estudiantes> estudiante;
    LinkedList<pa20192>  planAcademico;
    LinkedList<mat20192> materia;
    LinkedList<Aulas> aula;
    LinkedList<DistanciasBloques> distb;

    LinkedList<pa20192> plansito;
    LinkedList<pa20192> plansito2;
    LinkedList<pa20192> plansito3;
    LinkedList<pa20192> planFinal;

    LinkedList<mat20192> materiaN;
    
    String NuevaHoraIncial;
    String NuevaHoraFinal;
    String NuevoIdProfesor;

    int r = 500;
    int n = 10;
    int numeroRandom = 0;
    int finalNumeroRandom;
    int IdProfeRandom;
    int tpa;
    int tArregloFinal;
    int tMat;

    public void NumeroRandom()
    {
        numeroRandom = (int) (Math.random() * n) + 8; //[8,18]
        finalNumeroRandom = numeroRandom + 3;
        IdProfeRandom = (int) (Math.random() * r) + 50;
    }

    public void PasoString()
    {
        NumeroRandom();
        NuevaHoraIncial = Integer.toString(numeroRandom) + ":00";
        NuevaHoraFinal =  Integer.toString(finalNumeroRandom) + ":00";
    }

    public void retriccion()
    {

        ArregloPa20192 refPa = new ArregloPa20192();
        ArregloPa20192 refPaProfe = new ArregloPa20192();
        ArregloPa20192 refPaAula = new ArregloPa20192();
        
        ArregloMaterias refMat = new ArregloMaterias();
        
        refPa.leerpa();
        planAcademico = refPa.pa;
        
        refMat.leerMaterias();
        materiaN = refMat.mat;

        tpa = planAcademico.size();
        tMat = materiaN.size();

        // Declaración e inicialización de los contadores
        int c = 0;
        int o = 0;
        int a = 0;
        int b = 0;
        int d = 0;


        //System.out.println("Evaluamos la primera restricción y una parte de la tercera restricción");
        for(int i =0;i < tpa - 1 ;i++)
        {


            if(planAcademico.get(i).getProfesor() == 1)
            {
                b++;
                refPaProfe.pa.add(planAcademico.get(i));
                plansito= refPaProfe.pa;
            }


            if(planAcademico.get(i).getProfesor() != 1 )
            {
                if(planAcademico.get(i).getProfesor() == planAcademico.get(i+1).getProfesor() )
                {
                    for(int j = i + 1; j < tpa ; j++)
                    {
                        if(planAcademico.get(i).getDia().equalsIgnoreCase(planAcademico.get(j).getDia()))
                        {
                            //System.out.println(planAcademico.get(i).getDia() + "   "+ planAcademico.get(j).getDia());
                            //break;


                            if(planAcademico.get(i).getInicio().equalsIgnoreCase( planAcademico.get(j).getInicio()))
                            {
                                //planAcademico.get(i).setInicio("00:00") ;
                                //planAcademico.get(i).setFin("00:00");


                                planAcademico.get(j).setInicio("00:00") ;
                                planAcademico.get(j).setFin("00:00");
                                o++;
                                //System.out.println(planAcademico.get(j).getMateria() +  "  " + planAcademico.get(j).getInicio());
                            } 


                        }
                    }


                }//System.out.println(planAcademico.get(i).getMateria() + " tiene profesor asignado.");
            }


        }


        //System.out.println("Las materias a las que se les cambio el horario son: ");
        //ArregloPa20192 refModifPa = new ArregloPa20192();
        for(int i = 0; i < tpa; i++)
        {
            //System.out.println(planAcademico.get(i).getInicio());
            //c++;
            if(planAcademico.get(i).getInicio().equalsIgnoreCase("00:00"))
            {


                //System.out.println(planAcademico.get(i).getMateria());
            }
        }
        //System.out.println(c);


        //System.out.println("Evaluamos la segunda restricción y la otra parte de la tercera restricción");
        for(int i =0;i < tpa - 1 ;i++)
        {


            if(planAcademico.get(i).getAula() == 0)
            {
                d++;
                refPaAula.pa.add(planAcademico.get(i));
                plansito2= refPaAula.pa;
                //System.out.println( planAcademico.get(i).getProfesor() + " no tiene aula asignada asignado");
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


                        if(planAcademico.get(i).getInicio().equalsIgnoreCase( planAcademico.get(j).getInicio()))
                        {
                            planAcademico.get(j).setInicio("00:00") ;
                            planAcademico.get(j).setFin("00:00");
                            c++;
                        } 


                    }
                }


            }


        }


        ArregloPa20192 refModifPa = new ArregloPa20192();
        int g = 0;
        for(int i = 0; i < tpa; i++)
        {
            if(planAcademico.get(i).getInicio().equalsIgnoreCase("00:00"))
            {
                g++;
                String clase = planAcademico.get(i).getMateria();
                String dia = planAcademico.get(i).getDia();
                String hora = planAcademico.get(i).getInicio();

                //System.out.println(clase + "   " + dia + "   " + hora);

                refModifPa.pa.add(planAcademico.get(i));
                plansito3 = refModifPa.pa;
            }

        }
        //Imprimimos el arreglo de las materias que no tienen Aula asignado
        for(int i = 0; i < d ; i++)
        {
            String materia = plansito2.get(i).getMateria();
            String dia = plansito2.get(i).getDia();
            int hora = plansito2.get(i).getAula();
            //System.out.println(plansito2.get(i) + "  " + materia + " " + dia + "  " + hora);
        }

        for(int z = 0; z < g; z++) {
            PasoString();
            plansito.get(z).setInicio(NuevaHoraIncial);
            plansito.get(z).setFin(NuevaHoraFinal);
            //System.out.println(plansito.get(z).getInicio() + "  " + plansito.get(z).getFin());
        }

        for(int w = 0; w < b; w++) {
            NumeroRandom();
            plansito.get(w).setProfesor(IdProfeRandom);
            //System.out.println(plansito.get(w).getProfesor());
        }
        
        ArregloPa20192 refProfesFinal = new ArregloPa20192();
        for(int i = 0;  i < tpa; i++)
        {
            if(planAcademico.get(i).getInicio().equalsIgnoreCase("00:00"))
            {
                planAcademico.remove(i);
                tpa = planAcademico.size();
            }
            else
            {
                refProfesFinal.pa.add(planAcademico.get(i));
            }
            planFinal =  refProfesFinal.pa;   
        }
        //System.out.println(g);
        for(int i = 0; i < g; i++)
        {
            refProfesFinal.pa.add(plansito.get(i));
            planFinal = refProfesFinal.pa;
        }
        tArregloFinal = planFinal.size();
        
        
    }
}