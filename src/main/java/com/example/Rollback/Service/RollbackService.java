package com.example.Rollback.Service;
import com.example.Rollback.DAO.Repository;

import com.example.Rollback.Entity.Rollback;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class RollbackService {
    @Autowired
    private Repository repo;


    public List<Rollback> findAll() {
        return repo.findAll();
    }

    //yeni ürün kayt eder.
    @Transactional
    public Rollback save(Rollback ürün) {
      repo.save(ürün);
        if (ürün.getAd().equals("sebze")){
            throw new RuntimeException("Simulated error for rollback");
        }
       return ürün;
    }

}
