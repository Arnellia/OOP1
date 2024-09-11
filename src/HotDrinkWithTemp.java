public class HotDrinkWithTemp extends HotDrink {
    private int temperature;

    public HotDrinkWithTemp(String name, int volume, int temperature) {
        super(name, volume);
        this.temperature = temperature;
    }

    public int getTemperature(){
        return temperature;
    }
}

