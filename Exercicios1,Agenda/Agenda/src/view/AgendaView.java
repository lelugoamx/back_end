package view;

import java.util.List;

import model.AgendaModel;



public class AgendaView {
	
	public void AgendaDao(List<AgendaModel> agenda) {
		
		  System.out.println("==== Lista de Pa√≠ses ====");
	        System.out.println("--------------------");
	        
	    
	        for (AgendaModel pessoa : agenda) {
	            System.out.println("id: " + pessoa.getId() + 
	            				   " - Nome: " + pessoa.getNome() +
	            				   " - Email: " + pessoa.getEmail() +
	            				   " - Telefone " + pessoa.getTelefone());
	        }
	 
	        System.out.println("--------------------");
	        
	        
	}
	        public void removerContato(boolean contatoremovido) {
	        	
	            if (contatoremovido) {
	            	System.out.println("Contato Removido\n");
	            } else {
	            	System.out.println("Contato N„o Econtrato\n");
	            }
	       
		
	}
	        public void exibirPais(AgendaModel Agenda) {
	        	System.out.println("id: " + Agenda.getId() + 
     				   " - Nome: " + Agenda.getNome() +
     				   " - Email: " + Agenda.getEmail() +
     				   " - Telefone " + Agenda.getTelefone());
	        }

}
