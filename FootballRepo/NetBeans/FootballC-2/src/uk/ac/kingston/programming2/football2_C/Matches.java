package uk.ac.kingston.programming2.football2_C;
public class Matches {

    private String teamname;
    private String result;
    private String date;
    private String opponent;
    private String attendence;

    public Matches(String teamname, String result, String date, String opponent, String attendence) {
        this.teamname = teamname;
        this.result = result;
        this.date = date;
        this.opponent = opponent;
        this.attendence = attendence;
    }
    
    /**
     * Get the value of teamname
     *
     * @return the value of teamname
     */
    public String getTeamname() {
        return teamname;
    }

    /**
     * Set the value of teamname
     *
     * @param teamname new value of teamname
     */
    public void setTeamname(String teamname) {
        this.teamname = teamname;
    }

    /**
     * Get the value of result
     *
     * @return the value of result
     */
    public String getResult() {
        return result;
    }

    /**
     * Set the value of result
     *
     * @param result new value of result
     */
    public void setResult(String result) {
        this.result = result;
    }

    /**
     * Get the value of date
     *
     * @return the value of date
     */
    public String getDate() {
        return date;
    }

    /**
     * Set the value of date
     *
     * @param date new value of date
     */
    public void setDate(String date) {
        this.date = date;
    }

    /**
     * Get the value of opponent
     *
     * @return the value of opponent
     */
    public String getOpponent() {
        return opponent;
    }

    /**
     * Set the value of opponent
     *
     * @param opponent new value of opponent
     */
    public void setOpponent(String opponent) {
        this.opponent = opponent;
    }

    /**
     * Get the value of attendence
     *
     * @return the value of attendence
     */
    public String getAttendence() {
        return attendence;
    }

    /**
     * Set the value of attendence
     *
     * @param attendence new value of attendence
     */
    public void setAttendence(String attendence) {
        this.attendence = attendence;
    }

}
