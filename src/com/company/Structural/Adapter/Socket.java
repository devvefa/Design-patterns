package com.company.Structural.Adapter;

public class Socket {
    public void SupplyElectricity(IHomeAppliances homeAppliances){
        int volt = homeAppliances.PlugAndRun();
        System.out.println(volt +" volt taked from socket");
    }

}
