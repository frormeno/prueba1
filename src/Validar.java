/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author vina
 */
public class Validar {

    public Validar() {
    }

    public boolean validaKilometraje(int valor){
        if (valor<0 || valor>500000) {
            System.out.println("El kilometraje no puede ser menor a 0 n mayor a 500000");
            return false;
        } else {
            return true;
        }
    }
    
    public boolean validarPatente(String valor){
        if (valor.length()==6) {
            return true;
        } else {
            System.out.println("La patente debe contener 6 caracteres");
            return false;
        }
    }
    
    public boolean validarNombre(String valor){
        if (valor.isEmpty()||valor.isBlank()) {
            System.out.println("Ingrese un nombre valido");
            return false;
        } else {
            return true;
        }
    }
    
    public boolean validarMarca(String valor){
        if (valor.isEmpty()||valor.isBlank()) {
            System.out.println("Ingrese una marca valido");
            return false;
        } else {
            return true;
        }
    }
    
    public boolean validarTelefono(int valor){
        if (valor>99999999||valor<10000000) {
            System.out.println("El numero debe tener 8 digitos");
            return false;
        } else {
            return true;
        }
    }
    
}
