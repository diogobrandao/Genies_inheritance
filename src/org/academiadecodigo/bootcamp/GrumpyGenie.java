package org.academiadecodigo.bootcamp;

public class GrumpyGenie extends Genie {

    public GrumpyGenie(int wishLimit) {
        super(wishLimit);
    }

    @Override
    public void giveWish() {

        if (this.getGranted() < 1) {
            super.grantedCounter();
            System.out.println("Your wish has been granted!");
            return;
        }
        System.out.println("The wish limit has been reached");
    }



}
