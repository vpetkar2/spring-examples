/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo;

import java.time.LocalDate;

/**
 *
 * @author developer
 */
public class Test123 {

    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2012, 01, 32);
        date.plusDays(10);
        System.out.println(date);
    }
}
