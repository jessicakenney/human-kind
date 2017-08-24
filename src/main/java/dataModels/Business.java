package dataModels;


public class Business {
    private String name;
    private String type;
    private Double latitude;
    private Double longitude;

    public Business (String name, String type, Double latitude, Double longitude) {
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

    public Double getLatitude() {
        return latitude;
    }

    public Double getLongitude() {
        return longitude;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Business business = (Business) o;

        if (!name.equals(business.name)) return false;
        if (!type.equals(business.type)) return false;
        if (latitude != null ? !latitude.equals(business.latitude) : business.latitude != null) return false;
        return longitude != null ? longitude.equals(business.longitude) : business.longitude == null;
    }

    @Override
    public int hashCode() {
        int result = name.hashCode();
        result = 31 * result + type.hashCode();
        result = 31 * result + (latitude != null ? latitude.hashCode() : 0);
        result = 31 * result + (longitude != null ? longitude.hashCode() : 0);
        return result;
    }
}
