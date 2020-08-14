package com.company;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Guarantee {
    Product product;
    Date validUntil;

    Guarantee(Product product, Date validUntil) {
        this.product = product;
        this.validUntil = validUntil;
    }
}


