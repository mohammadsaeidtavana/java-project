package model.to;

/**
 * Created with IntelliJ IDEA.
 * User: Bahador
 * Date: 8/9/14
 * Time: 5:15 PM
 * To change this template use File | Settings | File Templates.
 */
public class CarTO {
    private long id;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    private String name;
    private String color;
}
