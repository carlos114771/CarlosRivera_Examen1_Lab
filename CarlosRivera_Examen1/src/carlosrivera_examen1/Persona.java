/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carlosrivera_examen1;

/**
 *
 * @author Usuario Dell
 */
public class Persona {

    String nombre;
    int edad;
    int id;
    int id_boleto;
    String departamento;
    double dinero;

    public Persona() {
    }

    public Persona(String nombre, int edad, int id, int id_boleto, String departamento, double dinero) {
        this.nombre = nombre;
        this.edad = edad;
        this.id = id;
        this.id_boleto = id_boleto;
        this.departamento = departamento;
        this.dinero = dinero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId_boleto() {
        return id_boleto;
    }

    public void setId_boleto(int id_boleto) {
        this.id_boleto = id_boleto;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public double getDinero() {
        return dinero;
    }

    public void setDinero(double dinero) {
        this.dinero = dinero;
    }

    @Override
    public String toString() {
        return nombre;
    }

}
