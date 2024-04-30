package LUCAS_EDUARDO_DE_LIMA.prova;

import java.util.ArrayList;

public class ListagemEvento {
    private ArrayList<String> eventos;

    public ListagemEvento(ArrayList<String> eventos) {
        this.eventos = eventos;
    }

    public void listarEventos() {
        if (eventos.isEmpty()) {
            System.out.println("Não há eventos cadastrados.");
        } else {
            System.out.println("Eventos cadastrados:");
            for (String evento : eventos) {
                System.out.println(evento);
            }
        }
    }
}