package br.demo.backend.model;

import br.demo.backend.model.enums.Theme;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "tb_configuration")
public class Configuration {
    @Id
    private Long taskId;
    // Falta usar o cérebro
    private Boolean notifications;
    private String primaryColor;
    private String secondaryColor;
    @Enumerated(value = EnumType.STRING)
    private Theme theme;
    private Integer fontSize;
    @JoinColumn(name = "taskId", insertable = false, updatable = false)
    @OneToOne
    private User user;
    private Boolean libras;
    private Boolean textToSound;
}
