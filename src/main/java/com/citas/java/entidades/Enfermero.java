package com.citas.java.entidades;

import com.citas.java.enumeraciones.TipoDocumento;

public  class Enfermero extends Persona {

public Enfermero(Integer id, String nombres, String apelliods, TipoDocumento tipoDocumento, String numeroDocumento) {
    super(id, nombres, apelliods, tipoDocumento, numeroDocumento);
}

}
