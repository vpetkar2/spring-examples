/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author developer
 */
public class Test3 {

    public static void main(String[] args) {
        String date = LocalDate
                .parse("2014-05-04")
                .format(DateTimeFormatter.ISO_DATE);
        System.out.println(date);
    }
}
