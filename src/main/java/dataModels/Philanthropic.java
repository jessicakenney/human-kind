package dataModels;
import java.util.List;

public class Philanthropic extends Business {
    private int id;
    private String charities;
    private Double annualContribution;

    public Philanthropic (String name, String type, Double latitude, Double longitude, String charities, Double annualContribution) {
        super(name, type, latitude, longitude);
        this.charities = charities;
        this.annualContribution = annualContribution;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    public String getCharities() {
        return charities;
    }

    public void setCharities(String charities) {
        this.charities = charities;
    }

    public Double getAnnualContribution() {
        return annualContribution;
    }

    public void setAnnualContribution(double annualContribution) {
        this.annualContribution = annualContribution;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Philanthropic that = (Philanthropic) o;

        if (id != that.id) return false;
        if (Double.compare(that.annualContribution, annualContribution) != 0) return false;
        return charities.equals(that.charities);
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        long temp;
        result = 31 * result + id;
        result = 31 * result + charities.hashCode();
        temp = Double.doubleToLongBits(annualContribution);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }
}


