package net.javaguides.school.dto;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class StudentDto {
    private Integer id;
    private String firstname;
    private String lastname;
    private String email;
    private Integer schoolId;
}