package trabalho1poo;

// STANY HELBERTH RA112683
// FELIPE ROVERONI RA112675

import java.time.LocalDate;

public class Consulta {
    private Paciente paciente;
    private LocalDate localDateCons;
    private int horario;
    private String medico;
    private boolean consultaNormal; //consulta normal se true, retorno se false

    public Consulta() {
    }

    public LocalDate getLocalDateCons() {
        return localDateCons;
    }

    public void setLocalDateCons(LocalDate localDateCons) {
        this.localDateCons = localDateCons;
    }

    public int getHorario() {
        return horario;
    }

    public void setHorario(int horario) {
        this.horario = horario;
    }
    
    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }
    
    public String getMedico() {
        return medico;
    }

    public void setMedico(String medico) {
        this.medico = medico;
    }

    public boolean isConsultaNormal() {
        return consultaNormal;
    }

    public void setConsultaNormal(boolean consultaNormal) {
        this.consultaNormal = consultaNormal;
    }
    
}
