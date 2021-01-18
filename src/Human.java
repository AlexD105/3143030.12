import com.sun.org.apache.xpath.internal.operations.Bool;
import java.util.Objects;

public class Human implements Sized {
    private String name;

    public Human(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void close(String what, String then) {
        System.out.print(getName() + " прикрыл " + what + " " + then.substring(0, then.length() - 1) + "ой");
    }

    public void cough(String how) {
        if (how == "LITE") {
            System.out.print("потихоньку покашлял");
        }
        if (how == "HARD") {
            System.out.print("на всю ракету покашлял");
        }
    }

    public void lookaround(String when) {
        if (when == "PAST") {
            System.out.print("после чего огляделся по сторонам ");
        }
        if (when == "BEFORE") {
            System.out.print("перед этим огляделся по сторонам ");
        }
    }

    public String continues(PredlogUSSR soyuznerushimiy) {
        switch (soyuznerushimiy) {
            case AND:
                System.out.print("и продолжал: ");
                break;
            case A:
                System.out.print("а продолжал: ");
                break;
        }
        return null;
    }

    public void see(String when) {
        if (when == "THIS_TIME") {
            System.out.print(getName() + " на самом деле видели в это время ");
        }
        if (when == "NO_THIS_TIME") {
            System.out.print(getName() + " на самом деле видели не в это время ");
        }

    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Human human = (Human) o;
        return Objects.equals(name, human.name);
    }

    public int hashCode() {
        return Objects.hash(name);
    }

    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                '}';
    }

    public void nthtimetosay(String what) {
        System.out.print(name + " не успел прознести " + what + ' ');
    }

    public void say(PredlogUSSR soyuznerushimiy) {
        switch (soyuznerushimiy) {
            case AND:
                System.out.print("и ");
                break;
            case A:
                System.out.print("а ");
                break;
        }
        System.out.print(name + " сказала:");
    }

    public void ntdeceived(PredlogUSSR soyuznerushimiy, String what) {
        switch (soyuznerushimiy) {
            case AND:
                System.out.print(" И ");
                break;
            case A:
                System.out.print(" А ");
                break;
        }
        System.out.print(name + " не обманулись в " + what);
    }
    static String ended(String where) {
        return ("Попав в " + where + ", ");
    }

    public void committed(PredlogUSSR soyuznerushimiy, String time, String what) {
        switch (soyuznerushimiy) {
            case AND:
                System.out.print("и ");
                break;
            case A:
                System.out.print("а ");
                break;
        }
        System.out.print(name + " за " + time + " совершил " + what);
    }

    public void fell(PredlogUSSR soyuznerushimiy, String where) {
        switch (soyuznerushimiy) {
            case AND:
                System.out.print("и ");
                break;
            case A:
                System.out.print("а ");
                break;
        }
        System.out.print("упал в " + where);
    }
    public void couldnt(String where) {
        System.out.print("В " + where + " " + name + " не мог ничего произнести ");
    }
    public void twist(PredlogUSSR soyuznerushimiy) {
        switch (soyuznerushimiy) {
            case AND:
                System.out.print("и ");
                break;
            case A:
                System.out.print("а ");
                break;
        }
        System.out.print("крутил перед собой руками");
    }
    public void announced(String what) {
        System.out.print(name + " объявил, что найдена " + what);
    }
    public void saw(String what) {
        System.out.print(name + " разглядели, что " + what);
    }
    public String listened(String what) {
        return(name + " с интересом прислушивался к " + what);
    }
    public void brought(String what) {
        System.out.print("принесли " + what);
    }
    public void popped(String what) {
        System.out.print("выскочил из-за " + what);
    }
    public void stretched(String what) {
        System.out.print("потянулся к " + what + "ю");
    }
    public void fire(String how, String what, Boolean c){
        if (c==true){
            System.out.print(how + name + " выстрелил из " + what);
        } else {
            throw new DidHeFire("Дед уже не тот, ничего не произошло.");
        }
    }
    public void setName() throws DoPersonHaveNameOrNot {
        if (name == ""){
            throw new DoPersonHaveNameOrNot("Отсутствует имя");
        }
    }
}
