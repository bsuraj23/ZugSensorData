package com.example.ZugData.repo;

import com.example.ZugData.model.ZugModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DriverRepo extends JpaRepository<DriverModel, Long> {
}
 


