package de.ohmstr.secretdata.repository;

import de.ohmstr.secretdata.domain.CurrencyData;
import org.springframework.data.repository.CrudRepository;

public interface CurrencyDataRepository extends CrudRepository<CurrencyData,Long> {

}
