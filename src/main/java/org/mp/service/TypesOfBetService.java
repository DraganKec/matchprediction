package org.mp.service;

import org.mp.domen.TypesOfBet;

/**
 * Created by Dragan on 08/01/17.
 */
public interface TypesOfBetService {

    TypesOfBet saveTypesOfBet (TypesOfBet typesOfBet);

    TypesOfBet getTypesOfBet(int id);

    Iterable<TypesOfBet> getTypesOfBets();
}
