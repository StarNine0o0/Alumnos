public class Alumno {
    private String nombre;
    private double[] calificaciones = new double[3];//3 por que es la cantidad de unidades a evaluar

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
        if (califValida(cali1) && califValida(cali2) && califValida(cali3)) {
            calificaciones[0] = cali1;
            calificaciones[1] = cali2;
            calificaciones[2] = cali3;
        } else {
            System.out.println("Error las calificaciones no son validad (0-100).");
        }
    }

    private boolean califValida(double calif) {
        return calif >= 0 && calif <= 100;//comprovar si las  falificaciones son validas 
    }

    public static void imprimirreporte(Alumno[] alumnos) {
        for (Alumno alumno : alumnos) {
            System.out.println("Resumen de: " + alumno.getNombre());
            for (int i = 0; i < alumno.getCalificaciones().length; i++) {//imprimir las calificaciones
                double calificacion = alumno.getCalificaciones()[i];
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