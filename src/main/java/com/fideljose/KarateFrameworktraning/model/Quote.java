package com.fideljose.KarateFrameworktraning.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Date;

@Data
@AllArgsConstructor
public class Quote {
    private String id;
    private Date date;
    private String city;
    private String address;
}
