public class BachelorStudent extends Student implements ProjectScoreBehaviour {
    public BachelorStudent(int id, float mid, float fin) {
        super(id, mid, fin);
    }

    @Override
    public float computeBaseScore() {
        return computeTotalScore();
    }

    
    @Override
    public float projectScore() {
        return 20.0f; // Tabloya göre sabit değer
    }
}
