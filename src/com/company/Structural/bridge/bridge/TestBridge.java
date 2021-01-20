package com.company.Structural.bridge.bridge;


import com.company.Structural.bridge.bridge.device.ComputerHeadphoneFizy;

public class TestBridge {
    public static void main(String[] args) {
      Song muzik = new Song("Yalnız Kurt ahmet şafak" ,"Biz böyle görmedik, haramı bilmedik  ");
        ComputerHeadphoneFizy computer =new ComputerHeadphoneFizy();
        computer.playSong(muzik);

    }
}
