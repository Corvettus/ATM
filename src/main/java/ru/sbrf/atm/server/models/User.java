package ru.sbrf.atm.server.models;

import ru.sbrf.atm.server.models.Account;

import java.util.ArrayList;
import java.util.Date;

public abstract class User {
    private long id;
    private String name;
    private Date birthDate;
    private ArrayList<Account> accounts;
}
