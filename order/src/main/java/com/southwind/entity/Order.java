package com.southwind.entity;

import lombok.Data;

import java.awt.*;
import java.util.Date;


@Data
public class Order {
    private long id;
    private User user;
    private Menu menu;
    private Admin admin;
    private Date date;
    private int state;
}