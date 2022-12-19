package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;

    private int cheeseprice;
    private int toppingprice;
    private int paperbagprice;
    boolean isCheeseAdded;
    boolean isToppingsAdded;
    boolean ispaperbagAdded;
    boolean isBillgenerated;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        // your code goes here
        this.cheeseprice=80;
        this.paperbagprice=20;
        if(isVeg==true){
            this.price=300;
            this.toppingprice=70;

        }
        else{
            this.price=400;
            this.toppingprice=120;
        }
        this.isCheeseAdded=false;
        this.isToppingsAdded=false;
        this.ispaperbagAdded=false;
        this.bill="Base price of the pizza"+this.price+"/n";
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
        if(isCheeseAdded==false){
            this.price = this.price + this.cheeseprice;
            isCheeseAdded=true;
        }
    }

    public void addExtraToppings(){
        // your code goes here
        if(isToppingsAdded==false){
            this.price = this.price + this.toppingprice;
            isToppingsAdded=true;
        }
    }

    public void addTakeaway(){
        // your code goes here
        if(ispaperbagAdded==false){
            this.price = this.price + this.paperbagprice;
            ispaperbagAdded=true;
        }
    }

    public String getBill(){
        // your code goes here
        if(isBillgenerated==false){
            if(isCheeseAdded==true){
                this.bill = this.bill+"Extra Cheese Added: "+this.cheeseprice+"\n";
            }
            if(isToppingsAdded==true){
                this.bill = this.bill+"Extra Toppings Added: "+this.toppingprice+"\n";
            }
            if(ispaperbagAdded==true){
                this.bill = this.bill+"Paperbag Added: "+this.paperbagprice+"\n";
            }
            this.bill = this.bill +"Total Price: "+this.price+"\n";
            isBillgenerated = true;
        }
        return this.bill;
    }
}
