package X;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: X.5VT  reason: invalid class name */
public class AnonymousClass5VT extends Number implements Serializable {
    public static final long serialVersionUID = 0;
    public transient AtomicLong A00;

    public static double A00(AnonymousClass5VT r1) {
        return Double.longBitsToDouble(r1.A00.get());
    }

    public AnonymousClass5VT(double d) {
        this.A00 = new AtomicLong(Double.doubleToRawLongBits(d));
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        this.A00 = new AtomicLong();
        this.A00.set(Double.doubleToRawLongBits(objectInputStream.readDouble()));
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeDouble(A00(this));
    }

    public double doubleValue() {
        return A00(this);
    }

    public float floatValue() {
        return (float) A00(this);
    }

    public int intValue() {
        return (int) A00(this);
    }

    public long longValue() {
        return (long) A00(this);
    }

    public String toString() {
        return Double.toString(A00(this));
    }

    public AnonymousClass5VT() {
        this(0.0d);
    }
}
