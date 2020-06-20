////Stwórz program składający się z klas:
////
////Person – posiada informacje o imieniu, nazwisku i wieku,
////Drink – posiada informacje o nazwie, cenie i tym, czy zawiera alkohol,
////W trzeciej klasie o nazwie Barman stwórz metodę order ktora przyjmije jako argumenty
//// obiekt typu Person (osoba, która zamawia drinka), oraz jeden Drink.
////
////Jeżeli osoba ma mniej niż 18 lat i Drink zawiera alkohol, to powinna zobaczyć komunikat o odmowie sprzedaży.
////
////Jeżeli osoba jest pełnoletnia, to wyświetlamy komunikat typu "[Imię], Twój drink jest gotowy do odbioru. Kwota do zapłaty [cena]".
////
////Wszystkie pola w klasach zadeklaruj jako private
public class Barman {
    void order (Person person1, Drink drink1){
        if (person1.age<18){
            System.out.println("Masz mniej niż 18 lat. Odmowa sprzedaży");
        }
        else
            System.out.println(person1.firstName + ", Twój drink jest gotowy do odbioru. Kwota do zapłaty: "+ drink1.price);

    }


}
