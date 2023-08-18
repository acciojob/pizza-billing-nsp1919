package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private int basePrice;
    private String bill;

    private final int extracheese=80;

    private int extratoppings;

    private final int bag=20;




    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        if (this.isVeg){
            this.basePrice=300;
            this.extratoppings=70;
        }
        else{
            this.basePrice=400;
            this.extratoppings=120;
        }
        this.price=this.basePrice;
    }

    public int getPrice(){
        return this.price;
    }



    private boolean addextracheese=false;
    private boolean addextratoppings=false;
    private boolean addbag=false;
    public void addExtraCheese(){
        // your code goes here
        if (!addextracheese){
            this.price+=this.extracheese;
            addextracheese=true;
        }
    }

    public void addExtraToppings(){
        // your code goes here
        if (!addextratoppings){
            this.price+=this.extratoppings;
            addextratoppings=true;
        }
    }

    public void addTakeaway(){
        // your code goes here
        if (!addbag){
            this.price+=this.bag;
            addbag=true;
        }
    }
    private boolean isBillGenerated;
    public String getBill(){
        // your code goes here
        if (!isBillGenerated) {
            this.bill = "Base Price Of The Pizza: " + this.basePrice + "\n";
            if (this.addextracheese)
                this.bill = this.bill + "Extra Cheese Added: " + this.extracheese + "\n";
            if (this.addextratoppings)
                this.bill = this.bill + "Extra Toppings Added: " + this.extratoppings + "\n";
            if (this.addbag)
                this.bill = this.bill + "Paperbag Added: " + this.bag + "\n";
            this.bill = this.bill + "Total Price: " + this.price;
            this.isBillGenerated = true;
        }
        return this.bill;
    }
}
