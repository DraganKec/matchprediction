package org.mp.service.imp;

import org.mp.domen.TypesOfBetItem;
import org.mp.repository.TypesOfBetItemRepository;
import org.mp.service.TypesOfBetItemService;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

/**
 * Created by Dragan on 08/01/17.
 */
@Component
@Transactional
public class TypesOfBetItemServiceImp implements TypesOfBetItemService {

    @Resource
    private TypesOfBetItemRepository typesOfBetItemRepository;

    @Override
    public TypesOfBetItem saveTypesOfBetItem(TypesOfBetItem typesOfBetItem) {
        typesOfBetItemRepository.save(typesOfBetItem);
        return typesOfBetItem;
    }

    @Override
    public TypesOfBetItem getTypesOfBetItem(int id) {
        return typesOfBetItemRepository.findOne(id);
    }

    @Override
    public Iterable<TypesOfBetItem> getTypesOfBetItems() {
        return typesOfBetItemRepository.findAll();
    }
}
