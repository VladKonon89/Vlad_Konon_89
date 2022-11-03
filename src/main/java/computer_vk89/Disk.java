package computer_vk89;

public class Disk {
    private DiskType diskType;
    private int size;
    private String make;
    private String model;
    //complete class: constructor 1, g/s, toString()


    public Disk(DiskType diskType, int size, String make, String model) {
        this.diskType = diskType;
        this.size = size;
        this.make = make;
        this.model = model;
    }

    public DiskType getDiskType() {
        return diskType;
    }

    public void setDiskType(DiskType diskType) {
        this.diskType = diskType;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
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
        return "Disk{" +
                "diskType=" + diskType +
                ", size=" + size +
                ", make='" + make + '\'' +
                ", model='" + model + '\'' +
                '}';
    }

}
