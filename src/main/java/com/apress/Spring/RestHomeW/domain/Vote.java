package com.apress.Spring.RestHomeW.domain;

import jakarta.persistence.*;

@Entity

@Table(name = "Vote")
public class Vote {
    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    @Column(name="VOTE_ID")
    private Long id;
    @ManyToOne
    @JoinColumn(name="OPTION_ID")
    private Option option;

    public Vote(Long id, Option option) {
        this.id = id;
        this.option = option;
    }

    public Vote() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Option getOption() {
        return option;
    }

    public void setOption(Option option) {
        this.option = option;
    }

    @Override
    public String toString() {
        return "Vote{" +
                "id=" + id +
                ", option=" + option +
                '}';
    }

    // Getters and Setters omitted for brevity
}
