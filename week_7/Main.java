public class Main {

    public static void main(String[] args) {

        Appliances appliance1 = new Refrigerator("LG");
        Appliances appliance2 = new WashingMachine("Panasonic");

        appliance1.turnOn();
        appliance1.operate();
        appliance1.turnOff();

        System.out.println();

        appliance2.turnOn();
        appliance2.operate();
        appliance2.turnOff();
    }
}                                                                                       