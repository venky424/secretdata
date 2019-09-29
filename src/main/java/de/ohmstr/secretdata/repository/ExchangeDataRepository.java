package de.ohmstr.secretdata.repository;

import de.ohmstr.secretdata.domain.ExchangeData;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ExchangeDataRepository extends JpaRepository<ExchangeData,Long> {
}
