package org.mp.service.imp;

import org.mp.domen.TypesOfBet;
import org.mp.repository.TypesOfBetRepository;
import org.mp.service.TypesOfBetService;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

/**
 * Created by Dragan on 08/01/17.
 */
@Component
@Transactional
public class TypesOfBetServiceImp implements TypesOfBetService {

    @Resource
    private TypesOfBetRepository typesOfBetRepository;

    @Override
    public TypesOfBet saveTypesOfBet(TypesOfBet typesOfBet) {
        typesOfBetRepository.save(typesOfBet);
        return typesOfBet;
    }

    @Override
    public TypesOfBet getTypesOfBet(int id) {
        return typesOfBetRepository.findOne(id);
    }

    @Override
    public Iterable<TypesOfBet> getTypesOfBets() {
        return typesOfBetRepository.findAll();
    }
}
