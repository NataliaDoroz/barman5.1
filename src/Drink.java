//Stwórz program składający się z klas:
//
//Person – posiada informacje o imieniu, nazwisku i wieku,
//Drink – posiada informacje o nazwie, cenie i tym, czy zawiera alkohol,
//W trzeciej klasie o nazwie Barman stwórz metodę main, a w niej obiekt typu Person (osoba, która zamawia drinka), oraz jeden Drink.
//
//Jeżeli osoba ma mniej niż 18 lat, to powinna zobaczyć komunikat o odmowie sprzedaży.
//
//Jeżeli osoba jest pełnoletnia, to wyświetlamy komunikat typu "[Imię], Twój drink jest gotowy do odbioru. Kwota do zapłaty [cena]".
public class Drink {
    public String name;
    public double price;
    public boolean isAlcohol;

    public Drink(String name, double price, boolean isAlcohol) {
        this.name = name;
        this.price = price;
        this.isAlcohol = isAlcohol;
    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public double getPrice() {
//        return price;
//    }
//
//    public void setPrice(double price) {
//        this.price = price;
//    }
//
//    public boolean isAlcohol() {
//        return isAlcohol;
//    }
//
//    public void setAlcohol(boolean alcohol) {
//        isAlcohol = alcohol;
//    }
}
