public class Subject {
    private String name;
    private int score;

    public void setScore(int score) throws Exception {
        if (score > 10 || score < 1)
            throw new Exception("10 бальная система!");

        this.score = score;
    }

    public int getScore() {
        return score;
    }

    public void setName(String name) throws Exception {
        if (name == null || name.isEmpty())
            throw new Exception("Имя не может быть пустым!");

        this.name = name;
    }

    public String getName() {
        return name;
    }
}
