package X;

import java.util.List;

/* renamed from: X.3HQ  reason: invalid class name */
public final class AnonymousClass3HQ {
    public final int A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof AnonymousClass3HQ) && this.A00 == ((AnonymousClass3HQ) obj).A00);
    }

    public int hashCode() {
        return this.A00;
    }

    public static void A00(int i, List list) {
        list.add(new AnonymousClass3HQ(i));
    }

    public AnonymousClass3HQ(int i) {
        this.A00 = i;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("CAGInfoRow(rowType=");
        return C36321k7.A0G(A0u, this.A00);
    }
}
