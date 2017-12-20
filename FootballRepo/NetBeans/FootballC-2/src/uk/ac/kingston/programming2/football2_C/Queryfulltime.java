package uk.ac.kingston.programming2.football2_C;
import java.util.*;
import java.io.*;

public class Queryfulltime {
    public ArrayList<Team> FullTime;

    
    public Queryfulltime(ArrayList<Team> FullTime) {
        this.FullTime = FullTime;
    }

public void getFullTime(String searchbyfulltime){


for(Team teamList: FullTime) {
    if(teamList.getFulltime().equalsIgnoreCase(searchbyfulltime)){
        System.out.println(teamList.getName() + " || Coaches: " + teamList.getCoaches() + " || Leage: " + teamList.getLeague() + " || Division: " + teamList.getDivision() + " || Fulltime: " + teamList.getFulltime());
            }
        }
    }
}
