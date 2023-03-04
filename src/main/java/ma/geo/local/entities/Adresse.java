package ma.geo.local.entities;

import javax.persistence.Embeddable;

@Embeddable
public class Adresse {
    public Adresse(String rue, String avenue, String ville) {
        this.rue = rue;
        this.avenue = avenue;
        this.ville = ville;
    }

    public Adresse() {
    }

    private String rue;
    private String avenue;
    private String ville;

    public String getRue() {
        return rue;
    }

    public String getAvenue() {
        return avenue;
    }

    public String getVille() {
        return ville;
    }

    public void setRue(String rue) {
        this.rue = rue;
    }

    public void setAvenue(String avenue) {
        this.avenue = avenue;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    @Override
    public String toString() {
        return "Adresse{" +
                "rue='" + rue + '\'' +
                ", avenue='" + avenue + '\'' +
                ", ville='" + ville + '\'' +
                '}';
    }
}
