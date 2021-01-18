public class TVthings {
    private String name;
    public TVthings(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public String own(PredlogUSSR soyuznerushimiy, String whose) {
        if (whose == "MY"){
            switch (soyuznerushimiy) {
                case NA:
                    System.out.print("на своих " + name + "ах ");
            }
        }
        if (whose == "YOUR"){
            switch (soyuznerushimiy) {
                case NA:
                    System.out.print("на своих " + name + "ах ");
            }
        }
        return null;
    }

    public void course(String bol){
        if (bol == "POR"){
            System.out.print("какое-то беспорядочное " + name);
        }
        if (bol == "NOPOR"){
            System.out.print("какое-то упорядоченное " + name);
        }
    }
    public void close(String what, String then) {
        System.out.print(getName() + " прикрыл " + what + " " + then.substring(0, then.length() - 1) + "ой");
    }

    public void gout(String how) {
        System.out.print(getName()+"ы " + how + " погасли" );
    }
}
