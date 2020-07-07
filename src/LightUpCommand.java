public class LightUpCommand implements ICommand {

    Light light;

    public LightUpCommand(Light light) {
        this.light = light;
    }

    public void execute() {
        this.light.DimUp();

    }
    public void unexecute() {
        this.light.DimDown();
    }
}
