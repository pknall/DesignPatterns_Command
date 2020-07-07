public class LightOffCommand implements ICommand {

    Light light;

    public LightOffCommand(Light light) {
        this.light = light;
    }

    public void execute() {
        this.light.Off();

    }
    public void unexecute() {
        this.light.On();
    }
}
