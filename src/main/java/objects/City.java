package objects;

import java.util.ArrayList;

public class City {
    private String name;
    private ArrayList<House> housesList  = new ArrayList<>();

    public City(String name) {
        this.name = name;
    }

    public City(String name, ArrayList<House> housesList) {
        this.name = name;
        this.housesList = housesList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<House> getHousesList() {
        return housesList;
    }

    public void setHousesList(ArrayList<House> housesList) {
        this.housesList = housesList;
    }

    public void showSettledList() {

        System.out.println("Город " + name);
        for (House house : housesList) {
            System.out.println("Дом " + house.getAddress());
            for (Flat flat : house.getFlatsList()) {
                System.out.println("- Квартира " + flat.getNumber());
                if (flat.getSettlerList().size() == 0) {
                    System.out.println(" -- Никто не живет ");
                    continue;
                }
                for (Settlers settler: flat.getSettlerList()) {
                    System.out.printf("-- Житель %s ", settler.getName());
                }
            }
            System.out.println();
        }
    }

    public void addHouse(House house) {
        housesList.add(house);
    }

}
