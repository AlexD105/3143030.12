public class Eye extends Bodyparts{
    public Eye(String name) {
        super(name);
    }

    public void close(String what, String then) {
        System.out.print(getName() + " прикрыл " + what + " " + then.substring(0, then.length() - 1) + "ой");
    }
    public void light(String how) {
        System.out.print(getName() + " засветились " + how +"ю");
    }
}
