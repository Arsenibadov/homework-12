
public class Main {
    public static void main(String[] args) {
        Author author1 = new Author ( "Anton", "Chekhov" );
        Author author2 = new Author ( "Fedor", "Dostoevsky" );
        Author author3 = new Author ( "Fedor", "Dostoevsky" );

        System.out.println ( " Author1 - " + author1.getAuthorName () + " " + author1.getAuthorSurname () );
        System.out.println ( " Author2 - " + author2.getAuthorName () + " " + author2.getAuthorSurname () );
        System.out.println ( " Author3 - " + author3.getAuthorName () + " " + author3.getAuthorSurname () );

        Book seagull = new Book ( "Чайка ", author1, 1895 );
        System.out.println ( seagull );
        Book idiot = new Book ( "Идиот ", author2, 1867 );
        Book idiot1 = new Book ( "Идиот ", author2, 1870 );
        System.out.println ( idiot );
        idiot.setYearOfPublication ( 2018 );
        System.out.println ( idiot );

        System.out.println ( author1.equals ( author2 ) );
        System.out.println ( author2.equals ( author3 ) );
        System.out.println ( seagull.equals ( idiot ) );
        System.out.println ( idiot.equals ( idiot1 ) );

        System.out.println ( author1.hashCode () );
        System.out.println ( idiot.hashCode () );
        System.out.println ( idiot1.hashCode () == idiot.hashCode () );
        System.out.println ( seagull.hashCode () == idiot.hashCode () );
    }
}