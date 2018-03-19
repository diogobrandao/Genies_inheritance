package org.academiadecodigo.bootcamp;

public class Genie {


    private int wishLimit; // wish Limit
    private int granted;

    public Genie(int wishLimit){
        this.wishLimit = wishLimit;

    }



    public void giveWish() { //int não foi necessario porq no grantedCounted ja faz a contagem

        if (granted < wishLimit) {
            grantedCounter();
            System.out.println("Your wish has been granted!");
        }

    }

    public int grantedCounter() {
        granted++;
        return granted;
    }

    public int getWishLimit() {
        return wishLimit;
    }

    public int getGranted() {
        return granted;
    }
}

