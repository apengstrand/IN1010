class BlaaResept extends Resept {

  public BlaaResept (Legemiddel legemiddel, Lege utskriveLege, int pasient, int rei) {            //Setter til protected slik at den ikke kan aksesseres fra utsiden av klassen eller subklassene
      super(legemiddel, utskriveLege, pasient, rei);

  }

  public String farge() {
      return "blaa";
  }

  public double prisAaBetale() {              //Returnerer prisen med 75% rabatt
      return 0.25 * legemiddelId.hentPris();
  }
}
