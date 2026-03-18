package week_3;

public class DrawingBook {

    public static int pageCount(int n, int p) {
        // Write your code here
        int pageTurnsFront = p / 2;
        int pageTurnsBack = (n / 2) - (p / 2);
        return Math.min(pageTurnsFront, pageTurnsBack);
    }
}
