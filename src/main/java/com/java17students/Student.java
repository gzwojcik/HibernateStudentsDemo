package com.java17students;

import com.sun.javafx.beans.IDProperty;
import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
@Data
@Setter
@Getter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    //identity  pobiera id, przyp wart, zapisuje obiekt
    //zapisuje obiekt, odczytuje go
    private Long id;
    private String imie;
    private String nazwisko;
    private String indeksSt;


}
