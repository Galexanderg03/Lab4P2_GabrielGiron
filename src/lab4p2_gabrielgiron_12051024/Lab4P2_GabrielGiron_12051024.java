/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4p2_gabrielgiron_12051024;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
/**
 *
 * @author Galex
 */
public class Lab4P2_GabrielGiron_12051024 {
static Random R = new Random();
static Scanner sc = new Scanner(System.in);
static ArrayList<Familia> Familias = new ArrayList();
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Instancias();
        int opcion = -1;
        while(opcion != 0)
        {
            System.out.println("-------------------------");
            System.out.println("0) Salir");
            System.out.println("1) Crear Familia");
            System.out.println("2) Crear Aldeano");
            System.out.println("3) Imprimir Familias");
            System.out.println("4) Pelear");
            System.out.println("Ingrese una Opcion");
            System.out.println("-------------------------");
            opcion = sc.nextInt();
            switch(opcion)
            {
                case 0:
                {
                    System.out.println("Salido Del Sistema Exitosamente");
                    break;
                }
                case 1:
                {
                    CrearFamilia();
                    break;
                }
                case 2:
                {
                    CrearAldeano();
                    break;
                }
                case 3:
                {
                    Imprimir();
                    break;
                }
                case 4:
                {
                    Pelea();
                    break;
                }
                default: System.out.println("Opcion No Valida5");
            }
        }
    }
    public static void CrearFamilia()
    {
        System.out.println("Ingrese el Apellido de la Familia");
        String Apellido = sc.next();
        int centinela = 0;
        for (int i = 0; i < Familias.size(); i++) {
            if(Apellido.equals(Familias.get(i).getApellido()))
            {
                System.out.println("El Apellido que usted Ingreso ya le pertenece a otra familia");
                centinela = 1;
                break;
            }
        }
        if(centinela == 0)
        {
            Familias.add(new Familia(Apellido));
            System.out.println("Familia Agregada Exitosamente");
        }
    }
    
    public static void CrearAldeano()
    {
        System.out.println("-------------------------");
        System.out.println("1) Normales");
        System.out.println("2) Pacifista");
        System.out.println("3) Herrero");
        System.out.println("4) Agronomo");
        System.out.println("5) Explosivo");
        System.out.println("Ingrese una Opcion");
        int opcion = sc.nextInt();
        print();
        System.out.println("Ingrese la posicion de la familia a la que desea agregar este aldeano que creara");
        int pos = sc.nextInt();
        switch(opcion)
        {
            case 1:
            {
                System.out.println("Ingrese el Nombre");
                String Nombre = sc.next();
                System.out.println("Ingrese la Edad");
                int Edad = sc.nextInt();
                System.out.println("Ingrese la Vida");
                int Vida = sc.nextInt();
                Persona N = new Normales(Nombre,Familias.get(pos).getApellido(),Edad,Vida);
                Familias.get(pos).getPersonas().add(N);
                System.out.println("Aldeando Agregado Exitosamente");
                break;
            }
            case 2:
            {
                System.out.println("Ingrese el Nombre");
                String Nombre = sc.next();
                System.out.println("Ingrese la Edad");
                int Edad = sc.nextInt();
                System.out.println("Ingrese la Vida");
                int Vida = sc.nextInt();
                Persona N = new Pacifista(Nombre,Familias.get(pos).getApellido(),Edad,Vida);
                Familias.get(pos).getPersonas().add(N);
                System.out.println("Aldeando Agregado Exitosamente");
                break;
            }
            case 3:
            {
                System.out.println("Ingrese el Nombre");
                String Nombre = sc.next();
                System.out.println("Ingrese la Edad");
                int Edad = sc.nextInt();
                System.out.println("Ingrese la Vida");
                int Vida = sc.nextInt();
                System.out.println("Ingrese el Ataque(200-500)");
                int Atk = sc.nextInt();
                if(Atk < 200 || Atk > 500)
                {
                    System.out.println("El Ataque que Ingreso no es aceptado");
                }
                else
                {
                    Persona N = new Herrero(Atk,Nombre,Familias.get(pos).getApellido(),Edad,Vida);
                    Familias.get(pos).getPersonas().add(N);
                    System.out.println("Aldeando Agregado Exitosamente");
                }
                break;
            }
            case 4:
            {
                System.out.println("Ingrese el Nombre");
                String Nombre = sc.next();
                System.out.println("Ingrese la Edad");
                int Edad = sc.nextInt();
                System.out.println("Ingrese la Vida");
                int Vida = sc.nextInt();
                Persona N = new Agronomo(Nombre,Familias.get(pos).getApellido(),Edad,Vida);
                Familias.get(pos).getPersonas().add(N);
                System.out.println("Aldeando Agregado Exitosamente");
                break;
            }
            case 5:
            {
                System.out.println("Ingrese el Nombre");
                String Nombre = sc.next();
                System.out.println("Ingrese la Edad");
                int Edad = sc.nextInt();
                System.out.println("Ingrese la Vida");
                int Vida = sc.nextInt();
                Persona N = new Agronomo(Nombre,Familias.get(pos).getApellido(),Edad,Vida);
                Familias.get(pos).getPersonas().add(N);
                System.out.println("Aldeando Agregado Exitosamente");
                break;
            }
        }
    }
    
    public static void Imprimir()
    {
        System.out.println("-------------------------");
        String Salida = "";
        for (int i = 0; i < Familias.size(); i++) {
            Salida = Salida + "[" + i + "]" + Familias.get(i).toString() + "\n";
        }
        System.out.println(Salida);
        System.out.println("-------------------------");
    }
    
    public static void Pelea()
    {
        print();
        System.out.println("Ingrese el Apellido de la Familia contra la que pelearan los Montesco");
        String Apellido = sc.next();
        if(Apellido.equals("Capuleto") && Familias.size() != 2)
        {
            System.out.println("Debes Eliminar a las otras Familias para poder pelear contra los Capuleto");
        }
        else
        {
            if(Apellido.equals("Capuleto"))
                Familias.get(1).getPersonas().remove(0);
            
            int pos = 0;
            int cent = 0;
            for (int i = 0; i < Familias.size(); i++) {
                if(Apellido.equals(Familias.get(i).getApellido()))
                {
                    pos = i;
                    cent = 1;
                    break;
                }
            }
            if(cent == 0)
            {
                System.out.println("El Apellido que Ingreso no es valido");
            }
            else if(Familias.get(pos).getPersonas().size() == 0)
            {
                System.out.println("Esta Familia no puede participar porque no tiene miembros");
            }
            else
            {
                while(Familias.get(0).getPersonas().size() > 0 && Familias.get(pos).getPersonas().size() > 0)
                {
                    int r1 = R.nextInt(Familias.get(pos).getPersonas().size());
                    int r2 = R.nextInt(Familias.get(0).getPersonas().size());
                    Persona P1 = Familias.get(pos).getPersonas().get(r1);
                    Persona P2 = Familias.get(0).getPersonas().get(r2);
                    int Hp1 = P1.getHP();
                    int Hp2 = P2.getHP();
                    
                    while(P1.getHP() > 0 && P2.getHP() > 0)
                    {
                        System.out.println(P1.getNombre()+ " " + P1.getApellido()+ " Atacara: " + P2.getNombre() + " " + P2.getApellido());
                        Pelear(P1,P2,pos,r1);
                        System.out.println(P2.getNombre()+ " " + P2.getApellido()+ " Tiene: "+P2.getHP()+" Vida");
                        if(P2.getHP() <= 0)
                        {       
                            if(P2 instanceof SuperGranjero)
                            {
                                System.out.println(P2.getNombre()+" "+P2.getApellido()+" Ha Muerto, Has perdido el juego");
                                System.exit(0);
                            }
                            else
                            {
                                System.out.println(P2.getNombre()+" "+P2.getApellido()+" Ha Muerto");
                                Familias.get(0).getPersonas().remove(r2);
                                P1.setHP(Hp1);
                                break;
                            }
                        }
                        System.out.println(P2.getNombre()+ " " + P2.getApellido()+ " Atacara: " + P1.getNombre() + " " + P1.getApellido());
                        Pelear(P2,P1,0,r2);
                        System.out.println(P1.getNombre()+ " " + P1.getApellido()+ " Tiene: "+P1.getHP()+" Vida");
                        if(P1.getHP() <= 0)
                        {
                            System.out.println(P1.getNombre()+" "+P1.getApellido()+" Ha Muerto");
                            Familias.get(pos).getPersonas().remove(r1);
                            P2.setHP(Hp2);
                            break;
                        }
                    }
                }
                if(Familias.get(pos).getPersonas().size() == 0)
                    Familias.remove(pos);
                
                if(Apellido.equals("Capuleto"))
                {
                    System.out.println("GANASTE");
                    System.exit(0);
                }
            }
        }
    }
    
    public static void Instancias()
    {
        //crear Familias
        Familia M = new Familia("Montesco");
        Familia C = new Familia("Capuleto");
        Familia A = new Familia("Alvarez");
        
        //crear Personas
        Persona R = new SuperGranjero("Romeo","Montesco",19,1000);
        Persona H = new Herrero(500,"Juan","Montesco",25,500);
        Persona a = new Agronomo("Carlos","Montesco",22,250);
        Persona J = new Normales("Julieta","Capuleto",17,50);
        Persona P = new Pacifista("Julio","Capuleto",20,100);
        Persona E = new Explosivo("Abraham","Capuleto",20,300);
        Persona B = new Herrero(300,"Bryan","Alvarez",20,200);
        
        //crear Add al ArrayList;
        Familias.add(M);
        Familias.add(C);
        Familias.add(A);
        M.getPersonas().add(R);
        M.getPersonas().add(H);
        M.getPersonas().add(a);
        C.getPersonas().add(J);
        C.getPersonas().add(P);
        C.getPersonas().add(E);
        A.getPersonas().add(B);
    }
    
    public static void Pelear(Persona P1, Persona P2, int pos, int r)
    {
        int Fallar = 1+R.nextInt(99);
        if(P1 instanceof Normales)
        {
            int Hp1 = P1.getHP();
            int Atk1 = ((Normales)Familias.get(pos).getPersonas().get(r)).getAtk();
            int Hp2 = P2.getHP();
            if(P2 instanceof Pacifista)
            {
                Hp2 = Hp2 - ((Atk1 * 5)/100);
                P2.setHP(Hp2);
            }
            else
            {
                Hp2 = Hp2 - Atk1;
                P2.setHP(Hp2);
            }
            P2.setHP(Hp2);
        }
        
        if(P1 instanceof Pacifista)
        {
            System.out.println(P1.getNombre() + " " +P1.getApellido()+" Dice su Discurso de Paz.........pero este no funciona");
        }
        
        if(P1 instanceof Herrero)
        {
            int Hp1 = P1.getHP();
            int Atk1 = ((Herrero)Familias.get(pos).getPersonas().get(r)).getAtk();
            int Hp2 = P2.getHP();
            if(Fallar <= 10)
            {
                System.out.println(P1.getNombre() + " " +P1.getApellido()+" Fallo el Ataque");
            }
            else
            {
                if(P2 instanceof Pacifista)
                {
                    Hp2 = Hp2 - ((Atk1 * 5)/100);
                    P2.setHP(Hp2);
                }
                else if(P2 instanceof Agronomo)
                {
                    Hp2 = Hp2 - ((Atk1 * 10)/100);
                    P2.setHP(Hp2);
                }
                else
                {
                    Hp2 = Hp2 - Atk1;
                    P2.setHP(Hp2);
                }
            }
        }
        
        if(P1 instanceof Agronomo)
        {
            int Hp1 = P1.getHP();
            int Atk1 = ((Agronomo)Familias.get(pos).getPersonas().get(r)).getAtk();
            int Hp2 = P2.getHP();
            if(Fallar <= 5)
            {
                System.out.println(P1.getNombre() + " " +P1.getApellido()+" Fallo el Ataque");
            }
            else
            {
                if(P2 instanceof Pacifista)
                {
                    Hp2 = Hp2 - ((Atk1 * 5)/100);
                    P2.setHP(Hp2);
                }
                else if(P2 instanceof Normales)
                {
                    Hp2 = Hp2 - ((Atk1 * 10)/100);
                    P2.setHP(Hp2);
                }
                else
                {
                    Hp2 = Hp2 - Atk1;
                    P2.setHP(Hp2);
                }
            }
        }
        
        if(P1 instanceof Explosivo)
        {
            int Hp1 = P1.getHP();
            int Atk1 = ((Explosivo)Familias.get(pos).getPersonas().get(r)).getAtk();
            int Hp2 = P2.getHP();
            if(Fallar <= 15)
            {
                System.out.println(P1.getNombre() + " " +P1.getApellido()+" Fallo el Ataque");
            }
            else
            {
                if(P2 instanceof Herrero)
                {
                    Hp2 = Hp2 - ((Atk1 * 5)/100);
                    P2.setHP(Hp2);
                }
                else if(P2 instanceof Agronomo)
                {
                    Hp2 = Hp2 - ((Atk1 * 10)/100);
                    P2.setHP(Hp2);
                }
                else
                {
                    Hp2 = Hp2 - Atk1;
                    P2.setHP(Hp2);
                }
            }
        }
        if(P1 instanceof SuperGranjero)
        {
            int Hp1 = P1.getHP();
            int Atk1 = ((SuperGranjero)Familias.get(pos).getPersonas().get(r)).getAtk();
            int Hp2 = P2.getHP();
            if(Fallar <= 15)
            {
                System.out.println(P1.getNombre() + " " +P1.getApellido()+" Fallo el Ataque");
            }
            else
            {
                if(P2 instanceof Herrero)
                {
                    Hp2 = Hp2 - ((Atk1 * 10)/100);
                    P2.setHP(Hp2);
                }
                else if(P2 instanceof Explosivo)
                {
                    Hp2 = Hp2 - ((Atk1 * 15)/100);
                    P2.setHP(Hp2);
                }
                else
                {
                    Hp2 = Hp2 - Atk1;
                    P2.setHP(Hp2);
                }
            }
        }
        
    }
    
    public static void print()
    {
        System.out.println("Lista Familias");
        String Salida = "";
        for (int i = 0; i < Familias.size(); i++) {
            Salida = Salida + "[" + i + "]" + Familias.get(i).getApellido() + "\n";
        }
        System.out.print(Salida);
    }
}
