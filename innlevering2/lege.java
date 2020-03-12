class Lege {
    protected String navn;

    public Lege (String nav) {
        navn = nav;
    }

    public String legeNavn() {            //Returnerer navn på lege
        return navn;
    }

    public String toString() {
        return ("Lege: " + navn);
    }
}
