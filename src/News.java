public class News {
    private String name;
    public News(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public void conveyed(PredlogUSSR soyuznerushimiy, String when, String what){
        switch (soyuznerushimiy) {
            case IN:
                System.out.print("В ");
                break;
            case NA:
                System.out.print("На ");
                break;
        }
        System.out.print(when + " передавались " + name + " " + what);
    }
    public void amazed(String how) {
        System.out.print(how + " поразил " + name);
    }
}
