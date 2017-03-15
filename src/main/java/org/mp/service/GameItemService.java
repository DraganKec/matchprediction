package org.mp.service;

import org.mp.domen.GameItem;

/**
 * Created by Dragan on 08/01/17.
 */
public interface GameItemService {

    GameItem saveGameItem(GameItem gameItem);

    GameItem getGameItem (int id);

    Iterable<GameItem> getGameItems ();
}
