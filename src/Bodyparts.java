public abstract class Bodyparts{
    private String name;
    public Bodyparts(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void healed(String what) {
        System.out.print(getName() + " зажил с помощью " + what);
    }
    public String whose(PredlogUSSR soyuznerushimiy, String whose) {
        if (whose == "THEM"){
            switch (soyuznerushimiy){
                case NA:
                    System.out.print("На их " + name + "е ");
                case PERED:
                    System.out.print("Перед их " + name + "ом ");
                }
            }
        if (whose == "OUR"){
            switch (soyuznerushimiy){
                case NA:
                    System.out.print("На наш " + name);
                case PERED:
                    System.out.print("Перед нашим " + name + "ом ");
            }
        }
        return null;
    }
}
