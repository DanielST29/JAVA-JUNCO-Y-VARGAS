package com.citas.java.entidades;

import java.time.LocalDateTime;

public interface IAgendamiento {

    public void agendarCita(LocalDateTime fecha);
    public void cancelarCita();
    public void reagendarCita(LocalDateTime fecha);
}
