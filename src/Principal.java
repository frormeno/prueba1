
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author vina
 */
public class Principal {

    public static void main(String[] args) {

        Validar validar = new Validar();
        Cliente cliente = new Cliente();
        Vehiculo vehiculo = new Vehiculo();
        String nombre, apellido, rut, nacionalidad, marca, modelo, patente;
        int opcion, edad, telefono, kilometraje;

        Scanner leer = new Scanner(System.in);
        boolean flag=false;

        System.out.println("*********MENU**********");
        System.out.println("Elija una opcion\n1) Crear vehiculo\n2) Mostrar informacion\n3) Calcular descuento al total de servicios prestados\n4) Salir");
        System.out.println("***********************");
        opcion = leer.nextInt();

        do {
            switch (opcion) {
                case 1:
                    System.out.println("***Creando un vehiculo***");
                    do {
                            System.out.println("Ingrese la marca del vehiculo");
                            marca = leer.nextLine();
                            validar.validarMarca(marca);
                            System.out.println("");
                            System.out.println("Ingrese modelo");
                            modelo=leer.nextLine();
                            
                            
                            
                            //no alcanse :(
                    } while (flag == false);
                case 2:
                    System.out.println("***DATO***");
                    vehiculo.mostrarVehiculo();
            }
        } while (opcion
                != 4);

    }

}
