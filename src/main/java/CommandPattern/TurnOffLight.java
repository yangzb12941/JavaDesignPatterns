package CommandPattern;

public class TurnOffLight implements Command {

    private Light light;

    public TurnOffLight(Light light) {
        this.light = light;
    }

    @Override
    public void excute() {
        // TODO Auto-generated method stub
        light.Off();
    }

    @Override
    public void undo() {
        // TODO Auto-generated method stub
        light.On();
    }
}
