package uk.ac.kingston.programming2.football2_C;
import java.util.*;
import java.io.*;

public class Queryname {
public ArrayList<Team> Name;

    
    public Queryname(ArrayList<Team> Name) {
        this.Name = Name;
    }

public void getName(String searchbyname){


for(Team teamList: Name) {
    if(teamList.getName().equalsIgnoreCase(searchbyname)){
        System.out.println(teamList.getName() + " || Coaches: " + teamList.getCoaches() + " || Leage: " + teamList.getLeague() + " || Division: " + teamList.getDivision() + " || Fulltime: " + teamList.getFulltime());
            }
        }
    }
}