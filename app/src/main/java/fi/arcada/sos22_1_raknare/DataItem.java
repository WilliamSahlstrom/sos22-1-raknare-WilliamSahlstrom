package fi.arcada.sos22_1_raknare;

//POJO- Plain Old Java Object
public class DataItem {
    //Vi deklarerar attribut (instansvariabler)
    double value;
    String name;

    public DataItem(String name, double value) {
        this.name = name;
        this.value = value;
    }
    //Getters
    public double getValue() {
        return value;
    }
    public String getName() {
        return name;
    }
    //Setter
    public void setValue(double value) {
        this.value = value;
    }
}
