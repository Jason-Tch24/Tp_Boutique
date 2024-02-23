public class Panier extends Boutique{
    public int prixTotalPanier(){
        int total=0;
        for(Produit produit:getListProduit()){
            total = total + produit.getPrix();
        }
        return total;
    }
}
