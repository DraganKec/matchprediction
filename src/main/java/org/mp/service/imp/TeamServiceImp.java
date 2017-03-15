package org.mp.service.imp;

import org.mp.domen.Team;
import org.mp.repository.TeamRepository;
import org.mp.service.TeamService;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

/**
 * Created by Dragan on 08/01/17.
 */
@Component
@Transactional
public class TeamServiceImp implements TeamService {

    @Resource
    private TeamRepository teamRepository;

    @Override
    public Team saveTeam(Team team) {
        teamRepository.save(team);
        return team;
    }

    @Override
    public Team getTeam(int id) {
        return teamRepository.findOne(id);
    }

    @Override
    public Iterable<Team> getTeams() {
        return teamRepository.findAll();
    }
}
