package com.crud.hibernet.demo.model;

import lombok.Data;

@Data
public class Id {
    private long id;

    public Id(long id){
        this.id = id;
    }
}
