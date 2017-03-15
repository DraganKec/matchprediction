package org.mp.domen;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;

/**
 * Created by Dragan on 07/01/17.
 */
@Entity
@Table(name = "types_of_bet_item")
@JsonIgnoreProperties(ignoreUnknown = true)
public class TypesOfBetItem {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "types_of_bet_item_id")
    private int typesOfBetItemId;

    @Column(name = "types_of_bet_item_name")
    private String typesOfBetItemName;

    @ManyToOne
    @JoinColumn(name = "types_of_bet_id")
    private TypesOfBet typesOfBet;

    public int getTypesOfBetItemId() {
        return typesOfBetItemId;
    }

    public void setTypesOfBetItemId(int typesOfBetItemId) {
        this.typesOfBetItemId = typesOfBetItemId;
    }

    public String getTypesOfBetItemName() {
        return typesOfBetItemName;
    }

    public void setTypesOfBetItemName(String typesOfBetItemName) {
        this.typesOfBetItemName = typesOfBetItemName;
    }

    public TypesOfBet getTypesOfBet() {
        return typesOfBet;
    }

    public void setTypesOfBet(TypesOfBet typesOfBet) {
        this.typesOfBet = typesOfBet;
    }
}
