class MilitaerResept extends HvitResept {
    private double rabatt = 1.00;
    public MilitaerResept (Legemiddel legemiddel, Lege utskriveLege, int pasient, int rei) {
        super(legemiddel, utskriveLege, pasient, rei);
/*
        legemiddelId = legemiddel;
        utskrivendeLege = utskriveLege;
        pasientId = pasient;
        reit = rei;
        */
    }

    public double prisAaBetale () {
        double x = legemiddelId.hentPris();
        double y = x - (x * rabatt);
        return y;
    }



}
