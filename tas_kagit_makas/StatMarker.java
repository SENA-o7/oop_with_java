// StatMarker class
public class StatMarker {
    // Oyuncuların hareketlerini işler ve kazananı belirler
    public static void processMoves(Gamer g1, Gamer g2) {
        Gamer.numTrials++; // Toplam oyun sayısını artır
        if (g1.sign == g2.sign) {
            Gamer.numDraw++;
            System.out.println("Berabere! İkisi de " + g1.sign + " seçti.");
        } else if (g1.sign.beats(g2.sign)) {
            g1.numOfWins++;
            System.out.println(g1.name + " Kazandı! " + g1.sign + " -> " + g2.sign + " Yendi.");
        } else { // İkinci oyuncu kazanırsa
            g2.numOfWins++;
            System.out.println(g2.name + " Kazandı! " + g2.sign + " -> " + g1.sign + " Yendi.");
        }
    }

    // Skorları ekrana basar
    public static void displayScores(Gamer g1, Gamer g2) {
        System.out.println("\n--- Skorlar ---");
        System.out.println("Toplam Oyunlar: " + Gamer.numTrials);
        System.out.println("Beraberlik: " + Gamer.numDraw);
        System.out.println(g1.name + " Kazanma Sayısı: " + g1.numOfWins);
        System.out.println(g2.name + " Kazanma Sayısı: " + g2.numOfWins);
        System.out.println("----------------");
    }
}
