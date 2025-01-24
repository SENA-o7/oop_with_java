import java.util.Scanner;

public class Arena {
    Gamer Gamer1;
    Gamer Gamer2;
    static boolean isGameOver = false;


    public void addPlayers(Gamer g1, Gamer g2) {
        this.Gamer1 = g1;
        this.Gamer2 = g2;
    }


    public void startGame() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Taş-Kağıt-Makas Oyunu Başlıyor!");
        while (!isGameOver) {
            Gamer1.move(scanner);
            Gamer2.move(scanner);

            StatMarker.processMoves(Gamer1, Gamer2); 
            StatMarker.displayScores(Gamer1, Gamer2); 

            if (Gamer.numTrials >= 5) { // 5 elden sonra oyun biter
                isGameOver = true;
            }
        }
        scanner.close();
    }
}
