package SegundoBimestre.ATV4.parte2;

import java.util.List;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class ATV4 {

    public static void main(String[] args) {

        List<String> options = List.of("Listar convênios de pagamento", "Consultar boletos");
        JFrame frame = new JFrame("Prova");
        frame.setSize(300, 250);

        String selected = (String) JOptionPane.showInputDialog(frame,
                "Bem-vindo. Escolha a opção que desejar!",
                "ATV4",
                JOptionPane.QUESTION_MESSAGE,
                null,
                options.toArray(),
                "Escolha uma opção.");

        switch (selected) {

            case "Listar convênios de pagamento":

                try {

                    JOptionPane.showMessageDialog(
                            frame,
                            ListarConvenios.listagemConvenio(),
                            "Convênios",
                            0);

                } catch (Exception e) {
                    e.printStackTrace();
                }

                break;

            case "Consultar boletos":
                String numeroBoleto = JOptionPane.showInputDialog(
                        frame,
                        "Insira o número do boleto",
                        "Número do boleto",
                        JOptionPane.QUESTION_MESSAGE);
                        
                ConsultarBoletos.consultarBoleto(numeroBoleto);

                break;
        }
    }
}
