import java.text.NumberFormat;
import java.util.Locale;

public class CPU {
    private double harga;
    private String merek;

    public CPU(double harga, String merek) {
        this.harga = harga;
        this.merek = merek;
    }

    public class Processor {
        int cores;
        String manufacturer;
        String name;

        Processor(int cores, String manufacturer, String name) {
            this.cores = cores;
            this.manufacturer = manufacturer;
            this.name = name;
        }

        public void getProcessorInfo() {
            System.out.println("Jumlah core: " + this.cores);
            System.out.println("Pabrik: " + this.manufacturer);
            System.out.println("Processor: " + this.name);
        }
    }

    public class RAM {
        int jumlahRAM;
        String manufacturer;

        RAM(int jumlahRAM, String manufacturer) {
            this.jumlahRAM = jumlahRAM;
            this.manufacturer = manufacturer;
        }

        public void getInfoRAM() {
            System.out.println("Jumlah RAM: " + this.jumlahRAM);
            System.out.println("Pabrik: " + this.manufacturer);
        }
    }

    public class HardDisk {
        int capacity;
        String manufacturer;

        HardDisk(int capacity, String manufacturer) {
            this.capacity = capacity;
            this.manufacturer = manufacturer;
        }

        public void getHardDiskInfo() {
            System.out.println("Kapasitas Hard Disk: " + this.capacity + " GB");
            System.out.println("Pabrik: " + this.manufacturer);
        }
    }

    public class Motherboard {
        String formFactor;
        String manufacturer;

        Motherboard(String formFactor, String manufacturer) {
            this.formFactor = formFactor;
            this.manufacturer = manufacturer;
        }

        public void getMotherboardInfo() {
            System.out.println("Form Factor Motherboard: " + this.formFactor);
            System.out.println("Pabrik: " + this.manufacturer);
        }
    }

    public class PowerSupply {
        int wattage;
        String manufacturer;

        PowerSupply(int wattage, String manufacturer) {
            this.wattage = wattage;
            this.manufacturer = manufacturer;
        }

        public void getPowerSupplyInfo() {
            System.out.println("Daya Power Supply: " + this.wattage + " Watt");
            System.out.println("Pabrik: " + this.manufacturer);
        }
    }

    public class VGACard {
        String manufacturer;
        String model;

        VGACard(String manufacturer, String model) {
            this.manufacturer = manufacturer;
            this.model = model;
        }
        public void getVGACardInfo() {
            System.out.println("Pabrik VGA Card: " + this.manufacturer);
            System.out.println("Model: " + this.model);
        }
    }
    
    public void getCPUInfo() {
        Locale localeID = new Locale("in", "ID");
        NumberFormat formatRupiah = NumberFormat.getCurrencyInstance(localeID);

        System.out.println("Komputer Merek: " + this.merek);
        System.out.println("Harga: " + formatRupiah.format(this.harga));
    }
}