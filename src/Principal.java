public class Principal {
    public static void main(String[] args) {
        Voo v = new Voo("G3412");
        v.cadastrarReserva(new Assento(19, 'F'));
        v.cadastrarReserva(new Assento(15, 'E'));
        v.cadastrarReserva(new Assento(13, 'D'));
        v.cadastrarReserva(new Assento(10, 'C'));
        v.cadastrarReserva(new Assento(5, 'F'));
        v.cadastrarReserva(new Assento(1, 'A'));

        v.gerarRelatorio();
    }
}