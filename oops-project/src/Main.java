
public class Main {
    public static void main(String[] args) {
        Pizza rp = new Pizza(true); //  non-veg Pizza
//        rp.addExtraToppings();
//        rp.addExtraCheese();
//        rp.addExtraCheese();
        rp.addExtraToppings();
        rp.addExtraCheese();
        rp.addTakeaway();
        rp.addTakeaway();
//        rp.removeExtraToppings();
//        rp.removeExtraCheese();
//        System.out.println(rp.getPrice());
         System.out.println(rp.getBill());

//            DeluxePizza dp = new DeluxePizza(true);
//            dp.addExtraCheese();
//            dp.addExtraCheese();
//            dp.addExtraToppings();
//            dp.addTakeaway();
//            dp.addTakeaway();
//            dp.addTakeaway();
//
//            System.out.println(dp.getPrice());
//            System.out.println(dp.getBill());
    }
}
