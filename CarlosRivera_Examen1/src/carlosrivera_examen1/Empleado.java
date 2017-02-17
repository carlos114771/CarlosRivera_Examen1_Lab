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
public class Empleado extends Persona {

    String empleo;

    public Empleado() {
        super();
    }

    public Empleado(String empleo, String nombre, int edad, int id, int id_boleto, String departamento, double dinero) {
        super(nombre, edad, id, id_boleto, departamento, dinero);
        this.empleo = empleo;
    }

    public String getEmpleo() {
        return empleo;
    }

    public void setEmpleo(String empleo) {
        this.empleo = empleo;
    }

    @Override
    public String toString() {
        return super.toString() + "Empleado{" + "empleo=" + empleo + '}';
    }

}
