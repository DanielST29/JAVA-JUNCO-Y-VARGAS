package com.citas.java.entidades;

import java.time.LocalDateTime;

public class CitaMedicoo extends Citaa implements IAgendamiento {
    private String motivo;
public String medico;
private Estado estado;

public CitaMedicoo(Integer id, LocalDateTime fecha, String motivo, String string, Estado estado) {
    super(id, fecha);
    this.motivo = motivo;
    this.medico = string;
    this.estado = estado;
    this.motivo=motivo;
    this.medico=string;
    this.estado=Estado.AGENDADA;
}
public String getMotivo() {
    return motivo;
}
public void setMotivo(String motivo) {
    this.motivo = motivo;
}
public String getMedico() {
    return medico;
}
public void setMedico(String medico) {
    this.medico = medico;
}
public Estado getEstado() {
    return estado;
}
public void setEstado(Estado estado) {
    this.estado = estado;
}
@Override
public void agendarCita(LocalDateTime fecha) {
    this.setFecha(fecha);
    this.setEstado(estado);
}

@Override
public String toString() {
    return "la fecha de la cita es el " + getFecha() + " el paciente es " + Paciente.getNombres() + ",el medico es " + getMedico()
            ;
}
@Override
public void cancelarCita() {
    this.estado = estado.CANCELADA;
    System.out.println("cita con medico "+medico+" cancelada");
}
@Override
public void reagendarCita(LocalDateTime fecha) {
    this.setFecha(fecha);
} 


}
