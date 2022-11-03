package computer_vk89;

public class Motherboard {
    private VideoAdapter videoAdapter;
    private RAM ram;
    private CPU cpu;
    private String make;
    private String model;
    //complete class: constructor 1, g/s, toString()


    public Motherboard(VideoAdapter videoAdapter, RAM ram, CPU cpu, String make, String model) {
        this.videoAdapter = videoAdapter;
        this.ram = ram;
        this.cpu = cpu;
        this.make = make;
        this.model = model;
    }

    public VideoAdapter getVideoAdapter() {
        return videoAdapter;
    }

    public void setVideoAdapter(VideoAdapter videoAdapter) {
        this.videoAdapter = videoAdapter;
    }

    public RAM getRam() {
        return ram;
    }

    public void setRam(RAM ram) {
        this.ram = ram;
    }

    public CPU getCpu() {
        return cpu;
    }

    public void setCpu(CPU cpu) {
        this.cpu = cpu;
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

    @Override
    public String toString() {
        return "Motherboard{" +
                "videoAdapter=" + videoAdapter +
                ", ram=" + ram +
                ", cpu=" + cpu +
                ", make='" + make + '\'' +
                ", model='" + model + '\'' +
                '}';
    }
}
