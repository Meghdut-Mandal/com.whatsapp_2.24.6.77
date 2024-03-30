package X;

import java.util.Set;

/* renamed from: X.6Pu  reason: invalid class name and case insensitive filesystem */
public class C131626Pu {
    public static final C131626Pu A02 = new C131626Pu((Set) null, 6);
    public static final C131626Pu A03 = new C131626Pu((Set) null, 4);
    public static final C131626Pu A04 = new C131626Pu((Set) null, 0);
    public static final C131626Pu A05 = new C131626Pu((Set) null, 5);
    public static final C131626Pu A06 = new C131626Pu((Set) null, 3);
    public static final C131626Pu A07 = new C131626Pu((Set) null, 2);
    public static final C131626Pu A08 = new C131626Pu((Set) null, 1);
    public final int A00;
    public final Set A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C131626Pu r5 = (C131626Pu) obj;
            if (this.A00 != r5.A00 || !C1901797e.A00(this.A01, r5.A01)) {
                return false;
            }
        }
        return true;
    }

    public boolean A00() {
        int i = this.A00;
        if (i == 2 || i == 3 || i == 1) {
            return true;
        }
        return false;
    }

    public boolean A01() {
        int i = this.A00;
        if (i == 3 || i == 2) {
            return true;
        }
        return false;
    }

    public C131626Pu(Set set, int i) {
        this.A00 = i;
        this.A01 = set;
    }

    public int hashCode() {
        Object[] A0M = AnonymousClass001.A0M();
        AnonymousClass000.A1J(A0M, this.A00);
        return AnonymousClass000.A0L(this.A01, A0M);
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("SyncResult(resultType=");
        A0u.append(this.A00);
        return C90474aD.A0f(A0u);
    }
}
