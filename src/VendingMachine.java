import java.util.ArrayList;
import java.util.List;

public abstract class VendingMachine {
  protected List<HotDrinkWithTemp> products;

          public VendingMachine() {
               products = new ArrayList<>();
           }

            public abstract void addProduct(HotDrinkWithTemp product);

           public abstract HotDrinkWithTemp getProduct(String name, int volume, int temperature);
}