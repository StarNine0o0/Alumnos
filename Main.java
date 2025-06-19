
    import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("¿Cantidad de alumnos? ");
        int can = sc.nextInt();
        sc.nextLine();

        Alumno[] alumnos = new Alumno[can];

        for (int i = 0; i < can; i++) {
            System.out.println("\nAlumno " + (i + 1));
            System.out.print("Ingrese el Nombre: ");
            String nombre = sc.nextLine();

            System.out.print("Ingrese la Calificación 1: ");
            double cali1 = sc.nextDouble();
            System.out.print("Ingrese la Calificación 2: ");
            double cali2 = sc.nextDouble();
            System.out.print("Ingrese la Calificación 3: ");
            double cali3 = sc.nextDouble();
            sc.nextLine();

            alumnos[i] = new Alumno(nombre);//se crea el alumno con su nombre y se le asignan su califiacaciones
            alumnos[i].setCalificaciones(cali1, cali2, cali3);
        }

        Alumno.imprimirreporte(alumnos);
    }
}
