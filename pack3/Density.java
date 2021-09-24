/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pack3;

import pack2.Vol;

public class Density extends Vol {
    protected int m;

    public Density( int l, int b, int h,int m) {
        super(l, b, h);
        this.m = m;
        System.out.println("Density="+1.0*m/(l*b*h));        
    }
    
}
