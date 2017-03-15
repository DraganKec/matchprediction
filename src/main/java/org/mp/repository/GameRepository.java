package org.mp.repository;

import org.mp.domen.Game;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by Dragan on 08/01/17.
 */
public interface GameRepository extends CrudRepository<Game, Integer> {
}
