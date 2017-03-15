package org.mp.service;

import org.mp.domen.Game;

/**
 * Created by Dragan on 08/01/17.
 */
public interface GameService {

    Game saveGame(Game game);

    Game getGame( int id);

    Iterable<Game> getGames();

}
