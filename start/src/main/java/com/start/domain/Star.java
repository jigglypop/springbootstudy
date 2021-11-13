package com.start.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "STAR")
@Data
public class Star {
    @Id
    @GeneratedValue
    private Long seq;
    private String title;
    private String writer;
    private String content;
}
