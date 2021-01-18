public class Sounds {
    private String name;

    public Sounds(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }


    public void heard(PredlogUSSR soyuznerushimiy) {
        switch (soyuznerushimiy) {
            case NA:
                System.out.print(" на ");
                break;
            case PERED:
                System.out.print(" перед ");
                break;
            case S:
                System.out.print(" с ");
                break;
            case AND:
                System.out.print("и ");
                break;
        }
        System.out.print("послышался " + name);
    }
}