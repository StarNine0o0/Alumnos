public class Main {
    public static void main(String[] args) {
        Alumno a1 = new Alumno("Juan");
        a1.setCalificaciones(75, 80, 70); // 2 reprobadas
        Alumno a2 = new Alumno("Maria");
        a2.setCalificaciones(50, 55, 40); // 3 reprobadas = baja

        Alumno[] lista = {a1, a2};//arreglo de alumnos llamado lista
        Alumno.imprimirreporte(lista);//imprimir reporte de alumnos se le manda la lista de alumnos

        for (Alumno a : lista) {
            a.verificarRemedialYBaja();
            a.imprimirRemediales();
            System.out.println();
        }
    }
}
