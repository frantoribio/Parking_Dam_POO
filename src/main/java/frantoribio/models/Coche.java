package frantoribio.models;

public class Coche {
    private String color = "";
    private String matricula = "";

    public Coche(String color, String matricula) {
        this.color = color;
        this.matricula = matricula;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    @Override
    public String toString() {
        return "Coche {" +
                "color = '" + color + '\'' +
                ", matricula = '" + matricula + '\'' +
                '}';
    }
}
