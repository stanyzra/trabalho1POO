/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalho1poo;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author aleix
 */
public class GerenciadorMensagem extends Usuario{
    
    DateTimeFormatter toBarras = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    public boolean encontrarPaciente(ArrayList <Consulta> consultas, ArrayList <Paciente> pacientes){
        boolean consultaExiste = false;
        if(pacientes.isEmpty() || consultas.isEmpty())
            System.out.println("Nenhum paciente ou consulta inserida.");
        else{
            
            for (int i = 0; i < consultas.size(); i++) {
                if(consultas.get(i).getLocalDateCons().equals(LocalDate.now().plusDays(1))){
                    consultaExiste = true;
                }
            }
        }
        return consultaExiste;
    }
    
    public void enviarMensagem(Scanner input, ArrayList <Paciente> pacientes, ArrayList <Consulta> consultas ){
        boolean consultaExiste;
       
        System.out.println("Pacientes cadastrados para o dia ( " + LocalDate.now().plusDays(1).format(toBarras) + ")");
        consultaExiste = encontrarPaciente(consultas, pacientes);
        
        if(!consultaExiste){
            System.out.println("Nenhuma consulta cadastrada para esse dia");
        }else{      
            System.out.println("Enviando mensagens para os celulares dos pacientes: ");
            for (int i = 0; i < consultas.size(); i++) {
                if(consultas.get(i).getLocalDateCons().equals(LocalDate.now().plusDays(1))){
                    System.out.println("Olá paciente "+consultas.get(i).getPaciente().getNome()
                    + ". Você tem uma consulta cadastrada para amanhã (" + consultas.get(i).getLocalDateCons().format(toBarras) + ")"
                    + " as " + consultas.get(i).getHorario() + ". Favor comparecer à consulta.");
                }
            }
        }
    }
}
