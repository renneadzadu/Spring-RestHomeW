package com.apress.Spring.RestHomeW.domain;

import jakarta.persistence.*;


@Entity
@Table(name= "Options")
public class Option {
    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    @Column(name="OPTION_ID")
    private Long id;
    @Column(name="OPTION_VALUE")
    private String value;

    public Option() {
    }

    public Option(Long id, String value) {
        this.id = id;
        this.value = value;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Option{" +
                "id=" + id +
                ", value='" + value + '\'' +
                '}';
    }
}

