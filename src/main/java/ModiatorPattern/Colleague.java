package ModiatorPattern;

public abstract class Colleague {
    protected Mediator mediator;
    protected String name;

    public Colleague(String name) {
        this.name = name;
    }

    public void setMedium(Mediator mediator) {

        this.mediator = mediator;

    }

    public String getName() {
        return name;
    }

    public abstract void Send(String to, String ad);

    public abstract void receive(String from, String ad);}
