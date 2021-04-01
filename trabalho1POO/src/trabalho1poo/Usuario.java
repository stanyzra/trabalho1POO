/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalho1poo;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author aleix
 */
public class Usuario {
    
    private Usuario tipoUsuario;

    public Usuario(Usuario tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }
    
    public Usuario() {
    }
/*
    public void cadastrarPaciente(String nome, String dataNsc, String endereco, int telefone, boolean particular, Paciente paciente){
        tipoUsuario.cadastrarPaciente(nome, dataNsc, endereco, telefone, particular, paciente);
    }
*/  
    public void cadastrarPaciente(Scanner input, ArrayList<Paciente> pacientes){
        tipoUsuario.cadastrarPaciente(input, pacientes);
    }
    
    public void cadastrarPaciente(Scanner input, ArrayList<Paciente> pacientes, ArrayList<DadosAdicionais> dadosAdicionais){
        tipoUsuario.cadastrarPaciente(input, pacientes, dadosAdicionais);
    }
    
    public void atualizarPaciente(Scanner input, ArrayList<Paciente> pacientes){
        tipoUsuario.atualizarPaciente(input, pacientes);
    }
    
    public void atualizarPaciente(Scanner input, ArrayList<Paciente> pacientes, ArrayList<DadosAdicionais> dadosAdicionais){
        tipoUsuario.atualizarPaciente(input, pacientes, dadosAdicionais);
    }
    
    public void removerPaciente(Scanner input, ArrayList<Paciente> pacientes){
        tipoUsuario.removerPaciente(input, pacientes);
    }
    
    public void removerPaciente(Scanner input, ArrayList<Paciente> pacientes, ArrayList<DadosAdicionais> dadosAdicionais){
        tipoUsuario.removerPaciente(input, pacientes, dadosAdicionais);
    }
    
    public void cadastrarProntuario(Scanner input, ArrayList<Paciente> pacientes, ArrayList<Prontuario> prontuario){
        tipoUsuario.cadastrarProntuario(input, pacientes, prontuario);
    }
    
    public void atualizarProntuario(Scanner input, ArrayList<Paciente> pacientes, ArrayList<Prontuario> prontuario){
        tipoUsuario.atualizarProntuario(input, pacientes, prontuario);
    }
    
    public void removerProntuario(Scanner input, ArrayList<Paciente> pacientes, ArrayList<Prontuario> prontuario){
        tipoUsuario.removerProntuario(input, pacientes, prontuario);
    }
    
    public Usuario getTipoUsuario() {
        return tipoUsuario;
    }

    public void setTipoUsuario(Usuario tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }

    public void cadastrarConsulta(Scanner input, ArrayList<Paciente> pacientes, ArrayList<Consulta> consultas) {
        tipoUsuario.cadastrarConsulta(input, pacientes, consultas);
    }
    
    public void atualizarConsulta(Scanner input, ArrayList<Paciente> pacientes, ArrayList<Consulta> consultas) {
        tipoUsuario.atualizarConsulta(input, pacientes, consultas);
    }
    
    public void removerConsulta(Scanner input, ArrayList<Paciente> pacientes, ArrayList<Consulta> consultas) {
        tipoUsuario.removerConsulta(input, pacientes, consultas);
    }
    
    public void gerarRelatorioConsulta(Scanner input, ArrayList<Paciente> pacientes, ArrayList<Consulta> consultas){
        tipoUsuario.gerarRelatorioConsulta(input, pacientes, consultas);
    }

}
