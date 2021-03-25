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
    private String dataConsulta;
    private String horario;
    private String medico;
    private String nome;
    private boolean consultaNormal; //consulta normal se true, retorno se false

    public Consulta() {
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }
    
    public String getDataConsulta() {
        return dataConsulta;
    }

    public void setDataConsulta(String dataConsulta) {
        this.dataConsulta = dataConsulta;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public String getMedico() {
        return medico;
    }

    public void setMedico(String medico) {
        this.medico = medico;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public boolean isConsultaNormal() {
        return consultaNormal;
    }

    public void setConsultaNormal(boolean consultaNormal) {
        this.consultaNormal = consultaNormal;
    }
    
}
