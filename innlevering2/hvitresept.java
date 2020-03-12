class HvitResept extends Resept {

  public HvitResept (Legemiddel legemiddel, Lege utskriveLege, int pasient, int rei) {            //Setter til protected slik at den ikke kan aksesseres fra utsiden av klassen eller subklassene
      super(legemiddel, utskriveLege, pasient, rei);
}

  public String farge() {
      return "hvit";
  }

public double prisAaBetale() {
    return legemiddelId.hentPris();

}

}
