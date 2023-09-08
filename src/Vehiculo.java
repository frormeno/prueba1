/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author vina
 */
public class Vehiculo {
    
    String marca,modelo,patente,cliente;
    int kilometraje;

    public Vehiculo() {
    }

    public Vehiculo(String marca, String modelo, String patente, String cliente, int kilometraje) {
        this.marca = marca;
        this.modelo = modelo;
        this.patente = patente;
        this.cliente = cliente;
        this.kilometraje = kilometraje;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public int getKilometraje() {
        return kilometraje;
    }

    public void setKilometraje(int kilometraje) {
        this.kilometraje = kilometraje;
    }

    
    

    public void mostrarVehiculo(){
        System.out.println("*****DATOS DE VEHICULO*****");
        System.out.println("La marca del modelo es: "+this.marca);
        System.out.println("El kilometraje del vehiculo es: "+this.kilometraje);
        System.out.println("El modelo del vehiculo es: "+this.modelo);
        System.out.println("La patente del vehiculo es: "+this.patente);
        System.out.println("El dueño del vehiculo es: "+this.cliente);
        System.out.println("***************************");
    }
            
 
    
    
}
