public class Client {
    private Inventaire inventaire;
    public String nomJoueur;

    // Getter
    public Inventaire getInventaire(){
        return inventaire;
    }
    public String getNomJoueur(){
        return nomJoueur;
    }
    // Setter
    public void setNomJoueur(String nomJoueur){
        this.nomJoueur = nomJoueur;
    }
}
