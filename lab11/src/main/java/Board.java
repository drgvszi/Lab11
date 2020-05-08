public class Board {
    private char[][] board;
    Boolean finish = false;
    public Board() {
        this.board = new char[15][15];
        for (int i=0;i<15;i++)
            for (int j=0;j<15;j++)
                board[i][j] = '-';
    }
    public Boolean getFinish() {
        return finish;
    }
    public void print() {
        System.out.print("    ");
        for (int i=0;i<15;i++){
            if (i<10)
                System.out.print('0' + Integer.toString(i) + " ");
            else
                System.out.print(i + " ");
        }
        System.out.println("");
        for (int i=0;i<15;i++){
            if (i<10)
                System.out.print('0' + Integer.toString(i) + "  ");
            else
                System.out.print(i + "  ");
            for (int j=0;j<15;j++)
                System.out.print(board[i][j] + "  ");
            System.out.println();
        }
        System.out.println('\n');
    }
    public boolean setValue(int i, int j, char c){
        if (this.board[i][j] != '-')
            return false;
        this.board[i][j] = c;
        finish = checkFinish(c);
        return true;
    }
    private boolean checkFinish( char c){
        for (int k=0;k<4;k++)
            if (path(c)>4)
                return true;
        return false;
    }
    private int path(char c){
        int nr=1;
        for(int ki=0;ki<15;ki++)
        {
            for(int kj=0;kj<15;kj++)
            {
                if(board[ki][kj]==c)
                {
                    nr++;
                }
                else
                {
                    nr=0;
                }
                if(nr==6)
                {
                    return nr;
                }
            }
        }
        return nr;
    }
}

