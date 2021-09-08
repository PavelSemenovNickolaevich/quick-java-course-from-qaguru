import objects.City;
import objects.Flat;
import objects.House;
import objects.Settlers;

public class Main {
    public static void main(String[] args) {

        City city = new City("Moscow");

        House house1 = new House("ул. Иванова, д.6");
        House house2 = new House("ул. Иванова, д.7");
        House house3 = new House("ул. Иванова, д.8");
        House house4 = new House("ул. Иванова, д.9");
        House house5 = new House("ул. Иванова, д.10");

        Flat flat1 = new Flat(1);
        Flat flat2 = new Flat(2);
        Flat flat3 = new Flat(3);
        Flat flat4 = new Flat(4);
        Flat flat5 = new Flat(5);

        Settlers settler1 = new Settlers("settler1");
        Settlers settler2 = new Settlers("settler2");
        Settlers settler3 = new Settlers("settler3");
        Settlers settler4 = new Settlers("settler4");
        Settlers settler5 = new Settlers("settler5");
        Settlers settler6 = new Settlers("settler6");
        Settlers settler7 = new Settlers("settler7");
        Settlers settler8 = new Settlers("settler8");
        Settlers settler9 = new Settlers("settler9");
        Settlers settler10 = new Settlers("settler10");

        flat1.addSettler(settler1);
        flat1.addSettler(settler2);

        flat2.addSettler(settler3);
        flat2.addSettler(settler4);
        flat2.addSettler(settler5);

        flat3.addSettler(settler6);

        flat5.addSettler(settler8);
        flat5.addSettler(settler9);

        house1.addFlat(flat1);
        house2.addFlat(flat3);
        house3.addFlat(flat2);
        house4.addFlat(flat5);
        house4.addFlat(flat4);

        city.addHouse(house1);
        city.addHouse(house2);
        city.addHouse(house3);
        city.addHouse(house4);
        city.addHouse(house5);

        city.showSettledList();
    }
}
