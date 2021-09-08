package objects;

import java.util.ArrayList;


public class Flat {
    private int number;
    private ArrayList<Settlers> settlerList = new ArrayList<>();
    private final int DEFAULT_CAPACITY = 2;

    public Flat(int number) {
        this.number = number;
    }

    public Flat(int number, ArrayList<Settlers> settlerList) {
        this.number = number;
        this.settlerList = settlerList;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public ArrayList<Settlers> getSettlerList() {
        return settlerList;
    }

    public void setSettlerList(ArrayList<Settlers> settlerList) {
        this.settlerList = settlerList;
    }

    public void addSettler(Settlers settlers) {
        if (settlerList.size() < DEFAULT_CAPACITY) {
            settlerList.add(settlers);
        } else {
            System.out.println("нельзя заселить более 2-х жителей в квартиру " + number);
        }
    }
}
