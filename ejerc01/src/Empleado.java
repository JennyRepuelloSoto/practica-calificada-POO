public class Empleado {

    public String nombre;
    public double salarioBase;
    public double horas;
    public double horasExtras;


    // Constructor
    /*
    public Empleado(String nombre, double salarioBase,double horas ,double horasExtras) {
        this.nombre = nombre;
        this.salarioBase = salarioBase;
        this.horas = horas;
        this.horasExtras = horasExtras;
    }*/

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public double getHoras() {
        return horas;
    }

    public void setHoras(double horas) {
        this.horas = horas;
    }

    public double getHorasExtras() {
        return horasExtras;
    }

    public void setHorasExtras(double horasExtras) {
        this.horasExtras = horasExtras;
    }

    // Método para calcular el salario total
    public double calcularSalarioTotal() {
        double  valorHoras = salarioBase / horas;

        double salarioTotal = salarioBase + (horasExtras * (valorHoras + (valorHoras * 0.5)));
        return salarioTotal;
    }

    // Método para determinar la categoría salarial
    public String determinarCategoria() {
        double salarioTotal = calcularSalarioTotal();
        if (salarioTotal > 5000) {
            return "Alto";
        } else if (salarioTotal >= 3000) {
            return "Medio";
        } else {
            return "Bajo";
        }
    }
}
