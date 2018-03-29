package pl.ll.geocaching.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by arabk on 24.03.2018.
 */
@Entity
@Table(name="point")
public class Point {

    @Id
    @GeneratedValue
    Long id;
    String name;
    String owner;
    String hint;
    String description;
    String userslist;
    double latitude;
    double longitude;

    public Point() {
    }

    public Point(Long id, String name, String owner, String hint, String description, String userslist, double latitude, double longitude) {
        this.id = id;
        this.name = name;
        this.owner = owner;
        this.hint = hint;
        this.description = description;
        this.userslist = userslist;
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getHint() {
        return hint;
    }

    public void setHint(String hint) {
        this.hint = hint;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getUserslist() {
        return userslist;
    }

    public void setUserslist(String userslist) {
        this.userslist = userslist;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }
}
