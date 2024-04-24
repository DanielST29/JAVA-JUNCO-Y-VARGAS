package com.citas.java.entidades;

import java.time.LocalDate;

import com.citas.java.enumeraciones.TipoDocumento;
import com.citas.java.enumeraciones.TipoSangre;

public class Paciente extends Persona {
private String correoElectronico;
private Integer celular;
private LocalDate fechaNacimiento;
private Double altura;
private double peso;
private TipoSangre tiposangre;
private char factorRH;

public Paciente(Integer id, String nombres, String apelliods, TipoDocumento tipoDocumento, String numeroDocumento,
        String correoElectronico, String string, String string2, String string3, String string4,
        TipoSangre tiposangre, String string5) {
    super(id, nombres, apelliods, tipoDocumento, numeroDocumento);
    this.correoElectronico = correoElectronico;
    this.celular = celular;
    this.fechaNacimiento = fechaNacimiento;
    this.altura = altura;
    this.peso = peso;
    this.tiposangre = tiposangre;
    this.factorRH = factorRH;
}

public String getCorreoElectronico() {
    return correoElectronico;
}

public void setCorreoElectronico(String correoElectronico) {
    this.correoElectronico = correoElectronico;
}

public Integer getCelular() {
    return celular;
}

public void setCelular(Integer celular) {
    this.celular = celular;
}

public LocalDate getFechaNacimiento() {
    return fechaNacimiento;
}

public void setFechaNacimiento(LocalDate fechaNacimiento) {
    this.fechaNacimiento = fechaNacimiento;
}

public Double getAltura() {
    return altura;
}

public void setAltura(Double altura) {
    this.altura = altura;
}

public double getPeso() {
    return peso;
}

public void setPeso(double peso) {
    this.peso = peso;
}

public TipoSangre getTiposangre() {
    return tiposangre;
}

public void setTiposangre(TipoSangre tiposangre) {
    this.tiposangre = tiposangre;
}

public char getFactorRH() {
    return factorRH;
}

public void setFactorRH(char factorRH) {
    this.factorRH = factorRH;
}

@Override
public String toString() {
    return "Paciente [getNombres()=" + getNombres() + ", getApelliods()=" + getApelliods() + "]";
}


}
