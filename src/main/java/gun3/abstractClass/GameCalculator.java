package gun3.abstractClass;

public abstract class GameCalculator {
    public abstract void calculate();
    public final void gameOver(){
        System.out.println("The game is over");
    }
}
