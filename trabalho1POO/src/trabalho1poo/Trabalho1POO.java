package trabalho1poo;

// STANY HELBERTH RA112683
// FELIPE ROVERONI RA112675

import java.util.ArrayList;
import java.util.Scanner;

public class Trabalho1POO {

    /**
     * @param args the command line arguments
     */
        public static void menuGerenciarMensagem(Scanner input, Usuario usuario, ArrayList pacientes, ArrayList consultas){
        int op;
        do{
            System.out.println(""
                    + "--------------------GERENCIAR MENSAGENS--------------------\n"
                    + "0 - Voltar                                                 |\n"
                    + "1 - Enviar mensagens para os pacientes do dia seguinte     |\n"
                    + "-----------------------------------------------------------\n"
                    + "Selecione uma opção: ");

            op = input.nextInt();
            switch(op){
                default:
                    System.out.println("Opção inválida");
                    break;
                case 1:
                    usuario.enviarMensagem(input, pacientes, consultas);
            }
       
        }while(op != 0);
    }
    
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
    
    public static void gerenciarProntuario(Scanner input, Usuario usuario, ArrayList pacientes, ArrayList prontuario){
        int op;
        do{
            System.out.println(""
            + "------------GERENCIAR CONSULTA-------------\n"
            + "0 - Voltar                                 |\n"
            + "1 - Cadastrar Prontuario                   |\n"
            + "2 - Consultar e Atualizar Prontuario       |\n"
            + "3 - Remover Prontuario                     |\n"
            + "--------------------------------------------\n"
            + "Selecione uma opção: ");

            op = input.nextInt();
            switch(op){
                default:
                    System.out.println("Opção inválida");
                    break;
                case 1:
                    usuario.cadastrarProntuario(input, pacientes, prontuario);
                    break;
                case 2:
                    usuario.atualizarProntuario(input, pacientes, prontuario);
                    break;
                case 3:
                    usuario.removerProntuario(input, pacientes, prontuario);
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
                    usuario.gerarRelatorioConsulta(input, pacientes, consultas);
            }
            
        }while(op != 0);
    }
    
    public static void menuMedico(Scanner input, Usuario usuario, ArrayList pacientes, ArrayList dadosAdicionais, ArrayList prontuario, ArrayList consultas){
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
                    gerenciarProntuario(input, usuario, pacientes, prontuario);
                    break;
                case 3:
                    usuario.gerarRelatorioMedico(input, pacientes, consultas, prontuario);
                    break;
            }
            
        }while(op != 0);
    }
    
    public static void main(String[] args) {
        int op;

        Scanner input = new Scanner(System.in);
       
        Medico medico = new Medico();
        Secretaria secretaria = new Secretaria();
        GerenciadorMensagem gerenciador = new GerenciadorMensagem();
        Usuario usuario = new Usuario();
        ArrayList<Consulta> consultas = new ArrayList();
        ArrayList<Paciente> pacientes = new ArrayList();
        ArrayList<DadosAdicionais> dadosAdicionais = new ArrayList();
        ArrayList<Prontuario> prontuario = new ArrayList();
        
        do{
             System.out.println(
            "------INFORMAR TIPO DE USUÁRIO------\n"
            + "0 - Sair                          |\n"
            + "1 - Secretária                    |\n"
            + "2 - Médico                        |\n"
            + "3 - Gerenciador de Mensagens      |\n"
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
                    menuMedico(input, usuario, pacientes, dadosAdicionais, prontuario, consultas);
                    break;
                case 3:
                    usuario.setTipoUsuario(gerenciador);
                    menuGerenciarMensagem(input, usuario, pacientes, consultas);
                    break;
            }
        }while(op != 0);
    }
}
