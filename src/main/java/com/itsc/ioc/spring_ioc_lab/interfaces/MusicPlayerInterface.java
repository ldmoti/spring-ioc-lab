package com.itsc.ioc.spring_ioc_lab.interfaces;

public interface MusicPlayerInterface {
    void play();
    void stop();
    void setOutputDevice(OutputDeviceInterface outputDevice);
}
