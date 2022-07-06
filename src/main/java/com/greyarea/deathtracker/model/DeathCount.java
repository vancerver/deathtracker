package com.greyarea.deathtracker.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "death_count", schema = "death_tracker")
@Getter
@Setter
public class DeathCount {
    @Column(name = "count")
    public Integer count;
    @Id
    private Long id;

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}
