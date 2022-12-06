class Person {
    private String firstName;
    private String lastName;
    private int meetCount;

    public Person(String fn, String ln) {
        firstName = fn;
        lastName = ln;
        meetCount = 0;
    }

    public void setMeetings(int meetings) {
        meetCount = meetings;
    }

    public int getMeetings() {
        return meetCount;
    }

    public void meetup(Person person) {
        System.out.println("Hello, my name is " + firstName);
        System.out.println("Hi, my name is " + person.firstName);

        meetCount++;
        person.setMeetings(person.getMeetings() + 1);
    }
}