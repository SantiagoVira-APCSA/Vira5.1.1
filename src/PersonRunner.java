public class PersonRunner {
    public static void main(String[] args) {
        // note that THREE Person objects are created

        Person person1 = new Person("Adam", "Jones");
        Person person2 = new Person("John", "Smith");

        person1.meetup(person2);

        System.out.println(person1.getMeetings());
        System.out.println(person2.getMeetings());

        person2.meetup(person1);

        System.out.println(person1.getMeetings());
        System.out.println(person2.getMeetings());

        Person person3 = new Person("Amy", "Jordan");
        person3.meetup(person2);

        System.out.println(person1.getMeetings());
        System.out.println(person2.getMeetings());
        System.out.println(person3.getMeetings());

    }
}