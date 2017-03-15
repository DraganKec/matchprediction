package org.mp.service.imp;

import org.mp.domen.Game;
import org.mp.repository.GameRepository;
import org.mp.service.GameService;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

/**
 * Created by Dragan on 08/01/17.
 */
@Component
@Transactional
public class GameServiceImp implements GameService {

    @Resource
    private GameRepository gameRepository;

    @Override
    public Game saveGame(Game game) {
        gameRepository.save(game);
        return game;
    }

    @Override
    public Game getGame(int id) {
        return gameRepository.findOne(id);
    }

    @Override
    public Iterable<Game> getGames() {
        return gameRepository.findAll();
    }
}
