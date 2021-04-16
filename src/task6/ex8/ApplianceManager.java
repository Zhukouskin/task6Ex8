package task6.ex8;


import java.util.Arrays;

public class ApplianceManager {

    PowerManager powerManager = new PowerManager();

    Appliance appliance = new Appliance("Toaster", 1200, true);
    Appliance appliance2 = new Appliance("Coffee Machine", 2250, false);
    Appliance appliance3 = new Appliance("Mixer", 800, true);
    Appliance appliance4 = new Appliance("Dishwasher", 2000, true);
    Appliance appliance5 = new Appliance("TV", 1000, false);
    Appliance appliance6 = new Appliance("Fridge", 1500, true);

    Appliance[] appliances = {appliance, appliance2, appliance3, appliance4, appliance5, appliance6};

    public void findPower() {
        for (int i = 0; i < appliances.length; i++) {
            if (appliances[i].isTurnOn()) {
                powerManager.addPowerConsumption(appliances[i].getPower());
            }
        }
        System.out.println(powerManager.getAllPower());
    }

    public void sortByPower() {
        Arrays.sort(appliances);
        for (Appliance appliance : appliances) {
            System.out.println(appliance.toString());
        }
    }

    public void showAllAppliance() {
        for (int i = 0; i < appliances.length; i++) {
            System.out.println(appliances[i].toString());
        }
    }

    public void showApplOn() {
        for (int i = 0; i < appliances.length; i++) {
            if (appliances[i].isTurnOn()) {
                System.out.println(appliances[i].toString());
            }
        }
    }

    public void showApplOff() {
        for (int i = 0; i < appliances.length; i++) {
            if (!appliances[i].isTurnOn()) {
                System.out.println(appliances[i].toString());
            }
        }
    }

    public void findByParam(int a, int b, String status) {
        if ("вкл".equalsIgnoreCase(status)) {
            for (int i = 0; i < appliances.length; i++) {
                if (appliances[i].getPower() >= a && appliances[i].getPower() <= b && appliances[i].isTurnOn()) {
                    System.out.println(appliances[i].toString());
                }
            }
        } else if ("выкл".equalsIgnoreCase(status)) {
            for (int i = 0; i < appliances.length; i++) {
                if (appliances[i].getPower() >= a && appliances[i].getPower() <= b && !appliances[i].isTurnOn()) {
                    System.out.println(appliances[i].toString());
                }
            }
        }
    }
}