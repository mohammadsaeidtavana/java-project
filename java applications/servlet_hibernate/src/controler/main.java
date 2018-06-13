package controler;

import model.bl.personBL;
import model.to.book;

/**
 * Created by user on 6/11/2017.
 */
public class main {
    public static void main(String[] args) {
        personBL personBL= model.bl.personBL.getPersonBL();
        book book=personBL.getOnperosn(1);
        System.out.println(book.getId());
        System.out.println(book.getName());
        System.out.println(book.getPrice());
    }
}
