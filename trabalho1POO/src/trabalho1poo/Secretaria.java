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

public class Secretaria extends Usuario{

    public void cadastrarPaciente(Scanner input, ArrayList<Paciente> pacientes){
        int op, dataNasc, tel;
        String nome, bairro, cidade, rua;
        boolean conv = false; //inicialização que poderá ser mudada durante a execução do cadastro

        Paciente pacienteNovo = new Paciente();
        
        System.out.println("Informe o nome: ");
        input.nextLine();
        nome = input.nextLine();
        System.out.println("Informe a data de nascimento (insira no formato "
                + "'diamesano' e apenas com números, exemplo: 07112000): ");
        dataNasc = input.nextInt();
        input.nextLine();
        System.out.println("Informe a cidade: ");
        cidade = input.nextLine();
        System.out.println("Informe o bairro: ");
        bairro = input.nextLine();
        System.out.println("Informe a rua: ");
        rua = input.nextLine();
        System.out.println("Informe o telefone: ");
        tel = input.nextInt();
        System.out.println("Tipo de convênio: (1 para particular ||"
                + " 2 para plano de saúde)");
        op = input.nextInt();

        switch (op) { //se for true = particular, se for false = plano de saúde
            default:
                System.out.println("Opção inválida"); 
                break;
            case 1:
                conv = true; 
                break;
            case 2:
                conv = false;
            }
        
        pacienteNovo.setNome(nome);
        pacienteNovo.setDataNasc(dataNasc);
        pacienteNovo.setBairro(bairro);
        pacienteNovo.setCidade(cidade);
        pacienteNovo.setRua(rua);
        pacienteNovo.setTelefone(tel);
        pacienteNovo.setParticular(conv);
        
        pacientes.add(pacienteNovo);
        System.out.println(pacientes.get(0).getNome());
        if(pacientes.size() > 1){
            System.out.println(pacientes.get(1).getNome());
            
        }
        System.out.println("Paciente cadastrado com sucesso");
        
    }
    
    public void atualizarPaciente(Scanner input, ArrayList<Paciente> pacientes){
        int op, indice;
        do{
            if(pacientes.isEmpty()){
                System.out.println("Nenhum paciente inserido.");
                break;
            }else{
                
                System.out.println("Selecione o paciente que deseja atualizar: ");
                
                for (int i = 0; i < pacientes.size(); i++) {
                    System.out.println((i+1)+" - "+pacientes.get(i).getNome());
                }
                indice = input.nextInt();
                
                if(indice == 0)
                    break;
                else if(indice < 0 || indice > pacientes.size()){
                    System.out.println("Opção inválida");
                    break;
                }else{
                
                    indice--;
                    System.out.println("--------------------------------------------");
                    do{
                    System.out.print(""
                            + "0 - Voltar \n"
                            + "1 - Nome (" + pacientes.get(indice).getNome() +")\n"
                            + "2 - Data de nascimento (" + pacientes.get(indice).getDataNasc()+")\n"
                            + "3 - Cidade (" + pacientes.get(indice).getCidade()+")\n"
                            + "4 - Bairro (" + pacientes.get(indice).getBairro()+")\n"
                            + "5 - Rua (" + pacientes.get(indice).getRua()+")\n"
                            + "6 - Telefone (" + pacientes.get(indice).getTelefone()+")\n"
                            + "7 - Convênio (");

                    if(pacientes.get(indice).isParticular() == true){
                        System.out.print("Particular)\n");
                    }else{
                        System.out.print("Plano de saúde)\n");
                    }

                    System.out.println("Selecione a informação que deseja cadastrar: ");
                    op = input.nextInt();

                    switch(op){
                        default:
                            System.out.println("Opção inválida");
                            break;
                        case 0:
                            break;
                        case 1:
                            System.out.println("Insira um novo nome");
                            input.nextLine();
                            String novoNome = input.nextLine();
                            pacientes.get(indice).setNome(novoNome);
                            break;
                        case 2:
                            System.out.println("Insira uma nova data de nascimento");
                            input.nextLine();
                            int novaDataDasc = input.nextInt();
                            pacientes.get(indice).setDataNasc(novaDataDasc);
                            break;
                        case 3:
                            System.out.println("Insira uma nova cidade");
                            input.nextLine();
                            String novaCidade = input.nextLine();
                            pacientes.get(indice).setCidade(novaCidade);
                            break;
                        case 4:
                            System.out.println("Insira um novo bairro");
                            input.nextLine();
                            String novoBairro = input.nextLine();
                            pacientes.get(indice).setBairro(novoBairro);
                            break;
                        case 5:
                            System.out.println("Insira uma nova rua");
                            input.nextLine();
                            String novaRua = input.nextLine();
                            pacientes.get(indice).setRua(novaRua);
                            break;
                        case 6:
                            System.out.println("Insira um novo telefone");
                            input.nextLine();
                            int novoTel = input.nextInt();
                            pacientes.get(indice).setTelefone(novoTel);
                            break;
                        case 7:  

                            System.out.println("Insira um novo convenio (1 para particular || 2 para plano de saúde)");
                            input.nextLine();
                            int conv = input.nextInt();

                            switch (conv) { //se for true = particular, se for false = plano de saúde
                                default:
                                    System.out.println("Opção inválida"); 
                                    break;
                                case 1:
                                    pacientes.get(indice).setParticular(true);
                                    break;
                                case 2:
                                    pacientes.get(indice).setParticular(false);
                            }
                        }
                    }while(op != 0); 
                }
            }
        }while(op != 0);
    }
    
    public void removerPaciente(Scanner input, ArrayList<Paciente> pacientes){
        int indice;
            if(pacientes.isEmpty()){
                System.out.println("Nenhum paciente inserido.");
            }else{
                do{

                    System.out.println("Selecione o paciente que deseja remover: \n"
                                     + "0 - Sair");

                    for (int i = 0; i < pacientes.size(); i++) {
                        System.out.println((i+1)+" - "+pacientes.get(i).getNome());
                    }
                    indice = input.nextInt();
                    if(indice == 0)
                        break;
                    else if(indice < 0 || indice > pacientes.size()){
                        System.out.println("Opção inválida");
                        break;
                    }else
                        pacientes.remove(indice-1);
                    System.out.println("Paciente removido com sucesso");
                }while(indice != 0);
            }
    }
    /*
    private Paciente paciente;
    private String dataConsulta;
    private String horario;
    private String medico;
    private String nome;
    private boolean consultaNormal; //consulta normal se true, retorno se false
    */
    public void cadastrarConsulta(Scanner input, ArrayList<Paciente> pacientes){
        int op, indice;
        String dataConsulta, horario, medico, nome;
        Paciente paciente;
        
        Consulta consulta = new Consulta();
        
        System.out.println("Insira a data da consulta: ");
        dataConsulta = input.nextLine();
        System.out.println("Insira o horario: ");
        horario = input.nextLine();
        System.out.println("Insira o nome do medico: ");
        medico = input.nextLine();
        System.out.println("Informe o nome do paciente: ");
        
        for (int i = 0; i < pacientes.size(); i++) {
                        System.out.println((i+1)+" - "+pacientes.get(i).getNome());
                    }
                    indice = input.nextInt();

        dataConsulta = input.nextLine();
        System.out.println("Insira a data da consulta: ");
        dataConsulta = input.nextLine();
        
        
    }
    
    public void atualizarConsulta(){
        
    }
    
    public void removerConsulta(){
        
    }
    
    public void gerarRelatorioConsulta(){
        
    }
    
}