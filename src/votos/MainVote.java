package votos;

public class MainVote {
    public static void main(String[] args) {
        Vote elected = new Vote();
        elected.votosAna = 0;
        elected.votosDiego = 0;
        elected.votoActual = 0;
        elected.elect();
    }
}
