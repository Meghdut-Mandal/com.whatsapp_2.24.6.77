package X;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.9n8  reason: invalid class name and case insensitive filesystem */
public abstract class C203019n8 {
    public static void populateMap(Map map, ObjectInputStream objectInputStream, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            map.put(objectInputStream.readObject(), objectInputStream.readObject());
        }
    }

    public static void populateMultiset(B6T b6t, ObjectInputStream objectInputStream, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            b6t.add(objectInputStream.readObject(), objectInputStream.readInt());
        }
    }

    public static C199279f3 getFieldSetter(Class cls, String str) {
        try {
            return new C199279f3(cls.getDeclaredField(str));
        } catch (NoSuchFieldException e) {
            throw C90524aI.A0Y(e);
        }
    }

    public static int readCount(ObjectInputStream objectInputStream) {
        return objectInputStream.readInt();
    }

    public static void writeMap(Map map, ObjectOutputStream objectOutputStream) {
        objectOutputStream.writeInt(map.size());
        Iterator A0y = AnonymousClass000.A0y(map);
        while (A0y.hasNext()) {
            Map.Entry A11 = AnonymousClass000.A11(A0y);
            objectOutputStream.writeObject(A11.getKey());
            objectOutputStream.writeObject(A11.getValue());
        }
    }

    public static void writeMultimap(B2P b2p, ObjectOutputStream objectOutputStream) {
        objectOutputStream.writeInt(b2p.asMap().size());
        Iterator A0y = AnonymousClass000.A0y(b2p.asMap());
        while (A0y.hasNext()) {
            Map.Entry A11 = AnonymousClass000.A11(A0y);
            objectOutputStream.writeObject(A11.getKey());
            objectOutputStream.writeInt(((Collection) A11.getValue()).size());
            for (Object writeObject : (Collection) A11.getValue()) {
                objectOutputStream.writeObject(writeObject);
            }
        }
    }

    public static void writeMultiset(B6T b6t, ObjectOutputStream objectOutputStream) {
        objectOutputStream.writeInt(b6t.entrySet().size());
        for (AnonymousClass9Y5 r1 : b6t.entrySet()) {
            objectOutputStream.writeObject(r1.getElement());
            objectOutputStream.writeInt(r1.getCount());
        }
    }
}
