package com.masai.userServiceInMicro.UserrController;

import com.masai.userServiceInMicro.Exception.UserrNotFound;
import com.masai.userServiceInMicro.Model.Userr;
import com.masai.userServiceInMicro.Service.UserrService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserrController {

    @Autowired
    private UserrService userrService;
    @PostMapping("/userr")
    public ResponseEntity<Userr> AddUserHandler(@RequestBody Userr userr){
        return new ResponseEntity<>(userrService.SaveUser(userr), HttpStatus.CREATED);
    }

    @PutMapping("/userr")
    public ResponseEntity<Userr>UpdateUserHandler(@RequestBody Userr userr) throws UserrNotFound {
        return new ResponseEntity<>(userrService.updateUserr(userr),HttpStatus.OK);
    }

    @DeleteMapping("/userr/{userId}")
    public ResponseEntity<String>deleteUserHandler(@PathVariable("userId")String userId) throws UserrNotFound {
        return new ResponseEntity<>(userrService.deleteUser(userId),HttpStatus.OK);
    }

    @GetMapping("/userr/{userId}")
    public ResponseEntity<Userr> getUserHandler(@PathVariable("userId")String userId) throws UserrNotFound {
        return new ResponseEntity<>(userrService.getUserById(userId),HttpStatus.OK);
    }

    @GetMapping("/userrs")
    public ResponseEntity<List<Userr>>getAllUserHandler() throws UserrNotFound {
        return new ResponseEntity<>(userrService.getUserrs(),HttpStatus.OK);
    }

}
