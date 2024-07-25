package com.crh.clean.repository;

import com.crh.clean.domain.Trash;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TrashRepository extends JpaRepository <Trash, Long> {


}
