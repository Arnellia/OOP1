public class Main {
    public static void main(String[] args) {
         VendingMachine vendingMachine = new HotDrinksVendingMachine();

              HotDrinkWithTemp coffee = new HotDrinkWithTemp("Coffee", 200, 80);
              HotDrinkWithTemp tea = new HotDrinkWithTemp("Tea", 150, 90);
              HotDrinkWithTemp hotChocolate = new HotDrinkWithTemp("Hot Chocolate", 250, 85);

              vendingMachine.addProduct(coffee);
              vendingMachine.addProduct(tea);
              vendingMachine.addProduct(hotChocolate);

                HotDrinkWithTemp selectedProduct = vendingMachine.getProduct("1", 200, 80);
                if (selectedProduct != null) {
                        System.out.println("Selected product: " + selectedProduct.getName() + ", Volume: " + selectedProduct.getVolume() + ", Temperature: " + selectedProduct.getTemperature());
                    } else {
                        System.out.println("Product not found");
                    }
            }
}

/*public interface VendingMachine {
    HotDrink getProduct(int name, int volume, int temperature);

    void addProduct(HotDrinkWithTemp coffee);} */
