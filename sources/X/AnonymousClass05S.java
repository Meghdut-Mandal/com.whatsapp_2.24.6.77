package X;

import java.util.Iterator;

/* renamed from: X.05S  reason: invalid class name */
public class AnonymousClass05S implements Iterator, C003501o {
    public C003201h A00;
    public boolean A01 = true;
    public final /* synthetic */ C001800t A02;

    public AnonymousClass05S(C001800t r2) {
        this.A02 = r2;
    }

    public void BvH(C003201h r3) {
        C003201h r0 = this.A00;
        if (r3 == r0) {
            C003201h r1 = r0.A01;
            this.A00 = r1;
            boolean z = false;
            if (r1 == null) {
                z = true;
            }
            this.A01 = z;
        }
    }

    public boolean hasNext() {
        C003201h r0;
        if (this.A01) {
            r0 = this.A02.A02;
        } else {
            C003201h r02 = this.A00;
            if (r02 == null) {
                return false;
            }
            r0 = r02.A00;
        }
        if (r0 != null) {
            return true;
        }
        return false;
    }

    public /* bridge */ /* synthetic */ Object next() {
        C003201h r0;
        if (this.A01) {
            this.A01 = false;
            r0 = this.A02.A02;
        } else {
            C003201h r02 = this.A00;
            if (r02 != null) {
                r0 = r02.A00;
            } else {
                r0 = null;
            }
        }
        this.A00 = r0;
        return r0;
    }
}
