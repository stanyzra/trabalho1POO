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

public class Medico extends Usuario{

    public void cadastrarPaciente(Scanner input, ArrayList<Paciente> pacientes, ArrayList<DadosAdicionais> dadosAdicionais){
        boolean fuma = false, bebe = false, colesterol = false, diabete = false, doencaCard = false;
        String cirurgias, alergias;
        int indice;
        
        DadosAdicionais novoDados = new DadosAdicionais();
        
        if(pacientes.isEmpty()){
            System.out.println("Nenhum paciente inserido.");
        }else{
        
            System.out.println("Informe para qual paciente deseja realizar a consulta: ");
        
            for (int i = 0; i < pacientes.size(); i++) {
                System.out.println((i+1)+" - "+pacientes.get(i).getNome());
            }
            
            indice = input.nextInt();    
            
            if(indice == 0){
            }else if(pacientes.get(indice-1).isDadosAdicionaisCadastrado()){
                System.out.println("Não é possível cadastrar uma novos dados para esse"
                        + "paciente. Se deseja atualizar, utilize a opção 2 no menu de "
                        + "gerencimaneto de dados.");
            }else{
        
                int escolha;    
                
                System.out.println("O paciente fuma? 1 para sim e 0 para não ");
                escolha = input.nextInt();
                if (escolha == 1) fuma = true;
                else if (escolha == 0) fuma = false;
                else System.out.println("Opção invalida");
                    
                System.out.println("O paciente bebe? ");
                escolha = input.nextInt();
                if (escolha == 1) bebe = true;
                else if (escolha == 0) bebe = false;
                else System.out.println("Opção invalida");
                
                System.out.println("O paciente tem problemas com colesterol? ");
                escolha = input.nextInt();
                if (escolha == 1) colesterol = true;
                else if (escolha == 0) colesterol = false;
                else System.out.println("Opção invalida");
                
                System.out.println("O paciente tem diabetes? ");
                escolha = input.nextInt();
                if (escolha == 1) diabete = true;
                else if (escolha == 0) diabete = false;
                else System.out.println("Opção invalida");
                
                System.out.println("O paciente tem problemas cardiacos? ");
                escolha = input.nextInt();
                if (escolha == 1) doencaCard = true;
                else if (escolha == 0) doencaCard = false;
                else System.out.println("Opção invalida");
                
                System.out.println("O paciente possui alergias? Se sim lista-las");
                input.nextLine();
                alergias = input.nextLine();
                System.out.println("O paciente fez cirurgias? Se sim lista-las");
                cirurgias = input.nextLine();
                
                novoDados.setFuma(fuma);
                novoDados.setBebe(bebe);
                novoDados.setColesterol(colesterol);
                novoDados.setDiabete(diabete);
                novoDados.setDoencaCard(doencaCard);
                novoDados.setAlergias(alergias);
                novoDados.setCirurgias(cirurgias);
                novoDados.setPaciente(pacientes.get(indice-1));
                pacientes.get(indice-1).setDadosAdicionais(novoDados);
                pacientes.get(indice-1).setDadosAdicionaisCadastrado(true);
                dadosAdicionais.add(novoDados);
            }
        }
        
    }
    
    public void atualizarPaciente(Scanner input, ArrayList<Paciente> pacientes, ArrayList<DadosAdicionais> dadosAdicionais){
        int op, indice;
        do{
            if(pacientes.isEmpty() || dadosAdicionais.isEmpty()){
                System.out.println("Nenhum paciente inserido ou dados adicionais.");
                break;
            }else{
                
                System.out.println("Selecione o paciente que deseja atualizar: ");
                
                for (int i = 0; i < dadosAdicionais.size(); i++) {
                    System.out.println((i+1)+" - "+dadosAdicionais.get(i).getPaciente().getNome());
                }
                indice = input.nextInt();
                
                if(indice == 0)
                    break;
                else if(indice < 0 || indice > dadosAdicionais.size()){
                    System.out.println("Opção inválida!");
                    break;
                }else{
                
                    indice--;
                    System.out.println("--------------------------------------------");
                    do{
                        
                    if(dadosAdicionais.get(indice).isFuma() == true){
                        System.out.print("1 - Fuma = Sim \n");
                    }else{
                        System.out.print("1 - Fuma = Não \n");
                    }
                    if(dadosAdicionais.get(indice).isBebe() == true){
                        System.out.print("2 - Bebe = Sim \n");
                    }else{
                        System.out.print("2 - Bebe = Não \n");
                    }
                    if(dadosAdicionais.get(indice).isColesterol() == true){
                        System.out.print("3 - Colesterol = Sim \n");
                    }else{
                        System.out.print("3 - Colesterol = Não \n");
                    }
                    if(dadosAdicionais.get(indice).isDiabete() == true){
                        System.out.print("4 - Diabete = Sim \n");
                    }else{
                        System.out.print("4 - Diabete = Não \n");
                    }
                    if(dadosAdicionais.get(indice).isDoencaCard()== true){
                        System.out.print("5 - Doença Cardiaca = Sim \n");
                    }else{
                        System.out.print("5 - Doença Cardiaca = Não \n");
                    }
                    
                    System.out.print(""
                            + "6 - Alergias (" + dadosAdicionais.get(indice).getAlergias()+")\n"
                            + "7 - Cirurgias (" + dadosAdicionais.get(indice).getCirurgias()+")\n"                            
                    );

                    System.out.println("Selecione a informação que deseja atualizar: ");
                    op = input.nextInt();

                    switch(op){
                        default:
                            System.out.println("Opção inválida");
                            break;
                        case 0:
                            break;
                        case 1:
                            System.out.println("\nAlterando condição de Fumante...");
                            dadosAdicionais.get(indice).setFuma(!(dadosAdicionais.get(indice).isFuma()));
                            break;
                        case 2:
                            System.out.println("Alterando condição de Bebe...");
                            dadosAdicionais.get(indice).setBebe(!(dadosAdicionais.get(indice).isBebe()));
                            break;
                        case 3:
                            System.out.println("Alterando condição de Colesterol...");
                            dadosAdicionais.get(indice).setColesterol(!(dadosAdicionais.get(indice).isColesterol()));
                            break;
                        case 4:
                            System.out.println("Alterando condição de Diabético...");
                            dadosAdicionais.get(indice).setDiabete(!(dadosAdicionais.get(indice).isDiabete()));
                            break;
                        case 5:
                            System.out.println("Alterando condição de Doença Cardiaca...");
                            dadosAdicionais.get(indice).setDoencaCard(!(dadosAdicionais.get(indice).isDoencaCard()));
                            break;
                        case 6:
                            System.out.println("Insira as Alergias que o Paciente Possui)");
                            input.nextLine();
                            String novoAlergias = input.nextLine();
                            dadosAdicionais.get(indice).setAlergias(novoAlergias);
                            break; 
                        case 7:  
                            System.out.println("Insira as cirurgias que o paciente já passou");
                            input.nextLine();
                            String novoCirurgias = input.nextLine();
                            dadosAdicionais.get(indice).setCirurgias(novoCirurgias);
                            break;
                        }
                    }while(op != 0); 
                }
            }
        }while(op != 0);
    }
    
    public void removerPaciente(Scanner input, ArrayList<Paciente> pacientes, ArrayList<DadosAdicionais> dadosAdicionais){
         int indice;
            if(pacientes.isEmpty() || dadosAdicionais.isEmpty()){
                System.out.println("Nenhum paciente ou dados adicionais inseridos.");
            }else{
                do{
                    System.out.println("Selecione o paciente que deseja remover os dados adicionais: \n"
                                     + "0 - Sair");

                    for (int i = 0; i < dadosAdicionais.size(); i++) {
                        System.out.println((i+1)+" - "+dadosAdicionais.get(i).getPaciente().getNome());
                    }
                    indice = input.nextInt();
                    if(indice == 0)
                        break;
                    else if(indice < 0 || indice > dadosAdicionais.size()){
                        System.out.println("Opção inválida");
                        break;
                    }else
                        dadosAdicionais.get(indice-1).getPaciente().setDadosAdicionaisCadastrado(false);
                        dadosAdicionais.remove(indice-1);
                    System.out.println("Dados Adicionais removidos com sucesso");
                }while(indice != 0);
            }
    }
    
    public void cadastrarProntuario(Scanner input, ArrayList<Paciente> pacientes, ArrayList<Prontuario> prontuario){
        String sintomas, diagnosticoDoenca, prescricaoTratamento;
        int indice;
        
        Prontuario novoProntuario = new Prontuario();
        
        if(pacientes.isEmpty()){
            System.out.println("Nenhum paciente inserido.");
        }else{
        
            System.out.println("Informe para qual paciente deseja cadastrar o prontuario: ");
        
            for (int i = 0; i < pacientes.size(); i++) {
                System.out.println((i+1)+" - "+pacientes.get(i).getNome());
            }
            
            indice = input.nextInt();    
            
            if(indice == 0){
            }else if(pacientes.get(indice-1).isProntuarioCadastrado()){
                System.out.println("Não é possível cadastrar um prontuario para esse"
                        + "paciente. Se deseja atualizar, utilize a opção 2 no menu de "
                        + "gerencimaneto de prontuario.");
            }else{
                System.out.println("Quais os sintomas do paciente? ");
                input.nextLine();
                sintomas = input.nextLine();
                
                System.out.println("Qual o Diagnóstico do paciente? ");
                input.nextLine();
                diagnosticoDoenca = input.nextLine();
                
                System.out.println("Qual a Prescrição para o paciente? ");
                prescricaoTratamento = input.nextLine();
                
                novoProntuario.setPaciente(pacientes.get(indice-1));
                novoProntuario.setSintomas(sintomas);
                novoProntuario.setDiagnosticoDoenca(diagnosticoDoenca);
                novoProntuario.setPrescricaoTratamento(prescricaoTratamento);
                pacientes.get(indice-1).setProntuario(novoProntuario);
                pacientes.get(indice-1).setProntuarioCadastrado(true);
                prontuario.add(novoProntuario);
            }
        }
    }
    
    public void atualizarProntuario(Scanner input, ArrayList<Paciente> pacientes, ArrayList<Prontuario> prontuario){
        int op, indice;
        do{
            if(pacientes.isEmpty() || prontuario.isEmpty()){
                System.out.println("Nenhum paciente inserido ou prontuario.");
                break;
            }else{
                
                System.out.println("Selecione o paciente que deseja atualizar: ");
                
                for (int i = 0; i < prontuario.size(); i++) {
                    System.out.println((i+1)+" - "+prontuario.get(i).getPaciente().getNome());
                }
                indice = input.nextInt();
                
                if(indice == 0)
                    break;
                else if(indice < 0 || indice > prontuario.size()){
                    System.out.println("Opção inválida!");
                    break;
                }else{
                
                    indice--;
                    System.out.println("--------------------------------------------");
                    do{
                    System.out.print(""
                            + "0 - Voltar \n"
                            + "1 - Sintomas (" + prontuario.get(indice).getSintomas()+")\n"
                            + "2 - Diagnostico Doença (" + prontuario.get(indice).getDiagnosticoDoenca()+")\n"
                            + "3 - Prescrição Tratamento (" + prontuario.get(indice).getPrescricaoTratamento()+")\n"
                    );

                    System.out.println("Selecione a informação do prontuario que deseja atualizar: ");
                    op = input.nextInt();

                    switch(op){
                        default:
                            System.out.println("Opção inválida");
                            break;
                        case 0:
                            break;
                        case 1:
                            System.out.println("Insira os Sintomas do Paciente: )");
                            input.nextLine();
                            String novoSintomas = input.nextLine();
                            prontuario.get(indice).setSintomas(novoSintomas);
                            break;
                        case 2:
                            System.out.println("Insira o Diagnostico do Paciente: )");
                            input.nextLine();
                            String novoDiagnosticoDoenca = input.nextLine();
                            prontuario.get(indice).setDiagnosticoDoenca(novoDiagnosticoDoenca);
                            break;
                        case 3:
                            System.out.println("Insira a Prescrição do Tratamento do paciente: )");
                            input.nextLine();
                            String novoPrescricaoTratamento = input.nextLine();
                            prontuario.get(indice).setPrescricaoTratamento(novoPrescricaoTratamento);
                            break;
                        }
                    }while(op != 0); 
                }
            }
        }while(op != 0);
    }
    
    public void removerProntuario(Scanner input, ArrayList<Paciente> pacientes, ArrayList<Prontuario> prontuario){
        int indice;
            if(pacientes.isEmpty() || prontuario.isEmpty()){
                System.out.println("Nenhum paciente ou prontuario inseridos.");
            }else{
                do{
                    System.out.println("Selecione o paciente que deseja remover os dados adicionais: \n"
                                     + "0 - Sair");

                    for (int i = 0; i < prontuario.size(); i++) {
                        System.out.println((i+1)+" - "+prontuario.get(i).getPaciente().getNome());
                    }
                    indice = input.nextInt();
                    if(indice == 0)
                        break;
                    else if(indice < 0 || indice > prontuario.size()){
                        System.out.println("Opção inválida");
                        break;
                    }else
                        prontuario.get(indice-1).getPaciente().setDadosAdicionaisCadastrado(false);
                        prontuario.remove(indice-1);
                    System.out.println("Prontuario removidos com sucesso");
                }while(indice != 0);
            }
    }
    
    public void gerarRelatorioMedico(){
        
    }
    
}
