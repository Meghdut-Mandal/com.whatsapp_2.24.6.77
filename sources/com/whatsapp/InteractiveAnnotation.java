package com.whatsapp;

import X.C28981Uw;
import X.C52332pG;
import X.C63393Jw;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class InteractiveAnnotation implements Serializable {
    public static final long serialVersionUID = -3211751283609597L;
    public Object data;
    public SerializablePoint[] polygonVertices;
    public boolean skipConfirmation;

    private void writeObject(ObjectOutputStream objectOutputStream) {
        objectOutputStream.writeObject(this.polygonVertices);
        Object obj = this.data;
        if (obj instanceof SerializableLocation) {
            objectOutputStream.writeObject(obj);
        }
    }

    public InteractiveAnnotation(Object obj, SerializablePoint[] serializablePointArr, boolean z) {
        this.polygonVertices = serializablePointArr;
        this.skipConfirmation = z;
        this.data = obj;
    }

    private void readObject(ObjectInputStream objectInputStream) {
        this.polygonVertices = (SerializablePoint[]) objectInputStream.readObject();
        try {
            this.data = objectInputStream.readObject();
        } catch (Exception unused) {
        }
    }

    public InteractiveAnnotation(String str, SerializablePoint[] serializablePointArr, double d, double d2, boolean z) {
        this.polygonVertices = serializablePointArr;
        this.skipConfirmation = z;
        this.data = new SerializableLocation(str, d, d2);
    }

    public InteractiveAnnotation(C28981Uw r7, C52332pG r8, String str, String str2, SerializablePoint[] serializablePointArr, int i, boolean z) {
        this.polygonVertices = serializablePointArr;
        this.skipConfirmation = z;
        this.data = new C63393Jw(r7, r8, str, str2, i);
    }
}
