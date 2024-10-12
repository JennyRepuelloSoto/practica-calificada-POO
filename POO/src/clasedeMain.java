public class clasedeMain {
    public static void main(String[] args) {

        Promedio alumn01 = new Promedio();
        alumn01.setNombre("Jenny");
        alumn01.setNota1(15);
        alumn01.setNota2(14);
        alumn01.setNota3(10);
        alumn01.setNota4(8);
        System.out.println("Nombre del alumno:"+alumn01.getNombre());
        System.out.println("Promedio es:"+alumn01.promedioFinal());
        System.out.println("Condicion es"+alumn01.condicionFinal());



        Promedio alumn02 = new Promedio();
        alumn02.setNombre("Luis");
        alumn02.setNota1(10);
        alumn02.setNota2(15);
        alumn02.setNota3(15);
        alumn02.setNota4(18);
        System.out.println("Nombre del alumno:"+alumn02.getNombre());
        System.out.println("Promedio es:"+alumn02.promedioFinal());
        System.out.println("Condicion es"+alumn02.condicionFinal());

    }
}



//System.out.println("Hello world!");}
