/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalho1poo;

/**
 *
 * @author aleix
 */
public class Consulta {
    private Paciente paciente;
    private int dataConsulta;
    private int horario;
    private String medico;
    private boolean consultaNormal; //consulta normal se true, retorno se false

    public Consulta() {
    }

    public int getDataConsulta() {
        return dataConsulta;
    }

    public void setDataConsulta(int dataConsulta) {
        this.dataConsulta = dataConsulta;
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
