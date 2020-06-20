//Stwórz program składający się z klas:
//
//Person – posiada informacje o imieniu, nazwisku i wieku,
//Drink – posiada informacje o nazwie, cenie i tym, czy zawiera alkohol,
//W trzeciej klasie o nazwie Barman stwórz metodę order ktora przyjmije jako argumenty
// obiekt typu Person (osoba, która zamawia drinka), oraz jeden Drink.
//
//Jeżeli osoba ma mniej niż 18 lat i Drink zawiera alkohol, to powinna zobaczyć komunikat o odmowie sprzedaży.
//
//Jeżeli osoba jest pełnoletnia, to wyświetlamy komunikat typu "[Imię], Twój drink jest gotowy do odbioru.
// Kwota do zapłaty [cena]".
//
//Wszystkie pola w klasach zadeklaruj jako private

import javax.swing.*;


public class Test {

    public static void main(String[] args) {
        Person person1=new Person("Natalia","Doroż",26);
        Person person2=new Person("Kasia","Kowalska", 13);
        Drink drink1=new Drink("Kamikadze", 15, true);

        Barman barman=new Barman();
        barman.order(person1,drink1);

        barman.order(person2,drink1);




    }
}
