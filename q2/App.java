public class App{
    public static void main(String[] args) {
        Game game = new Game(new Basketball());
        game.play();
        System.out.println();

        game.setGameStrategy(new Football());
        game.play();
    }
}