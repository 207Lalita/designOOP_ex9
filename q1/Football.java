public class Football extends Game {
    @Override
    void initialize() {
        System.out.println("initializing football game...");
    }

    @Override
    void startPlay() {
        System.out.println("Playing football game...");
    }

    @Override
    void endPlay() {
        System.out.println("Showing the results for the football game...");
    }
}
