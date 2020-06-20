public class Barman {

    public void order(Person person, Drink drink) {
        if (person.getAge() < 18 && (drink.isAlcohol())) {
            System.out.println(person.getFirstName() + ", Masz mniej niż 18 lat. Odmowa sprzedaży alkoholu");
        } else {
            System.out.println(person.getFirstName() + ", Twój drink jest gotowy do odbioru. Kwota do zapłaty: " + drink.getPrice() + "zł");
        }

    }
}
