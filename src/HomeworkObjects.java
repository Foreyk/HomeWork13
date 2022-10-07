public class HomeworkObjects {
    public static void main(String[] args) {
        Author danielDefoe = new Author("Даниэль", "Дефо");
        Book robinsonCrusoe = new Book("Робинзон Крузо", danielDefoe, 1716);

        Author swift = new Author("Джонатан", "Свифт");
        Book gulliver = new Book("Путешествия Гулливера", swift,1726);
        gulliver.setYearPublication(2020);

        System.out.println(robinsonCrusoe);
        System.out.println(gulliver);
    }


}