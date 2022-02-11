/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4p2_gabrielgiron_12051024;

import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author Galex
 */
public class Lab4P2_GabrielGiron_12051024 {
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
                    break;
                }
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
        Persona B = new Herrero(300,"Bryan","Alvarez",20,400);
        
        //crear Add al ArrayList;
        Familias.add(A);
        Familias.add(C);
        Familias.add(M);
        M.getPersonas().add(R);
        M.getPersonas().add(H);
        M.getPersonas().add(a);
        C.getPersonas().add(J);
        C.getPersonas().add(P);
        C.getPersonas().add(E);
        A.getPersonas().add(B);
    }
    public static void print()
    {
        System.out.println();
        String Salida = "";
        for (int i = 0; i < Familias.size(); i++) {
            Salida = Salida + "[" + i + "]" + Familias.get(i).getApellido() + "\n";
        }
        System.out.println(Salida);
    }
}
