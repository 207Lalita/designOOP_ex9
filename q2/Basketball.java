public class Basketball implements GameStrategy {

    @Override
    public void initialize() {
        System.out.println("Basketball Game Initialized!");
    }

    @Override
    public void startPlay() {
        System.out.println("Basketball Game Started!");
    }

    @Override
    public void endPlay() {
        System.out.println("Basketball Game Finished!");
    }
    
}