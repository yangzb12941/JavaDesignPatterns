package BridgePattern;

public abstract class Phone {
    protected Software software;

    public void setSoftware(Software software) {
        this.software = software;
    }

    public abstract void run();
}
