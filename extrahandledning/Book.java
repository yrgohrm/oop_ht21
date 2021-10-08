public class Book {
    private String isbn;
    private String title;
    private int year;

    public Book(String isbn, String title, int year) {
        this.isbn = isbn;
        this.title = title;
        this.year = year;
    }

    public String getTitle() {
        return title;
    }

    public String toStrXXXing() {
        StringBuilder sb = new StringBuilder("           *****\n");
        for (int i = 10; i > 0; --i) {
            for (int j = 0; j < i; ++j)
                sb.append(" ");
            sb.append("*   *");
            for (int j = 0; j < 10-i; ++j)
                sb.append(" ");
            sb.append("*\n");
        }
        sb.append("*****          *\n");
        for (int i = 0; i < title.length(); ++i) {
            sb.append("* ");
            sb.append(title.charAt(i));
            sb.append(" *          *\n");
        }
        return sb.toString();
    }
}
