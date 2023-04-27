package com.masai.userServiceInMicro.Exception;

public class UserrNotFound extends  Exception{
    public UserrNotFound(){

    }
    public UserrNotFound(String msg){
        super(msg);
    }
}
