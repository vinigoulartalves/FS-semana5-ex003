public class Main {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("Vini", 28, 1, 0);
        Jogador jogador2 = new Jogador("Mario", 20, 2, 0);
        Jogador jogador3 = new Jogador("Julia", 26, 3, 0);
        Jogador jogador4 = new Jogador("Leo", 19, 4, 0);
        Jogador jogador5 = new Jogador("Victor", 22, 5, 0);

        ListaMelhoresJogadores lista = new ListaMelhoresJogadores();
        lista.adicionarJogador(jogador1);
        lista.adicionarJogador(jogador2);
        lista.adicionarJogador(jogador3);
        lista.adicionarJogador(jogador4);
        lista.adicionarJogador(jogador5);

        lista.exibirMelhoresJogadores();


    }
}
