package org.mp.service;

import org.mp.domen.Team;

/**
 * Created by Dragan on 08/01/17.
 */
public interface TeamService {

    Team saveTeam(Team team);

    Team getTeam(int id);

    Iterable<Team> getTeams();
}
