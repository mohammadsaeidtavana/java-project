package model.to;

/**
 * Created by user on 6/9/2017.
 */
public class book {
    private int id;
    private String name;
    private long price;

    public book(String name, long price) {
        this.name = name;
        this.price = price;
    }

    public book() {

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

    public long getPrice() {
        return price;
    }

    public void setPrice(long price) {
        this.price = price;
    }
}
