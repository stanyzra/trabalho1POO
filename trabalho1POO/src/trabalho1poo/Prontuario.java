package trabalho1poo;

// STANY HELBERTH RA112683
// FELIPE ROVERONI RA112675

public class Prontuario {
    private String sintomas;
    private String diagnosticoDoenca;
    private String prescricaoTratamento;
    private Paciente paciente;

    public Prontuario() {
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }
    
    public String getSintomas() {
        return sintomas;
    }

    public void setSintomas(String sintomas) {
        this.sintomas = sintomas;
    }

    public String getDiagnosticoDoenca() {
        return diagnosticoDoenca;
    }

    public void setDiagnosticoDoenca(String diagnosticoDoenca) {
        this.diagnosticoDoenca = diagnosticoDoenca;
    }

    public String getPrescricaoTratamento() {
        return prescricaoTratamento;
    }

    public void setPrescricaoTratamento(String prescricaoTratamento) {
        this.prescricaoTratamento = prescricaoTratamento;
    }
    
    
}
