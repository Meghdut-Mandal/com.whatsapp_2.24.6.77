package X;

import java.util.Iterator;

/* renamed from: X.01p  reason: invalid class name and case insensitive filesystem */
public abstract class C003601p implements Iterator, C003501o {
    public C003201h A00;
    public C003201h A01;

    public abstract C003201h A00(C003201h r1);

    public abstract C003201h A01(C003201h r1);

    public void BvH(C003201h r3) {
        C003201h r0;
        C003201h r1 = this.A00;
        if (r1 == r3 && r3 == this.A01) {
            r1 = null;
            this.A01 = null;
            this.A00 = null;
        }
        if (r1 == r3) {
            r1 = A00(r1);
            this.A00 = r1;
        }
        C003201h r02 = this.A01;
        if (r02 == r3) {
            if (r02 == r1 || r1 == null) {
                r0 = null;
            } else {
                r0 = A01(r02);
            }
            this.A01 = r0;
        }
    }

    public boolean hasNext() {
        if (this.A01 != null) {
            return true;
        }
        return false;
    }

    public /* bridge */ /* synthetic */ Object next() {
        C003201h r0;
        C003201h r1 = this.A01;
        C003201h r02 = this.A00;
        if (r1 == r02 || r02 == null) {
            r0 = null;
        } else {
            r0 = A01(r1);
        }
        this.A01 = r0;
        return r1;
    }

    public C003601p(C003201h r1, C003201h r2) {
        this.A00 = r2;
        this.A01 = r1;
    }
}
