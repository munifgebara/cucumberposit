package br.com.munif.pocs.matera.cucumberposit;

public class GeraTestes {

    public enum Estado {
        ausente, autorizado, cancelado
    };

    public static void main(String[] args) {
        //                                                   1234567890123
        String pessoas[] = {"", "02393714960", "57040040000184", "57040040"};
        String compara[] = {"", "02393714960", "57040040000184", "57040040000184"};

        int casos = 1;

        for (Estado estado : Estado.values()) {

            for (int tipoPessoa = 1; tipoPessoa <= 3; tipoPessoa++) {

                //System.out.println("Corrente " + estado + " " + tipoPessoa + " " + (g1 ? "G1 " : "   ") + (g2 ? "G2 " : "   ") + (g3 ? "G3 " : "   "));
                System.out.println("     Scenario: Teste" + casos);
                if (estado != Estado.ausente) {
                    System.out.println((estado == Estado.autorizado ? "        Given autoriza \"" + pessoas[tipoPessoa] + "\"\n" : "        Given cancela \"" + pessoas[tipoPessoa] + "\""));
                }
                System.out.println("        When verifica estado \"" + compara[tipoPessoa] + "\"");
                System.out.println("        Then deve retornar " + estado);
                System.out.println("");
                casos++;

            }

        }
        System.out.println(casos);

    }

}
