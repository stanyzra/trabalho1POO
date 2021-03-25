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
    
    public void atualizarPaciente(Scanner input, ArrayList<Paciente> pacientes){
        tipoUsuario.atualizarPaciente(input, pacientes);

    }
    
    public void removerPaciente(Scanner input, ArrayList<Paciente> pacientes){
        tipoUsuario.removerPaciente(input, pacientes);

    }
    public Usuario getTipoUsuario() {
        return tipoUsuario;
    }

    public void setTipoUsuario(Usuario tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }

}