package homework2.Kateryna;

public class Task2 {
    public static void main(String[] args) {
        Computer comp1 = new Computer("HP", 15.4, 5, "laptop");
        Computer comp2 = new Computer("Acer", 17.0);}
    public static class Computer {
        private String brand;
        private double screenSize;
        private int numberOfCores;
        private String type;
        public String getBrand(){
            return brand;
        }
        public double getScreenSize() {
            return screenSize;
        }
        public int getNumberOfCores() {
            return numberOfCores;
        }
        public String getType() {
            return type;
        }
        public Computer(String brand, double screenSize, int numberOfCores, String type) {
            this.brand = brand;
            this.screenSize = screenSize;
            this.numberOfCores = numberOfCores;
            this.type = type;
        }
        public Computer(String brand, double screenSize) {
            this.brand = brand;
            this.screenSize = screenSize;
        }
    }
    }