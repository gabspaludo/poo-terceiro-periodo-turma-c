package aula6;

public class AulaSeisTest {



     public static void main(String[]args) {

        Professor profeUm = new Professor();
        Professor oMelhorProfe = new Professor();

        profeUm.nome = " IgorBola ";
        profeUm.materia = " A.I";

        oMelhorProfe.nome = " Sandro ";
        oMelhorProfe.materia = " POO ";

        profeUm.aprenstarse();
        oMelhorProfe.aprenstarse();

        Arma awp = new Arma();

        awp.nome = "AWP - Fever Dream";
        awp.tipo = "Rifle";
        awp.dano = 110;

        profeUm.arma = awp;

   }

}
