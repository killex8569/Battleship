public class Bateau {
    private final TypeBateau typeBateau;
    private boolean orientation;
    private final int longueur;

    // Constructeur
    public Bateau(TypeBateau typeBateau, boolean orientation, int longueur){
        this.typeBateau = typeBateau;
        this.orientation = orientation;
        this.longueur = longueur;
    }
    public TypeBateau getTypeBateau(){
        return typeBateau;
    }
    public boolean getOrientation(){
        return orientation;
    }
    public int getLongueur(){
        return longueur;
    }

    // Setter
    public void setOrientation(boolean orientation) {
        this.orientation = orientation;
    }



}
