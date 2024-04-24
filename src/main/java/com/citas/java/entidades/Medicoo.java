package com.citas.java.entidades;


import com.citas.java.enumeraciones.Especialidad;
import com.citas.java.enumeraciones.TipoDocumento;

public class Medicoo extends Persona {

private String RegistroMedico;
private Especialidad especialidad;

public Medicoo(Integer id, String nombres, String apelliods, TipoDocumento tipoDocumento, String numeroDocumento,
        String registroMedico, Especialidad especialidad) {
    super(id, nombres, apelliods, tipoDocumento, numeroDocumento);
    RegistroMedico = registroMedico;
    this.especialidad = especialidad;
}

public String getRegistroMedico() {
    return RegistroMedico;
}

public void setRegistroMedico(String registroMedico) {
    RegistroMedico = registroMedico;
}

public Especialidad getEspecialidad() {
    return especialidad;
}

public void setEspecialidad(Especialidad especialidad) {
    this.especialidad = especialidad;
}

@Override
public String toString() {
    return "Medicoo [especialidad=" + especialidad + ", getNombres()=" + getNombres() + ", getApelliods()="
            + getApelliods() + "]";
}


}
