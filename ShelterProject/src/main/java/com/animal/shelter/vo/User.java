package com.animal.shelter.vo;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Data
public class User {
    private Integer userID;

    private String name;
    private String email;
    private String password;
    private String contact;
    
}