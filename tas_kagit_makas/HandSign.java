public enum HandSign {
    Tas, Kagit, Makas;


    public boolean beats(HandSign other) {
        if (this == Tas && other == Makas) {
            return true;
        } else if (this == Kagit && other == Tas) {
            return true;
        } else if (this == Makas && other == Kagit) {
            return true;
        } else {
            return false;
        }
    }
}
