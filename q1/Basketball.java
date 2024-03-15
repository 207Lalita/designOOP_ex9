public class Basketball extends Game {

    @Override
    void initialize() {
        System.out.println("initializing basketball game...");
    }

    @Override
    void startPlay() {
        System.out.println("Playing basketball game...");
    }

    @Override
    void endPlay() {
        System.out.println("Showing the results for the basketball game...");
    }
    
}