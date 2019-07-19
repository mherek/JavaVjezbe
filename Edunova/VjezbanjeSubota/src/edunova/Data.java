
package edunova;

import java.util.HashMap;
import java.util.Map;

public class Data {

    private Integer id;
    private String date;
    private Home_team home_team;
    private Integer homeTeamScore;
    private Integer period;
    private Boolean postseason;
    private Integer season;
    private String status;
    private String time;
    private VisitorTeam visitorTeam;
    private Integer visitorTeamScore;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Home_team getHome_team() {
        return home_team;
    }

    public void setHome_team(Home_team homeTeam) {
        this.home_team = homeTeam;
    }

    public Integer getHomeTeamScore() {
        return homeTeamScore;
    }

    public void setHomeTeamScore(Integer homeTeamScore) {
        this.homeTeamScore = homeTeamScore;
    }

    public Integer getPeriod() {
        return period;
    }

    public void setPeriod(Integer period) {
        this.period = period;
    }

    public Boolean getPostseason() {
        return postseason;
    }

    public void setPostseason(Boolean postseason) {
        this.postseason = postseason;
    }

    public Integer getSeason() {
        return season;
    }

    public void setSeason(Integer season) {
        this.season = season;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public VisitorTeam getVisitorTeam() {
        return visitorTeam;
    }

    public void setVisitorTeam(VisitorTeam visitorTeam) {
        this.visitorTeam = visitorTeam;
    }

    public Integer getVisitorTeamScore() {
        return visitorTeamScore;
    }

    public void setVisitorTeamScore(Integer visitorTeamScore) {
        this.visitorTeamScore = visitorTeamScore;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
