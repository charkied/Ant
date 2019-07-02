public class Board {

    private int[][] value;
    private int x;
    private int y;
    public Board(int x, int y) {
        this.value = new int[x][y];
        this.x=x;
        this.y=y;
    }

    public int getValue(int x,int y) {
        return value[x][y];
    }

    public void setValue(int x, int y, int value) {
        this.value[x][y] = value;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void reset(){
        for(int i=0;i<x;i++)
            for(int j=0;j<y;j++)
                value[x][y]=0;
    }
}
