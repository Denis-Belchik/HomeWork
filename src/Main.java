public class Main {
    public static void main(String[] args) {
        Author nameLev = new Author("Lev", "Tolstoi");
        Author namePushkin = new Author("Aleksandr", "Pushkin");
        Book war = new Book("War and Peace", nameLev, 1878);
        Book roman = new Book("Roman", namePushkin, 1821);
        war.setYear(1700);
        roman.setYear(1400);

        System.out.println("war.getName() = " + war.getName());
        System.out.println("war.getYear() = " + war.getYear());
        System.out.println("war.getAuthor().getFirstName() = " + war.getAuthor().getFirstName());
        System.out.println("war.getAuthor().getLastName() = " + war.getAuthor().getLastName());
    }
}