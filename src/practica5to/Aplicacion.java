package practica5to;

import java.util.ArrayList;
import java.util.Scanner;

public class Aplicacion {

    static ArrayList<Estudiante> lista = new ArrayList<>();

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        /*  System.out.println("Tablas de multiplicar");
      
        int multiplicacion;
        int contador = 1;

        for (int i = 1; i < 13; i++) {
            for (int j = 1; j < 13; j++) {
                multiplicacion = i * j;
                System.out.println(i + "x" + j + " = " + multiplicacion);
            }
            System.out.println("");
            System.out.println("TABLA DEL "+(i+1));     
            
        }
         */

        //EJERCICIO 3
        /*
        Double suma = 0.0;
        Double promedio;
        ArrayList<Double> notas = new ArrayList<Double>();
        double nota = 0;
        double mayor = 0;
        double menor = 0;
        System.out.println("Ingrese notas");

        for (int i = 1; i < 7; i++) {
            System.out.println("Nota " + i);
            nota = scan.nextDouble();
            notas.add(nota);
            suma = suma + nota;
        }
        
        menor = notas.get(0);
        mayor=notas.get(0);
        
        for (int i = 0; i < notas.size(); i++) {
            if (notas.get(i) > mayor) {
                mayor = notas.get(i);
            }       
            if (notas.get(i)<menor) {
                menor =notas.get(i);
            }
        }

        System.out.println("Promedio");
        promedio = suma / 6;
        System.out.println("Su Promedio es: " + promedio);

        System.out.println("Su nota mayor es" + mayor);
        System.out.println("Su nota menor es:" + menor);*/
        String dni;
        String nombre;
        double nota;
        String paralelo;

        int regresar = 0;
        do {
            System.out.println("Ingrese DNI");
            dni = scan.next();
            System.out.println("Ingrese el nombre de la Materia");
            nombre = scan.next();
            System.out.println("Ingrese la nota");
            nota = scan.nextDouble();
            System.out.println("Ingrese paralelo");
            paralelo = scan.next();

            Estudiante est = new Estudiante(dni, nombre, nota, paralelo);
            lista.add(est);
            System.out.println("Quieres ingresar otro estudiante?");
            System.out.println("1.SI");
            System.out.println("2.NO");
            System.out.println("3. Mostrar");

            regresar = scan.nextInt();
            if (regresar == 3) {
                mostrar();
            }
        } while (regresar == 1);

    }

    public static void mostrar() {
        lista.stream().forEach(i -> System.out.println(" DNI: " + i.getDni() + " NOMBRE: "
                + i.getNombreMateria() + "NOTA: " + i.getNota() + " PARALEO: " + i.getParalelo()));
    }

}
