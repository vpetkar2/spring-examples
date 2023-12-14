/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author developer
 */
public class Salary {
    
    private double basic;
    private double hra;
    private double da;
    private double gross;

    public double getBasic() {
        return basic;
    }

    public void setBasic(double basic) {
        this.basic = basic;
    }

    public double getHra() {
        return hra;
    }

    public double getDa() {
        return da;
    }

    public double getGross() {
        return gross;
    }
    
    public void calculate() {
        hra = basic * 0.2;
        da = basic * 0.1;
        gross = basic + hra + da;
    }
}
