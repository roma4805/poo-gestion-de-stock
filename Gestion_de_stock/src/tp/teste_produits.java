package tp;

public class teste_produits {
	public static void main(String[] args) {
        Produit produitAlimentaire = new ProduitAlimentaire("Pâtes", 2.5, 100);
        Produit produitElectronique = new ProduitElectronique("Télévision", 500, 10);

        System.out.println("Valeur du stock de produit alimentaire : " + produitAlimentaire.calculerValeurStock());
        System.out.println("Valeur du stock de produit électronique : " + produitElectronique.calculerValeurStock());
    }
}
