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
    
    public static void gerenciarPaciente(Scanner input, Usuario usuario, ArrayList pacientes){
        int op;
        do{
            System.out.println(""
                    + "--------------GERENCIAR PACIENTE-------------\n"
                    + "0 - Voltar                                   |\n"
                    + "1 - Cadastrar Paciente                       |\n"
                    + "2 - Consultar e Atualizar Paciente           |\n"
                    + "3 - Remover Paciente                         |\n"
                    + "---------------------------------------------\n"
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
    
     public static void gerenciarPacienteMed(Scanner input, Usuario usuario, ArrayList pacientes, ArrayList dadosAdicionais){
        int op;
        do{
            System.out.println(""
                    + "------------GERENCIAR PACIENTE MED-----------\n"
                    + "0 - Voltar                                   |\n"
                    + "1 - Cadastrar Dados Adicionais               |\n"
                    + "2 - Consultar e Atualizar Dados Adicionais   |\n"
                    + "3 - Remover Dados Adicionais                 |\n"
                    + "---------------------------------------------\n"
                    + "Selecione uma opção: ");

            op = input.nextInt();
            switch(op){
                default:
                    System.out.println("Opção inválida");
                    break;
                case 1:
                    usuario.cadastrarPaciente(input, pacientes, dadosAdicionais);
                    break;
                case 2:
                    usuario.atualizarPaciente(input, pacientes, dadosAdicionais);
                    break;
                case 3:
                    usuario.removerPaciente(input, pacientes, dadosAdicionais);
                    break;
            }
       
        }while(op != 0);
    }
    
    public static void gerenciarConsulta(Scanner input, Usuario usuario, ArrayList pacientes, ArrayList consulta){
        int op;
        do{
            System.out.println(""
            + "------------GERENCIAR CONSULTA-------------\n"
            + "0 - Voltar                                 |\n"
            + "1 - Cadastrar Consulta                     |\n"
            + "2 - Consultar e Atualizar Consulta         |\n"
            + "3 - Remover Consulta                       |\n"
            + "--------------------------------------------\n"
            + "Selecione uma opção: ");

            op = input.nextInt();
            switch(op){
                default:
                    System.out.println("Opção inválida");
                    break;
                case 1:
                    usuario.cadastrarConsulta(input, pacientes, consulta);
                    break;
                case 2:
                    usuario.atualizarConsulta(input, pacientes, consulta);
                    break;
                case 3:
                    usuario.removerConsulta(input, pacientes, consulta);
                    break;
            }

        }while(op != 0);
    }
    
    public static void menuSecretaria(Scanner input, Usuario usuario, ArrayList pacientes, ArrayList consultas){
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
                    gerenciarPaciente(input, usuario, pacientes);
                    break;
                case 2:
                    gerenciarConsulta(input, usuario, pacientes, consultas);
                    break;
                case 3:
                    break;
            }
            
        }while(op != 0);
    }
    
    public static void menuMedico(Scanner input, Usuario usuario, ArrayList pacientes, ArrayList dadosAdicionais){
        int op;
        
        do{
            System.out.println(""
            + "-----------MENU MEDICO------------\n"
            + "0 - Voltar                        |\n"
            + "1 - Gerenciar pacientes           |\n"
            + "2 - Gerenciar prontuario          |\n"
            + "3 - Gerar relatórios              |\n"
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
                    gerenciarPacienteMed(input, usuario, pacientes, dadosAdicionais);
                    break;
                case 2:
                    
                    
                    break;
                case 3:
                    break;
            }
            
        }while(op != 0);
    }
    
    public static void main(String[] args) {
        int op;

        Scanner input = new Scanner(System.in);
       
        Medico medico = new Medico();
        Secretaria secretaria = new Secretaria();
        Usuario usuario = new Usuario();
        ArrayList<Consulta> consultas = new ArrayList();
        ArrayList<Paciente> pacientes = new ArrayList();
        ArrayList<DadosAdicionais> dadosAdicionais = new ArrayList();
        
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
                    menuSecretaria(input, usuario, pacientes, consultas);
                    break;
                case 2:
                    usuario.setTipoUsuario(medico);
                    menuMedico(input, usuario, pacientes, dadosAdicionais);
            }
        }while(op != 0);
    }
}
