package hu.schonherz.java.summer.project.data.dao;


import hu.schonherz.java.summer.project.data.entities.CustomerEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Repository
@Transactional(propagation = Propagation.SUPPORTS)
public interface CustomerDao extends JpaRepository<CustomerEntity, Long> {

    CustomerEntity findById(Long id);

    CustomerEntity findByUserId(Long id);

    List<CustomerEntity> findAll();
}