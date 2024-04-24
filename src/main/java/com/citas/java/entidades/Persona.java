package com.citas.java.entidades;

import com.citas.java.enumeraciones.TipoDocumento;

public abstract class  Persona {
private Integer id;
private static String nombree;
private String apelliods;
private TipoDocumento tipoDocumento ;
private String numeroDocumento;

public Persona(Integer id, String nombres, String apelliods, TipoDocumento tipoDocumento, String numeroDocumento) {
    this.id = id;
    this.nombree = nombres;
    this.apelliods = apelliods;
    this.tipoDocumento = tipoDocumento;
    this.numeroDocumento = numeroDocumento;
}

public Integer getId() {
    return id;
}

public void setId(Integer id) {
    this.id = id;
}

public static String getNombres() {
    return nombree;
}

public void setNombres(String nombres) {
    this.nombree = nombres;
}

public String getApelliods() {
    return apelliods;
}

public void setApelliods(String apelliods) {
    this.apelliods = apelliods;
}

public TipoDocumento getTipoDocumento() {
    return tipoDocumento;
}

public void setTipoDocumento(TipoDocumento tipoDocumento) {
    this.tipoDocumento = tipoDocumento;
}

public String getNumeroDocumento() {
    return numeroDocumento;
}

public void setNumeroDocumento(String numeroDocumento) {
    this.numeroDocumento = numeroDocumento;
}

}
