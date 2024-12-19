package com.itsc.ioc.spring_ioc_lab.model;

import com.itsc.ioc.spring_ioc_lab.interfaces.MusicPlayerInterface;
import com.itsc.ioc.spring_ioc_lab.interfaces.OutputDeviceInterface;


public class CdPlayer implements MusicPlayerInterface {
    private OutputDeviceInterface outputDevice;

    @Override
    public void play() {
        System.out.println("CD player playing");
        outputDevice.outputSound(); // Use the injected output device
    }

    @Override
    public void stop() {
        System.out.println("CD player stopped");
    }

    @Override
    public void setOutputDevice(OutputDeviceInterface outputDevice) {
        this.outputDevice = outputDevice;
    }
}