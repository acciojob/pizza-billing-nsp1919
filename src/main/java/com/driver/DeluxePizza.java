package com.driver;

public class DeluxePizza extends Pizza {
    private String bill="";
    private int total=0;

    public DeluxePizza(Boolean isVeg) {
        super(isVeg);
        // your code goes here

        if (isVeg) {
            setPrice(300);
            setExtratoppings(70);
            total += getPrice() + getExtracheese() + getExtratoppings();
        } else {
            setPrice(400);
            setExtratoppings(120);
            total += getPrice() + getExtracheese() + getExtratoppings();
        }
    }
    private boolean addbag=false;
    @Override
    public void addTakeaway() {
        super.addTakeaway();
        if (!addbag){
            this.total+=getBag();
            addbag=true;
        }
    }


    @Override
    public String getBill() {
        this.bill=this.bill+"Base Price Of The Pizza: "+getPrice() +"\n";
        this.bill=this.bill+"Extra Cheese Added: "+getExtracheese()+"\n";
        this.bill=this.bill+"Extra Toppings Added: "+getExtratoppings()+"\n";
        if (addbag)
            this.bill=this.bill+"Paperbag Added: "+getBag()+"\n";
        this.bill=this.bill+"Total Price: "+total;
        return bill;
    }
}
