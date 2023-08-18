package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
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

        if (isVeg){
            price=300;
            extratoppings=70;
            total+=price;
        }
        else{
            price=400;
            extratoppings=80;
            total+=price;
        }
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
            total+=extracheese;
            addextracheese=true;
        }
    }

    public void addExtraToppings(){
        // your code goes here
        if (!addextratoppings){
            total+=extratoppings;
            addextratoppings=true;
        }
    }

    public void addTakeaway(){
        // your code goes here
        if (!addbag){
            total+=bag;
            addbag=true;
        }
    }

    public String getBill(){
        // your code goes here

        this.bill=this.bill+"Base Price Of The Pizza: "+price +"\n";
        if (addextracheese)
            this.bill=this.bill+"Extra Cheese Added: "+extracheese+"\n";
        if (addextratoppings)
            this.bill=this.bill+"Extra Toppings Added: "+extratoppings+"\n";
        if (addbag)
            this.bill=this.bill+"Paperbag Added: "+bag+"\n";
        this.bill=this.bill+"Total Price: "+total;
        return this.bill;
    }
}
