package br.demo.backend.model.properties;

import br.demo.backend.model.enums.TypeOfProperty;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.util.Collection;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "tb_select")
public class Select extends Property {
    @OneToMany(cascade = CascadeType.ALL)
    private Collection<Option> options;

    public Select(Long id, String name, Boolean visible, Boolean obligatory, Collection<Option> options, TypeOfProperty type) {
        super(id, name, visible, obligatory, type);
        this.options = options;
    }

}
