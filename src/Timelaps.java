public class Timelaps {
    private String name;

    public Timelaps(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void sometimes(PredlogUSSR souznerushimiy){
        System.out.print("иногда ");
        switch (souznerushimiy){
            case NA:
                System.out.print("на " + name);
                break;
            case PERED:
                System.out.print("перед " + name);
                break;
            case S:
                System.out.print("с " + name);
                break;
            }
        }
    public void proizoshlo(){
        System.out.print("произошла " + name);
    }
}
