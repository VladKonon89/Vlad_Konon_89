package computer_vk89;

public class Computer {
    private String make;
    private String model;
    private Keyboard keyboard;
    private Mouse mouse;
    private Monitor monitor;
    private SystemBlock systemBlock;
    //complete class


    public Computer(String make, String model, Keyboard keyboard, Mouse mouse, Monitor monitor, SystemBlock systemBlock) {
        this.make = make;
        this.model = model;
        this.keyboard = keyboard;
        this.mouse = mouse;
        this.monitor = monitor;
        this.systemBlock = systemBlock;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Keyboard getKeyboard() {
        return keyboard;
    }

    public void setKeyboard(Keyboard keyboard) {
        this.keyboard = keyboard;
    }

    public Mouse getMouse() {
        return mouse;
    }

    public void setMouse(Mouse mouse) {
        this.mouse = mouse;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public void setMonitor(Monitor monitor) {
        this.monitor = monitor;
    }

    public SystemBlock getSystemBlock() {
        return systemBlock;
    }

    public void setSystemBlock(SystemBlock systemBlock) {
        this.systemBlock = systemBlock;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", keyboard=" + keyboard +
                ", mouse=" + mouse +
                ", monitor=" + monitor +
                ", systemBlock=" + systemBlock +
                '}';
    }
}
