/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pack2;

import pack1.Area;

public class Vol extends Area{
    protected int h;
    public Vol(int l,int b,int h){
        super(l,b);
        this.h=h;
        System.out.println("volume =" +l*b*h);
    }
}

