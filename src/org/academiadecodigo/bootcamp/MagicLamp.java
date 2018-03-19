package org.academiadecodigo.bootcamp;

public class MagicLamp {


    private int totalRecycles;
    private int genieCounter;
    private int genieLimit;


    public Genie rub(){
        Genie genie = null;
        int r = Randomizer.getRandom();
        if (genieCounter == genieLimit) {

            genie = new Demon(5);
            System.out.println("Demon");
            return genie;

        }

        if (r == 1) {
            genie = new FriendlyGenie(5);
            genieCounter++;
            System.out.println("Friendly genie");


        } else if (r == 0) {
            genie = new GrumpyGenie(5);
            genieCounter++;
            System.out.println("grumpy genie");

        }

        return genie;


    }

    public MagicLamp(int genieLimit) {
        this.genieLimit = genieLimit;
    }

    public void recycle(Genie genie) {
        if(genie instanceof Demon){  // (devolve boolean)recebe um genie, recebe qq um dos tres, pra garantir q é demon fazemos o instace off, genie é um Demon;
            genieCounter = 0;
            totalRecycles ++;
            ((Demon)genie).setRecycle(true); // cast - forçar objecto  a portar se como objecto de outro tipo
        }
        System.out.println("the demon is gone   ");


    }

    public boolean compareLamps(MagicLamp lamp) {
        if(this.totalRecycles == lamp.totalRecycles && this.genieCounter ==lamp.genieCounter && this.genieLimit==lamp.genieLimit){
            System.out.println("this lamps are equal");
            return true;
        }
        System.out.println("This lamps are different");
        return false;
    }


    public int numberLamps(int numberlamps) {
        numberlamps = totalRecycles - 1; //the first recycled lamp is the second lamp, etc.
        return numberlamps;

    }



    public int recycleCounter() {
        totalRecycles++;
        return totalRecycles;


    }




    //public boolean getRubs(){
     //   return rubs;
    //}

    //public int getTotalRubs() {
       // return totalRubs;
   // }

    public int getTotalRecycles() {
        return totalRecycles;
    }




}
