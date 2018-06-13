package main.java.net.viralpalet.spring.controler;

import main.java.net.viralpalet.spring.DA.DataAccess;
import main.java.net.viralpalet.spring.model.person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by saeedtavana on 4/5/18.
 */

@RestController
@RequestMapping("/alarm")
public class PersonRestControllerr {
    @Autowired
    private DataAccess dataAccess;

    @RequestMapping(value = "/person", method = RequestMethod.GET)
    public List<person> getCustomers() {


        List<person> persons= dataAccess.showperson();
        return persons;
    }
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public ResponseEntity getCustomer(@PathVariable("id") long id) {


        person persons= dataAccess.search(id);
        if (persons == null) {
            return new ResponseEntity("No Customer found for ID " + id, HttpStatus.NOT_FOUND);
        }

        return new ResponseEntity(persons, HttpStatus.OK);
    }
   // @RequestMapping(value = "/put", method = RequestMethod.GET)
    @GetMapping("/getname")
    public ResponseEntity print() {

        return new ResponseEntity("hello saeed jan", HttpStatus.OK);

    }
    @RequestMapping(value = "/get/{id}", method = RequestMethod.GET)
    public ResponseEntity createCustomer(@PathVariable("id") String id) {

        System.out.println(id);
        if (id==null ||id=="" || id.isEmpty())
        {
            return new ResponseEntity(" value can not be null",HttpStatus.NOT_FOUND);
        }
        person person=new person();
        person.setId(471);
        person.setName("saeed");
        person.setFamily("tavana");


        return new ResponseEntity(person, HttpStatus.OK);
    }
}
