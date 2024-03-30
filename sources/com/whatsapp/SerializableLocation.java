package com.whatsapp;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class SerializableLocation implements Serializable {
    public static final long serialVersionUID = -3211751283609598L;
    public double latitude;
    public double longitude;
    public String name;

    private void writeObject(ObjectOutputStream objectOutputStream) {
        objectOutputStream.writeDouble(this.latitude);
        objectOutputStream.writeDouble(this.longitude);
        objectOutputStream.writeObject(this.name);
    }

    public SerializableLocation(String str, double d, double d2) {
        this.latitude = d;
        this.longitude = d2;
        this.name = str;
    }

    private void readObject(ObjectInputStream objectInputStream) {
        this.latitude = objectInputStream.readDouble();
        this.longitude = objectInputStream.readDouble();
        this.name = (String) objectInputStream.readObject();
    }
}
