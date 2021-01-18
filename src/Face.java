public class Face {
    private String name;
    public Face(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void sthave(String what) {
        System.out.print(name + " приобрело " + what );
    }
}
