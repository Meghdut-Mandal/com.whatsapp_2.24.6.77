package X;

import java.util.List;

/* renamed from: X.82h  reason: invalid class name and case insensitive filesystem */
public final class C1688582h extends C201069ij {
    public final long A00;
    public final List A01 = AnonymousClass001.A0I();
    public final List A02 = AnonymousClass001.A0I();

    public C1688582h A00(int i) {
        List list = this.A01;
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            C1688582h r1 = (C1688582h) list.get(i2);
            if (r1.A00 == i) {
                return r1;
            }
        }
        return null;
    }

    public C1688482g A01(int i) {
        List list = this.A02;
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            C1688482g r1 = (C1688482g) list.get(i2);
            if (r1.A00 == i) {
                return r1;
            }
        }
        return null;
    }

    public C1688582h(int i, long j) {
        super(i);
        this.A00 = j;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append(C201069ij.A00(this.A00));
        A0u.append(" leaves: ");
        C90514aH.A1T(A0u, this.A02.toArray());
        A0u.append(" containers: ");
        C90514aH.A1T(A0u, this.A01.toArray());
        return A0u.toString();
    }
}
