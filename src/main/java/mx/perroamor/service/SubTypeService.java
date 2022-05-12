package mx.perroamor.service;

import jakarta.inject.Singleton;
import lombok.AllArgsConstructor;
import mx.perroamor.model.entity.SubType;
import mx.perroamor.model.repository.SubTypeRepository;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@AllArgsConstructor
@Singleton
public class SubTypeService {

    private final SubTypeRepository typeRepository;

    public List<SubType> getAllSubType() {
        return StreamSupport.stream(this.typeRepository.findAll().spliterator(), false)
                .collect(Collectors.toList());
    }
}
