package X;

import java.util.ConcurrentModificationException;
import java.util.Iterator;

public final class AY4 implements Iterator {
    public int A00;
    public int A01;
    public int A02;
    public boolean A03 = false;
    public final C21899AcT A04;
    public final Object[] A05;
    public final /* synthetic */ C21899AcT A06;

    public AY4(C21899AcT acT, C21899AcT acT2) {
        this.A06 = acT;
        this.A04 = acT2;
        this.A05 = acT2.A02;
        this.A01 = acT2.A00;
        int A022 = acT2.A02(-1);
        this.A00 = A022;
        this.A02 = A022;
    }

    public final boolean hasNext() {
        return C36401kF.A1U(this.A00);
    }

    public final Object next() {
        if (this.A01 == this.A04.A00) {
            int i = this.A00;
            if (i >= 0) {
                Object[] objArr = this.A05;
                Object obj = objArr[i];
                if (obj == C21899AcT.A03) {
                    obj = null;
                }
                this.A02 = i;
                this.A03 = true;
                while (true) {
                    i++;
                    if (i < objArr.length) {
                        if (objArr[i] != null) {
                            break;
                        }
                    } else {
                        i = -1;
                        break;
                    }
                }
                this.A00 = i;
                return obj;
            }
            throw C165617ti.A0e();
        }
        throw new ConcurrentModificationException();
    }

    public final void remove() {
        int i = this.A01;
        C21899AcT acT = this.A04;
        if (i != acT.A00) {
            throw new ConcurrentModificationException();
        } else if (this.A03) {
            this.A03 = false;
            Object[] objArr = this.A05;
            acT.remove(objArr[this.A02]);
            this.A01++;
            int i2 = this.A02;
            while (true) {
                if (i2 < objArr.length) {
                    if (objArr[i2] != null) {
                        break;
                    }
                    i2++;
                } else {
                    i2 = -1;
                    break;
                }
            }
            this.A00 = i2;
        } else {
            throw C165617ti.A0V();
        }
    }
}
