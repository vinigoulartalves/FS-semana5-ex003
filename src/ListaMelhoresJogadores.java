import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ListaMelhoresJogadores {

    private List<Jogador> melhoresJogadores;

    public ListaMelhoresJogadores() {
        this.melhoresJogadores = new ArrayList<>();
    }

    public List<Jogador> getMelhoresJogadores() {
        return melhoresJogadores;
    }

    public void setMelhoresJogadores(List<Jogador> melhoresJogadores) {
        this.melhoresJogadores = melhoresJogadores;
    }

    public void adicionarJogador(Jogador jogador) {
        this.melhoresJogadores.add(jogador);
    }

    public Jogador obterJogador(int posicao) {
        if (posicao >= 0 && posicao < melhoresJogadores.size()) {
            return melhoresJogadores.get(posicao);
        } else {
            return null;
        }
    }

    public void exibirMelhoresJogadores() {
        Collections.sort(melhoresJogadores, new Comparator<Jogador>() {
            @Override
            public int compare(Jogador jogador1, Jogador jogador2) {
                return Integer.compare(jogador2.getPontuacao(), jogador1.getPontuacao()); // Ordena em ordem decrescente
            }
        });

        System.out.println("Melhores jogadores:");
        for (int i = 0; i < melhoresJogadores.size(); i++) {
            System.out.println("Posição " + (i + 1) + ": " + melhoresJogadores.get(i).getNome() + " | Pontução: " + melhoresJogadores.get(i).getPontuacao());
        }
    }
}
