package dataModels;

/**
 * Created by Guest on 8/23/17.
 */
public class SocialEnterprise extends Business {
    private int id;
    private String humanKind;
    private Double humanKindByPercentage;

    public SocialEnterprise(String name, String type, Double latitude, Double longitude, String humanKind, Double humanKindByPercentage) {
        super(name, type, latitude, longitude);
        this.humanKind = humanKind;
        this.humanKindByPercentage = humanKindByPercentage;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getHumanKind() {
        return humanKind;
    }

    public void setHumanKind(String humanKind) {
        this.humanKind = humanKind;
    }

    public Double getHumanKindByPercentage() {
        return humanKindByPercentage;
    }

    public void setHumanKindByPercentage(Double humanKindByPercentage) {
        this.humanKindByPercentage = humanKindByPercentage;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        SocialEnterprise that = (SocialEnterprise) o;

        if (id != that.id) return false;
        if (!humanKind.equals(that.humanKind)) return false;
        return humanKindByPercentage != null ? humanKindByPercentage.equals(that.humanKindByPercentage) : that.humanKindByPercentage == null;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + id;
        result = 31 * result + humanKind.hashCode();
        result = 31 * result + (humanKindByPercentage != null ? humanKindByPercentage.hashCode() : 0);
        return result;
    }
}
