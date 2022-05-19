package mx.perroamor.service;

import jakarta.inject.Singleton;
import lombok.AllArgsConstructor;
import mx.perroamor.model.entity.Price;
import mx.perroamor.model.repository.PriceRepository;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@AllArgsConstructor
@Singleton
public class PriceService {

    private final PriceRepository priceRepository;

    public List<Price> getAllPrice() {
        return StreamSupport.stream(this.priceRepository.findAll().spliterator(), false)
                .collect(Collectors.toList());
    }

    public Price addPrice(Price price) {
        return this.priceRepository.save(price);
    }
}
