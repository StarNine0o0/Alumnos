public class Alumno {
    private String nombre;
    private double[] calificaciones = new double[3];//array de tipo doble de calificaciones, con 3 posiciones para las 3 unidades

    public Alumno(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double[] getCalificaciones() {
        return calificaciones;
    }

    public void setCalificaciones(double cali1, double cali2, double cali3) {
        if (califValida(cali1) && califValida(cali2) && califValida(cali3)) {//si devuelve true continua con la siguiente parte del codigo
            calificaciones[0] = cali1;//se guardan las calificaciones en el arreglo en su posicion correspondiente 
            calificaciones[1] = cali2;
            calificaciones[2] = cali3;
        } else {
            System.out.println("Error: las calificaciones no son válidas (0-100).");
        }
    }

    private boolean califValida(double calif) {
        return calif >= 0 && calif <= 100; //comprobar si las calificaciones estan entre 0 y 100
    }

    // Verificar remedial o baja
    public void verificarRemedialYBaja() {
        int reprobadas = 0;
        for (double calif : calificaciones) {
            if (calif < 70) { // Menor a 70 va a remedial
                reprobadas++;//contador de materias reprobadas
            }
        }

        if (reprobadas > 0) {
            System.out.println(nombre + " tiene materias en remedial.");
        }

        if (reprobadas > 2) {
            System.out.println(nombre + " ha sido dado de BAJA por más de 2 materias reprobadas.");
        }
    }

    // Nuevo método: Imprimir cuáles materias van a remedial
    public void imprimirRemediales() {
        System.out.println("Materias en remedial de " + nombre + ":");
        boolean tieneRemedial = false;//para saber si tiene materias en remedial
        for (int i = 0; i < calificaciones.length; i++) {// Recorre las calificaciones
            if (calificaciones[i] < 70) {
                System.out.println("  Unidad " + (i + 1) + " con calificación: " + calificaciones[i]);
                tieneRemedial = true;
            }
        }
        if (!tieneRemedial) {
            System.out.println("  Ninguna unidad en remedial.");
        }
    }

    public static void imprimirreporte(Alumno[] alumnos) {
        for (Alumno alumno : alumnos) {
            System.out.println("Resumen de: " + alumno.getNombre());
            for (int i = 0; i < alumno.getCalificaciones().length; i++) {
                double calificacion = alumno.getCalificaciones()[i];// Obtener la calificación de cada unidad
                if (calificacion < 70) {
                    System.out.println("  Calificación " + (i + 1) + ": " + calificacion + " (Reprobado)");
                } else {
                    System.out.println("  Calificación " + (i + 1) + ": " + calificacion + " (Aprobado)");
                }
            }
            System.out.println();
        }
    }
}
