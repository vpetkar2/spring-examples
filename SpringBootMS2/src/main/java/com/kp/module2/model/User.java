/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kp.module2.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author developer
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {
    private String name;
    private Department department;
}
