public class Salle {
    private int etage;
    private String nom;
    private double superficie;
    private Musee musee;

    public Salle(int etage, String nom, double superficie, Musee musee) {
        this.etage = etage;
        this.nom = nom;
        this.superficie = superficie;
        this.musee = musee;
    }

    public int getEtage() {
        return etage;
    }

    public void setEtage(int etage) {
        this.etage = etage;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public double getSuperficie() {
        return superficie;
    }

    public void setSuperficie(double superficie) {
        this.superficie = superficie;
    }

    public Musee getMusee() {
        return musee;
    }

    public void setMusee(Musee musee) {
        this.musee = musee;
    }
}
