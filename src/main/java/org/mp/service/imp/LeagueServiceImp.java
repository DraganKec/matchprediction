package org.mp.service.imp;

import org.mp.domen.League;
import org.mp.repository.LeagueRepository;
import org.mp.service.LeagueService;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

/**
 * Created by Dragan on 08/01/17.
 */
@Component
@Transactional
public class LeagueServiceImp implements LeagueService{

    @Resource
    private LeagueRepository leagueRepository;

    @Override
    public League saveLeague(League league) {
        leagueRepository.save(league);
        return league;
    }

    @Override
    public League getLeague(int id) {
        return leagueRepository.findOne(id);
    }

    @Override
    public Iterable<League> getLeagues() {
        return leagueRepository.findAll();
    }
}
