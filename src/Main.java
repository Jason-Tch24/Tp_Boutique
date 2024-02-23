import java.time.LocalDate;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //creer l'objet boutique
        Boutique superette = new Boutique();
        //creer les produit de la boutique
        Produit lait = new ProduitAlimentaire("Lait","Nature",3, LocalDate.of(2026,2,25));
        Produit machine = new ProduitElectronique("Lave vessele","lave les plat",200,2);
        Produit boisson =new ProduitBoisson("Soda","Coca cola zero",4,75);

        //creer un panier
        Panier panier= new Panier();

        //ajouter les produit dans la boutique(superette)
        superette.addProduit(lait);
        superette.addProduit(machine);
        superette.addProduit(boisson);

        //ajouter les produits dans le panier
        panier.addProduit(lait);
        panier.addProduit(boisson);

        //Afficher la liste des produit avec la methode getListProduit
        System.out.println(superette.getListProduit());

        //List les noms de tout les produit ajouter dans la boutique
        superette.nomProduit();

        //Affiche les details de chaque produit ajouter dans la boutique
        superette.afficherStock();

        //Affiche le contenue du panier
        System.out.println("Voici les produit dans votre panier "+panier.getListProduit());
        panier.afficherStock();

        //Afficher le prix du panier
        System.out.println("Le prix de votre panier est de : " + panier.prixTotalPanier());
    }
}