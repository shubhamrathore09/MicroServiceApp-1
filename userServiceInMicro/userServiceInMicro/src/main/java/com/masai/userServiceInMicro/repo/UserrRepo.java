package com.masai.userServiceInMicro.repo;

import com.masai.userServiceInMicro.Model.Userr;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserrRepo extends JpaRepository<Userr,String> {
}
