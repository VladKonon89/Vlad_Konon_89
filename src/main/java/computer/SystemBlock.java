package computer;

public class SystemBlock {
    private PowerSupply powerSupply;
    private Disk disk;
    private Motherboard motherboard;

    public PowerSupply getPowerSupply() {
        return powerSupply;
    }

    public void setPowerSupply(PowerSupply powerSupply) {
        this.powerSupply = powerSupply;
    }

    public Disk getDisk() {
        return disk;
    }

    public void setDisk(Disk disk) {
        this.disk = disk;
    }

    public Motherboard getMotherboard() {
        return motherboard;
    }

    public void setMotherboard(Motherboard motherboard) {
        this.motherboard = motherboard;
    }

    public SystemBlock(PowerSupply powerSupply, Disk disk, Motherboard motherboard) {
        this.powerSupply = powerSupply;
        this.disk = disk;
        this.motherboard = motherboard;
    }

    @Override
    public String toString() {
        return "SystemBlock{" +
                "powerSupply=" + powerSupply +
                ", disk=" + disk +
                ", motherboard=" + motherboard +
                '}';
    }
}
