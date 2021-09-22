package com.devrev.apilives.Repository;

import java.time.LocalDateTime;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.devrev.apilives.entity.Live;

@Repository
public interface LiveRepository extends JpaRepository<Live, Long>{

	Page<Live> findByLiveDateAfterOrderByLiveDateAsc(LocalDateTime date, Pageable pageable);
    Page<Live> findByLiveDateBeforeOrderByLiveDateDesc(LocalDateTime date, Pageable pageable);
    
}
