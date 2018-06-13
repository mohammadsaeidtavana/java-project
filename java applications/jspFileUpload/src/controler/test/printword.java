package controler.test;

/**
 * Created by saeedtavana on 5/19/18.
 */
public class printword {
   public String name;
    public int id;

    @Override
    public String toString() {
        return "printword{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
