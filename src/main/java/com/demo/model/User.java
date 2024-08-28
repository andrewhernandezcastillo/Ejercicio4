package com.demo.model;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.*;

import java.sql.Timestamp;

@Data
@Setter
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class User {

    private Long id;
    @NotEmpty(message = "campo name obligatorio")
    private String name;
    @NotEmpty(message = "campo lastname obligatorio")
    private String lastname;
    @NotEmpty(message = "campo email obligatorio")
    private String email;
    @NotNull(message = "campo age obligatorio")
    private Long age;
    private String createDate;

}
