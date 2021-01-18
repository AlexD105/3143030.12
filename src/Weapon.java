public class Weapon {
    private String name;
    public Weapon(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void found(String where, String time) {
        System.out.print(time + " " + name + " очутилась " + where);
    }
}
