public class CoffeePot implements Component {
    private Mediator mediator;

    @Override
    public void setMediator(Mediator mediator){
        this.mediator = mediator;
    }

    public void poorCoffee() {
        System.out.println("CoffeePot Started.");
    }

}
