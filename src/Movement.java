import java.util.ArrayList;

public class Movement {
    private ArrayList<Ant> ants;
    private String movementPattern;
    private Board board;
    double p;
    public Movement(ArrayList <Ant> ants, String movementPattern, int x, int y) {
        this.ants = ants;
        this.movementPattern = movementPattern;
        this.board = new Board(x,y);
    }

    public Movement(String movementPattern, int x, int y) {
        this.ants = new ArrayList<>();
        this.movementPattern = movementPattern;
        this.board = new Board(x,y);
    }

    public void setMovementPattern(String movementPattern) {
        this.movementPattern = movementPattern;
    }


    public void addAnt(Ant ant) {
        this.ants.add(ant);
    }

    public void move() {
        for (int i = 0; i < ants.size(); i++) {
            if(ants.get(i).getDirection()==0){
                ants.get(i).setY((ants.get(i).getY()+1)%board.getY());
                if (movementPattern.charAt(board.getValue(ants.get(i).getX(),ants.get(i).getY()))=='L')
                    ants.get(i).setDirection(3);
                    else
                    ants.get(i).setDirection(1);
            }
            if(ants.get(i).getDirection()==1){
                ants.get(i).setX((ants.get(i).getX()+1)%board.getX());
                if (movementPattern.charAt(board.getValue(ants.get(i).getX(),ants.get(i).getY()))=='L')
                    ants.get(i).setDirection(0);
                else
                    ants.get(i).setDirection(2);
            }
            if(ants.get(i).getDirection()==2){
                ants.get(i).setY((ants.get(i).getY()-1)%board.getY());
                if (movementPattern.charAt(board.getValue(ants.get(i).getX(),ants.get(i).getY()))=='L')
                    ants.get(i).setDirection(1);
                else
                    ants.get(i).setDirection(3);
            }
            if(ants.get(i).getDirection()==3){
                ants.get(i).setY((ants.get(i).getX()-1)%board.getY());
                if (movementPattern.charAt(board.getValue(ants.get(i).getX(),ants.get(i).getY()))=='L')
                    ants.get(i).setDirection(2);
                else
                    ants.get(i).setDirection(0);
            }
            board.setValue(ants.get(i).getX(),ants.get(i).getY(),(board.getValue(ants.get(i).getX(),ants.get(i).getY())+1)%movementPattern.length());
        }

    }

}
