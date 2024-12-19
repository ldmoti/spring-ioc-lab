package com.itsc.ioc.spring_ioc_lab.model;

import com.itsc.ioc.spring_ioc_lab.interfaces.MusicPlayerInterface;
import com.itsc.ioc.spring_ioc_lab.interfaces.OutputDeviceInterface;

public class Mp3Player implements MusicPlayerInterface {
    private OutputDeviceInterface outputDevice;


    @Override
    public void play() {
        System.out.println("MP3 player playing");
        outputDevice.outputSound();
    }

    @Override
    public void stop() {
        System.out.println("MP3 player stopped");
    }

    @Override
    public void setOutputDevice(OutputDeviceInterface outputDevice) {
         this.outputDevice = outputDevice;
    }
}