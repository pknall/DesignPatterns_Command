public class LightDownCommand implements ICommand {

    Light light;

    public LightDownCommand(Light light) {
        this.light = light;
    }

    public void execute() {
        this.light.DimDown();

    }
    public void unexecute() {
        this.light.DimUp();
    }
}
