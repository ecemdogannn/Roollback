package com.example.Rollback.Controller;

import com.example.Rollback.DAO.Repository;
import com.example.Rollback.Entity.Rollback;
import com.example.Rollback.Service.RollbackService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

@RestController
@RequestMapping("/api")
public class Controller {

    @Autowired
    private RollbackService service;

    @GetMapping("/register")
    public List<Rollback> urun(){
        return service.findAll();
    }

    @PostMapping("/register")
    public  String Rollback (@RequestBody Rollback urun){
        try {
       service.save(urun);
       return "ürün kayıt edildi.";
        } catch (Exception e) {
            System.out.println("Handle " + e.getMessage());
            //return "Kayıt işlemi sırasında bir hata meydana geldi, rollback yapıldı.";
            throw e;
        }


    }
}
