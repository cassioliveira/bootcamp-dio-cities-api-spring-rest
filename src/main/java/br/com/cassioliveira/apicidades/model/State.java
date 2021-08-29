package br.com.cassioliveira.apicidades.model;

import com.vladmihalcea.hibernate.type.json.JsonBinaryType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Type;
import org.hibernate.annotations.TypeDef;
import org.hibernate.annotations.TypeDefs;

import javax.persistence.*;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "State")
@Table(name = "estado")
//Esta anotação foi inserida para indicar ao Hibernate sobre como tratar o tipo json da tabela de estados e converter para um List<Integer>
@TypeDefs({
        @TypeDef(name = "jsonb", typeClass = JsonBinaryType.class)
})
public class State {

        @Id
        private Long id;

        @Column(name = "nome")
        private String name;

        private String uf;

        private Integer ibge;

  /* 1st
  @Column(name = "pais")
  private Integer countryId;*/

        // 2nd - @ManyToOne
        @ManyToOne
        @JoinColumn(name = "pais", referencedColumnName = "id")
        private Country country;

        @Type(type = "jsonb")
        @Basic(fetch = FetchType.LAZY)
        @Column(name = "ddd", columnDefinition = "jsonb")
        private List<Integer> ddd;

    }
