package com.itsc.ioc.spring_ioc_lab.model;

import com.itsc.ioc.spring_ioc_lab.interfaces.OutputDeviceInterface;

public class Speakers implements OutputDeviceInterface {
    @Override
    public void outputSound() {
        System.out.println("Sound from Speakers");
    }
}