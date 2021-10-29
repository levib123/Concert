package org.vashonsd;

public class Main {

    /**
     * For now, use the main() method to print out the name of a show.
     * Create several Performers by giving them names and descriptions.
     * If you want a performer to have had one or more hit songs, use the performer's
     * .addHit() method along with the name of the hit.
     * Then print out the performers.
     */
    public static void main(String[] args) {
        Performer Joe = new Performer("Joseph Stalin", "The Hottest Band on Earth");
        Joe.addHit("Gulag");
        //System.out.println(Joe);

        Performer OR = new Performer("Olivia Rodrigo", "#1 debut artist");
        OR.addHit("Drivers License");
        OR.addHit("Jealously Jealousy");
        OR.addHit("Deja Vu");
       // System.out.println(OR);

        Performer TS = new Performer("Taylor Swift", "Top Female Artist");
        TS.addHit("22");
        TS.addHit("Red");
        TS.addHit("Love Story");
      //  System.out.println(TS);

        Concert Coachella = new Concert("Coachella", "The Biggest Music Festival on Earth", "Indio, California");
        System.out.println(Coachella);
        System.out.println("Top Coachella performers include: ");
        Coachella.addHit(TS);

        //System.out.println(OR);
       // System.out.println(TS);

    }
}
