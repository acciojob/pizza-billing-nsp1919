package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private int basePrice;
    private String bill="";

    private final int extracheese=80;

    private int extratoppings;

    private final int bag=20;
    private int total=0;

    public void setPrice(int price) {
        this.price = price;
    }

    public Boolean getVeg() {
        return isVeg;
    }

    public void setVeg(Boolean veg) {
        isVeg = veg;
    }

    public void setBill(String bill) {
        this.bill = bill;
    }

    public int getExtracheese() {
        return extracheese;
    }

    public int getExtratoppings() {
        return extratoppings;
    }

    public void setExtratoppings(int extratoppings) {
        this.extratoppings = extratoppings;
    }

    public int getBag() {
        return bag;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public boolean isAddextracheese() {
        return addextracheese;
    }

    public void setAddextracheese(boolean addextracheese) {
        this.addextracheese = addextracheese;
    }

    public boolean isAddextratoppings() {
        return addextratoppings;
    }

    public void setAddextratoppings(boolean addextratoppings) {
        this.addextratoppings = addextratoppings;
    }

    public boolean isAddbag() {
        return addbag;
    }

    public void setAddbag(boolean addbag) {
        this.addbag = addbag;
    }

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;

        if (this.isVeg){
            this.basePrice=300;
            this.extratoppings=70;

        }
        else{
            this.basePrice=400;
            this.extratoppings=80;

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
            this.total+=this.extratoppings;
            addextratoppings=true;
        }
    }

    public void addTakeaway(){
        // your code goes here
        if (!addbag){
            this.total+=this.bag;
            addbag=true;
        }
    }

    public String getBill(){
        // your code goes here

        this.bill="Base Price Of The Pizza: "+this.basePrice+"\n";
        if (addextracheese)
            this.bill=this.bill+"Extra Cheese Added: "+this.extracheese+"\n";
        if (addextratoppings)
            this.bill=this.bill+"Extra Toppings Added: "+this.extratoppings+"\n";
        if (addbag)
            this.bill=this.bill+"Paperbag Added: "+this.bag+"\n";
        this.bill=this.bill+"Total Price: "+total;
        return this.bill;
    }
}
