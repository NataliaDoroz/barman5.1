public class Test {

    public static void main(String[] args) {
        Person adult = new Person("Natalia", "Doroż", 26);
        Person child = new Person("Kasia", "Kowalska", 13);
        Drink kamikadze = new Drink("Kamikadze", 15, true);
        Drink cola = new Drink("Cola", 8, false);

        Barman barman = new Barman();
        barman.order(adult, kamikadze);

        barman.order(adult, kamikadze);
        barman.order(child, cola);
    }
}
