package com.masai.userServiceInMicro.Service;

import com.masai.userServiceInMicro.Exception.UserrNotFound;
import com.masai.userServiceInMicro.Model.Rating;
import com.masai.userServiceInMicro.Model.Userr;
import com.masai.userServiceInMicro.repo.UserrRepo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;


@Service
public class UserrServiceImpl implements  UserrService{
    @Autowired
    private UserrRepo userrRepo;

    @Autowired
    private RestTemplate restTemplate;

    private Logger logger= LoggerFactory.getLogger(UserrServiceImpl.class);

    @Override
    public Userr SaveUser(Userr userr) {
        String useId= UUID.randomUUID().toString();
        userr.setUserId(useId);
        return userrRepo.save(userr);
    }

    @Override
    public List<Userr> getUserrs() throws UserrNotFound {
        List<Userr> userrs=userrRepo.findAll();
        if(userrs==null){
            throw  new UserrNotFound("No userr are available");
        }
        return userrs;
    }

    @Override
    public Userr getUserById(String userId) throws UserrNotFound {

        Userr userr= userrRepo.findById(userId).orElseThrow(()->new UserrNotFound("no userr are available by that id"));
       ArrayList forObject= restTemplate.getForObject("http://localhost:8882/rating/user/"+userId,ArrayList.class);

       logger.info("{} ",forObject);
       userr.setRatings(forObject);
       return userr;
       //8591723283
    }

    @Override
    public String deleteUser(String userId) throws UserrNotFound {
        Userr userr=userrRepo.findById(userId).orElseThrow(()->new UserrNotFound("no userr are available by that id"));
        userrRepo.delete(userr);
        return "successfully deleted";
    }

    @Override
    public Userr updateUserr(Userr userr) throws UserrNotFound {
        Userr userr1=userrRepo.findById(userr.getUserId()).orElseThrow(()->new UserrNotFound("user not found by that id"));
        userr1.setEmail(userr.getEmail());
        userr1.setPassword(userr.getPassword());
        userr1.setName(userr.getName());
        return userrRepo.save(userr1);
    }
}
