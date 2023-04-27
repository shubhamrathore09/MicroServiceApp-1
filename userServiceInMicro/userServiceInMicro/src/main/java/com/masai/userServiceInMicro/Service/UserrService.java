package com.masai.userServiceInMicro.Service;

import com.masai.userServiceInMicro.Exception.UserrNotFound;
import com.masai.userServiceInMicro.Model.Userr;

import java.util.List;

public interface UserrService {
    public Userr SaveUser(Userr userr);
    public List<Userr> getUserrs()throws UserrNotFound;
    public Userr getUserById(String userId)throws  UserrNotFound;
    public String deleteUser(String userId)throws  UserrNotFound;
    public Userr updateUserr(Userr userr)throws  UserrNotFound;
}
