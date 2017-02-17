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
public class Politico extends Persona {

    String partido_afiliado;

    public Politico() {
        super();
    }

    public Politico(String partido_afiliado, String nombre, int edad, int id, int id_boleto, String departamento, double dinero) {
        super(nombre, edad, id, id_boleto, departamento, dinero);
        this.partido_afiliado = partido_afiliado;
    }

    public String getPartido_afiliado() {
        return partido_afiliado;
    }

    public void setPartido_afiliado(String partido_afiliado) {
        this.partido_afiliado = partido_afiliado;
    }

    @Override
    public String toString() {
        return super.toString() + "Politico{" + "partido_afiliado=" + partido_afiliado + '}';
    }

}
