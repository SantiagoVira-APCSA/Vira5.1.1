public class StudentRunner {
    public static void main(String[] args) {
        Student alan = new Student("Alan Turing", 11, "Liberty High School");
        Student ada = new Student("Ada Lovelace", 5);
        Student mary = new Student("Mary Truman", 8);
        Student paul = new Student("Paul Rudd", 2, "Colerain Elementary School");
        Student cindy = new Student("Cindy Long", 4);

        System.out.println(alan.studentInfo());
        System.out.println(ada.studentInfo());
        System.out.println(mary.studentInfo());
        System.out.println(paul.studentInfo());
        System.out.println(cindy.studentInfo());
    }
}
