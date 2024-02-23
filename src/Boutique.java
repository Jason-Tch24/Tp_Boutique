import java.util.ArrayList;
import java.util.List;

public class Boutique {
    private List<Produit> listProduit = new ArrayList<>();
    private int idProduit;
    public List<Produit> getListProduit() {
        return listProduit;
    }

    public void addProduit(Produit produit) {
        if(produit.getId() == 0){
            idProduit++;
            produit.setId(idProduit);
        }
        listProduit.add(produit);
    }

    public void nomProduit(){
        for(Produit produit: listProduit) {
            System.out.println(produit.getNom());
        }
    }
    public void afficherStock(){
        for(Produit produit: listProduit){
            produit.afficher();
        }
    }
}
