public class Main {
    public static void main(String[] args) {  
        CPU myKomputer = new CPU(15000000, "Lenovo");
        CPU.Processor i7 = myKomputer.new Processor(8, "Intel", "i7");
        CPU.RAM rs32GB = myKomputer.new RAM(32, "Samsung");
        CPU.HardDisk hd1TB = myKomputer.new HardDisk(1000, "Seagate");
        CPU.VGACard nvidiaGTX = myKomputer.new VGACard("Nvidia", "GTX 1080");
        CPU.Motherboard gamingMotherboard = myKomputer.new Motherboard("ATX", "Asus");
        CPU.PowerSupply psu600W = myKomputer.new PowerSupply(600, "Corsair");

        myKomputer.getCPUInfo();
        i7.getProcessorInfo();
        rs32GB.getInfoRAM();
        hd1TB.getHardDiskInfo();
        nvidiaGTX.getVGACardInfo();
        gamingMotherboard.getMotherboardInfo();
        psu600W.getPowerSupplyInfo();
    }
}