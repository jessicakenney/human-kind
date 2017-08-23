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

}
