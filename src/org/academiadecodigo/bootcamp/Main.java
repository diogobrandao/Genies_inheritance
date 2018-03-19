package org.academiadecodigo.bootcamp;

public class Main {

    public static void main(String[] args) {

        MagicLamp lamp = new MagicLamp(3);
        Genie genie = new Genie(3);
        Genie demon = new Demon(3);
        lamp.rub();
        genie.giveWish();
        genie.giveWish();
        genie.giveWish();
        genie.giveWish();
        genie.giveWish();
        lamp.rub();
        genie.giveWish();
        genie.giveWish();
        genie.giveWish();
        genie.giveWish();
        genie.giveWish();
        lamp.rub();
        genie.giveWish();
        genie.giveWish();
        genie.giveWish();
        genie.giveWish();
        genie.giveWish();
        lamp.rub();
        genie.giveWish();
        lamp.recycle(demon);
        lamp.rub();
        genie.giveWish();




    }

}
