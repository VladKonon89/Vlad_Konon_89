package computer_vk89;

public class VideoAdapter {
    private String gpuModel;
    private String make;
    private String model;
    //complete class: constructor 1, g/s, toString()


    public VideoAdapter(String gpuModel, String make, String model) {
        this.gpuModel = gpuModel;
        this.make = make;
        this.model = model;
    }

    public String getGpuModel() {
        return gpuModel;
    }

    public void setGpuModel(String gpuModel) {
        this.gpuModel = gpuModel;
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
        return "VideoAdapter{" +
                "gpuModel='" + gpuModel + '\'' +
                ", make='" + make + '\'' +
                ", model='" + model + '\'' +
                '}';
    }
}
