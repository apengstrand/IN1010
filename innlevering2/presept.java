class PResept extends HvitResept {
    protected double rabatt = 108;
    double pris;

    public PResept (Legemiddel legemiddel, Lege utskriveLege, int pasient) {            //Setter til protected slik at den ikke kan aksesseres fra utsiden av klassen eller subklassene
        super(legemiddel, utskriveLege, pasient, 3);

    }

    public double prisAaBetale() {

      if(legemiddelId.hentPris() - rabatt < 0) {
        pris = 0;
      } else {
        pris = (legemiddelId.hentPris() - rabatt);
      }
      return pris;
    }



}
