package LUCAS_EDUARDO_DE_LIMA.prova;

import java.util.ArrayList;

public class CadastroEvento {
    private ArrayList<EventoShow> listaEventos;

    public CadastroEvento() {
        listaEventos = new ArrayList<>();
    }

    public void cadastrarEvento(EventoShow evento) {
        listaEventos.add(evento);
    }

    public void exibirEventosCadastrados() {
        if (listaEventos.isEmpty()) {
            System.out.println("Não há eventos de show cadastrados.");
        } else {
            System.out.println("Eventos de show cadastrados:");
            for (EventoShow evento : listaEventos) {
                System.out.println(evento);
            }
        }
    }
}
