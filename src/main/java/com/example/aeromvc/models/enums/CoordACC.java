package com.example.aeromvc.models.enums;

import com.example.aeromvc.models.Wpt;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;

@Entity
public class CoordACC {

    @Id
    @GeneratedValue
    private int id;

    @NotNull
    private String name;

    @OneToMany
    @JoinColumn(name = "coordacc_id")
    private List<Wpt> waypoints = new ArrayList<>();

    public CoordACC() {}

    public CoordACC(String name) { this.name = name; }

    public int getId() { return id; }

    public String getName() { return name; }

    public void setName(String name) { this.name = name; }

    public List<Wpt> getWaypoints() { return waypoints; }

}



//    ZERO ("Accurate to hundredths of seconds"),
//    ONE ("Accurate to tenths of seconds"),
//    TWO ("Accurate to seconds"),
//    FOUR ("Accurate to minutes");
//
//    private final String displayName;
//
//    CoordACC(String displayName) {
//        this.displayName = displayName;
//    }
//
//    public String getDisplayName() {
//        return displayName;
//    }

