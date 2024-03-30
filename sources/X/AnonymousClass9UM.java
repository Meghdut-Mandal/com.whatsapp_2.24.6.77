package X;

import java.util.ArrayList;

/* renamed from: X.9UM  reason: invalid class name */
public class AnonymousClass9UM {
    public int A00 = 0;
    public int A01 = 0;
    public int A02 = 0;
    public final Object[] A03 = new Object[50];

    public synchronized ArrayList A00() {
        ArrayList A14;
        synchronized (this) {
            A14 = C36441kJ.A14(this.A00);
            int i = 0;
            while (true) {
                int i2 = this.A00;
                if (i < i2) {
                    if (i2 > i) {
                        A14.add(this.A03[(i + this.A01) % 50]);
                        i++;
                    } else {
                        throw new IndexOutOfBoundsException();
                    }
                }
            }
        }
        return A14;
    }

    public synchronized void A01(Object obj) {
        synchronized (this) {
            Object[] objArr = this.A03;
            try {
                int i = this.A00;
                if (i == 50) {
                    int i2 = this.A01;
                    objArr[i2] = null;
                    this.A01 = (i2 + 1) % 50;
                    i = 49;
                    this.A00 = 49;
                } else if (i >= 50) {
                    th = AnonymousClass001.A09("Overflow");
                    throw th;
                }
                int i3 = this.A02;
                objArr[i3] = obj;
                this.A02 = (i3 + 1) % 50;
                this.A00 = i + 1;
            } catch (Throwable th) {
                th = th;
            }
        }
    }
}
