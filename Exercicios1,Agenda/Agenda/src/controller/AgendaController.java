package controller;

import dao.AgendaDao;
import view.AgendaView;

public class AgendaController {
	
	private AgendaDao AgendaDao;
	
	private AgendaView AgendaView;
	
	public AgendaController() {
		AgendaDao = new AgendaDao();
		AgendaView = new AgendaView();
	}

}
