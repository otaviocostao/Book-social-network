package com.bsn.book_network.auth;


import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class AuthenticationRequest {
    @Email(message = "O e-mail não está no formato certo")
    @NotEmpty(message = "O e-mail é obrigatório")
    @NotBlank(message = "O e-mail é obrigatório")
    private String email;
    @NotEmpty(message = "A senha é obrigatória")
    @NotBlank(message = "A senha é obrigatória")
    @Size(min = 8, message = "A senha deve ter 8 caractéres ou mais")
    private String password;
}
