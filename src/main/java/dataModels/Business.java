package dataModels;


public class Business {
    private String name;
    private String type;
    private float latitutde;
    private float longitude;

    public Business (String name, String type, float latitutde, float longitude) {
        this.name = name;
        this.type = type;
        this.latitutde = latitutde;
        this.longitude = longitude;
    }

    public String getName() {
        return name;
    }
    public String getType() {
        return type;
    }

}
