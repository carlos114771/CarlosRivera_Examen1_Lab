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
public class Estudiantes extends Persona {

    String carrera_estudiantil;

    public Estudiantes() {
        super();
    }

    public Estudiantes(String carrera_estudiantil, String nombre, int edad, int id, int id_boleto, String departamento, double dinero) {
        super(nombre, edad, id, id_boleto, departamento, dinero);
        this.carrera_estudiantil = carrera_estudiantil;
    }

    public String getCarrera_estudiantil() {
        return carrera_estudiantil;
    }

    public void setCarrera_estudiantil(String carrera_estudiantil) {
        this.carrera_estudiantil = carrera_estudiantil;
    }

    @Override
    public String toString() {
        return super.toString() + "Estudiantes{" + "carrera_estudiantil=" + carrera_estudiantil + '}';
    }

}
