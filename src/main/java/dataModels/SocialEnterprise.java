package dataModels;

/**
 * Created by Guest on 8/23/17.
 */
public class SocialEnterprise extends Business {
    private int id;
    private String humanKind;
    private float humanKindByPercentage;

    public SocialEnterprise(String name, String type, float latitude, float longitude, String humanKind, float humanKindByPercentage) {
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

    public float getHumanKindByPercentage() {
        return humanKindByPercentage;
    }

    public void setHumanKindByPercentage(float humanKindByPercentage) {
        this.humanKindByPercentage = humanKindByPercentage;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SocialEnterprise that = (SocialEnterprise) o;

        if (id != that.id) return false;
        if (Float.compare(that.humanKindByPercentage, humanKindByPercentage) != 0) return false;
        return humanKind.equals(that.humanKind);
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + humanKind.hashCode();
        result = 31 * result + (humanKindByPercentage != +0.0f ? Float.floatToIntBits(humanKindByPercentage) : 0);
        return result;
    }
}
