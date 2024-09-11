import java.util.ArrayList;
import java.util.List;

public class HotDrinksVendingMachine extends VendingMachine {
    private List<HotDrinkWithTemp> products;

    public HotDrinksVendingMachine() {
        products = new ArrayList<>();
    }

    public void addProduct(HotDrinkWithTemp product) {
        products.add(product);
    }

    public HotDrinkWithTemp getProduct(String name, int volume, int temperature) {
        for (HotDrinkWithTemp product : products) {
            if (product.getName().equals(String.valueOf(name)) &&
                    product.getVolume() == volume &&
                    product.getTemperature() == temperature) {
                return product;
            }
        }
        return null;
    }
}

