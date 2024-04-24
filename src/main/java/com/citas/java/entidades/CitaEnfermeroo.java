package com.citas.java.entidades;

import java.time.LocalDateTime;

public class CitaEnfermeroo extends Citaa implements IAgendamiento{
private ProcedimientosEnfermeria procedimiento;
private String enfermero;
public CitaEnfermeroo(Integer id, LocalDateTime fecha, ProcedimientosEnfermeria procedimiento, String string) {
    super(id, fecha);
    this.procedimiento = procedimiento;
    this.enfermero = string;
}
public ProcedimientosEnfermeria getProcedimiento() {
    return procedimiento;
}
public void setProcedimiento(ProcedimientosEnfermeria procedimiento) {
    this.procedimiento = procedimiento;
}
public String getEnfermero() {
    return enfermero;
}
public void setEnfermero(String enfermero) {
    this.enfermero = enfermero;
}
@Override
public void agendarCita(LocalDateTime fecha) {
    throw new UnsupportedOperationException("Unimplemented method 'agendarCita'");
}
@Override
public void cancelarCita() {
    System.out.println("Cita para procedimiento: "+this.procedimiento+ " cancelada");}
@Override
public void reagendarCita(LocalDateTime fecha) {
    throw new UnsupportedOperationException("Unimplemented method 'reagendarCita'");
}
@Override
public String toString() {
    return "procedimiento=" + procedimiento + ", enfermero=" + enfermero + ",fecha=" + getFecha()
            + ", Paciente=" + getPaciente() ;
}

}
