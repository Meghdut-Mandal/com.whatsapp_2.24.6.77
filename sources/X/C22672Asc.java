package X;

import java.util.Iterator;

/* renamed from: X.Asc  reason: case insensitive filesystem */
public class C22672Asc extends C22656AsM {
    public byte[] A00;

    public C22672Asc(byte[] bArr) {
        this.A00 = bArr;
    }

    public static void A06(C22672Asc asc) {
        byte[] bArr = asc.A00;
        if (bArr != null) {
            C202169lB r2 = new C202169lB();
            AXq aXq = new AXq(bArr);
            while (aXq.hasMoreElements()) {
                r2.A06((AnonymousClass120) aXq.nextElement());
            }
            asc.A00 = r2.A07();
            asc.A00 = null;
        }
    }

    public synchronized int A0A() {
        int i;
        byte[] bArr = this.A00;
        if (bArr != null) {
            int length = bArr.length;
            i = C201849kY.A01(length) + 1 + length;
        } else {
            i = new C22674Ase(this.A00).A0A();
        }
        return i;
    }

    public synchronized AnonymousClass121 A0B() {
        A06(this);
        return super.A0B();
    }

    public synchronized void A0D(C200179gm r3, boolean z) {
        byte[] bArr = this.A00;
        if (bArr != null) {
            r3.A04(bArr, 48, z);
        } else {
            new C22674Ase(this.A00).A0D(r3, z);
        }
    }

    public synchronized int hashCode() {
        A06(this);
        return super.hashCode();
    }

    public synchronized Iterator iterator() {
        A06(this);
        return super.iterator();
    }
}
