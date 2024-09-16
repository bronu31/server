package com.app.server.model.entity;

import java.util.List;

public class User {
    private Integer id;
    private String login;
    private String password;
    private String nickname;
    private List<Product> purchased;
    private List<Product> wantToPurchase;
}
