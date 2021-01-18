public class Movement {
    private String name;
    public Movement(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public void msimpression(String who) {
        System.out.print(name + " произвел очень сильное впечатление на " + who);
    }
}
