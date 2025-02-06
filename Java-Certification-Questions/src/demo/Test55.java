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
public class Test55 {

    int iVar = 100;
    float fVar = 100.100f;
    double dVar = 123;

    fVar  = iVar;  // Valid, implicit widening.
    iVar  = fVar;  // Invalid, narrowing without explicit cast. (Fails at Line 7)
    fVar  = dVar;  // Invalid, narrowing without explicit cast. (Fails at Line 10)
    dVar  = fVar;  // Valid, implicit widening.
    iVar  = dVar;  // Invalid, narrowing without explicit cast. (Fails at Line 12)
    dVar  = iVar;  // Valid, implicit widening.
}
