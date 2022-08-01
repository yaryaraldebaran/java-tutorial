package file_latihan;

public class testBaseball {
    public static void main(String[] args) {
        baseballPlayer aCatcher = new baseballPlayer(12, 0.123);
        // baseballPlayer aShortStop = new baseballPlayer(15, 0.56);
        baseballPlayer anOutfielder = new baseballPlayer(19, 0.76);
        aCatcher.showPlayer();
        anOutfielder.showPlayer();
        System.out.println("nilai floor dari 100.29812 adalah "+Math.floor(100.291389));
    }
}
