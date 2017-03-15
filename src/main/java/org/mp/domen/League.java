package org.mp.domen;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.Set;

/**
 * Created by Dragan on 07/01/17.
 */
@Entity
@Table(name="league")
@JsonIgnoreProperties(ignoreUnknown = true)
public class League {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "league_id")
    private int leagueId;

    @Column(name="league_name")
    private String leagueName;


    @Column(name="bet_click_league_id")
    private long beatClickLeagueId;

    @OneToMany(mappedBy = "league", cascade = CascadeType.ALL)
    @JsonIgnore
    private Set<Game> game;

    @OneToMany(mappedBy = "league", cascade = CascadeType.ALL)
    @JsonIgnore
    private Set<Team> teams;

    public int getLeagueId() {
        return leagueId;
    }

    public void setLeagueId(int leagueId) {
        this.leagueId = leagueId;
    }

    public String getLeagueName() {
        return leagueName;
    }

    public void setLeagueName(String leagueName) {
        this.leagueName = leagueName;
    }

    public long getBeatClickLeagueId() {
        return beatClickLeagueId;
    }

    public void setBeatClickLeagueId(long beatClickLeagueId) {
        this.beatClickLeagueId = beatClickLeagueId;
    }

    public Set<Game> getGame() {
        return game;
    }

    public void setGame(Set<Game> game) {
        this.game = game;
    }

    public Set<Team> getTeams() {
        return teams;
    }

    public void setTeams(Set<Team> teams) {
        this.teams = teams;
    }
}
