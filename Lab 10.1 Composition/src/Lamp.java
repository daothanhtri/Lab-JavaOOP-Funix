public class Lamp {
    private String style;
    private boolean battery;
    private int globRatting;

    public Lamp(String style, boolean battery, int globRatting) {
        this.style = style;
        this.battery = battery;
        this.globRatting = globRatting;
    }

    public void turnOn(){
        System.out.println("The light is turning on");
    }

    public String getStyle() {
        return style;
    }

    public boolean isBattery() {
        return battery;
    }

    public int getGlobRatting() {
        return globRatting;
    }
}
