public class Client {
    private Inventaire inventaire;
    public String nomJoueur;
    // Constructeur
    public Client(Inventaire inventaire, String nomJoueur){
    this.inventaire = inventaire;
    this.nomJoueur = nomJoueur;
    }
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
