import java.util.Scanner;


// Main class
public class RockPaperScissorGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Oyuncuların isimlerini al
        System.out.println("Birinci oyuncunun adını giriniz:");
        String name1 = scanner.nextLine();
        Gamer G1 = new Gamer(name1);

        System.out.println("İkinci oyuncunun adını giriniz:");
        String name2 = scanner.nextLine();
        Gamer G2 = new Gamer(name2);

        // Oyuncuları arenaya ekle ve oyunu başlat
        Arena arena = new Arena();
        arena.addPlayers(G1, G2);
        arena.startGame();

        // Son skorları göster
        StatMarker.displayScores(G1, G2);

        scanner.close(); // Scanner'ı kapat
    }
}
