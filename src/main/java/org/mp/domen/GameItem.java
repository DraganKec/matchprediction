package org.mp.domen;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.sql.Date;

/**
 * Created by Dragan on 07/01/17.
 */
@Entity
@Table(name = "game_items")
@JsonIgnoreProperties(ignoreUnknown = true)
public class GameItem {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "game_item_id")
    private int gameItemId;

    private Date date;

    @ManyToOne
    @JoinColumn(name = "game_id")
    private Game game;

    @ManyToOne
    @JoinColumn(name = "types_of_bet_item_id")
    private TypesOfBetItem typesOfBetItem;

    private float quota;

    public int getGameItemId() {
        return gameItemId;
    }

    public void setGameItemId(int gameItemId) {
        this.gameItemId = gameItemId;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Game getGame() {
        return game;
    }

    public void setGame(Game game) {
        this.game = game;
    }

    public TypesOfBetItem getTypesOfBetItem() {
        return typesOfBetItem;
    }

    public void setTypesOfBetItem(TypesOfBetItem typesOfBetItem) {
        this.typesOfBetItem = typesOfBetItem;
    }

    public float getQuota() {
        return quota;
    }

    public void setQuota(float quota) {
        this.quota = quota;
    }
}
