package model.TO;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

/**
 * Created by saeedtavana on 5/1/18.
 */
@Entity(name = "studentAttendance")
public class Student  {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name = "id",nullable = true)
    private long ID;
    @Column(name = "date",nullable = true)
    private String date;
    @Column(name = "time",nullable = true)
    private String time;
    @Column(name = "name",nullable = true)
    private String name;
    @Column(name = "course",nullable = true)
    private String course;

    @Override
    public String toString() {
        return "Student{" +
                "ID=" + ID +
                ", date='" + date + '\'' +
                ", time='" + time + '\'' +
                ", name='" + name + '\'' +
                ", course='" + course + '\'' +
                '}';
    }

    public Student() {
    }

    public String getCourse() {

        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public long getID() {
        return ID;
    }

    public void setID(long ID) {
        this.ID = ID;
    }
}
