package homework2.Ilona;

public class Task2 {
    public static void main(String[] args) {

        // Create instances from Constructor1
        Computer toshiba = new Computer("Toshiba", 28, 7, "desktop");
        System.out.println("Brand: " + toshiba.brand + ", " + "Screen Size: " + toshiba.screenSize + ", " + "Number of cores: " + toshiba.numberOfCores + ", " + "Type: " + toshiba.type);

        Computer dell = new Computer("Dell", 15, 6, "laptop");
        System.out.println("Brand: " + dell.brand + ", " + "Screen Size: " + dell.screenSize + ", " + "Number of cores: " + dell.numberOfCores + ", " + "Type: " + dell.type);

        Computer hp = new Computer("HP", 14, 7, "desktop");
        hp.setScreenSize(-15);
        System.out.println("Brand: " + hp.brand + ", " + "Screen Size: " + hp.screenSize + ", " + "Number of cores: " + hp.numberOfCores + ", " + "Type: " + hp.type);

        // Create instances from Constructor2
        Computer samsung = new Computer("Samsung", 17);
        System.out.println("Brand: " + samsung.brand + ", " + "Screen Size: " + samsung.screenSize);

        Computer asus = new Computer("Asus", 18);
        System.out.println("Brand: " + asus.brand + ", " + "Screen Size: " + asus.screenSize);
    }

    public static class Computer {
        private String brand;
        private int screenSize;
        private int numberOfCores;
        private String type;

        // The Constructor1: for creating instances
        public Computer(String brand, int screenSize, int numberOfCores, String type) {
            this.brand = brand;
            this.screenSize = screenSize;
            this.numberOfCores = numberOfCores;
            this.type = type;
        }

        // The Constructor2: for creating instances
        public Computer(String brand, int screenSize) {
            this.brand = brand;
            this.screenSize = screenSize;
        }

        // GETTERS
        public String getBrand() {
            return brand;
        }

        public int getScreenSize() {
            return screenSize;
        }

        public int getNumberOfCores() {
            return numberOfCores;
        }

        public String getType() {
            return type;
        }

        // SETTERS
        public void setBrand(String brand) {
            this.brand = brand;
        }

        // Add the validation (just for practice)
        public void setScreenSize(int screenSize) {
            if (screenSize >= 0) {
                this.screenSize = screenSize;
            } else {
                System.out.println("Incorrect Screen Size for " + brand);
            }
        }

        public void setNumberOfCores(int numberOfCores) {
            this.numberOfCores = numberOfCores;
        }

        public void setType(String type) {
            this.type = type;
        }
    }
}