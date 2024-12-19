package com.itsc.ioc.spring_ioc_lab.model;

import com.itsc.ioc.spring_ioc_lab.interfaces.OutputDeviceInterface;

public class Headphones implements OutputDeviceInterface {
    @Override
    public void outputSound() {
        System.out.println("Sound from Headphones");
    }
}