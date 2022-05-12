package mx.perroamor.service;

import jakarta.inject.Singleton;
import lombok.AllArgsConstructor;
import mx.perroamor.model.entity.Size;
import mx.perroamor.model.repository.SizeRepository;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@AllArgsConstructor
@Singleton
public class SizeService {

    private final SizeRepository sizeRepository;

    /**
     * Get all size
     */
    public List<Size> getAllSize() {
        return StreamSupport.stream(this.sizeRepository.findAll().spliterator(), false)
                .collect(Collectors.toList());
    }
}
