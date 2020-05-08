public class Game {
    Board board;
    String name;
    char piece1 = 'x';
    char piece2 = 'o';
    public Game(String name) {
        this.name = name;
    }
    public void generateBoard(){
        board = new Board();
    }
    public static void main(String[] args) {
        Game app = new Game("Joc");
        app.generateBoard();
        app.startGame();
    }
    public void startGame(){
        Player p1 = new Player("Player1", piece1, board);
        Player p2 = new Player("Player2", piece2, board);
        int i=0,j=0;
        while(!board.getFinish()){
            p1.turn(i,j);
            if (board.getFinish()){
                board.print();
                break;
            }
            p2.turn(14-i,14-j);
            j++;
            board.print();
        }
    }
}
