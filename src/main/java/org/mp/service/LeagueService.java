package org.mp.service;

import org.mp.domen.League;

/**
 * Created by Dragan on 08/01/17.
 */
public interface LeagueService {

    League saveLeague (League league);

    League getLeague(int id);

    Iterable<League> getLeagues();
}
