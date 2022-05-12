package mx.perroamor.service;

import jakarta.inject.Singleton;
import lombok.AllArgsConstructor;
import mx.perroamor.model.entity.Type;
import mx.perroamor.model.repository.TypeRepository;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@AllArgsConstructor
@Singleton
public class TypeService {

    private final TypeRepository typeRepository;

    public List<Type> getAllType() {
        return StreamSupport.stream(this.typeRepository.findAll().spliterator(), false)
                .collect(Collectors.toList());
    }
}
