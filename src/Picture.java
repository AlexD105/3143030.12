public class Picture implements Flashing{
    private String name;

    public Picture(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void arice(String how){
        if (how == "SUDDENLY") {
            System.out.print(name + " неожиданно возникала");
        }
        if (how == "NO_SUDDENLY") {
            System.out.print(name + "ожидаемо возникала");
        }
    }

    public void together(PredlogUSSR souznerushimiy, String together){
        if (together == "TOGETHER"){
            System.out.print(" вместе");
            switch (souznerushimiy){
                case NA:
                    System.out.print(" на ");
                case PERED:
                    System.out.print(" перед ");
                case S:
                    System.out.print(" с ");
            }
        }
        if (together == "SEPARATELY"){
            System.out.print(" раздельно");
            switch (souznerushimiy){
                case NA:
                    System.out.print(" на ");
                case PERED:
                    System.out.print(" перед ");
                case S:
                    System.out.print(" с ");
            }
        }
        System.out.print(name + "ми ");

    }

    public void appear(PredlogUSSR soyuznerushimiy, String where){
        System.out.print(" появлялась ");
        switch (soyuznerushimiy){
            case NA:
                System.out.print("на ");
            case PERED:
                System.out.print("перед ");
            case S:
                System.out.print("с ");
            case IN:
                System.out.print("в ");
        }
        System.out.print(where + "е " + name);
    }

    public void flashed(String which, String who){
        if (which == "COATED") {
            System.out.print("покрытое " + who + "ми " + name + " мелькало");
        }
        if (which == "NO_COATED") {
            System.out.print(who + "ми " + name + " мелькало");
        }
    }
    public void distorted(PredlogUSSR soyuznerushimiy){
        switch (soyuznerushimiy){
            case NA:
                System.out.print(" на ");
                break;
            case PERED:
                System.out.print(" перед ");
                break;
            case S:
                System.out.print(" с ");
                break;
            case IN:
                System.out.print(" в ");
                break;
        }
        System.out.print("искаженной " + name.substring(0, name.length() - 1) + "ей");

    }

    public void soyuz(PredlogUSSR soyuznerushimiy) {
        switch (soyuznerushimiy){
            case A:
                System.out.print("а " + name + "ами");
            case I:
                System.out.print("и "+ name + "ами");
        }
    }

    public void flash(String when){
        System.out.print(when + " замелькали " + name);

    }
}

