package model.to;

/**
 * Created with IntelliJ IDEA.
 * User: Bahador
 * Date: 8/9/14
 * Time: 5:09 PM
 * To change this template use File | Settings | File Templates.
 */
import java.util.ArrayList;
import java.util.List;

public class PersonTO {


    public List<CarTO> getCarTOs() {
        return carTOs;
    }

    public void setCarTOs(List<CarTO> carTOs) {
        this.carTOs = carTOs;
    }

    private List<CarTO> carTOs;

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

    public String getFamily() {
        return family;
    }

    public void setFamily(String family) {
        this.family = family;
    }

    private String name;
    private String family;
}
