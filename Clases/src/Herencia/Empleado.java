package Herencia;

public class Empleado {

    private String nombre;
    private int edad;
    private double salario;

    public Empleado(String nombre, int edad, double salario) {
        this.nombre = nombre;
        this.edad = edad;
        this.salario = salario;
    }

    public void mostrarInformacion() {
        System.out.println("Nombre:" + nombre);
        System.out.println("Edad:" + edad);
        System.out.println("Salario:" + salario);
    }
}

    class Gerente extends Empleado{

        private  String departamento;
        public Gerente(String nombre, int edad, double salario, String departamento) {
            super(nombre, edad, salario);
            this.departamento = departamento;
        }

        @Override
        public void mostrarInformacion() {
            super.mostrarInformacion();
            System.out.println("Departamento:" + departamento);
        }
    }

    class Administrador extends Gerente{

        private String sector;
        public Administrador(String nombre, int edad, double salario, String departamento, String sector) {
            super(nombre, edad, salario, departamento);
            this.sector = sector;
        }

        @Override
        public void mostrarInformacion() {
            super.mostrarInformacion();
            System.out.println("Sector:" + sector);
        }
    }

class Main {
    public static void main(String[] args) {
        Empleado empleado =  new Empleado("Oscar", 25, 950);
        empleado.mostrarInformacion();

        Gerente gerente = new Gerente("Diego", 34, 5000, "Administración");
        gerente.mostrarInformacion();

        Administrador administrador = new Administrador("Mario", 45, 5000,"",  "Administrador");
        administrador.mostrarInformacion();
    }
}
