package org.mp.repository;

import org.mp.domen.GameItem;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by Dragan on 08/01/17.
 */
public interface GameItemRepository extends CrudRepository<GameItem, Integer> {
}
