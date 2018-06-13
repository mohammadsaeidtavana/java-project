package model;

/**
 * Created by saeedtavana on 6/8/17.
 */
public class person {
    public void person()
    {
        counter++;
    }
    private static  int counter=1;

    public static int getCounter() {
        return counter;
    }


    private String name;
    private  String fmaily;
    private int id;

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

    public String getFmaily() {
        return fmaily;
    }

    public void setFmaily(String fmaily) {
        this.fmaily = fmaily;
    }
}
