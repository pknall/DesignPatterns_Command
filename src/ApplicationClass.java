public class ApplicationClass {

    // https://www.youtube.com/watch?v=9qA5kw8dcSU
    
    public static void main(String[] args) {
        Light light = new Light("Light 1");                         // Initialize Receiver (the Light)

        LightOnCommand lightOnCommand = new LightOnCommand(light);
        LightOffCommand lightOffCommand = new LightOffCommand(light);
        LightDownCommand lightDownCommand = new LightDownCommand(light);
        LightUpCommand lightUpCommand = new LightUpCommand(light);

        Invoker invoker = new Invoker(lightOnCommand, lightOffCommand, lightUpCommand, lightDownCommand);

        if (invoker.on != null) invoker.clickOn();
        System.out.println(light.getLightStatus());

        if (invoker.off != null) invoker.clickOff();
        System.out.println(light.getLightStatus());

        if (invoker.down != null) invoker.clickDown();
        System.out.println(light.getLightStatus());

        if (invoker.up != null) invoker.clickUp();
        System.out.println(light.getLightStatus());

    }
}
