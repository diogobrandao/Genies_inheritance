package org.academiadecodigo.bootcamp;

public class Demon extends Genie {

    private boolean recycle;

    @Override
    public void giveWish() {

        if (recycle == false) {
            grantedCounter();
            System.out.println("Your wish has been granted!");
        } else {
            System.out.println("youre out of wishes!");
        }

    }

    public Demon(int wishLimit) {
        super(wishLimit);
    }

    public void setRecycle(boolean recycle) {
        this.recycle = recycle;
    }
}
