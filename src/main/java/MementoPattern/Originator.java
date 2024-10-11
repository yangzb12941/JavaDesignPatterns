package MementoPattern;

public class Originator {

    private String state;

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Memento saveToMemento() {
        return new Memento(state);
    }

    public String getStateFromMemento(MementoIF memento) {
        return ((Memento) memento).getState();
    }
}
