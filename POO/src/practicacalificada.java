import java.util.Scanner;

public class practicacalificada {

       public class Empleado {
        // Atributos públicos
        public String nombre;
        public double salarioBase;
        public double horasExtras;

        // Constructor
        public Empleado(String nombre, double salarioBase, double horasExtras) {
            this.nombre = nombre;
            this.salarioBase = salarioBase;
            this.horasExtras = horasExtras;
        }

        // Método para calcular el salario total
        public double calcularSalarioTotal() {
            double valorHora = salarioBase / 160; // Suponiendo 160 horas al mes
            double salarioTotal = salarioBase + (horasExtras * (valorHora * 1.5));
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

