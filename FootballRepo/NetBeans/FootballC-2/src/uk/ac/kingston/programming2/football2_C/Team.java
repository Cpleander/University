package uk.ac.kingston.programming2.football2_C;

public class Team {
private String name;
private String[] coaches;
private String league;
private String division;
private String fulltime;

//

    /**
     *
     */
    public Team()
{
    
}

    /**
     *
     * @param name
     * @param coaches
     * @param league
     * @param division
     * @param fulltime
     */
    public Team(String name, String[] coaches, String league, String division, String fulltime) {
        this.name = name;
        this.coaches = coaches;
        this.league = league;
        this.division = division;
        this.fulltime = fulltime;
    }




//getters and setters
     /**
     * Get the name as a String
     *
     * @return the String containing the name 
     */
    public String getName() {
        return name;
    }
    /**
     * Set the name as a String 
     *
     * @param name a String containing the name
     */
    public void setName(String name) {
        this.name = name;
    }
    
    /**
     * Get the  coaches as a String 
     *
     * @return the String containing coaches
     */
    public String getCoaches() {
        return getArrayAsString(coaches);
    }
     /**
     * Set the coaches as a String 
     *
     * @param coaches a String containing the coaches
     */
    public void setCoaches(String coaches) {
        this.coaches = getStringAsArray(coaches);
    }
    
    private String[] getStringAsArray(String s) {
        String[] result = s.split(":");
        return result;
    }
    
    private String getArrayAsString(String[] a) {
        String result = "";
        for(String s:a) {
            result += s +" : ";
        }
        result = result.substring(0,result.length()-3);
        return result;
    }
   
    /**
     * Get the  league as a String 
     *
     * @return the String containing league
     */
    public String getLeague() {
        return league;
    }
     /**
     * Set the league as a String
     *
     * @param league String containing the league
     */
    public void setLeague(String league) {
        this.league = league;
    }
    /**
     * Get the  division as String 
     *
     * @return the String containing division
     */
    public String getDivision() {
        return division;
    }
    /**
     * Set the division as String 
     *
     * @param division a String containing division
     */
    public void setDivision(String division) {
        this.division = division;
    }

   
    /**
     * Get  fullTime as boolean
     *
     * @return the boolean containing fullTime
     */
     public String getFulltime() {
        return fulltime;
    }
    /**
     * Set the  fullTime as boolean 
     *
     * @param fulltime boolean containing fullTime
     */
    public void setFulltime(String fulltime) {
        this.fulltime = fulltime;
    }
    
    
    
}
