package dataModels;


public class Business {
    private String name;
    private String type;
    private float latitude;
    private float longitude;

    public Business (String name, String type, float latitude, float longitude) {
        this.name = name;
        this.type = type;
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public String getName() {
        return name;
    }
    public String getType() {
        return type;
    }

}
