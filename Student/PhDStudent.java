public class PhDStudent extends Student implements ArticleScoreBehaviour {
    protected int numberOfArticles;

    public PhDStudent(int id, float mid, float fin, int numberOfArticles) {
        super(id, mid, fin);
        this.numberOfArticles = numberOfArticles;
    }

  
    @Override
    public float computeBaseScore() {
        return computeTotalScore();
    }


    @Override
    public float articleScore() {
        return numberOfArticles * 8.0f; // Tabloya göre katsayı
    }
}
