package org.mp.service.imp;

import org.mp.domen.GameItem;
import org.mp.repository.GameItemRepository;
import org.mp.service.GameItemService;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

/**
 * Created by Dragan on 08/01/17.
 */
@Component
@Transactional
public class GameItemServiceImp implements GameItemService {

    @Resource
    private GameItemRepository gameItemRepository;


    @Override
    public GameItem saveGameItem(GameItem gameItem) {
        gameItemRepository.save(gameItem);
        return gameItem;
    }

    @Override
    public GameItem getGameItem(int id) {
        return gameItemRepository.findOne(id);
    }

    @Override
    public Iterable<GameItem> getGameItems() {
        return gameItemRepository.findAll();
    }
}
