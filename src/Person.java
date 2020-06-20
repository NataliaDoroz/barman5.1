//Stwórz program składający się z klas:
//
//Person – posiada informacje o imieniu, nazwisku i wieku,
//Drink – posiada informacje o nazwie, cenie i tym, czy zawiera alkohol,
//W trzeciej klasie o nazwie Barman stwórz metodę main, a w niej obiekt typu Person (osoba, która zamawia drinka), oraz jeden Drink.
//
//Jeżeli osoba ma mniej niż 18 lat, to powinna zobaczyć komunikat o odmowie sprzedaży.
//
//Jeżeli osoba jest pełnoletnia, to wyświetlamy komunikat typu "[Imię], Twój drink jest gotowy do odbioru. Kwota do zapłaty [cena]".
public class Person {
    public String firstName;
    public String lastName;
    public int age;

    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }


}
