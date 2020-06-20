public class Test {

    public static void main(String[] args) {
        Person person1 = new Person("Natalia", "Doroż", 26);
        Person person2 = new Person("Kasia", "Kowalska", 13);
        Drink drink1 = new Drink("Kamikadze", 15, true);
        Drink drink2 = new Drink("Cola", 8, false);

        Barman barman = new Barman();
        barman.order(person1, drink1);

        barman.order(person2, drink1);
        barman.order(person2, drink2);
    }
}
