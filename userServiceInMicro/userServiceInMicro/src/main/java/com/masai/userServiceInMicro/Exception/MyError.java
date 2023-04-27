package com.masai.userServiceInMicro.Exception;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class MyError {
    private String msg;
    private String details;
    private LocalDateTime localDateTime;
}
