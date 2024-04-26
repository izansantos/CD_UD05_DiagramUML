import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sca= new Scanner(System.in);
        //TODO: Crear los siguientes pasos para comprobar el funcionamiento del programa 
        // Crear una veterinaria
        Veterinaria veterinaria = new Veterinaria();
        // Crear dos clientes
        System.out.println("Inserte el nombre de tu cliente: ");
        String nombre = sca.nextLine();
        System.out.println("Inserte el teléfono de tu cliente: ");
        String telefono = sca.nextLine();
        System.out.println("Inserte la dirección de tu cliente: ");
        String direccion = sca.nextLine();
        Cliente cliente1 = new Cliente(nombre, direccion, telefono);
        System.out.println("Inserte el nombre de tu cliente: ");
        nombre = sca.nextLine();
        System.out.println("Inserte el teléfono de tu cliente: ");
        telefono = sca.nextLine();
        System.out.println("Inserte la dirección de tu cliente: ");
        direccion = sca.nextLine();
        Cliente cliente2 = new Cliente(nombre, direccion, telefono);
        // Agregar clientes a la veterinaria
        veterinaria.agregarCliente(cliente1,sca);
        veterinaria.agregarCliente(cliente2, sca);
        // Crear dos animales  
        System.out.println("Inserte el nombre de tu animal: ");
        nombre = sca.nextLine();
        System.out.println("Inserte la especie de tu animal: ");
        String especie = sca.nextLine();
        System.out.println("Inserte la raza de tu animal: ");
        String raza = sca.nextLine();
        System.out.println("Inserte el propietario de tu animal: ");
        Animal animal1 = new Animal(nombre, especie, raza, cliente1);
        System.out.println("Inserte el nombre de tu animal: ");
        nombre = sca.nextLine();
        System.out.println("Inserte la especie de tu animal: ");
        especie = sca.nextLine();
        System.out.println("Inserte la raza de tu animal: ");
        raza = sca.nextLine();
        System.out.println("Inserte el propietario de tu animal: ");
        Animal animal2 = new Animal(nombre, especie, raza, cliente2);
        // Agregar animales a la veterinaria
        veterinaria.agregarAnimal(animal1, sca);
        veterinaria.agregarAnimal(animal2, sca);
        //Crear un veterinario 
        System.out.println("Inserte el nombre de tu veterinario: ");
        nombre = sca.nextLine();
        System.out.println("Inserte la especialidad de tu animal: ");
        String especialidad = sca.nextLine();
        Veterinario  veterinario = new Veterinario(nombre,especialidad);
        // Crear una consulta
        System.out.println("Inserte la fecha de tu consulta: ");
        String fecha = sca.nextLine();
        System.out.println("Inserte el motivo de tu consulta: ");
        String motivo = sca.nextLine();
        System.out.println("Inserte el diagnóstico de tu consulta: ");
        String diagnóstico = sca.nextLine();
        System.out.println("Inserte el tratamiento de tu consulta: ");
        String tratamiento = sca.nextLine();
        Consulta consulta = new Consulta(fecha, motivo, diagnóstico, tratamiento, veterinario);
        // Asignar la consulta a un animal
        animal1.agregarConsulta(consulta);
        //Imprimir todas las consultas de los animales de la clínica
        veterinaria.imprimirConsultas();
    }

}