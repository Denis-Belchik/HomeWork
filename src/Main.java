public class Main {
    public static void main(String[] args) {
        Author nameLev = new Author("Lev", "Tolstoi");
        Author namePushkin = new Author("Aleksandr", "Pushkin");
        Book war = new Book("War and Peace", nameLev, 1878);
        Book roman = new Book("Roman", namePushkin, 1821);
        Book roman1 = new Book("Roman", namePushkin, 182);
        war.setYear(1700);
        roman.setYear(1400);

        System.out.println("war.getName() = " + war.getName());
        System.out.println("war.getYear() = " + war.getYear());
        System.out.println("war.getAuthor().getFirstName() = " + war.getAuthor().getFirstName());
        System.out.println("war.getAuthor().getLastName() = " + war.getAuthor().getLastName());

        System.out.println(namePushkin);
        System.out.println("roman = " + roman);
        System.out.println("roman1 = " + roman1);
        System.out.println("war = " + war);
        System.out.println("roman.equals(roman1) = " + roman.equals(roman1));
        System.out.println("roman.equals(war) = " + roman.equals(war));
        System.out.println("roman.hashCode() == roman1.hashCode() = " + (roman.hashCode() == roman1.hashCode()));
        System.out.println("war.hashCode() == roman1.hashCode() = " + (war.hashCode() == roman1.hashCode()));
    }
}