/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalho1poo;

import java.time.LocalDate;

/**
 *
 * @author aleix
 */
public class Paciente {
    //dados de identificação
    private String nome;
    private LocalDate localDateNasc;
    private String bairro;
    private String cidade;
    private String rua;
    private int telefone;
    private Consulta consulta;
    private boolean particular, consultaCadastrada; //convenio

    public Paciente() {
    }

    public Consulta getConsulta() {
        return consulta;
    }

    public boolean isConsultaCadastrada() {
        return consultaCadastrada;
    }

    public void setConsultaCadastrada(boolean consultaCadastrada) {
        this.consultaCadastrada = consultaCadastrada;
    }
    
    public void setConsulta(Consulta consulta) {
        this.consulta = consulta;
    }

    public LocalDate getLocalDateNasc() {
        return localDateNasc;
    }

    public void setLocalDateNasc(LocalDate localDateNasc) {
        this.localDateNasc = localDateNasc;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }
    
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    public boolean isParticular() {
        return particular;
    }

    public void setParticular(boolean particular) {
        this.particular = particular;
    }
    
}
