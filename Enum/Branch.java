public enum Branch {
    // Enum sabitleri ve açıklama mesajları
    MATH("Information regarding math"),
    PHYSICS("Information regarding physics"),
    CS("Information regarding computer science"),
    ENG("Information regarding English");

    // Özel bir açıklama mesajı tutan değişken
    private final String description;

    // Enum sabitlerine açıklama mesajı atayan constructor
    Branch(String description) {
        this.description = description;
    }


    public String getDescription() {
        return description;
    }
}
