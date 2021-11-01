package org.vashonsd;

import java.util.ArrayList;

public class Concert {
    String name;
    String description;
    String location;
    ArrayList<String> performers;

    public Concert(String name, String description, String location) {
        this.name = name;
        this.description = description;
        this.location = location;
        performers = new ArrayList<>();

    }

    public String getName() {return name;}

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getLocation() {
        return location;}

    public void setLocation(String Location) {
        this.location = location;


    }

    public void addHit(String performer) {
        performers.add(performer);
    }





    public void addPerformer(Performer performer) {
        performers.add(performer.toString());

    }
    public String toString() {
        String result = name + ": " + description + ", " + location + "\n " + performers.toString();



        return result;


    }
}

