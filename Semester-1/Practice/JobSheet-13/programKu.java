public class programKu {
    public static void TampilHinggaKei(int i) {
        for (int j = 1; j <= i; j++) {
            System.out.print(j);
        }
    }

    public static int Jumlah (int bil1, int bil2) {
        return (bil1 + bil2);
    }

    public static void TampilHinggaKei (int bil1, int bil2) {
        TampilHinggaKei(Jumlah(bil1, bil2));
    }

    public static void main(String[] args) {
        int temp = Jumlah(1, 1);
        TampilHinggaKei(temp, 5);
    }
}
