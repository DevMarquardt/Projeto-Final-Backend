package br.demo.backend.model.dtos.email;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SendEmailDTO {

    @NotBlank
    @Email
    private String emailTo;

    private String emailFrom = "gestaodeprojetosweg@gmail.com";
}
