package org.mp.domen;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.Set;

/**
 * Created by Dragan on 07/01/17.
 */
@Entity
@Table(name = "taypes_of_bet")
@JsonIgnoreProperties(ignoreUnknown = true)
public class TypesOfBet {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "types_of_bet_id")
    private int typesOfBetId;

    @Column(name = "types_of_bet_name")
    private String typesOfBetName;

    @Column(name = "type_of_ber_code")
    private String typesOfBetCode;

    @OneToMany(mappedBy = "typesOfBet", cascade = CascadeType.ALL)
    @JsonIgnore
    private Set<TypesOfBetItem> typesOfBetItem;

    public int getTypesOfBetId() {
        return typesOfBetId;
    }

    public void setTypesOfBetId(int typesOfBetId) {
        this.typesOfBetId = typesOfBetId;
    }

    public String getTypesOfBetName() {
        return typesOfBetName;
    }

    public void setTypesOfBetName(String typesOfBetName) {
        this.typesOfBetName = typesOfBetName;
    }

    public String getTypesOfBetCode() {
        return typesOfBetCode;
    }

    public void setTypesOfBetCode(String typesOfBetCode) {
        this.typesOfBetCode = typesOfBetCode;
    }

    public Set<TypesOfBetItem> getTypesOfBetItem() {
        return typesOfBetItem;
    }

    public void setTypesOfBetItem(Set<TypesOfBetItem> typesOfBetItem) {
        this.typesOfBetItem = typesOfBetItem;
    }
}
