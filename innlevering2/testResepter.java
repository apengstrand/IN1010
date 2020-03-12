class testResept {
    public static void main(String[] args) {

        //Tester opprettelse av legemidler
        Narkotisk narko1 = new Narkotisk("Barbital", 362, 10, 15);
        Narkotisk narko2 = new Narkotisk("Morfin", 450, 40, 35);
        Vanedannende vane1 = new Vanedannende("Anxiolytica", 150.20, 15, 40);
        Vanedannende vane2 = new Vanedannende("Sedativa", 198.50, 20, 10);
        Vanlig vanlig1 = new Vanlig("Paracet", 39.50, 5);
        Vanlig vanlig2 = new Vanlig("Ibux", 36.50, 2);

        //Skriver ut legemidler
        System.out.println("Utskrift av legemidler: \n");
        System.out.println("Narko1: " + narko1);
        System.out.println("Narko2: " + narko2);
        System.out.println("Vane1: " + vane1);
        System.out.println("Vane2: " + vane2);
        System.out.println("Vanlig1: " + vanlig1);
        System.out.println("Vanlig2: " + vanlig2);

        //Opprettelse av leger
        Lege lege1 = new Lege("Sindre");
        Lege lege2 = new Lege("Anna");
        Lege lege3 = new Lege("Stian");
        Spesialist lege4 = new Spesialist("Line", 4);
        System.out.println("\n");

        //Tester opprettelse av resepter
        PResept presept1 = new PResept(narko1, lege1, 2);
        PResept presept2 = new PResept(narko2, lege2, 1);

        BlaaResept blaresept1 = new BlaaResept(vane1, lege3, 2, 2);
        BlaaResept blaresept2 = new BlaaResept(vane2, lege2, 2, 2);

        MilitaerResept militar1 = new MilitaerResept(narko1, lege1, 634, 5);
        MilitaerResept militar2 = new MilitaerResept(vane2, lege3, 234, 2);
        MilitaerResept militar3 = new MilitaerResept(vanlig2, lege2, 634, 6);

        HvitResept hvitres1 = new HvitResept(narko2, lege3, 643, 2);

        //Utskrifter
        System.out.println("Utskrift av pris på resepter: \n");
        System.out.println("Pris på presept1: " + presept1.prisAaBetale());
        System.out.println("Pris på presept2: " + presept2.prisAaBetale());
        System.out.println("Pris på militar1: " + militar1.prisAaBetale());
        System.out.println("Pris på blaresept1: " + blaresept1.prisAaBetale());
        System.out.println("Pris på presept2: " + hvitres1.prisAaBetale());



        System.out.println("Presept id: " + presept1.hentId());
        System.out.println("Blaresept1 legemiddel : " + blaresept1.hentLegemiddel());
        System.out.println("Militar1 lege : " + militar1.hentLege());
        System.out.println("Militar2 pasientID : " + militar2.hentPasientId());
        System.out.println("Militar3 pasientID : " + militar3.hentReit());

        //Tester utskrift av resept
        System.out.println("\nUtskrift av resepter:");
        System.out.println(presept1);
        System.out.println(presept2);
        System.out.println(blaresept1);
        System.out.println(blaresept2);

        //Tester bruk av reseptene
        System.out.println("\nTester bruk av resepter:");
        System.out.println("Antall reit blaresept1: " + blaresept1.hentReit());

        if (blaresept1.bruk() == true) {
            System.out.println("Brukte resept 1 gang");
        } else {
            System.out.println("Ingen flere uttak på resepten");
        };

        System.out.println("Antall reit blaresept1: " + blaresept1.hentReit());
        blaresept1.bruk();
        System.out.println("Antall reit blaresept1: " + blaresept1.hentReit());
        blaresept1.bruk();
        System.out.println("Antall reit blaresept1: " + blaresept1.hentReit());

        //Tester farge
        System.out.println("Farge til resepten blaresept2: " + blaresept2.farge());
        System.out.println("Farge til resepten militar1: " + militar1.farge());

        //Tester utskrift av lege
        System.out.println("dette er lege til blaresept1: " + blaresept1.hentLege());




    }
}
