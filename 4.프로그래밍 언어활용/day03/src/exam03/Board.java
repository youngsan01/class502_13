package exam03;

public class Board {

    private Board instance = new Board();

    private Board() {}

    public Board getInstance() {
        return instance;
    }
}
