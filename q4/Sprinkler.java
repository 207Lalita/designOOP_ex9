public class Sprinkler implements Component {
    private Mediator mediator;

    @Override
    public void setMediator(Mediator mediator){
        this.mediator = mediator;
    }

    public void sprinkler(){
        System.out.println("Sprinkler activated.");
    }

}
