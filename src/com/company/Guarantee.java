package com.company;

import javax.sound.midi.Soundbank;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Guarantee {
    Product product;
    Date validUntil;


    Guarantee (Product product, Date validUntil){
        this.product = product;
        this.validUntil = validUntil;
    }
     public static boolean isValid(Guarantee guarantee){
         Date today = Calendar.getInstance().getTime();
        if(guarantee.validUntil.compareTo(today) > 0){
            return true;
        }else{
            guarantee.product = null;
            return false;
        }
     }

    public static void main(String[] args) throws ParseException {
        Product product = new Product("Lenovo","Laptop");
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");

        Date guaranteeNotValid = simpleDateFormat.parse("2019-04-15");
        Date guaranteeValid = simpleDateFormat.parse("2021-04-15");

        Guarantee guarantee = new Guarantee(product,guaranteeNotValid);
        System.out.println(guarantee.validUntil);
        System.out.println(isValid(guarantee));
        System.out.println(guarantee.product);

        Guarantee guarantee2 = new Guarantee(product,guaranteeValid);
        System.out.println(guarantee2.validUntil);
        System.out.println(isValid(guarantee2));
        System.out.println(guarantee2.product);
    }
}
