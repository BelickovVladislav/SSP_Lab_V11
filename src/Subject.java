public class Subject {
    private String name;
    private int score;

    public Subject() {
        this.name = "Дядя";
        this.score = 5;
    }

    public Subject(int score, String name) {
        setScore(score);
        setName(name);
    }

    public int getScore() {
        return score;
    }

    protected void setScore(int score) throws Exception {
        if (score > 10 || score < 1)
            throw new Exception("10 бальная система!");

        this.score = score;
    }

    public String getName() {
        return name;
    }

    protected void setName(String name) throws Exception {
        if (name == null || name.isEmpty())
            throw new Exception("Имя не может быть пустым!");

        this.name = name;
    }
}
