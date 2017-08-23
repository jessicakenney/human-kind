package dataModels;


import java.util.List;

public class Philanthropic extends Business {
    private List<String> charities;
    private double annualContribution;

    public Philanthropic (String name, String type, float latitude, float longitude, double annualContribution) {
        super(name, type, latitude, longitude);
        this.annualContribution = annualContribution;
    }

}
