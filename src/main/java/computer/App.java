package computer;

import jdk.jfr.Frequency;

public class App {
    public static void main(String[] args) {
        //Create 2 computers
        //Get CPU frequency Computer 1
        //Get RAM size from computer


        CPU cpu = new CPU(3600,"Cor","c12");
        RAM ram = new RAM(16,"Asus","DDR4");
        VideoAdapter videoAdapter = new VideoAdapter("GeForce","BEN","002grey");
        Motherboard motherboard = new Motherboard(videoAdapter,ram,cpu,"MSI","PLUS MAX");
        Disk disk = new Disk(DiskType.HDD, 100, "HGST", "MAc");
        PowerSupply powerSupply = new PowerSupply(600,"sohoo","GAMEMAX");
        SystemBlock systemBlock = new SystemBlock(powerSupply,disk,motherboard);
        Monitor monitor = new Monitor(24,"LG","24BK");
        Mouse mouse = new Mouse("Anker","AK-98ANWVM");
        Keyboard keyboard = new Keyboard("Microsoft","LMX100");
        Computer hp = new Computer("US", "Hewllet Packard",keyboard,mouse,monitor,systemBlock);

        int frequency1 = hp.getSystemBlock().getMotherboard().getCpu().getFrequency();
        System.out.println(frequency1);

        int size = hp.getSystemBlock().getMotherboard().getRam().getSize();
        System.out.println(size);

        CPU cpu2 = new CPU(5000,"Brain","ussr89");
        RAM ram2 = new RAM(20,"Lenovo","IDK500");
        VideoAdapter videoAdapter2 = new VideoAdapter("GeWeakness","BOB","053blue");
        Motherboard motherboard2 = new Motherboard(videoAdapter2,ram2,cpu2,"DonyKnow","PLUS MIN");
        Disk disk2 = new Disk(DiskType.SSD, 100, "RBC", "Windows");
        PowerSupply powerSupply2 = new PowerSupply(800,"sohoo","nod");
        SystemBlock systemBlock2 = new SystemBlock(powerSupply2,disk2,motherboard2);
        Monitor monitor2 = new Monitor(13,"Samsung","ultra");
        Mouse mouse2 = new Mouse("Genius","666");
        Keyboard keyboard2 = new Keyboard("Petya","Vasya");
        Computer dell = new Computer("China", "Dell",keyboard2,mouse2,monitor2,systemBlock2);

        int frequency2 = dell.getSystemBlock().getMotherboard().getCpu().getFrequency();
        System.out.println(frequency2);

        int size2 = dell.getSystemBlock().getMotherboard().getRam().getSize();
        System.out.println(size2);


    }
}
