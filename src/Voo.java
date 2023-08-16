import java.util.ArrayList;

public class Voo {
    private String identificador;
    private ArrayList<Assento> reserva;

    public Voo(String id) {
        identificador = id;
        reserva = new ArrayList<>();
    }

    public void cadastrarReserva(Assento a) {
        reserva.add(a);
    }

    public void gerarRelatorio() {
        System.out.printf("Identificador do vôo: %s\n", identificador);
        System.out.println("### Assentos disponiveis ###");
        String[] f = { "A", "B", "C", "D", "E", "F" };
        int cont = 0;

        for (int i = 1; i < 21; i++) {
            System.out.println();
            for (int j = 0; j < 6; j++) {
                cont = 0;
                for (Assento a : reserva) {
                    if ((a.getNum() == i) && (Character.toString(a.getPosicao()).equals(f[j]))) {
                        System.out.printf("%-8s", "X");
                        cont++;
                    }
                }
                if (cont == 0) {
                    System.out.printf("%-8s", i + f[j]);
                }
            }
        }
    }
}