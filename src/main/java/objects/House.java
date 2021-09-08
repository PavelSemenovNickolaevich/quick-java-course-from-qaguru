package objects;

import java.util.ArrayList;

public class House {

    private String address;
    private ArrayList<Flat> flatsList = new ArrayList<>();

    public House(String address) {
        this.address = address;
    }

    public House(String house, ArrayList<Flat> flatsList) {
        this.address = house;
        this.flatsList = flatsList;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public ArrayList<Flat> getFlatsList() {
        return flatsList;
    }

    public void setFlatsList(ArrayList<Flat> flatsList) {
        this.flatsList = flatsList;
    }

    public void addFlat(Flat flat) {
        flatsList.add(flat);
    }
}
