package com.spring.jpa.persistence;

import com.spring.jpa.domain.Board;
import org.springframework.data.repository.CrudRepository;

public interface BoardRepository extends CrudRepository<Board, Long>{
    
}
