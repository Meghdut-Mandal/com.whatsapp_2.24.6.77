package X;

import java.util.AbstractCollection;

/* renamed from: X.6Bu  reason: invalid class name and case insensitive filesystem */
public final class C128326Bu {
    public final int A00;
    public final int A01;
    public final Object A02;
    public final String A03;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C128326Bu) {
                C128326Bu r5 = (C128326Bu) obj;
                if (!AnonymousClass00C.A0J(this.A02, r5.A02) || this.A01 != r5.A01 || this.A00 != r5.A00 || !AnonymousClass00C.A0J(this.A03, r5.A03)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public static void A00(C128326Bu r2, Object obj, AbstractCollection abstractCollection, int i, int i2) {
        if (AnonymousClass6RF.A01(i, i2, r2.A01, r2.A00)) {
            abstractCollection.add(obj);
        }
    }

    public int hashCode() {
        return C90504aG.A0B(this.A03, ((((AnonymousClass000.A0H(this.A02) * 31) + this.A01) * 31) + this.A00) * 31);
    }

    public C128326Bu(Object obj, String str, int i, int i2) {
        this.A02 = obj;
        this.A01 = i;
        this.A00 = i2;
        this.A03 = str;
        if (i > i2) {
            throw AnonymousClass001.A08("Reversed range is not supported");
        }
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("Range(item=");
        A0u.append(this.A02);
        A0u.append(", start=");
        A0u.append(this.A01);
        A0u.append(", end=");
        A0u.append(this.A00);
        A0u.append(", tag=");
        return C36321k7.A0E(this.A03, A0u);
    }
}
