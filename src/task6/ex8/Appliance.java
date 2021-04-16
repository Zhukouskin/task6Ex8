package task6.ex8;

public class Appliance implements Comparable<Appliance> {

    private String name = "";
    private int power = 0;
    private boolean turnOn = false;

    public Appliance(String name, int power, boolean turnOn) {
        this.name = name;
        this.power = power;
        this.turnOn = turnOn;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public boolean isTurnOn() {
        return turnOn;
    }

    public void setTurnOn(boolean turnOn) {
        this.turnOn = turnOn;
    }

    public int compareTo(Appliance appliance) {

        if (this.power < appliance.power) {
            return -1;
        } else if (this.power > appliance.power) {
            return 1;
        }
        return 0;
    }


    @Override
    public String toString() {
        return "Appliance{" + "name='" + name + '\'' + ", power=" + power + ", turnOn=" + turnOn + '}';
    }

}
