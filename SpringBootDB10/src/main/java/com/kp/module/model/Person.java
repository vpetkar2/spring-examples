/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kp.module.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import lombok.Data;

/**
 *
 * @author developer
 */
@Entity
@Data
public class Person {
    @Id
    @GeneratedValue
    private int id;
    private String name;
    private int age;
}
