/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalho1poo;

import java.util.ArrayList;
import java.util.Scanner;
import java.time.LocalDate; 
import java.time.format.DateTimeFormatter;

/**
 *
 * @author aleix
 */

public class Secretaria extends Usuario{
    DateTimeFormatter toBarras = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    public void cadastrarPaciente(Scanner input, ArrayList<Paciente> pacientes){
        int op, tel;
        LocalDate dataNasc;
        String nome, bairro, cidade, rua; 
        boolean conv = false; //inicialização que poderá ser mudada durante a execução do cadastro

        Paciente pacienteNovo = new Paciente();
        
        System.out.println("Informe o nome: ");
        input.nextLine();
        nome = input.nextLine();
        System.out.println("Informe a data de nascimento (ano, mes e dia): ");
        dataNasc = LocalDate.of(input.nextInt(), input.nextInt(), input.nextInt());
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
        pacienteNovo.setLocalDateNasc(dataNasc);
        pacienteNovo.setBairro(bairro);
        pacienteNovo.setCidade(cidade);
        pacienteNovo.setRua(rua);
        pacienteNovo.setTelefone(tel);
        pacienteNovo.setParticular(conv);
        pacienteNovo.setConsultaCadastrada(false);
        
        pacientes.add(pacienteNovo);
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
                    System.out.print("OBS: a data está no formato (dia/mes/ano)"
                            + "0 - Voltar \n"
                            + "1 - Nome (" + pacientes.get(indice).getNome() +")\n"
                            + "2 - Data de nascimento (" + pacientes.get(indice).getLocalDateNasc().format(toBarras)+")\n"
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

                    System.out.println("Selecione a informação que deseja atualizar: ");
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
                            System.out.println("Insira uma nova data de nascimento (ano, mes e dia)");
                            input.nextLine();
                            LocalDate novaDataDasc = LocalDate.of(input.nextInt(), input.nextInt(), input.nextInt());
                            pacientes.get(indice).setLocalDateNasc(novaDataDasc);
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
    
    public void cadastrarConsulta(Scanner input, ArrayList<Paciente> pacientes, ArrayList<Consulta> consultas){
        int op, indice, horario;
        String medico;
        boolean consultaNormal = false; 
        
        Consulta novaConsulta = new Consulta();

        if(pacientes.isEmpty()){
            System.out.println("Nenhum paciente inserido.");
        }else{
        
            System.out.println("Informe para qual paciente deseja realizar a consulta: ");
        
            for (int i = 0; i < pacientes.size(); i++) {
                System.out.println((i+1)+" - "+pacientes.get(i).getNome());
            }
            
            indice = input.nextInt();    
            
            if(indice == 0){
            }else if(pacientes.get(indice-1).isConsultaCadastrada()){
                System.out.println("Não é possível cadastrar uma nova consulta para esse"
                        + "paciente. Se deseja atualizar, utilize a opção 2 no menu de "
                        + "gerencimaneto de consultas.");
            }else{
                System.out.println("Insira a data da consulta: (ano, mes e dia)");input.nextLine();
                LocalDate dataConsulta = LocalDate.of(input.nextInt(), input.nextInt(), input.nextInt());
                System.out.println("Insira o horario: ");
                horario = input.nextInt();
                System.out.println("Insira o nome do medico: ");
                input.nextLine();
                medico = input.nextLine();
                System.out.println("Insira o tipo de consulta: (1 para normal || 2 para retorno)");
                op = input.nextInt();

                switch (op) { //se for true = normal, se for false = retorno
                    default:
                        System.out.println("Opção inválida"); 
                        break;
                    case 1:
                        consultaNormal = true; 
                        break;
                    case 2:
                        consultaNormal = false;
                }

                novaConsulta.setPaciente(pacientes.get(indice-1));
                novaConsulta.setConsultaNormal(consultaNormal);
                novaConsulta.setLocalDateCons(dataConsulta);
                novaConsulta.setHorario(horario);
                novaConsulta.setMedico(medico);
                novaConsulta.getPaciente().setConsultaCadastrada(true);

                pacientes.get(indice-1).setConsulta(novaConsulta);
                consultas.add(novaConsulta);

                //System.out.println("medico: "+pacientes.get(0).getConsulta().getMedico());
            }
        }
    }
    
    public void atualizarConsulta(Scanner input, ArrayList<Paciente> pacientes, ArrayList<Consulta> consultas){
       int op, indice;
        do{
            if(pacientes.isEmpty() || consultas.isEmpty()){
                System.out.println("Nenhum paciente ou consulta inserida.");
                break;
            }else{
                
                System.out.println("Selecione o paciente que deseja atualizar a consulta: ");
                
                for (int i = 0; i < consultas.size(); i++) {
                    System.out.println((i+1)+" - "+consultas.get(i).getPaciente().getNome());
                }
                indice = input.nextInt();
                
                if(indice == 0)
                    break;
                else if(indice < 0 || indice > consultas.size()){
                    System.out.println("Opção inválida");
                    break;
                }else{
                    indice--;
                    System.out.println("--------------------------------------------");
                    do{
                    System.out.print(""
                            + "0 - Voltar \n"
                            + "1 - Nome (" + consultas.get(indice).getPaciente().getNome() +")\n"
                            + "2 - Data da consulta (" + consultas.get(indice).getLocalDateCons().format(toBarras)+")\n"
                            + "3 - Horario (" + consultas.get(indice).getHorario()+")\n"
                            + "4 - Médico (" + consultas.get(indice).getMedico()+")\n"
                            + "5 - Tipo de Consulta (");
                    
                    if(consultas.get(indice).isConsultaNormal() == true){
                        System.out.print("Consulta normal (1 hora))\n");
                    }else{
                        System.out.print("Retorno (30 minutos))\n");
                    }
                    
                    System.out.println("Selecione a informação que deseja atualizar: ");
                    op = input.nextInt();

                    switch(op){
                        default:
                            System.out.println("Opção inválida");
                            break;
                        case 0:
                            break;
                        case 1:
                            System.out.println("Insira um novo nome: ");
                            input.nextLine();
                            String novoNome = input.nextLine();
                            consultas.get(indice).getPaciente().setNome(novoNome);
                            break;
                        case 2:
                            System.out.println("Insira uma nova data de consulta: (ano, mes e dia)");
                            input.nextLine();
                            LocalDate novaDataCons = LocalDate.of(input.nextInt(), input.nextInt(), input.nextInt());
                            consultas.get(indice).setLocalDateCons(novaDataCons);
                            break;
                        case 3:
                            System.out.println("Insira um novo horario: ");
                            input.nextLine();
                            int novoHorario = input.nextInt();
                            consultas.get(indice).setHorario(novoHorario);
                            break;
                        case 4:
                            System.out.println("Insira um médico: ");
                            input.nextLine();
                            String novoMedico = input.nextLine();
                            consultas.get(indice).setMedico(novoMedico);
                            break;
                        case 5:  
                            System.out.println("Insira um novo tipo de consulta (1 para consulta normal || 2 para retorno)");
                            input.nextLine();
                            int cons = input.nextInt();

                            switch (cons) { //se for true = consulta normal, se for false = retorno
                                default:
                                    System.out.println("Opção inválida"); 
                                    break;
                                case 1:
                                    consultas.get(indice).setConsultaNormal(true);
                                    break;
                                case 2:
                                    consultas.get(indice).setConsultaNormal(false);
                            }
                        }
                    }while(op != 0);
                }
            }
        }while(op!=0);
    }
        
    public void removerConsulta(Scanner input, ArrayList<Paciente> pacientes, ArrayList<Consulta> consultas){
        int indice;
            if(pacientes.isEmpty() || consultas.isEmpty()){
                System.out.println("Nenhum paciente ou consulta inserida.");
            }else{
                do{
                    System.out.println("Selecione o paciente que deseja remover a consulta: \n"
                                     + "0 - Sair");

                    for (int i = 0; i < consultas.size(); i++) {
                        System.out.println((i+1)+" - "+consultas.get(i).getPaciente().getNome());
                    }
                    indice = input.nextInt();
                    if(indice == 0)
                        break;
                    else if(indice < 0 || indice > consultas.size()){
                        System.out.println("Opção inválida");
                        break;
                    }else
                        consultas.get(indice-1).getPaciente().setConsultaCadastrada(false);
                        consultas.remove(indice-1);
                    System.out.println("Consulta removida com sucesso");
                }while(indice != 0);
            }
    }
    
    public void gerarRelatorioConsulta(Scanner input, ArrayList<Paciente> pacientes, ArrayList<Consulta> consultas){
        if(pacientes.isEmpty() || consultas.isEmpty())
            System.out.println("Nenhum paciente ou consulta inserida.");
        else{
            boolean consultaExiste = false;
            System.out.println("Relatório de Consultas para o dia (" + LocalDate.now().plusDays(1).format(toBarras) + "), filtrando por telefone");
            for (int i = 0; i < consultas.size(); i++) {

                if(consultas.get(i).getLocalDateCons().equals(LocalDate.now().plusDays(1))){
                    
                    System.out.println("Paciente: " + consultas.get(i).getPaciente().getNome()
                    + "| Número de telefone: " +consultas.get(i).getPaciente().getTelefone());
                    consultaExiste = true;
                }
            }
            if(!consultaExiste){
                System.out.println("Nenhuma consulta cadastrada para esse dia");
            }
        }
    }
}