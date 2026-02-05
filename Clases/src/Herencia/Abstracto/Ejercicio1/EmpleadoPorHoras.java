package Herencia.Abstracto.Ejercicio1;

public class EmpleadoPorHoras extends Empleado {
    protected double horasTrabajadas;
    protected double salario;

    public EmpleadoPorHoras(String nombre, double horasTrabajadas, double salario) {
        super(nombre);
        this.horasTrabajadas = horasTrabajadas;
        this.salario = salario;
    }

    @Override
    public double calcularSalario() {
        double salarioTotal = salario * horasTrabajadas;
        return salarioTotal;
    }
}
