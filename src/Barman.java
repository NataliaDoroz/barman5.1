public class Barman {

    public void order(Person person1, Drink drink1) {
        if (person1.getAge() < 18) {
            if (drink1.isAlcohol() == true) {
                System.out.println(person1.getFirstName() + ", Masz mniej niż 18 lat. Odmowa sprzedaży alkoholu");
            } else {
                System.out.println(person1.getFirstName() + ", dla Ciebie " + drink1.getName() + ". Kwota do zapłaty: " + drink1.getPrice() + "zł");
            }
        } else
            System.out.println(person1.getFirstName() + ", Twój drink jest gotowy do odbioru. Kwota do zapłaty: " + drink1.getPrice() + "zł");

    }
}
