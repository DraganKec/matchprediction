package org.mp.domen;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.sql.Date;

/**
 * Created by Dragan on 07/01/17.
 */
@Entity
@Table(name = "game")
@JsonIgnoreProperties(ignoreUnknown = true)
public class Game {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "game_id")
    private int gameId;

    @Column(name = "game_time")
    private Date gameTime;

    @Column(name = "results_home_halftime")
    private int resultsHomeHalfTime;

    @Column(name = "results_guest_halftime")
    private int resultsGuestHalfTime;

    @Column(name = "results_home_end")
    private int resultsHomeEnd;

    @Column(name = "results_guest_end")
    private int resultsGuestEnd;

    @Column(name = "check")
    private int check;

    @ManyToOne
    @JoinColumn(name = "league_id")
    private League league;

    public int getGameId() {
        return gameId;
    }

    public void setGameId(int gameId) {
        this.gameId = gameId;
    }

    public Date getGameTime() {
        return gameTime;
    }

    public void setGameTime(Date gameTime) {
        this.gameTime = gameTime;
    }

    public int getResultsHomeHalfTime() {
        return resultsHomeHalfTime;
    }

    public void setResultsHomeHalfTime(int resultsHomeHalfTime) {
        this.resultsHomeHalfTime = resultsHomeHalfTime;
    }

    public int getResultsGuestHalfTime() {
        return resultsGuestHalfTime;
    }

    public void setResultsGuestHalfTime(int resultsGuestHalfTime) {
        this.resultsGuestHalfTime = resultsGuestHalfTime;
    }

    public int getResultsHomeEnd() {
        return resultsHomeEnd;
    }

    public void setResultsHomeEnd(int resultsHomeEnd) {
        this.resultsHomeEnd = resultsHomeEnd;
    }

    public int getResultsGuestEnd() {
        return resultsGuestEnd;
    }

    public void setResultsGuestEnd(int resultsGuestEnd) {
        this.resultsGuestEnd = resultsGuestEnd;
    }

    public int getCheck() {
        return check;
    }

    public void setCheck(int check) {
        this.check = check;
    }

    public League getLeague() {
        return league;
    }

    public void setLeague(League league) {
        this.league = league;
    }
}
