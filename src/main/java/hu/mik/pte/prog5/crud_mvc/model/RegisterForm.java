package hu.mik.pte.prog5.crud_mvc.model;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class RegisterForm {
    @NotBlank
    @Size(min=3, max=20)
    String username;
    @NotBlank
    @Size(min=3, max=20)
    String password;
    @NotBlank
    @Size(min=3, max=20)
    String confirmPassword;
}
