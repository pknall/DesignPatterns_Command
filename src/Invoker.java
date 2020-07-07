/***
 * This is the "clicker" that operates the light.
 */
public class Invoker {

    ICommand on;
    ICommand off;
    ICommand up;
    ICommand down;

    public Invoker(ICommand on) {
        this.on = on;
        this.off = null;
        this.up = null;
        this.down = null;
    }

    public Invoker(ICommand on, ICommand off) {
        this.on = on;
        this.off = off;
        this.up = null;
        this.down = null;
    }

    public Invoker(ICommand on, ICommand off, ICommand up, ICommand down) {
        this.on = on;
        this.off = off;
        this.up = up;
        this.down = down;
    }

    public void clickOn() {
        this.on.execute();
    }

    public void clickOff() {
        this.off.execute();
    }

    public void clickUp() {
        this.up.execute();
    }

    public void clickDown() {
        this.down.execute();
    }
}
