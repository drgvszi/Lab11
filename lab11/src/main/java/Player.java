public class Player {
    private String name;
    private char  c;
    private Board board;
    public Player(String name, char c, Board board) {
        this.name = name;
        this.c = c;
        this.board = board;
    }
    public boolean turn(int i, int j){
        if ( !(i>=0 && i<16)  ||  !(j>=0 && j<16))
            return false;
        return board.setValue(i, j, c);
    }
}
