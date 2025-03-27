public class Pizza {
    private int price = 0;
    private boolean isVeg;// variable defines veg or non-veg Pizza
    private String bill = "";


    private int VegPizzabaseprice = 300; // prices like that because we can change it in future
    private int NonvegPizzabaseprice = 400; // also no one can manipulate this list
    private int ExtraCheesePrice = 80;
    private int ExtraToppingsForVegPizza = 70;
    private int ExtraToppingsForNonVegPizza = 120;
    private int PaperbagPrice = 20;

    private boolean istoppingsaddedonce = false;
    private boolean ischeeseaddedonce = false;
    private boolean istakeawayadded = false;

    public Pizza(boolean isVeg) {
        this.isVeg = isVeg;
        if (isVeg) {
            this.price += VegPizzabaseprice;
            bill = bill + "Base Price Of The Pizza:" + VegPizzabaseprice + "\n";
        }
        else {
            this.price += NonvegPizzabaseprice;
            bill = bill + "Base Price Of The Pizza:" + NonvegPizzabaseprice + "\n";
        }
    }

    public int getPrice() { // getter
        return this.price; // gives you the price in your cart before generating bill
    }

    public void addExtraCheese() {
        if (ischeeseaddedonce == false) {  // feature added for cannot call more than one time
            this.price += ExtraCheesePrice;
            ischeeseaddedonce = true;
        }
    }


    public void addExtraToppings() {
        if (istoppingsaddedonce == false) {
            if (isVeg) {
                this.price += ExtraToppingsForVegPizza;
            } else {
                this.price += ExtraToppingsForNonVegPizza;
            }
            istoppingsaddedonce = true;
        }
    }
    // if we want to remove the added toppings
    public void removeExtraToppings(){
        if (istoppingsaddedonce==true) {
            if (isVeg) {
                this.price -= ExtraToppingsForVegPizza;
            }
            else {
                this.price -= ExtraToppingsForNonVegPizza;
            }
            istoppingsaddedonce = false;
        }
    }
    public void removeExtraCheese(){
        if (ischeeseaddedonce == true) {
            this.price-=ExtraCheesePrice;
            ischeeseaddedonce=false;
        }
    }
    int count=0; //  count for how many paper-bag a customer wants
    public void addTakeaway() {
        istakeawayadded = true;
        if(istakeawayadded) {
            this.price += PaperbagPrice;
            count++;
        }
    }

    public String getBill() { //getter
        if (ischeeseaddedonce == true) {  // always add cheese first if customer order for both cheese and toppings
            this.bill = this.bill + "Extra Cheese Added:" + ExtraCheesePrice + "\n";
        }
        if (istoppingsaddedonce == true) {
            if (isVeg) {
                this.bill = this.bill + "Extra toppings Added:" + ExtraToppingsForVegPizza + "\n";
            }
            else {
                this.bill = this.bill + "Extra toppings Added:" + ExtraToppingsForNonVegPizza + "\n";
            }
        }
        if (istakeawayadded) {
            this.bill = this.bill + "Paper-bag Added:" + count*PaperbagPrice + "\n";
        }
        this.bill = this.bill + "Total Price:" + this.price;

        return this.bill;
    }
}
