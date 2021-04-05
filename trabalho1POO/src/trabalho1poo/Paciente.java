package trabalho1poo;

// STANY HELBERTH RA112683
// FELIPE ROVERONI RA112675

import java.time.LocalDate;

public class Paciente {
    //dados de identificação
    private String nome;
    private LocalDate localDateNasc;
    private String bairro;
    private String cidade;
    private String rua;
    private int telefone;
    private Consulta consulta;
    private DadosAdicionais dadosAdicionais;
    private Prontuario prontuario;
    private boolean particular, consultaCadastrada, dadosAdicionaisCadastrado, prontuarioCadastrado; //convenio

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

    public boolean isDadosAdicionaisCadastrado() {
        return dadosAdicionaisCadastrado;
    }

    public void setDadosAdicionaisCadastrado(boolean dadosAdicionaisCadastrado) {
        this.dadosAdicionaisCadastrado = dadosAdicionaisCadastrado;
    }

    public DadosAdicionais getDadosAdicionais() {
        return dadosAdicionais;
    }

    public void setDadosAdicionais(DadosAdicionais dadosAdicionais) {
        this.dadosAdicionais = dadosAdicionais;
    }
        
    public boolean isProntuarioCadastrado(){
        return prontuarioCadastrado;
    }
    
    public void setProntuarioCadastrado(boolean prontuarioCadastrado) {
        this.prontuarioCadastrado = prontuarioCadastrado;
    }

    public Prontuario getProntuario() {
        return prontuario;
    }
    
    public void setProntuario(Prontuario prontuario){
        this.prontuario = prontuario;
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
