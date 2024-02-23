public class ProduitElectronique extends Produit{

    private int dureeGarantie;

    public ProduitElectronique(String nom, String description, int prix,int dureeGarantie) {
        super(nom, description, prix);
        this.dureeGarantie = dureeGarantie;
    }

    public int getDureeGarantie() {
        return dureeGarantie;
    }

    public void setDureeGarantie(int dureeGarantie) {
        this.dureeGarantie = dureeGarantie;
    }

    public void afficher(){
        super.afficher();
        System.out.println("Duree de garantie : "+ this.dureeGarantie);
    }
}
