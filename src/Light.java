public class Light {

    public String name;
    public int dimLevel = 100;
    public boolean lightStatus = false;

    public Light(String name) {
        this.name = name;
    }

    public void On() {
        lightStatus = true;
        dimLevel = 100;
    }

    public void Off() {
        lightStatus = false;
        dimLevel = 0;
    }

    public void DimUp() {
        if (!lightStatus) {
            On();
        }
        dimLevel +=10;
        if (dimLevel > 100) dimLevel = 100;
    }

    public void DimDown() {
        if (!lightStatus) {
            lightStatus = true;
            dimLevel = 20;
        }
        dimLevel -= 10;
        if (dimLevel < 20) dimLevel = 20;
    }

    public String getLightStatus() {
        StringBuilder sb = new StringBuilder();
        sb.append("The light is ");
        if (lightStatus) sb.append("ON");
        else sb.append("OFF");
        sb.append(". Dim level is ");
        sb.append(dimLevel);
        sb.append(".");

        return sb.toString();
    }
}
