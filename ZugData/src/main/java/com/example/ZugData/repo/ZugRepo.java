package com.example.ZugData.repo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;
import com.example.ZugData.model.ZugModel;




import com.example.ZugData.model.ZugModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ZugRepo extends JpaRepository<ZugModel, Long> {
}
 


