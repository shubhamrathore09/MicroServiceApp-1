package com.masai.userServiceInMicro.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Userr {
    @Id
    private String userId;
    private String name;
    private String email;
    private String password;

    @Transient
    private List<Rating> ratings=new ArrayList<>();
}
