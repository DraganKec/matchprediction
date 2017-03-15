package org.mp.service;

import org.mp.domen.TypesOfBetItem;

/**
 * Created by Dragan on 08/01/17.
 */
public interface TypesOfBetItemService {

    TypesOfBetItem saveTypesOfBetItem(TypesOfBetItem typesOfBetItem);

    TypesOfBetItem getTypesOfBetItem(int id);

    Iterable<TypesOfBetItem> getTypesOfBetItems ();
}
