/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo;

/**
 *
 * @author developer
 */

interface Exportable {

    void export();
}

class Tool implements Exportable {

    public void export() { // line n1
        System.out.println("Tool::export");
    }
}

class Test116 extends Tool implements Exportable {

    public void export() { // line n2
        System.out.println("RTool::export");
    }

    public static void main(String[] args) {
        Tool aTool = new Test116();
        Tool bTool = new Tool();
        callExport(aTool);
        callExport(bTool);
    }

    public static void callExport(Exportable ex) {
        ex.export();
    }
}
