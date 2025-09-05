import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Clase libro
        Libro libro1 = new Libro();
        System.out.println("libro1, con constructor sin parametros y valores predeterminados:" + "\n" + libro1);
        System.out.println();
        Libro libro2 = new Libro("Gabriel Garcia Marquez", "Cronicas de una muerte anunciada", 80);
        System.out.println("libro2, con costrustor con parametros:" + "\n" + libro2);
        System.out.println();
        //Clase CuentaBancaria

        CuentaBancaria cuenta1 = new CuentaBancaria();
        System.out.println("cuenta1, con constructor sin parametros: " + "\n" + cuenta1);
        System.out.println();
        CuentaBancaria cuenta2 = new CuentaBancaria("Ahorro", 45236113);
        System.out.println("cuenta2, con costructor de solo 2 parametros:" + "\n" + cuenta2);
        System.out.println();
        CuentaBancaria cuenta3 = new CuentaBancaria("Corriente", 74829, 2457234);
        System.out.println("cuenta3, con costructor 3 parametros:" + "\n" + cuenta3);
        System.out.println();

        // Clase Estudiante
        Estudiante estudiante1 = new Estudiante();
        System.out.println("estudiante1, con constructor sin parametros y valores predeterminados:" + "\n" + estudiante1);
        System.out.println();
        Estudiante estudiante2 = new Estudiante("Laura", 43);
        System.out.println("estudiante2, con costructor de solo 2 parametros:" + "\n" + estudiante2);
        System.out.println();
        Estudiante estudiante3 = new Estudiante("Pepe", 23, "Exel 1");
        System.out.println("estudiante3, con encadenamiento de constructores" + "\n" + estudiante3);
        System.out.println();

        //Con datos ingresados por pantalla
        Scanner scDatos = new Scanner(System.in);
        System.out.println("*** Libro ***");
        System.out.print("Titulo de la obra: ");
        var titulos = scDatos.nextLine();
        System.out.print("Digite el numero de paginas: ");
        var paginas = Integer.parseInt(scDatos.nextLine());
        System.out.print("Nombre del autor o autora: ");
        var nombres = scDatos.nextLine();
        Libro libro3 = new Libro(nombres, titulos, paginas);
        System.out.println("Se almacenaron los datos de la siguiente manera: " + "\n" + libro3);
        System.out.println();

        //Cuenta bancaria
        System.out.println("*** CuentaBancaria ***");
        System.out.print("Tipo de cuenta: ");
        var cuentas = scDatos.nextLine();
        System.out.print("Numero de cuenta: ");
        var numDeCuenta = Integer.parseInt(scDatos.nextLine());
        System.out.print("Saldo: ");
        var dinero = Double.parseDouble(scDatos.nextLine());
        CuentaBancaria cuenta4 = new CuentaBancaria(cuentas, numDeCuenta, dinero);
        System.out.println("Datos ingresados: " + "\n" + cuenta4);
        System.out.println();

        //Estudiante
        System.out.println("*** Estudiante ***");
        System.out.print("Nombre: ");
        var alumno = scDatos.nextLine();
        System.out.print("Edad: ");
        var alumnoEdad = Integer.parseInt(scDatos.nextLine());
        System.out.print("Curso: ");
        var alumnoCurso = scDatos.nextLine();
        Estudiante estudiante4 = new Estudiante(alumno, alumnoEdad, alumnoCurso);
        System.out.println("Los datos ingresado fueron: " + "\n" + estudiante4);
    }
}
