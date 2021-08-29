package br.com.cassioliveira.apicidades.model;

import javax.persistence.*;

import br.com.cassioliveira.apicidades.util.PointType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Type;
import org.hibernate.annotations.TypeDef;
import org.hibernate.annotations.TypeDefs;
import org.springframework.data.geo.Point;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "cidade")
@TypeDefs(value = {
        @TypeDef(name = "point", typeClass = PointType.class)
})
public class City {

        @Id
        private Long id;

        @Column(name = "nome")
        private String name;

        @Column(insertable = false, updatable = false)
        private Integer uf;

        private Integer ibge;

        @ManyToOne
        @JoinColumn(name = "uf", referencedColumnName = "id")
        private State state;

        // 1st
//        @Column(name = "lat_lon")
//        private String geolocation;

        // 2nd
        @Type(type = "point")
        @Column(name = "lat_lon", updatable = false, insertable = false)
        private Point location;

    }
