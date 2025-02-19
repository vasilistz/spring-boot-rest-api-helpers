package com.nooul.apihelpers.springbootrest.helpers.entities;

import com.nooul.apihelpers.springbootrest.helpers.values.Mobile;
import com.nooul.apihelpers.springbootrest.helpers.values.MobileConverter;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.util.UUID;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Sender {
    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(
            name = "UUID",
            strategy = "org.hibernate.id.UUIDGenerator"
    )
    @Type(type="uuid-char")
    private UUID id;

    @Convert(converter = MobileConverter.class)
    private Mobile sender;

}
