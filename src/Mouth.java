public class Mouth extends Bodyparts{

    public Mouth(String name) {
        super(name);
    }

    public void close(String what, String then) {
        System.out.print(getName() + " прикрыл " + what + " " + then.substring(0, then.length() - 1) + "ой");
    }
}
