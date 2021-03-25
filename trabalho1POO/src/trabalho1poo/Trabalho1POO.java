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

public class Trabalho1POO {

    /**
     * @param args the command line arguments
     */
    
    public static void gerenciarPaciente(Scanner input, Usuario usuario, Paciente pacienteNovo, ArrayList pacientes){
        int op;
        do{
            System.out.println(""
                    + "-------GERENCIAR PACIENTE--------\n"
                    + "0 - Voltar                       |\n"
                    + "1 - Cadastrar Paciente           |\n"
                    + "2 - Atualizar Paciente           |\n"
                    + "3 - Remover Paciente             |\n"
                    + "---------------------------------\n"
                    + "Selecione uma opção: ");

            op = input.nextInt();
            switch(op){
                default:
                    System.out.println("Opção inválida");
                    break;
                case 1:
                    usuario.cadastrarPaciente(input, pacientes);
                    //cadastrarPaciente(input, usuario, paciente);
                    //System.out.println("Nome paciente: " + paciente.getNome());
                    break;
                case 2:
                    usuario.atualizarPaciente(input, pacientes);
                    break;
                case 3:
                    usuario.removerPaciente(input, pacientes);
                    break;
            }
       
        }while(op != 0);
    }
    
    public static void menuSecretaria(Scanner input, Usuario usuario, Paciente pacienteNovo, ArrayList pacientes){
        int op;
        do{
            System.out.println(""
                    + "---------MENU SECRETARIA----------\n"
                    + "0 - Voltar                        |\n"
                    + "1 - Gerenciar pacientes           |\n"
                    + "2 - Gerenciar consultas           |\n"
                    + "3 - Gerar relatórios de consultas |\n"
                    + "----------------------------------\n"
                    + "Selecione uma opção: ");
            op = input.nextInt();

            switch(op){
                default:
                    System.out.println("Opção inválida");
                    break;
                case 0:
                    break;
                case 1:
                    gerenciarPaciente(input, usuario, pacienteNovo, pacientes);
                    break;
                case 2:
                    break;
                case 3:
                    break;
            }
            
        }while(op != 0);
    }
    
    public static void menuMedico(){
        System.out.println("");
    }
    
    public static void main(String[] args) {
        int op;

        Scanner input = new Scanner(System.in);
       
        Medico medico = new Medico();
        Paciente pacienteNovo = new Paciente();
        Secretaria secretaria = new Secretaria();
        Usuario usuario = new Usuario();
        ArrayList<Paciente> pacientes = new ArrayList();
        
        do{
             System.out.println(
                  "-----INFORMAR TIPO DE USUÁRIO-----\n"
                + "0 - Sair                          |\n"
                + "1 - Secretária                    |\n"
                + "2 - Médico                        |\n"
                + "----------------------------------\n"
                + "Selecione uma opção: ");
        
            op = input.nextInt();
        
            switch(op){
                default:
                    System.out.println("Tipo inválido");
                    break;
                case 0:
                    break;
                case 1:
                    usuario.setTipoUsuario(secretaria);                        
                    menuSecretaria(input, usuario, pacienteNovo, pacientes);
                    break;
                case 2:
                    usuario.setTipoUsuario(medico);
            }
        }while(op != 0);
    }
}
